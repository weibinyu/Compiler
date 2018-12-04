import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.lang.reflect.Array;
import java.util.Stack;

public class ASTConstructListener extends STBaseListener {
    private Stack<ASTNode> s = new Stack<>();
    private int id = 0;
    private int total = 0;
    private ASTNode goal = new ASTNode("Goal",null,null,id);
    @Override
    public void exitGoal(STParser.GoalContext ctx) {
        ASTNode a = s.pop();
        goal.addChild(a);
    }

    @Override
    public void exitExpression(STParser.ExpressionContext ctx) {
        if(!s.empty()){
            if(ctx.getChildCount() == 2){
                ASTNode right = s.pop();
                ASTNode left = s.pop();

                id++;
                ASTNode ue = new ASTNode(left.getName(),"UE",left.getOP_code(),id);
                ue.addChild(right);
                s.push(ue);
            }else if(ctx.getChildCount() == 3){
                ASTNode right = s.pop();
                ASTNode b = s.pop();
                ASTNode left = s.pop();

                id++;
                ASTNode be = new ASTNode(b.getName(),"BE",b.getOP_code(),id);
                be.addChild(left);
                be.addChild(right);
                s.push(be);
            }
        }

    }

    @Override
    public void exitPrimary_expression(STParser.Primary_expressionContext ctx) {
        super.exitPrimary_expression(ctx);
    }

    @Override
    public void exitSimple_value(STParser.Simple_valueContext ctx) {
        super.exitSimple_value(ctx);
    }

    @Override
    public void exitPot(STParser.PotContext ctx) {
        id++;
        ASTNode a = new ASTNode("POT","Numeric",ctx.getText(),id);
        s.add(a);
    }

    @Override
    public void exitMult(STParser.MultContext ctx) {
        id++;
        ASTNode a = new ASTNode("Mult","Numeric",ctx.getText(),id);
        s.add(a);
    }

    @Override
    public void exitAdd(STParser.AddContext ctx) {
        id++;
        ASTNode a = new ASTNode("Add","Numeric",ctx.getText(),id);
        s.add(a);
    }
    @Override
    public void exitCmp(STParser.CmpContext ctx) {
        id++;
        ASTNode a = new ASTNode("Cmp","CompareNumeric",ctx.getText(),id);
        s.add(a);
    }

    @Override
    public void exitEq(STParser.EqContext ctx) {
        id++;
        ASTNode a = new ASTNode("Eq","Compare",ctx.getText(),id);
        s.add(a);
    }

    @Override
    public void exitNeg(STParser.NegContext ctx) {
        id++;
        ASTNode a = new ASTNode("Neg","Logic",ctx.getText(),id);
        s.add(a);
    }

    @Override
    public void exitAnd(STParser.AndContext ctx) {
        id++;
        ASTNode a = new ASTNode("And","Logic",ctx.getText(),id);
        s.add(a);
    }

    @Override
    public void exitOr(STParser.OrContext ctx) {
        id++;
        ASTNode a = new ASTNode("Or","Logic",ctx.getText(),id);
        s.add(a);
    }

    @Override
    public void exitConstant(STParser.ConstantContext ctx) {
        super.exitConstant(ctx);
    }

    @Override
    public void exitReal_literal(STParser.Real_literalContext ctx) {
        id++;
        ASTNode a = new ASTNode("Constant","Real",ctx.getText(),id);
        s.add(a);
    }

    @Override
    public void exitInteger_literal(STParser.Integer_literalContext ctx) {
        id++;
        ASTNode a = new ASTNode("Constant","Int",ctx.getText(),id);
        s.add(a);
    }

    @Override
    public void exitBoolean_literal(STParser.Boolean_literalContext ctx) {
        id++;
        ASTNode a = new ASTNode("Constant","Bool",ctx.getText(),id);
        s.add(a);
    }

    @Override
    public void exitString_literal(STParser.String_literalContext ctx) {
        id++;
        ASTNode a = new ASTNode("Constant","String",ctx.getText(),id);
        s.add(a);
    }

    @Override
    public void exitEveryRule(ParserRuleContext ctx) {
        super.exitEveryRule(ctx);
    }

    @Override
    public void visitTerminal(TerminalNode node) {
        super.visitTerminal(node);
    }

    @Override
    public void visitErrorNode(ErrorNode node) {
        super.visitErrorNode(node);
    }

    public ASTNode getGoal(){
        return goal;
    }

}
