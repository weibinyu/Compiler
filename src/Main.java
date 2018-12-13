import java.io.IOException;
import java.util.Arrays;
import java.util.Stack;

import org.antlr.v4.gui.Trees;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.graphstream.graph.Graph;
import org.graphstream.graph.implementations.MultiGraph;
import org.graphstream.graph.implementations.SingleGraph;
import org.graphstream.stream.file.FileSinkGML;

public class Main {
    private static Graph ast = new SingleGraph("ast");
    private static FileSinkGML out1 = new FileSinkGML();
    private static int id = 0;
    private static Graph task = new MultiGraph("task");
    private static FileSinkGML out2 = new FileSinkGML();
    private static Scope ENV;
    private static Stack<ASTNode> LOOPS;
    public static void main(String[] args) {

        try {
            out1.begin("AST.gml");
            ast.addSink(out1);
            ast.setStrict(false);

            CharStream codePointCharStream = CharStreams.fromFileName("input2.txt");
            STLexer lexer = new STLexer(codePointCharStream);
            STParser parser = new STParser(new CommonTokenStream(lexer));

            parser.reset();
            ParseTree tree = parser.goal();
            ParseTreeWalker walker = new ParseTreeWalker();
            ASTConstructListener astL = new ASTConstructListener ();
            walker.walk(astL, tree);
            ASTNode g = astL.getGoal();
            //semanticAnalysis(g);
            //semanticAnalysis(g);
            drawGraph(g);
            out1.end();
            /*
            out2.begin("TASK.gml");
            task.addSink(out2);
            task.setStrict(false);

            taskConstruct(g);
            taskConstruct(g);
            drawTask(g);
            Interpreter(g.getFirst());
            out2.end();
            */
            //Trees.inspect(tree, parser);
        }catch (IOException e) {
            System.err.println("Input file not found.");
            return;
        }
    }
    //add edges and draw graph
    public static void drawTask(ASTNode start){
        ASTNode current = start;

        if (current.getName().equals("Goal")){
            task.addNode("Start");
            task.getNode("Start").addAttribute("label","Start");
            TaskNode first = current.getFirst();
            TaskNode last = current.getLast();
            TaskNode el = current.getChildren().get(0).getNext();
            addTaskG(first);
            addTaskG(last);
            addTaskG(el);

            task.addEdge("Start CE "+first.getTask(),"Start",String.valueOf(first.getId()));
            task.addEdge(last.getTask()+" CE "+el.getTask(),String.valueOf(last.getId()),String.valueOf(el.getId()));

            drawTask(current.getChildren().get(0));

        }else if(current.getArgumentType().equals("UE")){

            TaskNode ue = current.getLast();
            TaskNode e = current.getChildren().get(0).getLast();
            addTaskG(ue);
            addTaskG(e);

            task.addEdge(e.getId()+" CE " + ue.getId(),String.valueOf(e.getId()),String.valueOf(ue.getId()));
            task.addEdge(ue.getId()+" DE " + e.getId(),String.valueOf(ue.getId()),String.valueOf(e.getId()));

            drawTask(current.getChildren().get(0));

        }else if(current.getArgumentType().equals("BE")){

            TaskNode e1l = current.getChildren().get(0).getLast();
            TaskNode e2f = current.getChildren().get(1).getFirst();
            TaskNode e2l = current.getChildren().get(1).getLast();
            TaskNode b = current.getLast();
            addTaskG(e1l);
            addTaskG(e2f);
            addTaskG(e2l);
            addTaskG(b);

            task.addEdge(e1l.getId()+" CE " + e2f.getId(),String.valueOf(e1l.getId()),String.valueOf(e2f.getId()));
            task.addEdge(e2l.getId()+" CE " + b.getId(),String.valueOf(e2l.getId()),String.valueOf(b.getId()));
            task.addEdge(b.getId()+" DE " + e1l.getId(),String.valueOf(b.getId()),String.valueOf(e1l.getId()));
            task.addEdge(b.getId()+" DE " + e2l.getId(),String.valueOf(b.getId()),String.valueOf(e2l.getId()));

            drawTask(current.getChildren().get(0));
            drawTask(current.getChildren().get(1));
        }
    }

