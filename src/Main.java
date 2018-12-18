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
    private static int id = 0;
    private static Graph ast = new SingleGraph("ast");
    private static FileSinkGML out1 = new FileSinkGML();
    private static Graph task = new MultiGraph("task");
    private static FileSinkGML out2 = new FileSinkGML();
    private static AGConstruct aC = new AGConstruct();
    private static TaskConstruct tC = new TaskConstruct();

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
            int count = 0;
            while((!g.getCOMPLETE()||!g.getOK())&& count<10){
                count ++;
                aC.semanticAnalysis(g);
            }
            drawGraph(g);
            out1.end();

            out2.begin("TASK.gml");
            task.addSink(out2);
            task.setStrict(false);

            //for(int i = 2;i<g.getChildren().size();i++){
                taskConstruct(g);
                taskConstruct(g);
            //}
            //for(int i = 2;i<g.getChildren().size();i++){
                drawTask(g);
            //}

            out2.end();
             /*
            Interpreter(g.getFirst());

            */
            //Trees.inspect(tree, parser);
        }catch (IOException e) {
            System.err.println("Input file not found.");
            return;
        }
    }
    //add edges and draw graph
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

    public static void taskConstruct(ASTNode start){
        ASTNode current = start;
        if (current.getName().equals("Goal")){
            for(ASTNode a : current.getChildren()){
                taskConstruct(a);
            }
        }else if(current.getName().equals("Program")){
            if(current.getNext()==null){
                TaskNode t = new TaskNode("Terminate",id);
                id++;
                current.setNext(t);
                addTaskG(t);
            }
            current.getChildren().get(1).setNext(current.getNext());
            taskConstruct(current.getChildren().get(1));
        }else if(current.getName().equals("Function")){
            if(current.getNext()==null){
                TaskNode t = new TaskNode("Return",id);
                id++;
                current.setNext(t);
                addTaskG(t);
            }
            current.getChildren().get(1).setNext(current.getNext());
            taskConstruct(current.getChildren().get(1));
        }else if(current.getName().equals("Stats")){
            for(int i = 0;i<current.getChildren().size()-1;i++){
                current.getChildren().get(i).setNext(current.getChildren().get(i+1).getFirst());
            }
            for(int i = 0;i<current.getChildren().size();i++){
                taskConstruct(current.getChildren().get(i));
            }
            current.setFirst(current.getChildren().get(0).getFirst());
            current.getChildren().get(current.getChildren().size()-1).setNext(current.getNext());
            current.setLast(current.getChildren().get(current.getChildren().size()-1).getLast());

        }else if(current.getName().equals("Assign")){
            ASTNode va = current.getChildren().get(0);
            ASTNode exp = current.getChildren().get(1);

            taskConstruct(exp);
            //TODO print
            System.out.println(va.getName()+" "+va.getOP_code()+" "+va.getRW());
            if(exp.getNext()==null){
                if(va.getRW()){
                    TaskNode t = new TaskNode("Print", id);
                    id++;
                    t.setPred(exp.getLast());
                    t.setNext(current.getNext());
                    t.setKind(va.getKind());
                    addTaskG(t);
                    exp.setNext(t);
                }else {
                    TaskNode t = new TaskNode("Store", id);
                    id++;
                    t.setPred(exp.getLast());
                    t.setNext(current.getNext());
                    t.setKind(va.getKind());
                    t.setOpCode(va.getOP_code());
                    t.varName = va.getOP_code();
                    t.isLoacl = true;
                    addTaskG(t);
                    exp.setNext(t);
                }
            }
            if(va.getRW()){
                TaskNode t = exp.getNext();
                t.setPred(exp.getLast());
                t.setNext(current.getNext());
                t.setKind(va.getKind());
            }else {
                TaskNode t = exp.getNext();
                t.setPred(exp.getLast());
                t.setNext(current.getNext());
                t.setOpCode(va.getOP_code());
                t.setKind(va.getKind());
                t.varName = va.getOP_code();
                t.isLoacl = true;

            }
            current.setFirst(exp.getFirst());

        }else if(current.getName().equals("Variable")){
            if(current.varRef){
                if(current.getLast() == null) {
                    TaskNode t = new TaskNode("Load", id);
                    id++;
                    t.setKind(current.getKind());
                    t.varName = current.getOP_code();
                    t.setCoerce(current.getCoerce());
                    t.setNext(current.getNext());
                    t.setOpCode(current.getOP_code());
                    t.setPred(current.getPred());
                    t.setSort(t.getKind());
                    current.setLast(t);
                    current.setFirst(current.getLast());
                    addTaskG(t);
                }
                TaskNode t = current.getLast();
                t.setKind(current.getKind());
                t.varName = current.getOP_code();
                t.setCoerce(current.getCoerce());
                t.setOpCode(current.getOP_code());
                t.setNext(current.getNext());
                t.setPred(current.getPred());
                t.setSort(t.getKind());
            }
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
                addTaskG(t);
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

        }else if(current.getName().equals("IF")){
            ASTNode exp = current.getChildren().get(0);
            for (int i=0;i<current.getChildren().size();i++){
                if(i>0){
                    current.getChildren().get(i).setNext(current.getNext());
                }
                taskConstruct(current.getChildren().get(i));
            }

            if(exp.getNext()==null){
                TaskNode t = new TaskNode("IF",id);
                id++;
                t.setPred(exp.getLast());
                exp.setNext(t);
                t.t = current.getChildren().get(1);
                if(current.getChildren().size()>2){
                    t.f = current.getChildren().get(2);
                }
                addTaskG(t);
            }
            TaskNode t = exp.getNext();
            t.setPred(exp.getLast());
            exp.setNext(t);
            t.t = current.getChildren().get(1);
            if(current.getChildren().size()>2){
                t.f = current.getChildren().get(2);
            }
            current.setFirst(exp.getFirst());

        }else if(current.getName().equals("While")){
            ASTNode exp = current.getChildren().get(0);
            ASTNode st = current.getChildren().get(1);
            taskConstruct(exp);
            taskConstruct(st);

            if(exp.getNext()==null){
                TaskNode t = new TaskNode("IF",id);
                id++;
                t.setPred(exp.getLast());
                exp.setNext(t);
                t.t = current.getChildren().get(1);
                t.f = current;
                addTaskG(t);
            }
            TaskNode t = exp.getNext();
            t.setPred(exp.getLast());
            exp.setNext(t);
            t.t = current.getChildren().get(1);
            t.f = current;
            current.setFirst(exp.getFirst());
            st.setNext(exp.getFirst());
        }else if(current.getName().equals("FC")){
            if(current.getLast()==null){
                TaskNode p = new TaskNode("Push",id);
                p.setOpCode(current.getOP_code());
                id++;
                addTaskG(p);
                TaskNode c = new TaskNode("Call",id);
                id++;
                addTaskG(c);
                for(ASTNode a : current.getChildren()){
                    taskConstruct(a);
                }
                p.setNext(current.getChildren().get(0).getFirst());
                current.TARGET.getSIG().reverse();
                for(int i = 0;i<current.getChildren().size();i++){
                    TaskNode s = new TaskNode("Store",id);
                    id++;
                    s.setOpCode(current.TARGET.getSIG().getIn().get(i).getOP_code());
                    if(i+1<current.getChildren().size()){
                        s.setNext(current.getChildren().get(i+1).getFirst());
                    }
                    current.getChildren().get(i).getLast().setNext(s);
                    addTaskG(s);
                }
                current.getChildren().get(current.getChildren().size()-1).getLast().getNext().setNext(c);
                current.setFirst(p);
                current.setLast(c);
            }

        }else if(current.getName().equals("UE")){
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
                addTaskG(t);
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

        }else if(current.getName().equals("BE")){
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
                addTaskG(t);
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

    public static void drawTask(ASTNode start){
        ASTNode current = start;
        if (current.getName().equals("Goal")){
            for (ASTNode a: current.getChildren()) {
                drawTask(a);
            }

        }else if(current.getName().equals("Program")){
            task.addNode("Start");
            task.getNode("Start").addAttribute("label","Start");
            TaskNode first = current.getChildren().get(1).getFirst();

            task.addEdge("Start CE "+first.getTask(),"Start",String.valueOf(first.getId()));

            drawTask(current.getChildren().get(1));
        }else if(current.getName().equals("Function")){
            drawTask(current.getChildren().get(1));
        }else if(current.getName().equals("Stats")){
            addTaskG(current.getFirst());
            for (ASTNode a:current.getChildren()) {
                drawTask(a);
            }
        }else if(current.getName().equals("Assign")){
            ASTNode exp = current.getChildren().get(1);
            TaskNode st = exp.getNext();

            drawTask(exp);
            System.out.println(st.getTask()+" "+st.getOpCode());
            task.addEdge(exp.getLast().getId()+" CE " + st.getId(),String.valueOf(exp.getLast().getId()),String.valueOf(st.getId()));
            task.addEdge(st.getId()+" DE " + exp.getLast().getId(),String.valueOf(st.getId()),String.valueOf(exp.getLast().getId()));
            task.addEdge(st.getId()+" CE " + current.getNext().getId(),String.valueOf(st.getId()),String.valueOf(current.getNext().getId()));

        }else if(current.getName().equals("IF")){
            ASTNode exp = current.getChildren().get(0);
            TaskNode taskNode = exp.getNext();
            ASTNode t = taskNode.t;
            ASTNode f = taskNode.f;

            drawTask(exp);
            drawTask(t);
            drawTask(f);

            task.addEdge(exp.getLast().getId()+" CE " + taskNode.getId(),String.valueOf(exp.getLast().getId()),String.valueOf(taskNode.getId()));
            task.addEdge(taskNode.getId()+" CE " + t.getFirst().getId(),String.valueOf(taskNode.getId()),String.valueOf(t.getFirst().getId()));
            task.addEdge(taskNode.getId()+" CE " + f.getFirst().getId(),String.valueOf(taskNode.getId()),String.valueOf(f.getFirst().getId()));

        }else if(current.getName().equals("While")){
            ASTNode exp = current.getChildren().get(0);
            ASTNode st = current.getChildren().get(1);
            TaskNode taskNode = exp.getNext();
            ASTNode t = taskNode.t;
            ASTNode f = taskNode.f;

            drawTask(exp);
            drawTask(st);

            task.addEdge(exp.getLast().getId()+" CE " + taskNode.getId(),String.valueOf(exp.getLast().getId()),String.valueOf(taskNode.getId()));
            task.addEdge(taskNode.getId()+" CE " + t.getFirst().getId(),String.valueOf(taskNode.getId()),String.valueOf(t.getFirst().getId()));
            task.addEdge(taskNode.getId()+" CE " + f.getNext().getId(),String.valueOf(taskNode.getId()),String.valueOf(f.getNext().getId()));


        }else if(current.getName().equals("FC")){
            task.addEdge(current.getFirst().getId()+" CE "+current.getFirst().getNext().getId()
                    ,String.valueOf(current.getFirst().getId()),String.valueOf(current.getFirst().getNext().getId()));


            for(int i = 0;i<current.getChildren().size();i++){
                drawTask(current.getChildren().get(i));
                TaskNode f = current.getChildren().get(i).getLast();
                TaskNode s = current.getChildren().get(i).getLast().getNext();
                task.addEdge(f.getId()+" CE "+ s.getId(),String.valueOf(f.getId()),String.valueOf(s.getId()));
                task.addEdge(s.getId()+" DE "+ f.getId(),String.valueOf(s.getId()),String.valueOf(f.getId()));
                task.addEdge(s.getId()+" CE "+ s.getNext().getId(),String.valueOf(s.getId()),String.valueOf(s.getNext().getId()));
            }
        }else if(current.getName().equals("UE")){

            TaskNode ue = current.getLast();
            TaskNode e = current.getChildren().get(0).getLast();

            task.addEdge(e.getId()+" CE " + ue.getId(),String.valueOf(e.getId()),String.valueOf(ue.getId()));
            task.addEdge(ue.getId()+" DE " + e.getId(),String.valueOf(ue.getId()),String.valueOf(e.getId()));

            drawTask(current.getChildren().get(0));

        }else if(current.getName().equals("BE")){

            TaskNode e1l = current.getChildren().get(0).getLast();
            TaskNode e2f = current.getChildren().get(1).getFirst();
            TaskNode e2l = current.getChildren().get(1).getLast();
            TaskNode b = current.getLast();

            task.addEdge(e1l.getId()+" CE " + e2f.getId(),String.valueOf(e1l.getId()),String.valueOf(e2f.getId()));
            task.addEdge(e2l.getId()+" CE " + b.getId(),String.valueOf(e2l.getId()),String.valueOf(b.getId()));
            task.addEdge(b.getId()+" DE " + e1l.getId(),String.valueOf(b.getId()),String.valueOf(e1l.getId()));
            task.addEdge(b.getId()+" DE " + e2l.getId(),String.valueOf(b.getId()),String.valueOf(e2l.getId()));

            drawTask(current.getChildren().get(0));
            drawTask(current.getChildren().get(1));
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


    //add created Task node as graph node.
    private static void addTaskG(TaskNode n){
        if(n.getTask().equals("Const")){
            task.addNode(String.valueOf(n.getId()));
            task.getNode(String.valueOf(n.getId())).addAttribute("label", n.getValue()+" "+n.getKind());
        }else if(n.getTask().equals("Terminate")){
            task.addNode(String.valueOf(n.getId()));
            task.getNode(String.valueOf(n.getId())).addAttribute("label", n.getTask()+" "+n.getKind());
        }else{
            task.addNode(String.valueOf(n.getId()));
            task.getNode(String.valueOf(n.getId())).addAttribute("label", n.getTask()+" "+n.getOpCode()+" "+n.getKind());
        }
    }

}
