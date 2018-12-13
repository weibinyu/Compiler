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
        int i = 1;
        if(ctx.global_variable_declaration_block() != null){
            i++;
        }
        i += ctx.function_declaration().size();
        for(int n = 0; n<i;n++){
            goal.addChild(s.pop());
        }
    }

    @Override
    public void exitGlobal_variable_declaration_block(STParser.Global_variable_declaration_blockContext ctx) {
        id++;
        ASTNode gv = new ASTNode("Global",null,null,id);
        int i = 0;
        for(STParser.Variable_declarationContext v : ctx.variable_declaration()){
            i+=v.identifier().size();
        }
        if(i!=0){
            for(int n = 0; n<i;n++){
                gv.addChild(s.pop());
            }
            s.push(gv);
        }

    }

    @Override
    public void exitProgram_declaration(STParser.Program_declarationContext ctx) {
        id++;
        ASTNode p = new ASTNode("Program",null,ctx.identifier().getText(),id);
        p.addChild(s.pop());
        if(ctx.program_variable_declaration_block()!=null){
            p.addChild(s.pop());
        }
        s.push(p);
    }

    @Override
    public void exitProgram_variable_declaration_block(STParser.Program_variable_declaration_blockContext ctx) {
        id++;
        ASTNode lo = new ASTNode("Local",null,null,id);
        int i = 0;
        for(STParser.Variable_declarationContext v : ctx.local_variable_declaration_block().variable_declaration()){
            i+=v.identifier().size();
        }
        for(STParser.Access_variable_declarationContext a : ctx.access_variable_declaration_block().access_variable_declaration()){
            i++;
        }
        if(i!=0){
            for(int n = 0; n<i;n++){
                lo.addChild(s.pop());
            }
            s.push(lo);
        }
    }

    @Override
    public void exitFunction_declaration(STParser.Function_declarationContext ctx) {
        id++;
        ASTNode lo = new ASTNode("Function",ctx.type_specification().getText(),ctx.identifier().getText(),id);
        for(int i = 0;i<ctx.statementList().getChildCount();i++){
            lo.addChild(s.pop());
        }
        if(ctx.function_variable_declaration_blocks().getChildCount()!=0){
            lo.addChild(s.pop());
        }
        s.push(lo);
    }

    @Override
    public void exitFunction_variable_declaration_blocks(STParser.Function_variable_declaration_blocksContext ctx) {
        id++;
        int i = 0;
        ASTNode lo = new ASTNode("Local",null,null,id);
        for(STParser.Function_variable_declaration_blockContext f : ctx.function_variable_declaration_block()){
            for(STParser.Variable_declarationContext v : f.variable_declaration()){
                i+=v.identifier().size();
            }
        }
        if(i!=0){
            for(int n = 0; n<i;n++){
                lo.addChild(s.pop());
            }
            s.push(lo);
        }
    }

    @Override
    public void exitVariable_declaration(STParser.Variable_declarationContext ctx) {
        for(STParser.IdentifierContext i :ctx.identifier()){
            id++;
            ASTNode lo = new ASTNode("Declaration",ctx.type_specification().getText(),i.getText(),id);
            s.push(lo);
        }
    }

    @Override
    public void exitAccess_variable_declaration(STParser.Access_variable_declarationContext ctx) {
        id++;
        ASTNode lo = new ASTNode(ctx.getChild(ctx.getChildCount()-2).getText(),
                ctx.type_specification().getText(),ctx.identifier().getText(),id);
        s.push(lo);
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
    public void exitFunction_call(STParser.Function_callContext ctx) {
        id++;
        ASTNode v = new ASTNode(ctx.identifier().getText(),"FC",null,id);
        if(ctx.parameter_list()!=null){
            for(STParser.ExpressionContext e : ctx.parameter_list().expression()){
                v.addChild(s.pop());
            }
        }
        s.push(v);

    }

    @Override
    public void exitStatementList(STParser.StatementListContext ctx) {
        id++;
        ASTNode v = new ASTNode("States",null,null,id);
        for(int i = 0;i<ctx.statement().size();i++){
            v.addChild(s.pop());
        }
        s.push(v);
    }

    @Override
    public void exitIf_statement(STParser.If_statementContext ctx) {
        id++;
        ASTNode v = new ASTNode("IF",null,null,id);
        v.addChild(s.pop());
        v.addChild(s.pop());
        if(ctx.else_part()!=null){
            v.addChild(s.pop());
        }
        s.push(v);
    }

    @Override
    public void exitWhile_statement(STParser.While_statementContext ctx) {
        super.exitWhile_statement(ctx);
    }

    @Override
    public void exitAssignment_statement(STParser.Assignment_statementContext ctx) {
        ASTNode right = s.pop();
        ASTNode left = s.pop();


        id++;
        ASTNode be = new ASTNode("State","Assign",":=",id);
        be.addChild(left);
        be.addChild(right);
        s.push(be);
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
        s.push(a);
    }

    @Override
    public void exitMult(STParser.MultContext ctx) {
        id++;
        ASTNode a = new ASTNode("Mult","Numeric",ctx.getText(),id);
        s.push(a);
    }

    @Override
    public void exitAdd(STParser.AddContext ctx) {
        id++;
        ASTNode a = new ASTNode("Add","Numeric",ctx.getText(),id);
        s.push(a);
    }
    @Override
    public void exitCmp(STParser.CmpContext ctx) {
        id++;
        ASTNode a = new ASTNode("Cmp","CompareNumeric",ctx.getText(),id);
        s.push(a);
    }

    @Override
    public void exitEq(STParser.EqContext ctx) {
        id++;
        ASTNode a = new ASTNode("Eq","Compare",ctx.getText(),id);
        s.push(a);
    }

    @Override
    public void exitNeg(STParser.NegContext ctx) {
        id++;
        ASTNode a = new ASTNode("Neg","Logic",ctx.getText(),id);
        s.push(a);
    }

    @Override
    public void exitAnd(STParser.AndContext ctx) {
        id++;
        ASTNode a = new ASTNode("And","Logic",ctx.getText(),id);
        s.push(a);
    }

    @Override
    public void exitOr(STParser.OrContext ctx) {
        id++;
        ASTNode a = new ASTNode("Or","Logic",ctx.getText(),id);
        s.push(a);
    }

    @Override
    public void exitConstant(STParser.ConstantContext ctx) {
        super.exitConstant(ctx);
    }

    @Override
    public void exitVariable(STParser.VariableContext ctx) {
        id++;
        s.push(new ASTNode("Variable",null,ctx.getText(),id));
    }

    @Override
    public void exitReal_literal(STParser.Real_literalContext ctx) {
        id++;
        ASTNode a = new ASTNode("Constant","Real",ctx.getText(),id);
        s.push(a);
    }

    @Override
    public void exitInteger_literal(STParser.Integer_literalContext ctx) {
        id++;
        ASTNode a = new ASTNode("Constant","Int",ctx.getText(),id);
        s.push(a);
    }

    @Override
    public void exitBoolean_literal(STParser.Boolean_literalContext ctx) {
        id++;
        ASTNode a = new ASTNode("Constant","Bool",ctx.getText(),id);
        s.push(a);
    }

    @Override
    public void exitString_literal(STParser.String_literalContext ctx) {
        id++;
        String string = ctx.getText().substring(1,ctx.getText().length()-1);
        ASTNode a = new ASTNode("Constant","String",string,id);
        s.push(a);
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