    public static void drawGraph(ASTNode goal){
        ASTNode g = goal;

        if(g.getName().equals("Goal")){
            ast.addNode(String.valueOf(g.getId()));
            ast.getNode(String.valueOf(g.getId())).addAttribute("label",g.getName()+" "+ g.getCOMPLETE());
        }else {
            ast.addNode(String.valueOf(g.getId()));
            ast.getNode(String.valueOf(g.getId())).addAttribute("label", g.getName()+" "+g.getArgumentType()+" "+g.getOP_code() +" " + g.getCOMPLETE() + " " +g.getCoerce());
        }
        for(ASTNode a : g.getChildren()){
            drawGraph(a);
            ast.addEdge(g.getId()+" to "+a.getId(), String.valueOf(g.getId()), String.valueOf(a.getId()),true);
        }
    }
    public static void semanticAnalysis(ASTNode start){
        ASTNode current = start;
        if (current.getName().equals("Goal")){
            //inh
            current.setSCOPE(new Scope(null));
            current.setLOOPS(new Stack<>());
            ENV = current.getSCOPE();
            LOOPS = current.getLOOPS();

            semanticAnalysis(current.getChildren().get(0));
            //syn
            current.setOK(current.isOk());
            current.setCOMPLETE(current.getSCOPE() != null && current.getOK() != null && current.getLOOPS() !=null
                    &&current.isComplete());
            ENV.setComplete(true);
            ENV = ENV.getOuter();

        }else if(current.getName().equals("Global") || current.getName().equals("Local")){
            //inh
            for (ASTNode a: current.getChildren()) {
                semanticAnalysis(a);
            }
            //syn
            current.setOK(current.isOk());
            current.setCOMPLETE(current.getOK()!=null&&current.isComplete());

        }else if(current.getName().equals("Declaration")){
            //inh

            //syn
            current.setOK(ENV.isDefined(current.getOP_code()));
            current.setCOMPLETE(current.getOK()!=null);
            /*ENV.setDefinition(current.getOP_code(),current);
            if (Declaration.IN)
                SIG.addFormalInParameter(Declaration.ID,Declaration);
            if (Declaration.OUT)
                SIG.addFormalOutParameter(Declaration.ID,Declaration);
             */
        }else if(current.getName().equals("Program")){
            //inh TODO
            current.setSCOPE(new Scope(ENV));
            ENV = current.getSCOPE();

            for (ASTNode a :current.getChildren()) {
                semanticAnalysis(a);
            }
            //syn
            current.setOK(current.isOk());
            current.setCOMPLETE(current.getSCOPE()!=null && current.getOK()!=null&&current.isComplete());
            ENV.setComplete(true);
            ENV = ENV.getOuter();
        }else if(current.getName().equals("Function")){
            //inh
            current.setSCOPE(new Scope(ENV));
            //current.setSIG();
            ENV = current.getSCOPE();
            //SIG = current.getSIG();

            //syn
            current.setOK(current.isOk());
            //current.setCOMPLETE(current.getSCOPE()!=null&&);
        }else if(current.getName().equals("Stats")){
            current.setOK(current.isOk());
            current.setCOMPLETE(current.getOK()!=null&&current.isComplete());
        }else if(current.getName().equals("IF")){
            //inh
            current.getChildren().get(0).setCoerce(false);
            //syn

        }else if(current.getName().equals("Constant")){
            current.setCOMPLETE(true);
            current.setOK(true);
            current.setKind(current.getArgumentType());

        }else if(current.getArgumentType().equals("UE")){
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

            current.setCOMPLETE(current.getKind() != null && current.getCoerce() != null && child.getCOMPLETE() != null);

        }else if(current.getArgumentType().equals("BE")){
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

            current.setCOMPLETE(current.getKind()!=null && current.getCoerce()!=null);
        }
    }

