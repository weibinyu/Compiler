import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class AGConstruct {
    private Scope ENV;
    private Stack<ASTNode> LOOPS;
    private Stack <ASTNode> FUN = new Stack<>();
    private Signature SIG = new Signature();

    public void semanticAnalysis(ASTNode start){
        ASTNode current = start;
        if (current.getName().equals("Goal")){
            //inh
            if(current.getSCOPE()==null){
                current.setSCOPE(new Scope(null));//To save function returned variable
            }
            current.setLOOPS(new Stack<>());
            ENV = current.getSCOPE();

            LOOPS = current.getLOOPS();

            for(ASTNode c : current.getChildren()){
                semanticAnalysis(c);
            }

            //syn
            current.setOK(current.childOk());
            current.setCOMPLETE(current.getSCOPE() != null && current.getOK() != null && current.getLOOPS() !=null
                    &&current.childComplete());
            ENV.setComplete(true);
            ENV = ENV.getOuter();

        }else if(current.getName().equals("Global") || current.getName().equals("Local")){
            //inh
            for (ASTNode a: current.getChildren()) {
                semanticAnalysis(a);
            }
            //syn
            current.setOK(current.childOk());
            current.setCOMPLETE(current.getOK()!=null && current.childComplete());

        }else if(current.getName().equals("Declaration")){
            if(!ENV.getComplete()){
                current.setOK(!ENV.isDefined(current.getOP_code()));
                current.setCOMPLETE(current.getOK()!=null);
                ENV.setDefinition(current.getOP_code(),current);

            }
            if(current.In){
                SIG.addFormalInParameter(current.getOP_code(),current);
            }else if(current.Out){
                SIG.addFormalOutParameter(current.getOP_code(),current);
            }

        }else if(current.getName().equals("Program")){
            //inh
            if(current.getSCOPE()==null){
                current.setSCOPE(new Scope(ENV));
            }

            ENV = current.getSCOPE();

            for (ASTNode a :current.getChildren()) {
                semanticAnalysis(a);
            }
            //syn
            current.setOK(current.childOk());
            current.setCOMPLETE(current.getSCOPE()!=null && current.getOK()!=null&&current.childComplete());
            ENV.setComplete(true);
            ENV = ENV.getOuter();
        }else if(current.getName().equals("Function")){
            //inh
            if(current.getSCOPE()==null){
                current.setSCOPE(new Scope(ENV));
            }

            current.setSIG(new Signature());
            FUN.push(current);
            ENV.setDefinition(current.getOP_code(),current);
            ENV = current.getSCOPE();
            SIG = current.getSIG();
            for (ASTNode a :current.getChildren()) {
                semanticAnalysis(a);
            }
            //syn
            current.setOK(current.childOk());
            current.setCOMPLETE(current.getSCOPE()!=null&&current.getSIG()!=null&&current.getOK()!=null
                    &&current.childComplete());
            ENV.setComplete(true);
            ENV = ENV.getOuter();

        }else if(current.getName().equals("Stats")){
            for(ASTNode a : current.getChildren()){
                semanticAnalysis(a);
            }
            current.setOK(current.childOk());
            current.setCOMPLETE(current.getOK()!=null&&current.childComplete());
        }else if(current.getName().equals("IF")){
            ASTNode exp = current.getChildren().get(0);
            exp.setCoerce(false);
            for(ASTNode c : current.getChildren()){
                semanticAnalysis(c);
            }
            //syn
            current.setOK(!ENV.isDefined(current.Label)&& exp.getKind().equals("Bool") &&current.childOk());
            current.setCOMPLETE(current.getOK()!=null && current.childComplete());
            if(current.Label != null &&!ENV.getComplete()){
                ENV.setDefinition((current.Label),current);
            }

        }else if(current.getName().equals("While")){
            ASTNode exp = current.getChildren().get(0);
            exp.setCoerce(false);
            LOOPS.push(current);
            semanticAnalysis(current.getChildren().get(0));
            semanticAnalysis(current.getChildren().get(1));

            //syn
            current.setOK(!ENV.isDefined(current.Label)&& exp.getKind().equals("Bool") &&current.childOk());
            current.setCOMPLETE(current.getOK()!=null && current.childComplete());
            LOOPS.pop();
            if(current.Label != null &&!ENV.getComplete()){
                ENV.setDefinition(current.Label,current);
            }

        }else if(current.getName().equals("Assign")){
            ASTNode va = current.getChildren().get(0);
            ASTNode exp = current.getChildren().get(1);
            //inh
            if(va.getKind()!=null && exp.getKind()!=null){
                exp.setCoerce(va.getKind().equals("Real")&&exp.getKind().equals("Int"));
            }
            semanticAnalysis(va);
            semanticAnalysis(exp);

            //syn

            current.setOK(((va.getKind().equals("Real")&&isNumericValue(exp.getKind()))
                    || va.getKind().equals(exp.getKind())&&!va.getKind().equals("Error"))
                    && !va.getRO()
                    && !ENV.isDefined(current.Label)
                    && current.childOk());


            current.setCOMPLETE(current.getOK()!=null&&current.childComplete());
            if(current.Label != null &&!ENV.getComplete()){
                ENV.setDefinition(current.Label,current);
            }

        }else if(current.getName().equals("EMPTY")){
            current.setOK(!ENV.isDefined(current.Label));
            current.setCOMPLETE(current.getOK()!=null&&current.TARGET!=null);
            if(current.Label!=null&&!ENV.getComplete()){
                ENV.setDefinition(current.Label,current);
            }
        } else if(current.getName().equals("JMP")){
            if(ENV.getComplete()){
                current.setOK(!ENV.isDefined(current.Label) && ENV.isDefined(current.TARGET.Label));
                current.TARGET = ENV.getDefinition(current.TARGET.Label);
            }else {
                current.setOK(false);
            }
            current.setCOMPLETE(current.getOK()!=null&&current.TARGET!=null);
            if(current.Label!=null&&!ENV.getComplete()){
                ENV.setDefinition(current.Label,current);
            }


        }else if(current.getName().equals("CONT")){
            current.setOK(!ENV.isDefined(current.Label));
            current.TARGET = LOOPS.peek();
            current.setCOMPLETE(current.getOK()!=null&&current.TARGET!=null);
            if(current.Label!=null&&!ENV.getComplete()){
                ENV.setDefinition(current.Label,current);
            }

        }else if(current.getName().equals("EXIT")){
            current.setOK(!ENV.isDefined(current.Label));
            current.TARGET = LOOPS.peek();
            current.setCOMPLETE(current.getOK()!=null&&current.TARGET!=null);
            if(current.Label!=null&&!ENV.getComplete()){
                ENV.setDefinition(current.Label,current);
            }
        }else if(current.getName().equals("FC")){
            //inh
            if(current.TARGET != null){
                for(int i = 0; i<current.getChildren().size();i++){
                    ASTNode t = current.getChildren().get(i);
                    ASTNode p = current.TARGET.getSIG().getIn().get(i);
                    t.setCoerce(p.In && t.getKind().equals("Int")&&p.getKind().equals("Real"));
                }
            }

            for(ASTNode c : current.getChildren()){
                semanticAnalysis(c);
            }
            //syn
            if(ENV.getOuter().getComplete()){
                current.TARGET = ENV.getOuter().getDefinition(current.getOP_code());
                current.setKind(current.TARGET.getKind());
                current.setArgumentType(current.getKind());
                current.setOK(isCompatible(current.getChildren(),current.TARGET.getSIG()) && current.childOk());
                current.setCOMPLETE(current.getKind()!=null&&current.getCoerce()!=null&current.TARGET!=null&&current.getOK()
                        &&current.childComplete());
            }

        }else if(current.getName().equals("Constant")){
            current.setCOMPLETE(true);
            current.setOK(true);
            current.setKind(current.getArgumentType());

        }else if(current.getName().equals("Variable")){
            //syn
            ASTNode temp = ENV.getDefinition(current.getOP_code());
            current.setKind(temp.getKind());
            current.setArgumentType(temp.getKind());
            current.setRO(temp.getRO());
            current.setRW(temp.getRW());
            current.setOK(ENV.getDefinition(current.getOP_code())!=null&&current.getKind()!=null&&current.getRO()!=null
                    &&current.getRW()!=null);
            current.setCOMPLETE(current.getOK());

        }else if(current.getName().equals("UE")){
            //inh
            current.getChildren().get(0).setCoerce(false);
            semanticAnalysis(current.getChildren().get(0));
            ASTNode child =current.getChildren().get(0);
            //syn
            if((child.getKind().equals("Real")||child.getKind().equals("Int"))&&isNumeric(current.getOP_code())){
                current.setKind(child.getKind());
            }else if(child.getKind().equals("Bool")&&current.getOP_code().equals("NOT")){
                current.setKind(child.getKind());
            }else{
                current.setKind("Error");
            }

            current.setOK(!current.getKind().equals("Error")&& current.childOk());
            current.setCOMPLETE(current.getKind() != null && current.getCoerce() != null && child.getCOMPLETE() != null);

        }else if(current.getName().equals("BE")){
            //inh
            if(current.getKind()!= null){
                current.getChildren().get(0).setCoerce(current.getChildren().get(0).getKind().equals("Int") && current.getKind().equals("Real"));
                current.getChildren().get(1).setCoerce(current.getChildren().get(1).getKind().equals("Int") && current.getKind().equals("Real"));
            }

            semanticAnalysis(current.getChildren().get(0));
            semanticAnalysis(current.getChildren().get(1));
            ASTNode left = current.getChildren().get(0);
            ASTNode right = current.getChildren().get(1);
            //syn
            if(left.getKind().equals("Int") && right.getKind().equals("Int")&& isNumeric(current.getOP_code())){
                current.setKind("Int");
            }else if((left.getKind().equals("Real") && isNumericValue(right.getKind())|| isNumericValue(left.getKind()) && right.getKind().equals("Real")) && isNumeric(current.getOP_code())){
                current.setKind("Real");
            }else if(left.getKind().equals("String") && right.getKind().equals("String")&& current.getOP_code().equals("+")){
                current.setKind("String");
            }else if(left.getKind().equals("Bool") && right.getKind().equals("Bool") && isLogic(current.getOP_code())){
                current.setKind("Bool");
            }else if(isNumericValue(left.getKind()) && isNumericValue(right.getKind()) && (isCompareNumeric(current.getOP_code()))|| isCompare(current.getOP_code())){
                current.setKind("Bool");
            }else if(left.getKind().equals(right.getKind()) && isCompare(current.getOP_code())){
                current.setKind("Bool");
            }else{
                current.setKind("Error");
            }
            current.setOK(!current.getKind().equals("Error")&& current.childOk());
            current.setCOMPLETE(current.getKind()!=null && current.getCoerce()!=null);
        }
    }
    private static boolean isCompatible(ArrayList<ASTNode> exp, Signature sig){
        boolean b = false;
        //Auxiliary
        /*
        * boolean isCompatible (List<AstNode> expressions, Signature sig)
        true, if
            same number of actual in-parameters and formal in-paramters
            && i-th actual in-parameter KIND is same or coercible to i-th formal in-paramter KIND
            && same number of actual out-parameters and formal out-paramtere
            && i-th formal out-parameter KIND is same or coercible to i-th actual out-paramter
            && all actual out-parameter are variables and ! READ_ONLY
        false, otherwise */
        if(sig!=null){
            if(exp.size() == sig.getIn().size()){
                for(int i = 0;i<exp.size();i++){
                    if(exp.get(i).getKind().equals(sig.getIn().get(i).getKind())
                            || (isNumericValue(exp.get(i).getKind())) && isNumericValue(sig.getIn().get(i).getKind()))
                    {
                        b=true;
                    }else {
                        return false;
                    }
                }
            }
        }
        return b;
    }
    private static boolean isNumeric(String op){
        String [] a = {"+", "-", "*", "/", "MOD", "**"};
        return Arrays.asList(a).contains(op);
    }
    private static boolean isNumericValue(String kind){
        String [] a = {"Real", "Int"};
        return Arrays.asList(a).contains(kind);
    }
    private static boolean isLogic(String op){
        String [] a = {"AND", "OR", "XOR" };
        return Arrays.asList(a).contains(op);
    }
    private static boolean isCompareNumeric(String op){
        String [] a = {"<", "<=", ">", ">="};
        return Arrays.asList(a).contains(op);
    }
    private static boolean isCompare(String op){
        String [] a = {"==", "<>"};
        return Arrays.asList(a).contains(op);
    }
}
