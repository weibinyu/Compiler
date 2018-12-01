// Generated from C:/Users/weibin/IdeaProjects/Compiler/src\ST.g4 by ANTLR 4.7
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link STParser}.
 */
public interface STListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link STParser#goal}.
	 * @param ctx the parse tree
	 */
	void enterGoal(STParser.GoalContext ctx);
	/**
	 * Exit a parse tree produced by {@link STParser#goal}.
	 * @param ctx the parse tree
	 */
	void exitGoal(STParser.GoalContext ctx);
	/**
	 * Enter a parse tree produced by {@link STParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(STParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link STParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(STParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link STParser#primary_expression}.
	 * @param ctx the parse tree
	 */
	void enterPrimary_expression(STParser.Primary_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link STParser#primary_expression}.
	 * @param ctx the parse tree
	 */
	void exitPrimary_expression(STParser.Primary_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link STParser#simple_value}.
	 * @param ctx the parse tree
	 */
	void enterSimple_value(STParser.Simple_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link STParser#simple_value}.
	 * @param ctx the parse tree
	 */
	void exitSimple_value(STParser.Simple_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link STParser#pot}.
	 * @param ctx the parse tree
	 */
	void enterPot(STParser.PotContext ctx);
	/**
	 * Exit a parse tree produced by {@link STParser#pot}.
	 * @param ctx the parse tree
	 */
	void exitPot(STParser.PotContext ctx);
	/**
	 * Enter a parse tree produced by {@link STParser#mult}.
	 * @param ctx the parse tree
	 */
	void enterMult(STParser.MultContext ctx);
	/**
	 * Exit a parse tree produced by {@link STParser#mult}.
	 * @param ctx the parse tree
	 */
	void exitMult(STParser.MultContext ctx);
	/**
	 * Enter a parse tree produced by {@link STParser#add}.
	 * @param ctx the parse tree
	 */
	void enterAdd(STParser.AddContext ctx);
	/**
	 * Exit a parse tree produced by {@link STParser#add}.
	 * @param ctx the parse tree
	 */
	void exitAdd(STParser.AddContext ctx);
	/**
	 * Enter a parse tree produced by {@link STParser#cmp}.
	 * @param ctx the parse tree
	 */
	void enterCmp(STParser.CmpContext ctx);
	/**
	 * Exit a parse tree produced by {@link STParser#cmp}.
	 * @param ctx the parse tree
	 */
	void exitCmp(STParser.CmpContext ctx);
	/**
	 * Enter a parse tree produced by {@link STParser#eq}.
	 * @param ctx the parse tree
	 */
	void enterEq(STParser.EqContext ctx);
	/**
	 * Exit a parse tree produced by {@link STParser#eq}.
	 * @param ctx the parse tree
	 */
	void exitEq(STParser.EqContext ctx);
	/**
	 * Enter a parse tree produced by {@link STParser#neg}.
	 * @param ctx the parse tree
	 */
	void enterNeg(STParser.NegContext ctx);
	/**
	 * Exit a parse tree produced by {@link STParser#neg}.
	 * @param ctx the parse tree
	 */
	void exitNeg(STParser.NegContext ctx);
	/**
	 * Enter a parse tree produced by {@link STParser#and}.
	 * @param ctx the parse tree
	 */
	void enterAnd(STParser.AndContext ctx);
	/**
	 * Exit a parse tree produced by {@link STParser#and}.
	 * @param ctx the parse tree
	 */
	void exitAnd(STParser.AndContext ctx);
	/**
	 * Enter a parse tree produced by {@link STParser#or}.
	 * @param ctx the parse tree
	 */
	void enterOr(STParser.OrContext ctx);
	/**
	 * Exit a parse tree produced by {@link STParser#or}.
	 * @param ctx the parse tree
	 */
	void exitOr(STParser.OrContext ctx);
	/**
	 * Enter a parse tree produced by {@link STParser#constant}.
	 * @param ctx the parse tree
	 */
	void enterConstant(STParser.ConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link STParser#constant}.
	 * @param ctx the parse tree
	 */
	void exitConstant(STParser.ConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link STParser#real_literal}.
	 * @param ctx the parse tree
	 */
	void enterReal_literal(STParser.Real_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link STParser#real_literal}.
	 * @param ctx the parse tree
	 */
	void exitReal_literal(STParser.Real_literalContext ctx);
	/**
	 * Enter a parse tree produced by {@link STParser#integer_literal}.
	 * @param ctx the parse tree
	 */
	void enterInteger_literal(STParser.Integer_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link STParser#integer_literal}.
	 * @param ctx the parse tree
	 */
	void exitInteger_literal(STParser.Integer_literalContext ctx);
	/**
	 * Enter a parse tree produced by {@link STParser#boolean_literal}.
	 * @param ctx the parse tree
	 */
	void enterBoolean_literal(STParser.Boolean_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link STParser#boolean_literal}.
	 * @param ctx the parse tree
	 */
	void exitBoolean_literal(STParser.Boolean_literalContext ctx);
	/**
	 * Enter a parse tree produced by {@link STParser#string_literal}.
	 * @param ctx the parse tree
	 */
	void enterString_literal(STParser.String_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link STParser#string_literal}.
	 * @param ctx the parse tree
	 */
	void exitString_literal(STParser.String_literalContext ctx);
}