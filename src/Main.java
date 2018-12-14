import java.io.IOException;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;


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
    private static Signature SIG = new Signature();
    public static void main(String[] args) {
        try {
            out1.begin("AST.gml");
            ast.addSink(out1);
            ast.setStrict(false);

            CharStream codePointCharStream = CharStreams.fromFileName("input.txt");
            STLexer lexer = new STLexer(codePointCharStream);
            STParser parser = new STParser(new CommonTokenStream(lexer));

            parser.reset();
            ParseTree tree = parser.goal();
            ParseTreeWalker walker = new ParseTreeWalker();
            ASTConstructListener astL = new ASTConstructListener ();
            walker.walk(astL, tree);
            ASTNode g = astL.getGoal();
            semanticAnalysis(g);
            semanticAnalysis(g);
            semanticAnalysis(g);
            semanticAnalysis(g);
            semanticAnalysis(g);
            semanticAnalysis(g);
            semanticAnalysis(g);
            System.out.println("sssssss");
            semanticAnalysis(g);
            System.out.println("sssssss");
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
            ast.getNode(String.valueOf(g.getId())).addAttribute("label",g.getName()+" "+ g.getCOMPLETE()+" "+g.getOK());
        }else {
            ast.addNode(String.valueOf(g.getId()));
            ast.getNode(String.valueOf(g.getId())).addAttribute("label", g.getName()+" "+g.getArgumentType()+" "+g.getOP_code() +" " + g.getCOMPLETE() +" "+g.getOK()+ " " +g.getCoerce());
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
            //syn
            current.setOK(!ENV.isDefined(current.getOP_code()));
            current.setCOMPLETE(current.getOK()!=null);
            ENV.setDefinition(current.getOP_code(),current);
            if(current.In){
                SIG.addFormalInParameter(current.getOP_code(),current);
            }else if(current.Out){
                SIG.addFormalOutParameter(current.getOP_code(),current);
            }
        }else if(current.getName().equals("Program")){
            //inh
            current.setSCOPE(new Scope(ENV));
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
            current.setSCOPE(new Scope(ENV));
            current.setSIG(new Signature());
            ENV = current.getSCOPE();
            ENV.setDefinition(current.getOP_code(),current);
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

        }else if(current.getName().equals("JMP")){
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
            for(int i = 0; i<current.getChildren().size();i++){
                ASTNode t = current.getChildren().get(i);
                ASTNode p = current.TARGET.getSIG().getParameter(i);
                t.setCoerce(p.In && t.getKind().equals("Int")&&p.getKind().equals("Real"));
            }
            for(ASTNode c : current.getChildren()){
                semanticAnalysis(c);
            }
            //syn
            if(ENV.getOuter().getComplete()){
                current.TARGET = ENV.getOuter().getDefinition(current.TARGET.getOP_code());
            }
            current.setKind(current.TARGET.getKind());
            current.setOK(isCompatible(current.getChildren(),current.TARGET.getSIG()) && current.childOk());
            current.setCOMPLETE(current.getKind()!=null&&current.getCoerce()!=null&current.TARGET!=null&&current.getOK()
                    &&current.childComplete());

        }else if(current.getName().equals("Constant")){
            current.setCOMPLETE(true);
            current.setOK(true);
            current.setKind(current.getArgumentType());

        }else if(current.getName().equals("Variable")){
            //syn
            ASTNode temp = ENV.getDefinition(current.getOP_code());

            System.out.println(current.getName()+" "+current.getKind()+" "+current.getOP_code()+" "+ENV.isDefined(current.getOP_code()));
            System.out.println(temp.getName()+" "+temp.getKind()+" "+temp.getOP_code());
            System.out.println();
            current.setKind(temp.getKind());
            current.setRO(temp.getRO());
            current.setRW(temp.getRW());
            current.setOK(ENV.isDefined(current.getOP_code())&&current.getKind()!=null&&current.getRO()!=null
                    &&current.getRW()!=null);
            current.setCOMPLETE(current.getOK());
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

            current.setOK(!current.getKind().equals("Error")&& current.childOk());
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
            current.setOK(!current.getKind().equals("Error")&& current.childOk());
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
    private static boolean isCompatible(ArrayList<ASTNode> exp,Signature sig){
        boolean b = false;
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
