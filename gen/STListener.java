// Generated from C:/Users/PC/Desktop/Compiler\ST.g4 by ANTLR 4.7
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
	 * Enter a parse tree produced by {@link STParser#program_declaration}.
	 * @param ctx the parse tree
	 */
	void enterProgram_declaration(STParser.Program_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link STParser#program_declaration}.
	 * @param ctx the parse tree
	 */
	void exitProgram_declaration(STParser.Program_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link STParser#program_variable_declaration_block}.
	 * @param ctx the parse tree
	 */
	void enterProgram_variable_declaration_block(STParser.Program_variable_declaration_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link STParser#program_variable_declaration_block}.
	 * @param ctx the parse tree
	 */
	void exitProgram_variable_declaration_block(STParser.Program_variable_declaration_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link STParser#function_declaration}.
	 * @param ctx the parse tree
	 */
	void enterFunction_declaration(STParser.Function_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link STParser#function_declaration}.
	 * @param ctx the parse tree
	 */
	void exitFunction_declaration(STParser.Function_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link STParser#local_variable_declaration_block}.
	 * @param ctx the parse tree
	 */
	void enterLocal_variable_declaration_block(STParser.Local_variable_declaration_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link STParser#local_variable_declaration_block}.
	 * @param ctx the parse tree
	 */
	void exitLocal_variable_declaration_block(STParser.Local_variable_declaration_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link STParser#function_variable_declaration_blocks}.
	 * @param ctx the parse tree
	 */
	void enterFunction_variable_declaration_blocks(STParser.Function_variable_declaration_blocksContext ctx);
	/**
	 * Exit a parse tree produced by {@link STParser#function_variable_declaration_blocks}.
	 * @param ctx the parse tree
	 */
	void exitFunction_variable_declaration_blocks(STParser.Function_variable_declaration_blocksContext ctx);
	/**
	 * Enter a parse tree produced by {@link STParser#function_variable_declaration_block}.
	 * @param ctx the parse tree
	 */
	void enterFunction_variable_declaration_block(STParser.Function_variable_declaration_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link STParser#function_variable_declaration_block}.
	 * @param ctx the parse tree
	 */
	void exitFunction_variable_declaration_block(STParser.Function_variable_declaration_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link STParser#variable_declaration_type}.
	 * @param ctx the parse tree
	 */
	void enterVariable_declaration_type(STParser.Variable_declaration_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link STParser#variable_declaration_type}.
	 * @param ctx the parse tree
	 */
	void exitVariable_declaration_type(STParser.Variable_declaration_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link STParser#access_variable_declaration_block}.
	 * @param ctx the parse tree
	 */
	void enterAccess_variable_declaration_block(STParser.Access_variable_declaration_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link STParser#access_variable_declaration_block}.
	 * @param ctx the parse tree
	 */
	void exitAccess_variable_declaration_block(STParser.Access_variable_declaration_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link STParser#variable_declaration}.
	 * @param ctx the parse tree
	 */
	void enterVariable_declaration(STParser.Variable_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link STParser#variable_declaration}.
	 * @param ctx the parse tree
	 */
	void exitVariable_declaration(STParser.Variable_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link STParser#access_variable_declaration}.
	 * @param ctx the parse tree
	 */
	void enterAccess_variable_declaration(STParser.Access_variable_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link STParser#access_variable_declaration}.
	 * @param ctx the parse tree
	 */
	void exitAccess_variable_declaration(STParser.Access_variable_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link STParser#global_variable_declaration_block}.
	 * @param ctx the parse tree
	 */
	void enterGlobal_variable_declaration_block(STParser.Global_variable_declaration_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link STParser#global_variable_declaration_block}.
	 * @param ctx the parse tree
	 */
	void exitGlobal_variable_declaration_block(STParser.Global_variable_declaration_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link STParser#type_specification}.
	 * @param ctx the parse tree
	 */
	void enterType_specification(STParser.Type_specificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link STParser#type_specification}.
	 * @param ctx the parse tree
	 */
	void exitType_specification(STParser.Type_specificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link STParser#integer_type}.
	 * @param ctx the parse tree
	 */
	void enterInteger_type(STParser.Integer_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link STParser#integer_type}.
	 * @param ctx the parse tree
	 */
	void exitInteger_type(STParser.Integer_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link STParser#real_type}.
	 * @param ctx the parse tree
	 */
	void enterReal_type(STParser.Real_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link STParser#real_type}.
	 * @param ctx the parse tree
	 */
	void exitReal_type(STParser.Real_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link STParser#boolean_type}.
	 * @param ctx the parse tree
	 */
	void enterBoolean_type(STParser.Boolean_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link STParser#boolean_type}.
	 * @param ctx the parse tree
	 */
	void exitBoolean_type(STParser.Boolean_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link STParser#string_type}.
	 * @param ctx the parse tree
	 */
	void enterString_type(STParser.String_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link STParser#string_type}.
	 * @param ctx the parse tree
	 */
	void exitString_type(STParser.String_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link STParser#statementList}.
	 * @param ctx the parse tree
	 */
	void enterStatementList(STParser.StatementListContext ctx);
	/**
	 * Exit a parse tree produced by {@link STParser#statementList}.
	 * @param ctx the parse tree
	 */
	void exitStatementList(STParser.StatementListContext ctx);
	/**
	 * Enter a parse tree produced by {@link STParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(STParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link STParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(STParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link STParser#base_statement}.
	 * @param ctx the parse tree
	 */
	void enterBase_statement(STParser.Base_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link STParser#base_statement}.
	 * @param ctx the parse tree
	 */
	void exitBase_statement(STParser.Base_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link STParser#if_statement}.
	 * @param ctx the parse tree
	 */
	void enterIf_statement(STParser.If_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link STParser#if_statement}.
	 * @param ctx the parse tree
	 */
	void exitIf_statement(STParser.If_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link STParser#else_part}.
	 * @param ctx the parse tree
	 */
	void enterElse_part(STParser.Else_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link STParser#else_part}.
	 * @param ctx the parse tree
	 */
	void exitElse_part(STParser.Else_partContext ctx);
	/**
	 * Enter a parse tree produced by {@link STParser#while_statement}.
	 * @param ctx the parse tree
	 */
	void enterWhile_statement(STParser.While_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link STParser#while_statement}.
	 * @param ctx the parse tree
	 */
	void exitWhile_statement(STParser.While_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link STParser#assignment_statement}.
	 * @param ctx the parse tree
	 */
	void enterAssignment_statement(STParser.Assignment_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link STParser#assignment_statement}.
	 * @param ctx the parse tree
	 */
	void exitAssignment_statement(STParser.Assignment_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link STParser#exit_statement}.
	 * @param ctx the parse tree
	 */
	void enterExit_statement(STParser.Exit_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link STParser#exit_statement}.
	 * @param ctx the parse tree
	 */
	void exitExit_statement(STParser.Exit_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link STParser#continue_statement}.
	 * @param ctx the parse tree
	 */
	void enterContinue_statement(STParser.Continue_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link STParser#continue_statement}.
	 * @param ctx the parse tree
	 */
	void exitContinue_statement(STParser.Continue_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link STParser#jump_statement}.
	 * @param ctx the parse tree
	 */
	void enterJump_statement(STParser.Jump_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link STParser#jump_statement}.
	 * @param ctx the parse tree
	 */
	void exitJump_statement(STParser.Jump_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link STParser#empty_statement}.
	 * @param ctx the parse tree
	 */
	void enterEmpty_statement(STParser.Empty_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link STParser#empty_statement}.
	 * @param ctx the parse tree
	 */
	void exitEmpty_statement(STParser.Empty_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link STParser#labeled_statement}.
	 * @param ctx the parse tree
	 */
	void enterLabeled_statement(STParser.Labeled_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link STParser#labeled_statement}.
	 * @param ctx the parse tree
	 */
	void exitLabeled_statement(STParser.Labeled_statementContext ctx);
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
	 * Enter a parse tree produced by {@link STParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(STParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link STParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(STParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link STParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(STParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link STParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(STParser.IdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link STParser#function_call}.
	 * @param ctx the parse tree
	 */
	void enterFunction_call(STParser.Function_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link STParser#function_call}.
	 * @param ctx the parse tree
	 */
	void exitFunction_call(STParser.Function_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link STParser#parameter_list}.
	 * @param ctx the parse tree
	 */
	void enterParameter_list(STParser.Parameter_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link STParser#parameter_list}.
	 * @param ctx the parse tree
	 */
	void exitParameter_list(STParser.Parameter_listContext ctx);
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