// Generated from C:/Users/PC/Desktop/Compiler\ST.g4 by ANTLR 4.7
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
	 * Visit a parse tree produced by {@link STParser#program_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram_declaration(STParser.Program_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link STParser#program_variable_declaration_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram_variable_declaration_block(STParser.Program_variable_declaration_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link STParser#function_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_declaration(STParser.Function_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link STParser#local_variable_declaration_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocal_variable_declaration_block(STParser.Local_variable_declaration_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link STParser#function_variable_declaration_blocks}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_variable_declaration_blocks(STParser.Function_variable_declaration_blocksContext ctx);
	/**
	 * Visit a parse tree produced by {@link STParser#function_variable_declaration_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_variable_declaration_block(STParser.Function_variable_declaration_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link STParser#variable_declaration_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable_declaration_type(STParser.Variable_declaration_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link STParser#access_variable_declaration_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAccess_variable_declaration_block(STParser.Access_variable_declaration_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link STParser#variable_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable_declaration(STParser.Variable_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link STParser#access_variable_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAccess_variable_declaration(STParser.Access_variable_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link STParser#global_variable_declaration_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlobal_variable_declaration_block(STParser.Global_variable_declaration_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link STParser#type_specification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_specification(STParser.Type_specificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link STParser#integer_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInteger_type(STParser.Integer_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link STParser#real_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReal_type(STParser.Real_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link STParser#boolean_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolean_type(STParser.Boolean_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link STParser#string_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString_type(STParser.String_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link STParser#statementList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementList(STParser.StatementListContext ctx);
	/**
	 * Visit a parse tree produced by {@link STParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(STParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link STParser#base_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBase_statement(STParser.Base_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link STParser#if_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_statement(STParser.If_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link STParser#else_part}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElse_part(STParser.Else_partContext ctx);
	/**
	 * Visit a parse tree produced by {@link STParser#while_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_statement(STParser.While_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link STParser#assignment_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment_statement(STParser.Assignment_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link STParser#exit_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExit_statement(STParser.Exit_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link STParser#continue_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContinue_statement(STParser.Continue_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link STParser#jump_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJump_statement(STParser.Jump_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link STParser#empty_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEmpty_statement(STParser.Empty_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link STParser#labeled_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabeled_statement(STParser.Labeled_statementContext ctx);
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
	 * Visit a parse tree produced by {@link STParser#variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(STParser.VariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link STParser#identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(STParser.IdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link STParser#function_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_call(STParser.Function_callContext ctx);
	/**
	 * Visit a parse tree produced by {@link STParser#parameter_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter_list(STParser.Parameter_listContext ctx);
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