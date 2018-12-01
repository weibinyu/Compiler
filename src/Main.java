import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.antlr.v4.gui.Trees;
import org.antlr.v4.runtime.*;

public class Main {
    public static final String INPUT_FILE = "input.txt";
    public static void main(String[] args) {

        try {
            CharStream codePointCharStream = CharStreams.fromFileName("input.txt");
            STLexer lexer = new STLexer(codePointCharStream);
            STParser parser = new STParser(new CommonTokenStream(lexer));
            ParserRuleContext ruleContext = parser.goal();
            ASTConstructVisitor astV = new ASTConstructVisitor();
            astV.visit(ruleContext);

            Trees.inspect(ruleContext, parser);
        }catch (IOException e) {
            System.err.println("Input file not found.");
            return;
        }
    }
}
