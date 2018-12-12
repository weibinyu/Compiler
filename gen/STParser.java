// Generated from C:/Users/PC/Desktop/Compiler\ST.g4 by ANTLR 4.7
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class STParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, REAL_EXPONENT=7, FIX_POINT=8, 
		UNSIGNED_INT=9, NULL=10, ONETONINE=11, STRING_VALUE=12, WSTRING_VALUE=13, 
		PRAGMA=14, WSFULL=15, LINE_COMMENT=16, C_LINE_COMMENT=17, SINGLE_LINE_COMMENT=18, 
		AND=19, BOOL=20, CONTINUE=21, DIV=22, DO=23, END_IF=24, END_PROGRAM=25, 
		END_VAR=26, END_WHILE=27, ELSE=28, EQ=29, EXIT=30, FUNCTION=31, END_FUNCTION=32, 
		FALSE=33, GE=34, GT=35, LE=36, LT=37, IF=38, INT=39, JMP=40, MOD=41, MINUS=42, 
		NEQ=43, NOT=44, OR=45, PLUS=46, POT=47, PROGRAM=48, READ_ONLY=49, READ_WRITE=50, 
		REAL=51, STRING=52, THEN=53, TIMES=54, TRUE=55, VAR=56, VAR_INPUT=57, 
		VAR_OUTPUT=58, VAR_IN_OUT=59, VAR_ACCESS=60, VAR_GLOBAL=61, WHILE=62, 
		XOR=63, IDENTIFIER=64;
	public static final int
		RULE_goal = 0, RULE_program_declaration = 1, RULE_program_variable_declaration_block = 2, 
		RULE_function_declaration = 3, RULE_local_variable_declaration_block = 4, 
		RULE_function_variable_declaration_blocks = 5, RULE_function_variable_declaration_block = 6, 
		RULE_variable_declaration_type = 7, RULE_access_variable_declaration_block = 8, 
		RULE_variable_declaration = 9, RULE_access_variable_declaration = 10, 
		RULE_global_variable_declaration_block = 11, RULE_type_specification = 12, 
		RULE_integer_type = 13, RULE_real_type = 14, RULE_boolean_type = 15, RULE_string_type = 16, 
		RULE_statementList = 17, RULE_statement = 18, RULE_base_statement = 19, 
		RULE_if_statement = 20, RULE_else_part = 21, RULE_while_statement = 22, 
		RULE_assignment_statement = 23, RULE_exit_statement = 24, RULE_continue_statement = 25, 
		RULE_jump_statement = 26, RULE_empty_statement = 27, RULE_labeled_statement = 28, 
		RULE_expression = 29, RULE_primary_expression = 30, RULE_simple_value = 31, 
		RULE_variable = 32, RULE_identifier = 33, RULE_function_call = 34, RULE_parameter_list = 35, 
		RULE_pot = 36, RULE_mult = 37, RULE_add = 38, RULE_cmp = 39, RULE_eq = 40, 
		RULE_neg = 41, RULE_and = 42, RULE_or = 43, RULE_constant = 44, RULE_real_literal = 45, 
		RULE_integer_literal = 46, RULE_boolean_literal = 47, RULE_string_literal = 48;
	public static final String[] ruleNames = {
		"goal", "program_declaration", "program_variable_declaration_block", "function_declaration", 
		"local_variable_declaration_block", "function_variable_declaration_blocks", 
		"function_variable_declaration_block", "variable_declaration_type", "access_variable_declaration_block", 
		"variable_declaration", "access_variable_declaration", "global_variable_declaration_block", 
		"type_specification", "integer_type", "real_type", "boolean_type", "string_type", 
		"statementList", "statement", "base_statement", "if_statement", "else_part", 
		"while_statement", "assignment_statement", "exit_statement", "continue_statement", 
		"jump_statement", "empty_statement", "labeled_statement", "expression", 
		"primary_expression", "simple_value", "variable", "identifier", "function_call", 
		"parameter_list", "pot", "mult", "add", "cmp", "eq", "neg", "and", "or", 
		"constant", "real_literal", "integer_literal", "boolean_literal", "string_literal"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "':'", "','", "';'", "':='", "'('", "')'", null, null, null, "'0'", 
		null, null, null, null, null, null, null, null, "'AND'", "'BOOL'", "'CONTINUE'", 
		"'/'", "'DO'", "'END_IF'", "'END_PROGRAM'", "'END_VAR'", "'END_WHILE'", 
		"'ELSE'", "'=='", "'EXIT'", "'FUNCTION'", "'END_FUNCTION'", "'FALSE'", 
		"'>='", "'>'", "'<='", "'<'", "'IF'", "'INT'", "'JMP'", "'MOD'", "'-'", 
		"'<>'", "'NOT'", "'OR'", "'+'", "'**'", "'PROGRAM'", "'READ_ONLY'", "'READ_WRITE'", 
		"'REAL'", "'STRING'", "'THEN'", "'*'", "'TRUE'", "'VAR'", "'VAR_INPUT'", 
		"'VAR_OUTPUT'", "'VAR_IN_OUT'", "'VAR_ACCESS'", "'VAR_GLOBAL'", "'WHILE'", 
		"'XOR'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, "REAL_EXPONENT", "FIX_POINT", 
		"UNSIGNED_INT", "NULL", "ONETONINE", "STRING_VALUE", "WSTRING_VALUE", 
		"PRAGMA", "WSFULL", "LINE_COMMENT", "C_LINE_COMMENT", "SINGLE_LINE_COMMENT", 
		"AND", "BOOL", "CONTINUE", "DIV", "DO", "END_IF", "END_PROGRAM", "END_VAR", 
		"END_WHILE", "ELSE", "EQ", "EXIT", "FUNCTION", "END_FUNCTION", "FALSE", 
		"GE", "GT", "LE", "LT", "IF", "INT", "JMP", "MOD", "MINUS", "NEQ", "NOT", 
		"OR", "PLUS", "POT", "PROGRAM", "READ_ONLY", "READ_WRITE", "REAL", "STRING", 
		"THEN", "TIMES", "TRUE", "VAR", "VAR_INPUT", "VAR_OUTPUT", "VAR_IN_OUT", 
		"VAR_ACCESS", "VAR_GLOBAL", "WHILE", "XOR", "IDENTIFIER"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "ST.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public STParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class GoalContext extends ParserRuleContext {
		public Program_declarationContext program_declaration() {
			return getRuleContext(Program_declarationContext.class,0);
		}
		public Global_variable_declaration_blockContext global_variable_declaration_block() {
			return getRuleContext(Global_variable_declaration_blockContext.class,0);
		}
		public List<Function_declarationContext> function_declaration() {
			return getRuleContexts(Function_declarationContext.class);
		}
		public Function_declarationContext function_declaration(int i) {
			return getRuleContext(Function_declarationContext.class,i);
		}
		public GoalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_goal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof STListener ) ((STListener)listener).enterGoal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof STListener ) ((STListener)listener).exitGoal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof STVisitor ) return ((STVisitor<? extends T>)visitor).visitGoal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GoalContext goal() throws RecognitionException {
		GoalContext _localctx = new GoalContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_goal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(99);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VAR_GLOBAL) {
				{
				setState(98);
				global_variable_declaration_block();
				}
			}

			setState(101);
			program_declaration();
			setState(105);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FUNCTION) {
				{
				{
				setState(102);
				function_declaration();
				}
				}
				setState(107);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Program_declarationContext extends ParserRuleContext {
		public TerminalNode PROGRAM() { return getToken(STParser.PROGRAM, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Program_variable_declaration_blockContext program_variable_declaration_block() {
			return getRuleContext(Program_variable_declaration_blockContext.class,0);
		}
		public StatementListContext statementList() {
			return getRuleContext(StatementListContext.class,0);
		}
		public TerminalNode END_PROGRAM() { return getToken(STParser.END_PROGRAM, 0); }
		public Program_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof STListener ) ((STListener)listener).enterProgram_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof STListener ) ((STListener)listener).exitProgram_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof STVisitor ) return ((STVisitor<? extends T>)visitor).visitProgram_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Program_declarationContext program_declaration() throws RecognitionException {
		Program_declarationContext _localctx = new Program_declarationContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_program_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(108);
			match(PROGRAM);
			setState(109);
			identifier();
			setState(110);
			program_variable_declaration_block();
			setState(111);
			statementList();
			setState(112);
			match(END_PROGRAM);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Program_variable_declaration_blockContext extends ParserRuleContext {
		public Access_variable_declaration_blockContext access_variable_declaration_block() {
			return getRuleContext(Access_variable_declaration_blockContext.class,0);
		}
		public Local_variable_declaration_blockContext local_variable_declaration_block() {
			return getRuleContext(Local_variable_declaration_blockContext.class,0);
		}
		public Program_variable_declaration_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program_variable_declaration_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof STListener ) ((STListener)listener).enterProgram_variable_declaration_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof STListener ) ((STListener)listener).exitProgram_variable_declaration_block(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof STVisitor ) return ((STVisitor<? extends T>)visitor).visitProgram_variable_declaration_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Program_variable_declaration_blockContext program_variable_declaration_block() throws RecognitionException {
		Program_variable_declaration_blockContext _localctx = new Program_variable_declaration_blockContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_program_variable_declaration_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VAR_ACCESS) {
				{
				setState(114);
				access_variable_declaration_block();
				}
			}

			setState(118);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VAR) {
				{
				setState(117);
				local_variable_declaration_block();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Function_declarationContext extends ParserRuleContext {
		public TerminalNode FUNCTION() { return getToken(STParser.FUNCTION, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Type_specificationContext type_specification() {
			return getRuleContext(Type_specificationContext.class,0);
		}
		public Function_variable_declaration_blocksContext function_variable_declaration_blocks() {
			return getRuleContext(Function_variable_declaration_blocksContext.class,0);
		}
		public StatementListContext statementList() {
			return getRuleContext(StatementListContext.class,0);
		}
		public TerminalNode END_FUNCTION() { return getToken(STParser.END_FUNCTION, 0); }
		public Function_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof STListener ) ((STListener)listener).enterFunction_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof STListener ) ((STListener)listener).exitFunction_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof STVisitor ) return ((STVisitor<? extends T>)visitor).visitFunction_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_declarationContext function_declaration() throws RecognitionException {
		Function_declarationContext _localctx = new Function_declarationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_function_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			match(FUNCTION);
			setState(121);
			identifier();
			setState(122);
			match(T__0);
			setState(123);
			type_specification();
			setState(124);
			function_variable_declaration_blocks();
			setState(125);
			statementList();
			setState(126);
			match(END_FUNCTION);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Local_variable_declaration_blockContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(STParser.VAR, 0); }
		public TerminalNode END_VAR() { return getToken(STParser.END_VAR, 0); }
		public List<Variable_declarationContext> variable_declaration() {
			return getRuleContexts(Variable_declarationContext.class);
		}
		public Variable_declarationContext variable_declaration(int i) {
			return getRuleContext(Variable_declarationContext.class,i);
		}
		public Local_variable_declaration_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_local_variable_declaration_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof STListener ) ((STListener)listener).enterLocal_variable_declaration_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof STListener ) ((STListener)listener).exitLocal_variable_declaration_block(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof STVisitor ) return ((STVisitor<? extends T>)visitor).visitLocal_variable_declaration_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Local_variable_declaration_blockContext local_variable_declaration_block() throws RecognitionException {
		Local_variable_declaration_blockContext _localctx = new Local_variable_declaration_blockContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_local_variable_declaration_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
			match(VAR);
			setState(130); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(129);
				variable_declaration();
				}
				}
				setState(132); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==IDENTIFIER );
			setState(134);
			match(END_VAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Function_variable_declaration_blocksContext extends ParserRuleContext {
		public List<Function_variable_declaration_blockContext> function_variable_declaration_block() {
			return getRuleContexts(Function_variable_declaration_blockContext.class);
		}
		public Function_variable_declaration_blockContext function_variable_declaration_block(int i) {
			return getRuleContext(Function_variable_declaration_blockContext.class,i);
		}
		public Function_variable_declaration_blocksContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_variable_declaration_blocks; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof STListener ) ((STListener)listener).enterFunction_variable_declaration_blocks(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof STListener ) ((STListener)listener).exitFunction_variable_declaration_blocks(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof STVisitor ) return ((STVisitor<? extends T>)visitor).visitFunction_variable_declaration_blocks(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_variable_declaration_blocksContext function_variable_declaration_blocks() throws RecognitionException {
		Function_variable_declaration_blocksContext _localctx = new Function_variable_declaration_blocksContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_function_variable_declaration_blocks);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VAR) | (1L << VAR_INPUT) | (1L << VAR_OUTPUT) | (1L << VAR_IN_OUT))) != 0)) {
				{
				{
				setState(136);
				function_variable_declaration_block();
				}
				}
				setState(141);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Function_variable_declaration_blockContext extends ParserRuleContext {
		public Variable_declaration_typeContext variable_declaration_type() {
			return getRuleContext(Variable_declaration_typeContext.class,0);
		}
		public TerminalNode END_VAR() { return getToken(STParser.END_VAR, 0); }
		public List<Variable_declarationContext> variable_declaration() {
			return getRuleContexts(Variable_declarationContext.class);
		}
		public Variable_declarationContext variable_declaration(int i) {
			return getRuleContext(Variable_declarationContext.class,i);
		}
		public Function_variable_declaration_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_variable_declaration_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof STListener ) ((STListener)listener).enterFunction_variable_declaration_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof STListener ) ((STListener)listener).exitFunction_variable_declaration_block(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof STVisitor ) return ((STVisitor<? extends T>)visitor).visitFunction_variable_declaration_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_variable_declaration_blockContext function_variable_declaration_block() throws RecognitionException {
		Function_variable_declaration_blockContext _localctx = new Function_variable_declaration_blockContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_function_variable_declaration_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(142);
			variable_declaration_type();
			setState(144); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(143);
				variable_declaration();
				}
				}
				setState(146); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==IDENTIFIER );
			setState(148);
			match(END_VAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Variable_declaration_typeContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(STParser.VAR, 0); }
		public TerminalNode VAR_INPUT() { return getToken(STParser.VAR_INPUT, 0); }
		public TerminalNode VAR_OUTPUT() { return getToken(STParser.VAR_OUTPUT, 0); }
		public TerminalNode VAR_IN_OUT() { return getToken(STParser.VAR_IN_OUT, 0); }
		public Variable_declaration_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable_declaration_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof STListener ) ((STListener)listener).enterVariable_declaration_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof STListener ) ((STListener)listener).exitVariable_declaration_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof STVisitor ) return ((STVisitor<? extends T>)visitor).visitVariable_declaration_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Variable_declaration_typeContext variable_declaration_type() throws RecognitionException {
		Variable_declaration_typeContext _localctx = new Variable_declaration_typeContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_variable_declaration_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(150);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VAR) | (1L << VAR_INPUT) | (1L << VAR_OUTPUT) | (1L << VAR_IN_OUT))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Access_variable_declaration_blockContext extends ParserRuleContext {
		public TerminalNode VAR_ACCESS() { return getToken(STParser.VAR_ACCESS, 0); }
		public TerminalNode END_VAR() { return getToken(STParser.END_VAR, 0); }
		public List<Access_variable_declarationContext> access_variable_declaration() {
			return getRuleContexts(Access_variable_declarationContext.class);
		}
		public Access_variable_declarationContext access_variable_declaration(int i) {
			return getRuleContext(Access_variable_declarationContext.class,i);
		}
		public Access_variable_declaration_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_access_variable_declaration_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof STListener ) ((STListener)listener).enterAccess_variable_declaration_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof STListener ) ((STListener)listener).exitAccess_variable_declaration_block(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof STVisitor ) return ((STVisitor<? extends T>)visitor).visitAccess_variable_declaration_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Access_variable_declaration_blockContext access_variable_declaration_block() throws RecognitionException {
		Access_variable_declaration_blockContext _localctx = new Access_variable_declaration_blockContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_access_variable_declaration_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(152);
			match(VAR_ACCESS);
			setState(154); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(153);
				access_variable_declaration();
				}
				}
				setState(156); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==IDENTIFIER );
			setState(158);
			match(END_VAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Variable_declarationContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public Type_specificationContext type_specification() {
			return getRuleContext(Type_specificationContext.class,0);
		}
		public Variable_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof STListener ) ((STListener)listener).enterVariable_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof STListener ) ((STListener)listener).exitVariable_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof STVisitor ) return ((STVisitor<? extends T>)visitor).visitVariable_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Variable_declarationContext variable_declaration() throws RecognitionException {
		Variable_declarationContext _localctx = new Variable_declarationContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_variable_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(160);
			identifier();
			setState(165);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(161);
				match(T__1);
				setState(162);
				identifier();
				}
				}
				setState(167);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(168);
			match(T__0);
			setState(169);
			type_specification();
			setState(170);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Access_variable_declarationContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Type_specificationContext type_specification() {
			return getRuleContext(Type_specificationContext.class,0);
		}
		public TerminalNode READ_WRITE() { return getToken(STParser.READ_WRITE, 0); }
		public TerminalNode READ_ONLY() { return getToken(STParser.READ_ONLY, 0); }
		public Access_variable_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_access_variable_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof STListener ) ((STListener)listener).enterAccess_variable_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof STListener ) ((STListener)listener).exitAccess_variable_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof STVisitor ) return ((STVisitor<? extends T>)visitor).visitAccess_variable_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Access_variable_declarationContext access_variable_declaration() throws RecognitionException {
		Access_variable_declarationContext _localctx = new Access_variable_declarationContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_access_variable_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(172);
			identifier();
			setState(173);
			match(T__0);
			setState(174);
			type_specification();
			setState(175);
			_la = _input.LA(1);
			if ( !(_la==READ_ONLY || _la==READ_WRITE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(176);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Global_variable_declaration_blockContext extends ParserRuleContext {
		public TerminalNode VAR_GLOBAL() { return getToken(STParser.VAR_GLOBAL, 0); }
		public TerminalNode END_VAR() { return getToken(STParser.END_VAR, 0); }
		public List<Variable_declarationContext> variable_declaration() {
			return getRuleContexts(Variable_declarationContext.class);
		}
		public Variable_declarationContext variable_declaration(int i) {
			return getRuleContext(Variable_declarationContext.class,i);
		}
		public Global_variable_declaration_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_global_variable_declaration_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof STListener ) ((STListener)listener).enterGlobal_variable_declaration_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof STListener ) ((STListener)listener).exitGlobal_variable_declaration_block(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof STVisitor ) return ((STVisitor<? extends T>)visitor).visitGlobal_variable_declaration_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Global_variable_declaration_blockContext global_variable_declaration_block() throws RecognitionException {
		Global_variable_declaration_blockContext _localctx = new Global_variable_declaration_blockContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_global_variable_declaration_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(178);
			match(VAR_GLOBAL);
			setState(180); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(179);
				variable_declaration();
				}
				}
				setState(182); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==IDENTIFIER );
			setState(184);
			match(END_VAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Type_specificationContext extends ParserRuleContext {
		public Integer_typeContext integer_type() {
			return getRuleContext(Integer_typeContext.class,0);
		}
		public Real_typeContext real_type() {
			return getRuleContext(Real_typeContext.class,0);
		}
		public Boolean_typeContext boolean_type() {
			return getRuleContext(Boolean_typeContext.class,0);
		}
		public String_typeContext string_type() {
			return getRuleContext(String_typeContext.class,0);
		}
		public Type_specificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_specification; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof STListener ) ((STListener)listener).enterType_specification(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof STListener ) ((STListener)listener).exitType_specification(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof STVisitor ) return ((STVisitor<? extends T>)visitor).visitType_specification(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Type_specificationContext type_specification() throws RecognitionException {
		Type_specificationContext _localctx = new Type_specificationContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_type_specification);
		try {
			setState(190);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(186);
				integer_type();
				}
				break;
			case REAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(187);
				real_type();
				}
				break;
			case BOOL:
				enterOuterAlt(_localctx, 3);
				{
				setState(188);
				boolean_type();
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 4);
				{
				setState(189);
				string_type();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Integer_typeContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(STParser.INT, 0); }
		public Integer_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integer_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof STListener ) ((STListener)listener).enterInteger_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof STListener ) ((STListener)listener).exitInteger_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof STVisitor ) return ((STVisitor<? extends T>)visitor).visitInteger_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Integer_typeContext integer_type() throws RecognitionException {
		Integer_typeContext _localctx = new Integer_typeContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_integer_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(192);
			match(INT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Real_typeContext extends ParserRuleContext {
		public TerminalNode REAL() { return getToken(STParser.REAL, 0); }
		public Real_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_real_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof STListener ) ((STListener)listener).enterReal_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof STListener ) ((STListener)listener).exitReal_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof STVisitor ) return ((STVisitor<? extends T>)visitor).visitReal_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Real_typeContext real_type() throws RecognitionException {
		Real_typeContext _localctx = new Real_typeContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_real_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(194);
			match(REAL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Boolean_typeContext extends ParserRuleContext {
		public TerminalNode BOOL() { return getToken(STParser.BOOL, 0); }
		public Boolean_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolean_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof STListener ) ((STListener)listener).enterBoolean_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof STListener ) ((STListener)listener).exitBoolean_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof STVisitor ) return ((STVisitor<? extends T>)visitor).visitBoolean_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Boolean_typeContext boolean_type() throws RecognitionException {
		Boolean_typeContext _localctx = new Boolean_typeContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_boolean_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(196);
			match(BOOL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class String_typeContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(STParser.STRING, 0); }
		public String_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof STListener ) ((STListener)listener).enterString_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof STListener ) ((STListener)listener).exitString_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof STVisitor ) return ((STVisitor<? extends T>)visitor).visitString_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final String_typeContext string_type() throws RecognitionException {
		String_typeContext _localctx = new String_typeContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_string_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(198);
			match(STRING);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementListContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public StatementListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof STListener ) ((STListener)listener).enterStatementList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof STListener ) ((STListener)listener).exitStatementList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof STVisitor ) return ((STVisitor<? extends T>)visitor).visitStatementList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementListContext statementList() throws RecognitionException {
		StatementListContext _localctx = new StatementListContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_statementList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(201); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(200);
				statement();
				}
				}
				setState(203); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 3)) & ~0x3f) == 0 && ((1L << (_la - 3)) & ((1L << (T__2 - 3)) | (1L << (CONTINUE - 3)) | (1L << (EXIT - 3)) | (1L << (IF - 3)) | (1L << (JMP - 3)) | (1L << (WHILE - 3)) | (1L << (IDENTIFIER - 3)))) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public Base_statementContext base_statement() {
			return getRuleContext(Base_statementContext.class,0);
		}
		public Labeled_statementContext labeled_statement() {
			return getRuleContext(Labeled_statementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof STListener ) ((STListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof STListener ) ((STListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof STVisitor ) return ((STVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_statement);
		try {
			setState(207);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(205);
				base_statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(206);
				labeled_statement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Base_statementContext extends ParserRuleContext {
		public If_statementContext if_statement() {
			return getRuleContext(If_statementContext.class,0);
		}
		public While_statementContext while_statement() {
			return getRuleContext(While_statementContext.class,0);
		}
		public Assignment_statementContext assignment_statement() {
			return getRuleContext(Assignment_statementContext.class,0);
		}
		public Exit_statementContext exit_statement() {
			return getRuleContext(Exit_statementContext.class,0);
		}
		public Continue_statementContext continue_statement() {
			return getRuleContext(Continue_statementContext.class,0);
		}
		public Jump_statementContext jump_statement() {
			return getRuleContext(Jump_statementContext.class,0);
		}
		public Empty_statementContext empty_statement() {
			return getRuleContext(Empty_statementContext.class,0);
		}
		public Base_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_base_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof STListener ) ((STListener)listener).enterBase_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof STListener ) ((STListener)listener).exitBase_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof STVisitor ) return ((STVisitor<? extends T>)visitor).visitBase_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Base_statementContext base_statement() throws RecognitionException {
		Base_statementContext _localctx = new Base_statementContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_base_statement);
		try {
			setState(216);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IF:
				enterOuterAlt(_localctx, 1);
				{
				setState(209);
				if_statement();
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 2);
				{
				setState(210);
				while_statement();
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 3);
				{
				setState(211);
				assignment_statement();
				}
				break;
			case EXIT:
				enterOuterAlt(_localctx, 4);
				{
				setState(212);
				exit_statement();
				}
				break;
			case CONTINUE:
				enterOuterAlt(_localctx, 5);
				{
				setState(213);
				continue_statement();
				}
				break;
			case JMP:
				enterOuterAlt(_localctx, 6);
				{
				setState(214);
				jump_statement();
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 7);
				{
				setState(215);
				empty_statement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class If_statementContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(STParser.IF, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode THEN() { return getToken(STParser.THEN, 0); }
		public StatementListContext statementList() {
			return getRuleContext(StatementListContext.class,0);
		}
		public TerminalNode END_IF() { return getToken(STParser.END_IF, 0); }
		public Else_partContext else_part() {
			return getRuleContext(Else_partContext.class,0);
		}
		public If_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof STListener ) ((STListener)listener).enterIf_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof STListener ) ((STListener)listener).exitIf_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof STVisitor ) return ((STVisitor<? extends T>)visitor).visitIf_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_statementContext if_statement() throws RecognitionException {
		If_statementContext _localctx = new If_statementContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_if_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(218);
			match(IF);
			setState(219);
			expression(0);
			setState(220);
			match(THEN);
			setState(221);
			statementList();
			setState(223);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(222);
				else_part();
				}
			}

			setState(225);
			match(END_IF);
			setState(227);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				setState(226);
				match(T__2);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Else_partContext extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(STParser.ELSE, 0); }
		public StatementListContext statementList() {
			return getRuleContext(StatementListContext.class,0);
		}
		public Else_partContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_else_part; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof STListener ) ((STListener)listener).enterElse_part(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof STListener ) ((STListener)listener).exitElse_part(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof STVisitor ) return ((STVisitor<? extends T>)visitor).visitElse_part(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Else_partContext else_part() throws RecognitionException {
		Else_partContext _localctx = new Else_partContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_else_part);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(229);
			match(ELSE);
			setState(230);
			statementList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class While_statementContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(STParser.WHILE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode DO() { return getToken(STParser.DO, 0); }
		public StatementListContext statementList() {
			return getRuleContext(StatementListContext.class,0);
		}
		public TerminalNode END_WHILE() { return getToken(STParser.END_WHILE, 0); }
		public While_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof STListener ) ((STListener)listener).enterWhile_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof STListener ) ((STListener)listener).exitWhile_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof STVisitor ) return ((STVisitor<? extends T>)visitor).visitWhile_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final While_statementContext while_statement() throws RecognitionException {
		While_statementContext _localctx = new While_statementContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_while_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(232);
			match(WHILE);
			setState(233);
			expression(0);
			setState(234);
			match(DO);
			setState(235);
			statementList();
			setState(236);
			match(END_WHILE);
			setState(238);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				{
				setState(237);
				match(T__2);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Assignment_statementContext extends ParserRuleContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Assignment_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof STListener ) ((STListener)listener).enterAssignment_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof STListener ) ((STListener)listener).exitAssignment_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof STVisitor ) return ((STVisitor<? extends T>)visitor).visitAssignment_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Assignment_statementContext assignment_statement() throws RecognitionException {
		Assignment_statementContext _localctx = new Assignment_statementContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_assignment_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(240);
			variable();
			setState(241);
			match(T__3);
			setState(242);
			expression(0);
			setState(243);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Exit_statementContext extends ParserRuleContext {
		public TerminalNode EXIT() { return getToken(STParser.EXIT, 0); }
		public Exit_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exit_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof STListener ) ((STListener)listener).enterExit_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof STListener ) ((STListener)listener).exitExit_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof STVisitor ) return ((STVisitor<? extends T>)visitor).visitExit_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Exit_statementContext exit_statement() throws RecognitionException {
		Exit_statementContext _localctx = new Exit_statementContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_exit_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(245);
			match(EXIT);
			setState(246);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Continue_statementContext extends ParserRuleContext {
		public TerminalNode CONTINUE() { return getToken(STParser.CONTINUE, 0); }
		public Continue_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_continue_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof STListener ) ((STListener)listener).enterContinue_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof STListener ) ((STListener)listener).exitContinue_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof STVisitor ) return ((STVisitor<? extends T>)visitor).visitContinue_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Continue_statementContext continue_statement() throws RecognitionException {
		Continue_statementContext _localctx = new Continue_statementContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_continue_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(248);
			match(CONTINUE);
			setState(249);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Jump_statementContext extends ParserRuleContext {
		public TerminalNode JMP() { return getToken(STParser.JMP, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Jump_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jump_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof STListener ) ((STListener)listener).enterJump_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof STListener ) ((STListener)listener).exitJump_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof STVisitor ) return ((STVisitor<? extends T>)visitor).visitJump_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Jump_statementContext jump_statement() throws RecognitionException {
		Jump_statementContext _localctx = new Jump_statementContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_jump_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(251);
			match(JMP);
			setState(252);
			identifier();
			setState(253);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Empty_statementContext extends ParserRuleContext {
		public Empty_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_empty_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof STListener ) ((STListener)listener).enterEmpty_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof STListener ) ((STListener)listener).exitEmpty_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof STVisitor ) return ((STVisitor<? extends T>)visitor).visitEmpty_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Empty_statementContext empty_statement() throws RecognitionException {
		Empty_statementContext _localctx = new Empty_statementContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_empty_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(255);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Labeled_statementContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public Labeled_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_labeled_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof STListener ) ((STListener)listener).enterLabeled_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof STListener ) ((STListener)listener).exitLabeled_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof STVisitor ) return ((STVisitor<? extends T>)visitor).visitLabeled_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Labeled_statementContext labeled_statement() throws RecognitionException {
		Labeled_statementContext _localctx = new Labeled_statementContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_labeled_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(257);
			identifier();
			setState(258);
			match(T__0);
			setState(259);
			statement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public Primary_expressionContext primary_expression() {
			return getRuleContext(Primary_expressionContext.class,0);
		}
		public AddContext add() {
			return getRuleContext(AddContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public NegContext neg() {
			return getRuleContext(NegContext.class,0);
		}
		public PotContext pot() {
			return getRuleContext(PotContext.class,0);
		}
		public MultContext mult() {
			return getRuleContext(MultContext.class,0);
		}
		public CmpContext cmp() {
			return getRuleContext(CmpContext.class,0);
		}
		public EqContext eq() {
			return getRuleContext(EqContext.class,0);
		}
		public AndContext and() {
			return getRuleContext(AndContext.class,0);
		}
		public OrContext or() {
			return getRuleContext(OrContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof STListener ) ((STListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof STListener ) ((STListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof STVisitor ) return ((STVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 58;
		enterRecursionRule(_localctx, 58, RULE_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(269);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
			case REAL_EXPONENT:
			case FIX_POINT:
			case UNSIGNED_INT:
			case STRING_VALUE:
			case WSTRING_VALUE:
			case FALSE:
			case TRUE:
			case IDENTIFIER:
				{
				setState(262);
				primary_expression();
				}
				break;
			case MINUS:
			case PLUS:
				{
				setState(263);
				add();
				setState(264);
				expression(9);
				}
				break;
			case NOT:
				{
				setState(266);
				neg();
				setState(267);
				expression(3);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(301);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(299);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(271);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(272);
						pot();
						setState(273);
						expression(9);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(275);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(276);
						mult();
						setState(277);
						expression(8);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(279);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(280);
						add();
						setState(281);
						expression(7);
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(283);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(284);
						cmp();
						setState(285);
						expression(6);
						}
						break;
					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(287);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(288);
						eq();
						setState(289);
						expression(5);
						}
						break;
					case 6:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(291);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(292);
						and();
						setState(293);
						expression(3);
						}
						break;
					case 7:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(295);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(296);
						or();
						setState(297);
						expression(2);
						}
						break;
					}
					} 
				}
				setState(303);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Primary_expressionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Simple_valueContext simple_value() {
			return getRuleContext(Simple_valueContext.class,0);
		}
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public Primary_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primary_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof STListener ) ((STListener)listener).enterPrimary_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof STListener ) ((STListener)listener).exitPrimary_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof STVisitor ) return ((STVisitor<? extends T>)visitor).visitPrimary_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Primary_expressionContext primary_expression() throws RecognitionException {
		Primary_expressionContext _localctx = new Primary_expressionContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_primary_expression);
		try {
			setState(310);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(304);
				match(T__4);
				setState(305);
				expression(0);
				setState(306);
				match(T__5);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(308);
				simple_value();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(309);
				function_call();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Simple_valueContext extends ParserRuleContext {
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public Simple_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simple_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof STListener ) ((STListener)listener).enterSimple_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof STListener ) ((STListener)listener).exitSimple_value(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof STVisitor ) return ((STVisitor<? extends T>)visitor).visitSimple_value(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Simple_valueContext simple_value() throws RecognitionException {
		Simple_valueContext _localctx = new Simple_valueContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_simple_value);
		try {
			setState(314);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case REAL_EXPONENT:
			case FIX_POINT:
			case UNSIGNED_INT:
			case STRING_VALUE:
			case WSTRING_VALUE:
			case FALSE:
			case TRUE:
				enterOuterAlt(_localctx, 1);
				{
				setState(312);
				constant();
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(313);
				variable();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof STListener ) ((STListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof STListener ) ((STListener)listener).exitVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof STVisitor ) return ((STVisitor<? extends T>)visitor).visitVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_variable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(316);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdentifierContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(STParser.IDENTIFIER, 0); }
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof STListener ) ((STListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof STListener ) ((STListener)listener).exitIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof STVisitor ) return ((STVisitor<? extends T>)visitor).visitIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(318);
			match(IDENTIFIER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Function_callContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Parameter_listContext parameter_list() {
			return getRuleContext(Parameter_listContext.class,0);
		}
		public Function_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof STListener ) ((STListener)listener).enterFunction_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof STListener ) ((STListener)listener).exitFunction_call(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof STVisitor ) return ((STVisitor<? extends T>)visitor).visitFunction_call(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_callContext function_call() throws RecognitionException {
		Function_callContext _localctx = new Function_callContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_function_call);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(320);
			identifier();
			setState(321);
			match(T__4);
			setState(323);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 5)) & ~0x3f) == 0 && ((1L << (_la - 5)) & ((1L << (T__4 - 5)) | (1L << (REAL_EXPONENT - 5)) | (1L << (FIX_POINT - 5)) | (1L << (UNSIGNED_INT - 5)) | (1L << (STRING_VALUE - 5)) | (1L << (WSTRING_VALUE - 5)) | (1L << (FALSE - 5)) | (1L << (MINUS - 5)) | (1L << (NOT - 5)) | (1L << (PLUS - 5)) | (1L << (TRUE - 5)) | (1L << (IDENTIFIER - 5)))) != 0)) {
				{
				setState(322);
				parameter_list();
				}
			}

			setState(325);
			match(T__5);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Parameter_listContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public Parameter_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof STListener ) ((STListener)listener).enterParameter_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof STListener ) ((STListener)listener).exitParameter_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof STVisitor ) return ((STVisitor<? extends T>)visitor).visitParameter_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Parameter_listContext parameter_list() throws RecognitionException {
		Parameter_listContext _localctx = new Parameter_listContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_parameter_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(327);
			expression(0);
			setState(332);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(328);
				match(T__1);
				setState(329);
				expression(0);
				}
				}
				setState(334);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PotContext extends ParserRuleContext {
		public TerminalNode POT() { return getToken(STParser.POT, 0); }
		public PotContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pot; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof STListener ) ((STListener)listener).enterPot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof STListener ) ((STListener)listener).exitPot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof STVisitor ) return ((STVisitor<? extends T>)visitor).visitPot(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PotContext pot() throws RecognitionException {
		PotContext _localctx = new PotContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_pot);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(335);
			match(POT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MultContext extends ParserRuleContext {
		public TerminalNode TIMES() { return getToken(STParser.TIMES, 0); }
		public TerminalNode DIV() { return getToken(STParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(STParser.MOD, 0); }
		public MultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mult; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof STListener ) ((STListener)listener).enterMult(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof STListener ) ((STListener)listener).exitMult(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof STVisitor ) return ((STVisitor<? extends T>)visitor).visitMult(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultContext mult() throws RecognitionException {
		MultContext _localctx = new MultContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_mult);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(337);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DIV) | (1L << MOD) | (1L << TIMES))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AddContext extends ParserRuleContext {
		public TerminalNode PLUS() { return getToken(STParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(STParser.MINUS, 0); }
		public AddContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_add; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof STListener ) ((STListener)listener).enterAdd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof STListener ) ((STListener)listener).exitAdd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof STVisitor ) return ((STVisitor<? extends T>)visitor).visitAdd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AddContext add() throws RecognitionException {
		AddContext _localctx = new AddContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_add);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(339);
			_la = _input.LA(1);
			if ( !(_la==MINUS || _la==PLUS) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CmpContext extends ParserRuleContext {
		public TerminalNode LT() { return getToken(STParser.LT, 0); }
		public TerminalNode GT() { return getToken(STParser.GT, 0); }
		public TerminalNode LE() { return getToken(STParser.LE, 0); }
		public TerminalNode GE() { return getToken(STParser.GE, 0); }
		public CmpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof STListener ) ((STListener)listener).enterCmp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof STListener ) ((STListener)listener).exitCmp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof STVisitor ) return ((STVisitor<? extends T>)visitor).visitCmp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CmpContext cmp() throws RecognitionException {
		CmpContext _localctx = new CmpContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_cmp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(341);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GE) | (1L << GT) | (1L << LE) | (1L << LT))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EqContext extends ParserRuleContext {
		public TerminalNode EQ() { return getToken(STParser.EQ, 0); }
		public TerminalNode NEQ() { return getToken(STParser.NEQ, 0); }
		public EqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof STListener ) ((STListener)listener).enterEq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof STListener ) ((STListener)listener).exitEq(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof STVisitor ) return ((STVisitor<? extends T>)visitor).visitEq(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EqContext eq() throws RecognitionException {
		EqContext _localctx = new EqContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_eq);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(343);
			_la = _input.LA(1);
			if ( !(_la==EQ || _la==NEQ) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NegContext extends ParserRuleContext {
		public TerminalNode NOT() { return getToken(STParser.NOT, 0); }
		public NegContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_neg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof STListener ) ((STListener)listener).enterNeg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof STListener ) ((STListener)listener).exitNeg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof STVisitor ) return ((STVisitor<? extends T>)visitor).visitNeg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NegContext neg() throws RecognitionException {
		NegContext _localctx = new NegContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_neg);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(345);
			match(NOT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AndContext extends ParserRuleContext {
		public TerminalNode AND() { return getToken(STParser.AND, 0); }
		public AndContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_and; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof STListener ) ((STListener)listener).enterAnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof STListener ) ((STListener)listener).exitAnd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof STVisitor ) return ((STVisitor<? extends T>)visitor).visitAnd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AndContext and() throws RecognitionException {
		AndContext _localctx = new AndContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_and);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(347);
			match(AND);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OrContext extends ParserRuleContext {
		public TerminalNode OR() { return getToken(STParser.OR, 0); }
		public TerminalNode XOR() { return getToken(STParser.XOR, 0); }
		public OrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_or; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof STListener ) ((STListener)listener).enterOr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof STListener ) ((STListener)listener).exitOr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof STVisitor ) return ((STVisitor<? extends T>)visitor).visitOr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OrContext or() throws RecognitionException {
		OrContext _localctx = new OrContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_or);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(349);
			_la = _input.LA(1);
			if ( !(_la==OR || _la==XOR) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstantContext extends ParserRuleContext {
		public Integer_literalContext integer_literal() {
			return getRuleContext(Integer_literalContext.class,0);
		}
		public Real_literalContext real_literal() {
			return getRuleContext(Real_literalContext.class,0);
		}
		public Boolean_literalContext boolean_literal() {
			return getRuleContext(Boolean_literalContext.class,0);
		}
		public String_literalContext string_literal() {
			return getRuleContext(String_literalContext.class,0);
		}
		public ConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof STListener ) ((STListener)listener).enterConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof STListener ) ((STListener)listener).exitConstant(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof STVisitor ) return ((STVisitor<? extends T>)visitor).visitConstant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantContext constant() throws RecognitionException {
		ConstantContext _localctx = new ConstantContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_constant);
		try {
			setState(355);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case UNSIGNED_INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(351);
				integer_literal();
				}
				break;
			case REAL_EXPONENT:
			case FIX_POINT:
				enterOuterAlt(_localctx, 2);
				{
				setState(352);
				real_literal();
				}
				break;
			case FALSE:
			case TRUE:
				enterOuterAlt(_localctx, 3);
				{
				setState(353);
				boolean_literal();
				}
				break;
			case STRING_VALUE:
			case WSTRING_VALUE:
				enterOuterAlt(_localctx, 4);
				{
				setState(354);
				string_literal();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Real_literalContext extends ParserRuleContext {
		public TerminalNode FIX_POINT() { return getToken(STParser.FIX_POINT, 0); }
		public TerminalNode REAL_EXPONENT() { return getToken(STParser.REAL_EXPONENT, 0); }
		public Real_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_real_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof STListener ) ((STListener)listener).enterReal_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof STListener ) ((STListener)listener).exitReal_literal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof STVisitor ) return ((STVisitor<? extends T>)visitor).visitReal_literal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Real_literalContext real_literal() throws RecognitionException {
		Real_literalContext _localctx = new Real_literalContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_real_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(357);
			_la = _input.LA(1);
			if ( !(_la==REAL_EXPONENT || _la==FIX_POINT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Integer_literalContext extends ParserRuleContext {
		public TerminalNode UNSIGNED_INT() { return getToken(STParser.UNSIGNED_INT, 0); }
		public Integer_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integer_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof STListener ) ((STListener)listener).enterInteger_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof STListener ) ((STListener)listener).exitInteger_literal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof STVisitor ) return ((STVisitor<? extends T>)visitor).visitInteger_literal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Integer_literalContext integer_literal() throws RecognitionException {
		Integer_literalContext _localctx = new Integer_literalContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_integer_literal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(359);
			match(UNSIGNED_INT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Boolean_literalContext extends ParserRuleContext {
		public TerminalNode TRUE() { return getToken(STParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(STParser.FALSE, 0); }
		public Boolean_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolean_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof STListener ) ((STListener)listener).enterBoolean_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof STListener ) ((STListener)listener).exitBoolean_literal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof STVisitor ) return ((STVisitor<? extends T>)visitor).visitBoolean_literal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Boolean_literalContext boolean_literal() throws RecognitionException {
		Boolean_literalContext _localctx = new Boolean_literalContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_boolean_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(361);
			_la = _input.LA(1);
			if ( !(_la==FALSE || _la==TRUE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class String_literalContext extends ParserRuleContext {
		public TerminalNode STRING_VALUE() { return getToken(STParser.STRING_VALUE, 0); }
		public TerminalNode WSTRING_VALUE() { return getToken(STParser.WSTRING_VALUE, 0); }
		public String_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof STListener ) ((STListener)listener).enterString_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof STListener ) ((STListener)listener).exitString_literal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof STVisitor ) return ((STVisitor<? extends T>)visitor).visitString_literal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final String_literalContext string_literal() throws RecognitionException {
		String_literalContext _localctx = new String_literalContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_string_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(363);
			_la = _input.LA(1);
			if ( !(_la==STRING_VALUE || _la==WSTRING_VALUE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 29:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 8);
		case 1:
			return precpred(_ctx, 7);
		case 2:
			return precpred(_ctx, 6);
		case 3:
			return precpred(_ctx, 5);
		case 4:
			return precpred(_ctx, 4);
		case 5:
			return precpred(_ctx, 2);
		case 6:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3B\u0170\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\3\2\5\2f\n\2\3\2"+
		"\3\2\7\2j\n\2\f\2\16\2m\13\2\3\3\3\3\3\3\3\3\3\3\3\3\3\4\5\4v\n\4\3\4"+
		"\5\4y\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\6\6\u0085\n\6\r\6\16"+
		"\6\u0086\3\6\3\6\3\7\7\7\u008c\n\7\f\7\16\7\u008f\13\7\3\b\3\b\6\b\u0093"+
		"\n\b\r\b\16\b\u0094\3\b\3\b\3\t\3\t\3\n\3\n\6\n\u009d\n\n\r\n\16\n\u009e"+
		"\3\n\3\n\3\13\3\13\3\13\7\13\u00a6\n\13\f\13\16\13\u00a9\13\13\3\13\3"+
		"\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\6\r\u00b7\n\r\r\r\16\r\u00b8"+
		"\3\r\3\r\3\16\3\16\3\16\3\16\5\16\u00c1\n\16\3\17\3\17\3\20\3\20\3\21"+
		"\3\21\3\22\3\22\3\23\6\23\u00cc\n\23\r\23\16\23\u00cd\3\24\3\24\5\24\u00d2"+
		"\n\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u00db\n\25\3\26\3\26\3\26"+
		"\3\26\3\26\5\26\u00e2\n\26\3\26\3\26\5\26\u00e6\n\26\3\27\3\27\3\27\3"+
		"\30\3\30\3\30\3\30\3\30\3\30\5\30\u00f1\n\30\3\31\3\31\3\31\3\31\3\31"+
		"\3\32\3\32\3\32\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\35\3\35\3\36\3\36"+
		"\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\5\37\u0110\n\37\3\37"+
		"\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37"+
		"\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\7\37"+
		"\u012e\n\37\f\37\16\37\u0131\13\37\3 \3 \3 \3 \3 \3 \5 \u0139\n \3!\3"+
		"!\5!\u013d\n!\3\"\3\"\3#\3#\3$\3$\3$\5$\u0146\n$\3$\3$\3%\3%\3%\7%\u014d"+
		"\n%\f%\16%\u0150\13%\3&\3&\3\'\3\'\3(\3(\3)\3)\3*\3*\3+\3+\3,\3,\3-\3"+
		"-\3.\3.\3.\3.\5.\u0166\n.\3/\3/\3\60\3\60\3\61\3\61\3\62\3\62\3\62\2\3"+
		"<\63\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@"+
		"BDFHJLNPRTVXZ\\^`b\2\f\3\2:=\3\2\63\64\5\2\30\30++88\4\2,,\60\60\3\2$"+
		"\'\4\2\37\37--\4\2//AA\3\2\t\n\4\2##99\3\2\16\17\2\u0167\2e\3\2\2\2\4"+
		"n\3\2\2\2\6u\3\2\2\2\bz\3\2\2\2\n\u0082\3\2\2\2\f\u008d\3\2\2\2\16\u0090"+
		"\3\2\2\2\20\u0098\3\2\2\2\22\u009a\3\2\2\2\24\u00a2\3\2\2\2\26\u00ae\3"+
		"\2\2\2\30\u00b4\3\2\2\2\32\u00c0\3\2\2\2\34\u00c2\3\2\2\2\36\u00c4\3\2"+
		"\2\2 \u00c6\3\2\2\2\"\u00c8\3\2\2\2$\u00cb\3\2\2\2&\u00d1\3\2\2\2(\u00da"+
		"\3\2\2\2*\u00dc\3\2\2\2,\u00e7\3\2\2\2.\u00ea\3\2\2\2\60\u00f2\3\2\2\2"+
		"\62\u00f7\3\2\2\2\64\u00fa\3\2\2\2\66\u00fd\3\2\2\28\u0101\3\2\2\2:\u0103"+
		"\3\2\2\2<\u010f\3\2\2\2>\u0138\3\2\2\2@\u013c\3\2\2\2B\u013e\3\2\2\2D"+
		"\u0140\3\2\2\2F\u0142\3\2\2\2H\u0149\3\2\2\2J\u0151\3\2\2\2L\u0153\3\2"+
		"\2\2N\u0155\3\2\2\2P\u0157\3\2\2\2R\u0159\3\2\2\2T\u015b\3\2\2\2V\u015d"+
		"\3\2\2\2X\u015f\3\2\2\2Z\u0165\3\2\2\2\\\u0167\3\2\2\2^\u0169\3\2\2\2"+
		"`\u016b\3\2\2\2b\u016d\3\2\2\2df\5\30\r\2ed\3\2\2\2ef\3\2\2\2fg\3\2\2"+
		"\2gk\5\4\3\2hj\5\b\5\2ih\3\2\2\2jm\3\2\2\2ki\3\2\2\2kl\3\2\2\2l\3\3\2"+
		"\2\2mk\3\2\2\2no\7\62\2\2op\5D#\2pq\5\6\4\2qr\5$\23\2rs\7\33\2\2s\5\3"+
		"\2\2\2tv\5\22\n\2ut\3\2\2\2uv\3\2\2\2vx\3\2\2\2wy\5\n\6\2xw\3\2\2\2xy"+
		"\3\2\2\2y\7\3\2\2\2z{\7!\2\2{|\5D#\2|}\7\3\2\2}~\5\32\16\2~\177\5\f\7"+
		"\2\177\u0080\5$\23\2\u0080\u0081\7\"\2\2\u0081\t\3\2\2\2\u0082\u0084\7"+
		":\2\2\u0083\u0085\5\24\13\2\u0084\u0083\3\2\2\2\u0085\u0086\3\2\2\2\u0086"+
		"\u0084\3\2\2\2\u0086\u0087\3\2\2\2\u0087\u0088\3\2\2\2\u0088\u0089\7\34"+
		"\2\2\u0089\13\3\2\2\2\u008a\u008c\5\16\b\2\u008b\u008a\3\2\2\2\u008c\u008f"+
		"\3\2\2\2\u008d\u008b\3\2\2\2\u008d\u008e\3\2\2\2\u008e\r\3\2\2\2\u008f"+
		"\u008d\3\2\2\2\u0090\u0092\5\20\t\2\u0091\u0093\5\24\13\2\u0092\u0091"+
		"\3\2\2\2\u0093\u0094\3\2\2\2\u0094\u0092\3\2\2\2\u0094\u0095\3\2\2\2\u0095"+
		"\u0096\3\2\2\2\u0096\u0097\7\34\2\2\u0097\17\3\2\2\2\u0098\u0099\t\2\2"+
		"\2\u0099\21\3\2\2\2\u009a\u009c\7>\2\2\u009b\u009d\5\26\f\2\u009c\u009b"+
		"\3\2\2\2\u009d\u009e\3\2\2\2\u009e\u009c\3\2\2\2\u009e\u009f\3\2\2\2\u009f"+
		"\u00a0\3\2\2\2\u00a0\u00a1\7\34\2\2\u00a1\23\3\2\2\2\u00a2\u00a7\5D#\2"+
		"\u00a3\u00a4\7\4\2\2\u00a4\u00a6\5D#\2\u00a5\u00a3\3\2\2\2\u00a6\u00a9"+
		"\3\2\2\2\u00a7\u00a5\3\2\2\2\u00a7\u00a8\3\2\2\2\u00a8\u00aa\3\2\2\2\u00a9"+
		"\u00a7\3\2\2\2\u00aa\u00ab\7\3\2\2\u00ab\u00ac\5\32\16\2\u00ac\u00ad\7"+
		"\5\2\2\u00ad\25\3\2\2\2\u00ae\u00af\5D#\2\u00af\u00b0\7\3\2\2\u00b0\u00b1"+
		"\5\32\16\2\u00b1\u00b2\t\3\2\2\u00b2\u00b3\7\5\2\2\u00b3\27\3\2\2\2\u00b4"+
		"\u00b6\7?\2\2\u00b5\u00b7\5\24\13\2\u00b6\u00b5\3\2\2\2\u00b7\u00b8\3"+
		"\2\2\2\u00b8\u00b6\3\2\2\2\u00b8\u00b9\3\2\2\2\u00b9\u00ba\3\2\2\2\u00ba"+
		"\u00bb\7\34\2\2\u00bb\31\3\2\2\2\u00bc\u00c1\5\34\17\2\u00bd\u00c1\5\36"+
		"\20\2\u00be\u00c1\5 \21\2\u00bf\u00c1\5\"\22\2\u00c0\u00bc\3\2\2\2\u00c0"+
		"\u00bd\3\2\2\2\u00c0\u00be\3\2\2\2\u00c0\u00bf\3\2\2\2\u00c1\33\3\2\2"+
		"\2\u00c2\u00c3\7)\2\2\u00c3\35\3\2\2\2\u00c4\u00c5\7\65\2\2\u00c5\37\3"+
		"\2\2\2\u00c6\u00c7\7\26\2\2\u00c7!\3\2\2\2\u00c8\u00c9\7\66\2\2\u00c9"+
		"#\3\2\2\2\u00ca\u00cc\5&\24\2\u00cb\u00ca\3\2\2\2\u00cc\u00cd\3\2\2\2"+
		"\u00cd\u00cb\3\2\2\2\u00cd\u00ce\3\2\2\2\u00ce%\3\2\2\2\u00cf\u00d2\5"+
		"(\25\2\u00d0\u00d2\5:\36\2\u00d1\u00cf\3\2\2\2\u00d1\u00d0\3\2\2\2\u00d2"+
		"\'\3\2\2\2\u00d3\u00db\5*\26\2\u00d4\u00db\5.\30\2\u00d5\u00db\5\60\31"+
		"\2\u00d6\u00db\5\62\32\2\u00d7\u00db\5\64\33\2\u00d8\u00db\5\66\34\2\u00d9"+
		"\u00db\58\35\2\u00da\u00d3\3\2\2\2\u00da\u00d4\3\2\2\2\u00da\u00d5\3\2"+
		"\2\2\u00da\u00d6\3\2\2\2\u00da\u00d7\3\2\2\2\u00da\u00d8\3\2\2\2\u00da"+
		"\u00d9\3\2\2\2\u00db)\3\2\2\2\u00dc\u00dd\7(\2\2\u00dd\u00de\5<\37\2\u00de"+
		"\u00df\7\67\2\2\u00df\u00e1\5$\23\2\u00e0\u00e2\5,\27\2\u00e1\u00e0\3"+
		"\2\2\2\u00e1\u00e2\3\2\2\2\u00e2\u00e3\3\2\2\2\u00e3\u00e5\7\32\2\2\u00e4"+
		"\u00e6\7\5\2\2\u00e5\u00e4\3\2\2\2\u00e5\u00e6\3\2\2\2\u00e6+\3\2\2\2"+
		"\u00e7\u00e8\7\36\2\2\u00e8\u00e9\5$\23\2\u00e9-\3\2\2\2\u00ea\u00eb\7"+
		"@\2\2\u00eb\u00ec\5<\37\2\u00ec\u00ed\7\31\2\2\u00ed\u00ee\5$\23\2\u00ee"+
		"\u00f0\7\35\2\2\u00ef\u00f1\7\5\2\2\u00f0\u00ef\3\2\2\2\u00f0\u00f1\3"+
		"\2\2\2\u00f1/\3\2\2\2\u00f2\u00f3\5B\"\2\u00f3\u00f4\7\6\2\2\u00f4\u00f5"+
		"\5<\37\2\u00f5\u00f6\7\5\2\2\u00f6\61\3\2\2\2\u00f7\u00f8\7 \2\2\u00f8"+
		"\u00f9\7\5\2\2\u00f9\63\3\2\2\2\u00fa\u00fb\7\27\2\2\u00fb\u00fc\7\5\2"+
		"\2\u00fc\65\3\2\2\2\u00fd\u00fe\7*\2\2\u00fe\u00ff\5D#\2\u00ff\u0100\7"+
		"\5\2\2\u0100\67\3\2\2\2\u0101\u0102\7\5\2\2\u01029\3\2\2\2\u0103\u0104"+
		"\5D#\2\u0104\u0105\7\3\2\2\u0105\u0106\5&\24\2\u0106;\3\2\2\2\u0107\u0108"+
		"\b\37\1\2\u0108\u0110\5> \2\u0109\u010a\5N(\2\u010a\u010b\5<\37\13\u010b"+
		"\u0110\3\2\2\2\u010c\u010d\5T+\2\u010d\u010e\5<\37\5\u010e\u0110\3\2\2"+
		"\2\u010f\u0107\3\2\2\2\u010f\u0109\3\2\2\2\u010f\u010c\3\2\2\2\u0110\u012f"+
		"\3\2\2\2\u0111\u0112\f\n\2\2\u0112\u0113\5J&\2\u0113\u0114\5<\37\13\u0114"+
		"\u012e\3\2\2\2\u0115\u0116\f\t\2\2\u0116\u0117\5L\'\2\u0117\u0118\5<\37"+
		"\n\u0118\u012e\3\2\2\2\u0119\u011a\f\b\2\2\u011a\u011b\5N(\2\u011b\u011c"+
		"\5<\37\t\u011c\u012e\3\2\2\2\u011d\u011e\f\7\2\2\u011e\u011f\5P)\2\u011f"+
		"\u0120\5<\37\b\u0120\u012e\3\2\2\2\u0121\u0122\f\6\2\2\u0122\u0123\5R"+
		"*\2\u0123\u0124\5<\37\7\u0124\u012e\3\2\2\2\u0125\u0126\f\4\2\2\u0126"+
		"\u0127\5V,\2\u0127\u0128\5<\37\5\u0128\u012e\3\2\2\2\u0129\u012a\f\3\2"+
		"\2\u012a\u012b\5X-\2\u012b\u012c\5<\37\4\u012c\u012e\3\2\2\2\u012d\u0111"+
		"\3\2\2\2\u012d\u0115\3\2\2\2\u012d\u0119\3\2\2\2\u012d\u011d\3\2\2\2\u012d"+
		"\u0121\3\2\2\2\u012d\u0125\3\2\2\2\u012d\u0129\3\2\2\2\u012e\u0131\3\2"+
		"\2\2\u012f\u012d\3\2\2\2\u012f\u0130\3\2\2\2\u0130=\3\2\2\2\u0131\u012f"+
		"\3\2\2\2\u0132\u0133\7\7\2\2\u0133\u0134\5<\37\2\u0134\u0135\7\b\2\2\u0135"+
		"\u0139\3\2\2\2\u0136\u0139\5@!\2\u0137\u0139\5F$\2\u0138\u0132\3\2\2\2"+
		"\u0138\u0136\3\2\2\2\u0138\u0137\3\2\2\2\u0139?\3\2\2\2\u013a\u013d\5"+
		"Z.\2\u013b\u013d\5B\"\2\u013c\u013a\3\2\2\2\u013c\u013b\3\2\2\2\u013d"+
		"A\3\2\2\2\u013e\u013f\5D#\2\u013fC\3\2\2\2\u0140\u0141\7B\2\2\u0141E\3"+
		"\2\2\2\u0142\u0143\5D#\2\u0143\u0145\7\7\2\2\u0144\u0146\5H%\2\u0145\u0144"+
		"\3\2\2\2\u0145\u0146\3\2\2\2\u0146\u0147\3\2\2\2\u0147\u0148\7\b\2\2\u0148"+
		"G\3\2\2\2\u0149\u014e\5<\37\2\u014a\u014b\7\4\2\2\u014b\u014d\5<\37\2"+
		"\u014c\u014a\3\2\2\2\u014d\u0150\3\2\2\2\u014e\u014c\3\2\2\2\u014e\u014f"+
		"\3\2\2\2\u014fI\3\2\2\2\u0150\u014e\3\2\2\2\u0151\u0152\7\61\2\2\u0152"+
		"K\3\2\2\2\u0153\u0154\t\4\2\2\u0154M\3\2\2\2\u0155\u0156\t\5\2\2\u0156"+
		"O\3\2\2\2\u0157\u0158\t\6\2\2\u0158Q\3\2\2\2\u0159\u015a\t\7\2\2\u015a"+
		"S\3\2\2\2\u015b\u015c\7.\2\2\u015cU\3\2\2\2\u015d\u015e\7\25\2\2\u015e"+
		"W\3\2\2\2\u015f\u0160\t\b\2\2\u0160Y\3\2\2\2\u0161\u0166\5^\60\2\u0162"+
		"\u0166\5\\/\2\u0163\u0166\5`\61\2\u0164\u0166\5b\62\2\u0165\u0161\3\2"+
		"\2\2\u0165\u0162\3\2\2\2\u0165\u0163\3\2\2\2\u0165\u0164\3\2\2\2\u0166"+
		"[\3\2\2\2\u0167\u0168\t\t\2\2\u0168]\3\2\2\2\u0169\u016a\7\13\2\2\u016a"+
		"_\3\2\2\2\u016b\u016c\t\n\2\2\u016ca\3\2\2\2\u016d\u016e\t\13\2\2\u016e"+
		"c\3\2\2\2\33ekux\u0086\u008d\u0094\u009e\u00a7\u00b8\u00c0\u00cd\u00d1"+
		"\u00da\u00e1\u00e5\u00f0\u010f\u012d\u012f\u0138\u013c\u0145\u014e\u0165";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}