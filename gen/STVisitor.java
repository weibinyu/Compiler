// Generated from C:/Users/weibin/IdeaProjects/Compiler/src\ST.g4 by ANTLR 4.7
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link STParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface STVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link STParser#goal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGoal(STParser.GoalContext ctx);
	/**
	 * Visit a parse tree produced by {@link STParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(STParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link STParser#primary_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimary_expression(STParser.Primary_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link STParser#simple_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimple_value(STParser.Simple_valueContext ctx);
	/**
	 * Visit a parse tree produced by {@link STParser#pot}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPot(STParser.PotContext ctx);
	/**
	 * Visit a parse tree produced by {@link STParser#mult}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMult(STParser.MultContext ctx);
	/**
	 * Visit a parse tree produced by {@link STParser#add}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdd(STParser.AddContext ctx);
	/**
	 * Visit a parse tree produced by {@link STParser#cmp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmp(STParser.CmpContext ctx);
	/**
	 * Visit a parse tree produced by {@link STParser#eq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEq(STParser.EqContext ctx);
	/**
	 * Visit a parse tree produced by {@link STParser#neg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNeg(STParser.NegContext ctx);
	/**
	 * Visit a parse tree produced by {@link STParser#and}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnd(STParser.AndContext ctx);
	/**
	 * Visit a parse tree produced by {@link STParser#or}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOr(STParser.OrContext ctx);
	/**
	 * Visit a parse tree produced by {@link STParser#constant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstant(STParser.ConstantContext ctx);
	/**
	 * Visit a parse tree produced by {@link STParser#real_literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReal_literal(STParser.Real_literalContext ctx);
	/**
	 * Visit a parse tree produced by {@link STParser#integer_literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInteger_literal(STParser.Integer_literalContext ctx);
	/**
	 * Visit a parse tree produced by {@link STParser#boolean_literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolean_literal(STParser.Boolean_literalContext ctx);
	/**
	 * Visit a parse tree produced by {@link STParser#string_literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString_literal(STParser.String_literalContext ctx);
}