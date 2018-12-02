import java.io.IOException;
import java.util.Arrays;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.graphstream.graph.Graph;
import org.graphstream.graph.implementations.SingleGraph;
import org.graphstream.stream.file.FileSinkGML;

public class Main {
    private static Graph ast = new SingleGraph("ast");
    private static FileSinkGML out1 = new FileSinkGML();
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
            /*while (g.getCOMPLETE()!= true){
                semanticAnalysis(g);
            }*/
            drawGraph(g);

            out1.end();
            //Trees.inspect(tree, parser);
        }catch (IOException e) {
            System.err.println("Input file not found.");
            return;
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
            semanticAnalysis(current.getChildren().get(0));
            ASTNode child =current.getChildren().get(0);
            //syn
            current.setCOMPLETE(child.getCOMPLETE());
            current.setOK(!child.getKind().contains("Error"));
            current.getChildren().get(0).setCoerce(false);

        }else if (current.getName().equals("Constant")){
            current.setCOMPLETE(true);
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
                System.out.println(current.getChildren().get(0).getKind());
                System.out.println(current.getChildren().get(1).getKind());
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

    public static void TaskConstruct(ASTNode start){
        ASTNode current = start;
        if (current.getName().equals("Goal")){
            //inh
            TaskNode t = new TaskNode("Terminate");
            t.setKind("Void");
            current.getChildren().get(0).setNext(t);

            TaskConstruct(current.getChildren().get(0));
            ASTNode child =current.getChildren().get(0);
            //syn
            current.getChildren().get(0).setCoerce(false);
            current.setFirst(child.getFirst());
            current.setLast(child.getLast());

        }else if (current.getName().equals("Constant")){
            current.setCOMPLETE(true);
            current.setKind(current.getArgumentType());

        }else if(current.getArgumentType().equals("UE")){
            //inh
            current.getChildren().get(0).setNext(current.getLast());
            TaskConstruct(current.getChildren().get(0));
            ASTNode child =current.getChildren().get(0);
            //syn
            current.setFirst(child.getFirst());
            TaskNode t = new TaskNode("UE");
            t.setKind(current.getKind());
            t.setOpCode(current.getOP_code());
            t.setCoerce(current.getCoerce());
            current.setLast(t);


        }else if(current.getArgumentType().equals("BE")){

            TaskConstruct(current.getChildren().get(0));
            TaskConstruct(current.getChildren().get(1));
            ASTNode left = current.getChildren().get(0);
            ASTNode right = current.getChildren().get(1);

        }
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
