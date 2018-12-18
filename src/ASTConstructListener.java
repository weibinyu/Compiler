import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;
import java.util.Stack;

public class ASTConstructListener extends STBaseListener {
    private Stack<ASTNode> s = new Stack<>();
    private int id = 1;
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
        goal.reverse();
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
        ASTNode st = s.pop();
        if(ctx.program_variable_declaration_block()!=null){
            p.addChild(s.pop());
        }
        p.addChild(st);
        s.push(p);
    }

    @Override
    public void exitProgram_variable_declaration_block(STParser.Program_variable_declaration_blockContext ctx) {
        id++;
        ASTNode lo = new ASTNode("Local",null,null,id);
        int i = 0;
        if(ctx.local_variable_declaration_block()!=null){
            for(STParser.Variable_declarationContext v : ctx.local_variable_declaration_block().variable_declaration()){
                i+=v.identifier().size();
            }
        }
        if(ctx.access_variable_declaration_block()!=null){
            for(STParser.Access_variable_declarationContext a : ctx.access_variable_declaration_block().access_variable_declaration()){
                i++;
            }
        }
        for(int n = 0; n<i;n++){
            lo.addChild(s.pop());
        }
        s.push(lo);
    }

    @Override
    public void exitFunction_declaration(STParser.Function_declarationContext ctx) {
        id++;
        String f = ctx.type_specification().getText().substring(0,1).toUpperCase();
        String r = ctx.type_specification().getText().substring(1).toLowerCase();
        ASTNode lo = new ASTNode("Function",f+r,ctx.identifier().getText(),id);
        lo.setKind(lo.getArgumentType());

        ASTNode st = s.pop();
        if(ctx.function_variable_declaration_blocks()!=null){
            lo.addChild(s.pop());
        }
        lo.addChild(st);
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
    public void exitFunction_variable_declaration_block(STParser.Function_variable_declaration_blockContext ctx) {
        Stack<ASTNode> tmps = new Stack<>();
        for(STParser.Variable_declarationContext v : ctx.variable_declaration()){
            ASTNode tmp;
            for(STParser.IdentifierContext i : v.identifier()){
                tmp = s.pop();
                tmp.In = false;
                tmp.Out = false;
                if(ctx.variable_declaration_type().getText().equals("VAR_INPUT")){
                    tmp.In = true;
                }else if(ctx.variable_declaration_type().getText().equals("VAR_OUTPUT")){
                    tmp.Out = true;
                }else if(ctx.variable_declaration_type().getText().equals("VAR_IN_OUT")) {
                    tmp.In = true;
                    tmp.Out = true;
                }
                tmps.push(tmp);
            }
            while (!tmps.empty()){
                s.push(tmps.pop());
            }
        }
    }

    @Override
    public void exitVariable_declaration(STParser.Variable_declarationContext ctx) {
        for(STParser.IdentifierContext i :ctx.identifier()){
            id++;
            ASTNode lo = new ASTNode("Declaration",ctx.type_specification().getText(),i.getText(),id);
            String f = ctx.type_specification().getText().substring(0,1).toUpperCase();
            String r = ctx.type_specification().getText().substring(1).toLowerCase();
            lo.setKind(f+r);
            lo.setRW(false);
            lo.setRO(false);
            s.push(lo);
        }
    }

    @Override
    public void exitAccess_variable_declaration(STParser.Access_variable_declarationContext ctx) {
        id++;
        ASTNode lo = new ASTNode("Declaration",ctx.getChild(ctx.getChildCount()-2).getText()
                ,ctx.identifier().getText(),id);
        String f = ctx.type_specification().getText().substring(0,1).toUpperCase();
        String r = ctx.type_specification().getText().substring(1).toLowerCase();
        lo.setKind(f+r);
        lo.setRW(false);
        lo.setRO(false);
        if(lo.getArgumentType().equals("READ_ONLY"))
            lo.setRO(true);
        if(lo.getArgumentType().equals("READ_WRITE"))
            lo.setRW(true);
        s.push(lo);
    }

    @Override
    public void exitExpression(STParser.ExpressionContext ctx) {
        if(!s.empty()){
            if(ctx.getChildCount() == 2){
                ASTNode right = s.pop();
                ASTNode left = s.pop();

                id++;
                ASTNode ue = new ASTNode("UE",left.getName(),left.getOP_code(),id);
                ue.addChild(right);
                s.push(ue);
            }else if(ctx.getChildCount() == 3){
                ASTNode right = s.pop();
                ASTNode b = s.pop();
                ASTNode left = s.pop();

                id++;
                ASTNode be = new ASTNode("BE",b.getName(),b.getOP_code(),id);
                be.addChild(left);
                be.addChild(right);
                s.push(be);
            }
        }

    }

    @Override
    public void exitFunction_call(STParser.Function_callContext ctx) {
        id++;
        ASTNode v = new ASTNode("FC",null,ctx.identifier().getText(),id);
        if(ctx.parameter_list()!=null){
            for(STParser.ExpressionContext e : ctx.parameter_list().expression()){
                v.addChild(s.pop());
            }
        }
        v.reverse();
        s.push(v);

    }

    @Override
    public void exitStatementList(STParser.StatementListContext ctx) {
        id++;
        ASTNode v = new ASTNode("Stats",null,null,id);
        for(int i = 0;i<ctx.statement().size();i++){
            v.addChild(s.pop());
        }
        v.reverse();
        s.push(v);
    }

    @Override
    public void exitLabeled_statement(STParser.Labeled_statementContext ctx) {
        ASTNode st = s.pop();
        st.Label = ctx.identifier().getText();
        s.push(st);
    }

    @Override
    public void exitExit_statement(STParser.Exit_statementContext ctx) {
        id++;
        ASTNode v = new ASTNode("EXIT",null,null,id);
        s.push(v);
    }

    @Override
    public void exitContinue_statement(STParser.Continue_statementContext ctx) {
        id++;
        ASTNode v = new ASTNode("CONT",null,null,id);
        s.push(v);
    }

    @Override
    public void exitJump_statement(STParser.Jump_statementContext ctx) {
        id++;
        ASTNode v = new ASTNode("JMP",null,null,id);
        v.addChild(s.pop());
        s.push(v);
    }

    @Override
    public void exitEmpty_statement(STParser.Empty_statementContext ctx) {
        id++;
        ASTNode v = new ASTNode("EMPTY",null,null,id);
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
        v.reverse();
        s.push(v);
    }

    @Override
    public void exitWhile_statement(STParser.While_statementContext ctx) {
        id++;
        ASTNode be = new ASTNode("While",null,null,id);
        be.addChild(s.pop());   //expression and statmentList
        be.addChild(s.pop());
        be.reverse();
        s.push(be);
    }

    @Override
    public void exitAssignment_statement(STParser.Assignment_statementContext ctx) {
        ASTNode right = s.pop();
        ASTNode left = s.pop();


        id++;
        ASTNode be = new ASTNode("Assign",null,":=",id);
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
        if(ctx.variable()!=null){
            ASTNode t = s.pop();
            t.varRef = true;
            s.push(t);
        }
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
