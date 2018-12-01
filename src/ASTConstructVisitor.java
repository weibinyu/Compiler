import grail.simpletree.TreeNode;
import java.util.Stack;

public class ASTConstructVisitor extends STBaseVisitor<Object> {
    Stack<ASTNode> s = new Stack<>();

    @Override
    public Object visitGoal(STParser.GoalContext ctx) {
        return super.visitGoal(ctx);
    }

    @Override
    public Object visitExpression(STParser.ExpressionContext ctx) {
        return super.visitExpression(ctx);
    }

    @Override
    public Object visitPrimary_expression(STParser.Primary_expressionContext ctx) {
        return super.visitPrimary_expression(ctx);
    }

    @Override
    public Object visitSimple_value(STParser.Simple_valueContext ctx) {
        return super.visitSimple_value(ctx);
    }

    @Override
    public Object visitPot(STParser.PotContext ctx) {
        System.out.println(ctx.getText());
        return super.visitPot(ctx);
    }

    @Override
    public Object visitMult(STParser.MultContext ctx) {
        System.out.println(ctx.getText());
        return super.visitMult(ctx);
    }

    @Override
    public Object visitAdd(STParser.AddContext ctx) {
        System.out.println(ctx.getText());
        return super.visitAdd(ctx);
    }

    @Override
    public Object visitCmp(STParser.CmpContext ctx) {
        return super.visitCmp(ctx);
    }

    @Override
    public Object visitEq(STParser.EqContext ctx) {
        return super.visitEq(ctx);
    }

    @Override
    public Object visitNeg(STParser.NegContext ctx) {
        return super.visitNeg(ctx);
    }

    @Override
    public Object visitAnd(STParser.AndContext ctx) {
        return super.visitAnd(ctx);
    }

    @Override
    public Object visitOr(STParser.OrContext ctx) {
        return super.visitOr(ctx);
    }

    @Override
    public Object visitConstant(STParser.ConstantContext ctx) {
        return super.visitConstant(ctx);
    }

    @Override
    public Object visitReal_literal(STParser.Real_literalContext ctx) {
        System.out.println(ctx.getText());
        return super.visitReal_literal(ctx);
    }

    @Override
    public Object visitInteger_literal(STParser.Integer_literalContext ctx) {
        System.out.println(ctx.getText());
        return super.visitInteger_literal(ctx);
    }

    @Override
    public Object visitBoolean_literal(STParser.Boolean_literalContext ctx) {
        System.out.println(ctx.getText());
        ASTNode b = new ASTNode("Const","Expression",ctx.getText());
        return super.visitBoolean_literal(ctx);
    }

    @Override
    public Object visitString_literal(STParser.String_literalContext ctx) {
        System.out.println(ctx.getText());
        return super.visitString_literal(ctx);
    }
}