    public static void taskConstruct(ASTNode start){
        ASTNode current = start;
        if (current.getName().equals("Goal")){
            //inh
            TaskNode t = new TaskNode("Terminate",id);
            id++;
            t.setKind("Void");
            t.setSort(t.getTask());
            current.getChildren().get(0).setNext(t);

            taskConstruct(current.getChildren().get(0));
            ASTNode child =current.getChildren().get(0);
            //syn
            current.setFirst(child.getFirst());
            current.setLast(child.getLast());

        }else if (current.getName().equals("Constant")){
            if(current.getLast() == null) {
                TaskNode t = new TaskNode("Const", id);
                id++;
                t.setKind(current.getKind());
                t.setValue(current.getOP_code());
                t.setCoerce(current.getCoerce());
                t.setNext(current.getNext());
                t.setSort(t.getKind());
                current.setLast(t);
                current.setFirst(current.getLast());
            }
            TaskNode t = current.getLast();
            t.setKind(current.getKind());
            t.setValue(current.getOP_code());
            t.setCoerce(current.getCoerce());
            t.setNext(current.getNext());
            t.setSort(t.getKind());
            if(t.getCoerce()){
                t.setKind("Real");
            }
            current.setFirst(current.getLast());

        }else if(current.getArgumentType().equals("UE")){
            //inh
            current.getChildren().get(0).setNext(current.getLast());
            taskConstruct(current.getChildren().get(0));
            ASTNode child =current.getChildren().get(0);
            //syn
            current.setFirst(child.getFirst());
            if(current.getLast() == null){
                TaskNode t = new TaskNode("UE",id);
                id++;
                t.setKind(current.getKind());
                t.setOpCode(current.getOP_code());
                t.setCoerce(current.getCoerce());
                t.setNext(current.getNext());
                t.setPred(child.getLast());
                current.setLast(t);
            }
            TaskNode t = current.getLast();
            t.setKind(current.getKind());
            t.setOpCode(current.getOP_code());
            t.setCoerce(current.getCoerce());
            t.setNext(current.getNext());
            t.setPred(child.getLast());
            if(t.getCoerce()){
                t.setKind("Real");
            }

        }else if(current.getArgumentType().equals("BE")){
            //inh
            current.getChildren().get(0).setNext(current.getChildren().get(1).getFirst());
            current.getChildren().get(1).setNext(current.getLast());
            taskConstruct(current.getChildren().get(0));
            taskConstruct(current.getChildren().get(1));
            ASTNode left = current.getChildren().get(0);
            ASTNode right = current.getChildren().get(1);
            //syn
            current.setFirst(left.getFirst());
            if(current.getLast() == null){
                TaskNode t = new TaskNode("BE",id);
                id++;
                t.setKind(current.getKind());
                t.setOpCode(current.getOP_code());
                t.setCoerce(current.getCoerce());
                t.setNext(current.getNext());
                t.setPredLeft(left.getLast());
                t.setPredRight(right.getLast());
                current.setLast(t);
            }
            TaskNode t = current.getLast();
            t.setKind(current.getKind());
            t.setOpCode(current.getOP_code());
            t.setCoerce(current.getCoerce());
            t.setNext(current.getNext());
            t.setPredLeft(left.getLast());
            t.setPredRight(right.getLast());
            if(t.getCoerce()){
                t.setKind("Real");
            }
        }

    }

    private static void Interpreter(TaskNode t) {
        TaskNode CT = t;
        while (CT != null) {
            if (CT.getTask().equals("UE")) {
                if (CT.getOpCode().equals("-")) {
                    if(CT.getPred().getKind().equals("Int")){
                        int i = 0 - Integer.valueOf(CT.getPred().getValue());
                        CT.setValue(String.valueOf(i));
                    }else{
                        double i = 0 - Double.valueOf(CT.getPred().getValue());
                        CT.setValue(String.valueOf(i));
                    }
                } else if (CT.getOpCode().equals("NOT")) {
                        boolean i = !Boolean.valueOf(CT.getPred().getValue());
                        CT.setValue(String.valueOf(i));
                }
            } else if (CT.getTask().equals("BE")) {
                if (CT.getOpCode().equals("+")) {
                    if(CT.getPredLeft().getKind().equals("String")){
                        String s = CT.getPredLeft().getValue()+CT.getPredRight().getValue();
                        CT.setValue(s);
                    }else if(CT.getPredLeft().getKind().equals("Int")){
                        int left = Integer.valueOf(CT.getPredLeft().getValue());
                        int right = Integer.valueOf(CT.getPredRight().getValue());
                        CT.setValue(String.valueOf(left + right));
                    }else{
                        double left = Double.valueOf(CT.getPredLeft().getValue());
                        double right = Double.valueOf(CT.getPredRight().getValue());
                        CT.setValue(String.valueOf(left + right));
                    }

                } else if (CT.getOpCode().equals("-")) {
                    if(CT.getPredLeft().getKind().equals("Int")){
                        int left = Integer.valueOf(CT.getPredLeft().getValue());
                        int right = Integer.valueOf(CT.getPredRight().getValue());
                        CT.setValue(String.valueOf(left - right));
                    }else{
                        double left = Double.valueOf(CT.getPredLeft().getValue());
                        double right = Double.valueOf(CT.getPredRight().getValue());
                        CT.setValue(String.valueOf(left - right));
                    }
                } else if (CT.getOpCode().equals("*")) {
                    if(CT.getPredLeft().getKind().equals("Int")){
                        int left = Integer.valueOf(CT.getPredLeft().getValue());
                        int right = Integer.valueOf(CT.getPredRight().getValue());
                        CT.setValue(String.valueOf(left * right));
                    }else{
                        double left = Double.valueOf(CT.getPredLeft().getValue());
                        double right = Double.valueOf(CT.getPredRight().getValue());
                        CT.setValue(String.valueOf(left * right));
                    }
                } else if (CT.getOpCode().equals("/")) {
                    if(CT.getPredLeft().getKind().equals("Int")){
                        int left = Integer.valueOf(CT.getPredLeft().getValue());
                        int right = Integer.valueOf(CT.getPredRight().getValue());
                        CT.setValue(String.valueOf(left / right));
                    }else{
                        double left = Double.valueOf(CT.getPredLeft().getValue());
                        double right = Double.valueOf(CT.getPredRight().getValue());
                        CT.setValue(String.valueOf(left / right));
                    }
                } else if (CT.getOpCode().equals("MOD")) {
                    if(CT.getPredLeft().getKind().equals("Int")){
                        int left = Integer.valueOf(CT.getPredLeft().getValue());
                        int right = Integer.valueOf(CT.getPredRight().getValue());
                        CT.setValue(String.valueOf(left % right));
                    }else{
                        double left = Double.valueOf(CT.getPredLeft().getValue());
                        double right = Double.valueOf(CT.getPredRight().getValue());
                        CT.setValue(String.valueOf(left % right));
                    }
                } else if (CT.getOpCode().equals("**")) {
                    if(CT.getPredLeft().getKind().equals("Int")){
                        int left = Integer.valueOf(CT.getPredLeft().getValue());
                        int right = Integer.valueOf(CT.getPredRight().getValue());
                        CT.setValue(String.valueOf((int)Math.pow(left,right)));
                    }else{
                        double left = Double.valueOf(CT.getPredLeft().getValue());
                        double right = Double.valueOf(CT.getPredRight().getValue());
                        CT.setValue(String.valueOf(Math.pow(left,right)));
                    }
                } else if (CT.getOpCode().equals(">")) {
                    if(CT.getPredLeft().getKind().equals("Int")){
                        int left = Integer.valueOf(CT.getPredLeft().getValue());
                        int right = Integer.valueOf(CT.getPredRight().getValue());
                        CT.setValue(String.valueOf(left > right));
                    }else{
                        double left = Double.valueOf(CT.getPredLeft().getValue());
                        double right = Double.valueOf(CT.getPredRight().getValue());
                        CT.setValue(String.valueOf(left > right));
                    }
                } else if (CT.getOpCode().equals("<")) {
                    if(CT.getPredLeft().getKind().equals("Int")){
                        int left = Integer.valueOf(CT.getPredLeft().getValue());
                        int right = Integer.valueOf(CT.getPredRight().getValue());
                        CT.setValue(String.valueOf(left < right));
                    }else{
                        double left = Double.valueOf(CT.getPredLeft().getValue());
                        double right = Double.valueOf(CT.getPredRight().getValue());
                        CT.setValue(String.valueOf(left < right));
                    }
                } else if (CT.getOpCode().equals(">=")) {
                    if(CT.getPredLeft().getKind().equals("Int")){
                        int left = Integer.valueOf(CT.getPredLeft().getValue());
                        int right = Integer.valueOf(CT.getPredRight().getValue());
                        CT.setValue(String.valueOf(left >= right));
                    }else{
                        double left = Double.valueOf(CT.getPredLeft().getValue());
                        double right = Double.valueOf(CT.getPredRight().getValue());
                        CT.setValue(String.valueOf(left >= right));
                    }
                } else if (CT.getOpCode().equals("<=")) {
                    if(CT.getPredLeft().getKind().equals("Int")){
                        int left = Integer.valueOf(CT.getPredLeft().getValue());
                        int right = Integer.valueOf(CT.getPredRight().getValue());
                        CT.setValue(String.valueOf(left <= right));
                    }else{
                        double left = Double.valueOf(CT.getPredLeft().getValue());
                        double right = Double.valueOf(CT.getPredRight().getValue());
                        CT.setValue(String.valueOf(left <= right));
                    }
                } else if (CT.getOpCode().equals("==")) {
                    CT.setValue(String.valueOf(CT.getPredLeft().getValue().equals(CT.getPredRight().getValue())));
                } else if (CT.getOpCode().equals("<>")) {
                    CT.setValue(String.valueOf(!CT.getPredLeft().getValue().equals(CT.getPredRight().getValue())));
                } else if (CT.getOpCode().equals("AND")) {
                    boolean left = Boolean.valueOf(CT.getPredLeft().getValue());
                    boolean right = Boolean.valueOf(CT.getPredRight().getValue());
                    CT.setValue(String.valueOf(left && right));
                }else if (CT.getOpCode().equals("OR")) {

                    boolean left = Boolean.valueOf(CT.getPredLeft().getValue());
                    boolean right = Boolean.valueOf(CT.getPredRight().getValue());
                    CT.setValue(String.valueOf(left || right));
                }
                else if (CT.getOpCode().equals("XOR")) {
                    boolean left = Boolean.valueOf(CT.getPredLeft().getValue());
                    boolean right = Boolean.valueOf(CT.getPredRight().getValue());
                    CT.setValue(String.valueOf(left ^ right));
                }
            }
            if(CT.getNext() != null){
                if(CT.getTask().equals("Const")){
                    System.out.println("Task value of "+CT.getTask()+" is "+CT.getValue()+" and next is " +CT.getNext().getTask());
                }else {
                    System.out.println("Task value of "+CT.getTask()+" is "+CT.getValue()+ " op is "+ CT.getOpCode()+" and next is " +CT.getNext().getTask());
                }

            }
            CT = CT.getNext();

        }
    }

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
    private static boolean isCompatible(){
        return false;
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
    //add created Task node as graph node.
    private static void addTaskG(TaskNode n){
        if(n.getTask().equals("Const")){
            task.addNode(String.valueOf(n.getId()));
            task.getNode(String.valueOf(n.getId())).addAttribute("label", n.getValue()+"("+n.getKind()+" "+n.getCoerce()+")");
        }else if(n.getTask().equals("Terminate")){
            task.addNode(String.valueOf(n.getId()));
            task.getNode(String.valueOf(n.getId())).addAttribute("label", n.getTask()+"("+n.getKind()+" "+n.getCoerce()+")");
        }else{
            task.addNode(String.valueOf(n.getId()));
            task.getNode(String.valueOf(n.getId())).addAttribute("label", n.getOpCode()+"("+n.getKind()+" "+n.getCoerce()+")");
        }
    }

}
