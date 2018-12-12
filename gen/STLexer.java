// Generated from C:/Users/PC/Desktop/Compiler\ST.g4 by ANTLR 4.7
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class STLexer extends Lexer {
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
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "REAL_EXPONENT", "FIX_POINT", 
		"UNSIGNED_INT", "EXPONENT", "DIGIT", "NULL", "ONETONINE", "STRING_VALUE", 
		"WSTRING_VALUE", "CHAR_SYMBOL", "WCHAR_SYMBOL", "PRAGMA", "WSFULL", "LINE_COMMENT", 
		"C_LINE_COMMENT", "SINGLE_LINE_COMMENT", "AND", "BOOL", "CONTINUE", "DIV", 
		"DO", "END_IF", "END_PROGRAM", "END_VAR", "END_WHILE", "ELSE", "EQ", "EXIT", 
		"FUNCTION", "END_FUNCTION", "FALSE", "GE", "GT", "LE", "LT", "IF", "INT", 
		"JMP", "MOD", "MINUS", "NEQ", "NOT", "OR", "PLUS", "POT", "PROGRAM", "READ_ONLY", 
		"READ_WRITE", "REAL", "STRING", "THEN", "TIMES", "TRUE", "VAR", "VAR_INPUT", 
		"VAR_OUTPUT", "VAR_IN_OUT", "VAR_ACCESS", "VAR_GLOBAL", "WHILE", "XOR", 
		"IDENTIFIER", "LETTER"
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


	public STLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "ST.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2B\u0226\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\3\2\3\2\3\3\3\3"+
		"\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\5\b\u009d\n\b\3\b\3\b\3\t"+
		"\3\t\3\t\7\t\u00a4\n\t\f\t\16\t\u00a7\13\t\3\n\3\n\3\n\7\n\u00ac\n\n\f"+
		"\n\16\n\u00af\13\n\5\n\u00b1\n\n\3\13\3\13\3\13\5\13\u00b6\n\13\3\13\3"+
		"\13\3\f\3\f\5\f\u00bc\n\f\3\r\3\r\3\16\3\16\3\17\3\17\7\17\u00c4\n\17"+
		"\f\17\16\17\u00c7\13\17\3\17\3\17\3\20\3\20\7\20\u00cd\n\20\f\20\16\20"+
		"\u00d0\13\20\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\7\23\u00da\n\23\f"+
		"\23\16\23\u00dd\13\23\3\23\3\23\3\23\3\23\3\24\6\24\u00e4\n\24\r\24\16"+
		"\24\u00e5\3\24\3\24\3\25\3\25\3\25\3\25\7\25\u00ee\n\25\f\25\16\25\u00f1"+
		"\13\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\7\26\u00fc\n\26\f"+
		"\26\16\26\u00ff\13\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\7\27"+
		"\u010a\n\27\f\27\16\27\u010d\13\27\3\27\3\27\3\30\3\30\3\30\3\30\3\31"+
		"\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\33"+
		"\3\33\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36"+
		"\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37"+
		"\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3\"\3\"\3"+
		"\"\3#\3#\3#\3#\3#\3$\3$\3$\3$\3$\3$\3$\3$\3$\3%\3%\3%\3%\3%\3%\3%\3%\3"+
		"%\3%\3%\3%\3%\3&\3&\3&\3&\3&\3&\3\'\3\'\3\'\3(\3(\3)\3)\3)\3*\3*\3+\3"+
		"+\3+\3,\3,\3,\3,\3-\3-\3-\3-\3.\3.\3.\3.\3/\3/\3\60\3\60\3\60\3\61\3\61"+
		"\3\61\3\61\3\62\3\62\3\62\3\63\3\63\3\64\3\64\3\64\3\65\3\65\3\65\3\65"+
		"\3\65\3\65\3\65\3\65\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66"+
		"\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\38\38\38\38\3"+
		"8\39\39\39\39\39\39\39\3:\3:\3:\3:\3:\3;\3;\3<\3<\3<\3<\3<\3=\3=\3=\3"+
		"=\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3@\3"+
		"@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3B\3B\3"+
		"B\3B\3B\3B\3B\3B\3B\3B\3B\3C\3C\3C\3C\3C\3C\3D\3D\3D\3D\3E\3E\5E\u021b"+
		"\nE\3E\3E\3E\7E\u0220\nE\fE\16E\u0223\13E\3F\3F\5\u00db\u00ef\u00fd\2"+
		"G\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\2\27\2\31\f\33\r\35\16\37"+
		"\17!\2#\2%\20\'\21)\22+\23-\24/\25\61\26\63\27\65\30\67\319\32;\33=\34"+
		"?\35A\36C\37E G!I\"K#M$O%Q&S\'U(W)Y*[+],_-a.c/e\60g\61i\62k\63m\64o\65"+
		"q\66s\67u8w9y:{;}<\177=\u0081>\u0083?\u0085@\u0087A\u0089B\u008b\2\3\2"+
		"\b\3\2\63;\6\2\f\f\17\17&&))\6\2\f\f\17\17$$&&\5\2\13\f\16\17\"\"\4\2"+
		"\f\f\17\17\4\2C\\c|\2\u0232\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3"+
		"\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2"+
		"\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2%\3\2\2\2\2\'\3"+
		"\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3"+
		"\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3"+
		"\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2"+
		"\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2"+
		"Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3"+
		"\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2"+
		"\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2"+
		"\177\3\2\2\2\2\u0081\3\2\2\2\2\u0083\3\2\2\2\2\u0085\3\2\2\2\2\u0087\3"+
		"\2\2\2\2\u0089\3\2\2\2\3\u008d\3\2\2\2\5\u008f\3\2\2\2\7\u0091\3\2\2\2"+
		"\t\u0093\3\2\2\2\13\u0096\3\2\2\2\r\u0098\3\2\2\2\17\u009c\3\2\2\2\21"+
		"\u00a0\3\2\2\2\23\u00b0\3\2\2\2\25\u00b2\3\2\2\2\27\u00bb\3\2\2\2\31\u00bd"+
		"\3\2\2\2\33\u00bf\3\2\2\2\35\u00c1\3\2\2\2\37\u00ca\3\2\2\2!\u00d3\3\2"+
		"\2\2#\u00d5\3\2\2\2%\u00d7\3\2\2\2\'\u00e3\3\2\2\2)\u00e9\3\2\2\2+\u00f7"+
		"\3\2\2\2-\u0105\3\2\2\2/\u0110\3\2\2\2\61\u0114\3\2\2\2\63\u0119\3\2\2"+
		"\2\65\u0122\3\2\2\2\67\u0124\3\2\2\29\u0127\3\2\2\2;\u012e\3\2\2\2=\u013a"+
		"\3\2\2\2?\u0142\3\2\2\2A\u014c\3\2\2\2C\u0151\3\2\2\2E\u0154\3\2\2\2G"+
		"\u0159\3\2\2\2I\u0162\3\2\2\2K\u016f\3\2\2\2M\u0175\3\2\2\2O\u0178\3\2"+
		"\2\2Q\u017a\3\2\2\2S\u017d\3\2\2\2U\u017f\3\2\2\2W\u0182\3\2\2\2Y\u0186"+
		"\3\2\2\2[\u018a\3\2\2\2]\u018e\3\2\2\2_\u0190\3\2\2\2a\u0193\3\2\2\2c"+
		"\u0197\3\2\2\2e\u019a\3\2\2\2g\u019c\3\2\2\2i\u019f\3\2\2\2k\u01a7\3\2"+
		"\2\2m\u01b1\3\2\2\2o\u01bc\3\2\2\2q\u01c1\3\2\2\2s\u01c8\3\2\2\2u\u01cd"+
		"\3\2\2\2w\u01cf\3\2\2\2y\u01d4\3\2\2\2{\u01d8\3\2\2\2}\u01e2\3\2\2\2\177"+
		"\u01ed\3\2\2\2\u0081\u01f8\3\2\2\2\u0083\u0203\3\2\2\2\u0085\u020e\3\2"+
		"\2\2\u0087\u0214\3\2\2\2\u0089\u021a\3\2\2\2\u008b\u0224\3\2\2\2\u008d"+
		"\u008e\7<\2\2\u008e\4\3\2\2\2\u008f\u0090\7.\2\2\u0090\6\3\2\2\2\u0091"+
		"\u0092\7=\2\2\u0092\b\3\2\2\2\u0093\u0094\7<\2\2\u0094\u0095\7?\2\2\u0095"+
		"\n\3\2\2\2\u0096\u0097\7*\2\2\u0097\f\3\2\2\2\u0098\u0099\7+\2\2\u0099"+
		"\16\3\2\2\2\u009a\u009d\5\21\t\2\u009b\u009d\5\23\n\2\u009c\u009a\3\2"+
		"\2\2\u009c\u009b\3\2\2\2\u009d\u009e\3\2\2\2\u009e\u009f\5\25\13\2\u009f"+
		"\20\3\2\2\2\u00a0\u00a1\5\23\n\2\u00a1\u00a5\7\60\2\2\u00a2\u00a4\5\27"+
		"\f\2\u00a3\u00a2\3\2\2\2\u00a4\u00a7\3\2\2\2\u00a5\u00a3\3\2\2\2\u00a5"+
		"\u00a6\3\2\2\2\u00a6\22\3\2\2\2\u00a7\u00a5\3\2\2\2\u00a8\u00b1\5\31\r"+
		"\2\u00a9\u00ad\5\33\16\2\u00aa\u00ac\5\27\f\2\u00ab\u00aa\3\2\2\2\u00ac"+
		"\u00af\3\2\2\2\u00ad\u00ab\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae\u00b1\3\2"+
		"\2\2\u00af\u00ad\3\2\2\2\u00b0\u00a8\3\2\2\2\u00b0\u00a9\3\2\2\2\u00b1"+
		"\24\3\2\2\2\u00b2\u00b5\7G\2\2\u00b3\u00b6\5e\63\2\u00b4\u00b6\5]/\2\u00b5"+
		"\u00b3\3\2\2\2\u00b5\u00b4\3\2\2\2\u00b5\u00b6\3\2\2\2\u00b6\u00b7\3\2"+
		"\2\2\u00b7\u00b8\5\23\n\2\u00b8\26\3\2\2\2\u00b9\u00bc\5\31\r\2\u00ba"+
		"\u00bc\5\33\16\2\u00bb\u00b9\3\2\2\2\u00bb\u00ba\3\2\2\2\u00bc\30\3\2"+
		"\2\2\u00bd\u00be\7\62\2\2\u00be\32\3\2\2\2\u00bf\u00c0\t\2\2\2\u00c0\34"+
		"\3\2\2\2\u00c1\u00c5\7)\2\2\u00c2\u00c4\5!\21\2\u00c3\u00c2\3\2\2\2\u00c4"+
		"\u00c7\3\2\2\2\u00c5\u00c3\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c6\u00c8\3\2"+
		"\2\2\u00c7\u00c5\3\2\2\2\u00c8\u00c9\7)\2\2\u00c9\36\3\2\2\2\u00ca\u00ce"+
		"\7$\2\2\u00cb\u00cd\5#\22\2\u00cc\u00cb\3\2\2\2\u00cd\u00d0\3\2\2\2\u00ce"+
		"\u00cc\3\2\2\2\u00ce\u00cf\3\2\2\2\u00cf\u00d1\3\2\2\2\u00d0\u00ce\3\2"+
		"\2\2\u00d1\u00d2\7$\2\2\u00d2 \3\2\2\2\u00d3\u00d4\n\3\2\2\u00d4\"\3\2"+
		"\2\2\u00d5\u00d6\n\4\2\2\u00d6$\3\2\2\2\u00d7\u00db\7}\2\2\u00d8\u00da"+
		"\13\2\2\2\u00d9\u00d8\3\2\2\2\u00da\u00dd\3\2\2\2\u00db\u00dc\3\2\2\2"+
		"\u00db\u00d9\3\2\2\2\u00dc\u00de\3\2\2\2\u00dd\u00db\3\2\2\2\u00de\u00df"+
		"\7\177\2\2\u00df\u00e0\3\2\2\2\u00e0\u00e1\b\23\2\2\u00e1&\3\2\2\2\u00e2"+
		"\u00e4\t\5\2\2\u00e3\u00e2\3\2\2\2\u00e4\u00e5\3\2\2\2\u00e5\u00e3\3\2"+
		"\2\2\u00e5\u00e6\3\2\2\2\u00e6\u00e7\3\2\2\2\u00e7\u00e8\b\24\2\2\u00e8"+
		"(\3\2\2\2\u00e9\u00ea\7*\2\2\u00ea\u00eb\7,\2\2\u00eb\u00ef\3\2\2\2\u00ec"+
		"\u00ee\13\2\2\2\u00ed\u00ec\3\2\2\2\u00ee\u00f1\3\2\2\2\u00ef\u00f0\3"+
		"\2\2\2\u00ef\u00ed\3\2\2\2\u00f0\u00f2\3\2\2\2\u00f1\u00ef\3\2\2\2\u00f2"+
		"\u00f3\7,\2\2\u00f3\u00f4\7+\2\2\u00f4\u00f5\3\2\2\2\u00f5\u00f6\b\25"+
		"\2\2\u00f6*\3\2\2\2\u00f7\u00f8\7\61\2\2\u00f8\u00f9\7,\2\2\u00f9\u00fd"+
		"\3\2\2\2\u00fa\u00fc\13\2\2\2\u00fb\u00fa\3\2\2\2\u00fc\u00ff\3\2\2\2"+
		"\u00fd\u00fe\3\2\2\2\u00fd\u00fb\3\2\2\2\u00fe\u0100\3\2\2\2\u00ff\u00fd"+
		"\3\2\2\2\u0100\u0101\7,\2\2\u0101\u0102\7\61\2\2\u0102\u0103\3\2\2\2\u0103"+
		"\u0104\b\26\2\2\u0104,\3\2\2\2\u0105\u0106\7\61\2\2\u0106\u0107\7\61\2"+
		"\2\u0107\u010b\3\2\2\2\u0108\u010a\n\6\2\2\u0109\u0108\3\2\2\2\u010a\u010d"+
		"\3\2\2\2\u010b\u0109\3\2\2\2\u010b\u010c\3\2\2\2\u010c\u010e\3\2\2\2\u010d"+
		"\u010b\3\2\2\2\u010e\u010f\b\27\2\2\u010f.\3\2\2\2\u0110\u0111\7C\2\2"+
		"\u0111\u0112\7P\2\2\u0112\u0113\7F\2\2\u0113\60\3\2\2\2\u0114\u0115\7"+
		"D\2\2\u0115\u0116\7Q\2\2\u0116\u0117\7Q\2\2\u0117\u0118\7N\2\2\u0118\62"+
		"\3\2\2\2\u0119\u011a\7E\2\2\u011a\u011b\7Q\2\2\u011b\u011c\7P\2\2\u011c"+
		"\u011d\7V\2\2\u011d\u011e\7K\2\2\u011e\u011f\7P\2\2\u011f\u0120\7W\2\2"+
		"\u0120\u0121\7G\2\2\u0121\64\3\2\2\2\u0122\u0123\7\61\2\2\u0123\66\3\2"+
		"\2\2\u0124\u0125\7F\2\2\u0125\u0126\7Q\2\2\u01268\3\2\2\2\u0127\u0128"+
		"\7G\2\2\u0128\u0129\7P\2\2\u0129\u012a\7F\2\2\u012a\u012b\7a\2\2\u012b"+
		"\u012c\7K\2\2\u012c\u012d\7H\2\2\u012d:\3\2\2\2\u012e\u012f\7G\2\2\u012f"+
		"\u0130\7P\2\2\u0130\u0131\7F\2\2\u0131\u0132\7a\2\2\u0132\u0133\7R\2\2"+
		"\u0133\u0134\7T\2\2\u0134\u0135\7Q\2\2\u0135\u0136\7I\2\2\u0136\u0137"+
		"\7T\2\2\u0137\u0138\7C\2\2\u0138\u0139\7O\2\2\u0139<\3\2\2\2\u013a\u013b"+
		"\7G\2\2\u013b\u013c\7P\2\2\u013c\u013d\7F\2\2\u013d\u013e\7a\2\2\u013e"+
		"\u013f\7X\2\2\u013f\u0140\7C\2\2\u0140\u0141\7T\2\2\u0141>\3\2\2\2\u0142"+
		"\u0143\7G\2\2\u0143\u0144\7P\2\2\u0144\u0145\7F\2\2\u0145\u0146\7a\2\2"+
		"\u0146\u0147\7Y\2\2\u0147\u0148\7J\2\2\u0148\u0149\7K\2\2\u0149\u014a"+
		"\7N\2\2\u014a\u014b\7G\2\2\u014b@\3\2\2\2\u014c\u014d\7G\2\2\u014d\u014e"+
		"\7N\2\2\u014e\u014f\7U\2\2\u014f\u0150\7G\2\2\u0150B\3\2\2\2\u0151\u0152"+
		"\7?\2\2\u0152\u0153\7?\2\2\u0153D\3\2\2\2\u0154\u0155\7G\2\2\u0155\u0156"+
		"\7Z\2\2\u0156\u0157\7K\2\2\u0157\u0158\7V\2\2\u0158F\3\2\2\2\u0159\u015a"+
		"\7H\2\2\u015a\u015b\7W\2\2\u015b\u015c\7P\2\2\u015c\u015d\7E\2\2\u015d"+
		"\u015e\7V\2\2\u015e\u015f\7K\2\2\u015f\u0160\7Q\2\2\u0160\u0161\7P\2\2"+
		"\u0161H\3\2\2\2\u0162\u0163\7G\2\2\u0163\u0164\7P\2\2\u0164\u0165\7F\2"+
		"\2\u0165\u0166\7a\2\2\u0166\u0167\7H\2\2\u0167\u0168\7W\2\2\u0168\u0169"+
		"\7P\2\2\u0169\u016a\7E\2\2\u016a\u016b\7V\2\2\u016b\u016c\7K\2\2\u016c"+
		"\u016d\7Q\2\2\u016d\u016e\7P\2\2\u016eJ\3\2\2\2\u016f\u0170\7H\2\2\u0170"+
		"\u0171\7C\2\2\u0171\u0172\7N\2\2\u0172\u0173\7U\2\2\u0173\u0174\7G\2\2"+
		"\u0174L\3\2\2\2\u0175\u0176\7@\2\2\u0176\u0177\7?\2\2\u0177N\3\2\2\2\u0178"+
		"\u0179\7@\2\2\u0179P\3\2\2\2\u017a\u017b\7>\2\2\u017b\u017c\7?\2\2\u017c"+
		"R\3\2\2\2\u017d\u017e\7>\2\2\u017eT\3\2\2\2\u017f\u0180\7K\2\2\u0180\u0181"+
		"\7H\2\2\u0181V\3\2\2\2\u0182\u0183\7K\2\2\u0183\u0184\7P\2\2\u0184\u0185"+
		"\7V\2\2\u0185X\3\2\2\2\u0186\u0187\7L\2\2\u0187\u0188\7O\2\2\u0188\u0189"+
		"\7R\2\2\u0189Z\3\2\2\2\u018a\u018b\7O\2\2\u018b\u018c\7Q\2\2\u018c\u018d"+
		"\7F\2\2\u018d\\\3\2\2\2\u018e\u018f\7/\2\2\u018f^\3\2\2\2\u0190\u0191"+
		"\7>\2\2\u0191\u0192\7@\2\2\u0192`\3\2\2\2\u0193\u0194\7P\2\2\u0194\u0195"+
		"\7Q\2\2\u0195\u0196\7V\2\2\u0196b\3\2\2\2\u0197\u0198\7Q\2\2\u0198\u0199"+
		"\7T\2\2\u0199d\3\2\2\2\u019a\u019b\7-\2\2\u019bf\3\2\2\2\u019c\u019d\7"+
		",\2\2\u019d\u019e\7,\2\2\u019eh\3\2\2\2\u019f\u01a0\7R\2\2\u01a0\u01a1"+
		"\7T\2\2\u01a1\u01a2\7Q\2\2\u01a2\u01a3\7I\2\2\u01a3\u01a4\7T\2\2\u01a4"+
		"\u01a5\7C\2\2\u01a5\u01a6\7O\2\2\u01a6j\3\2\2\2\u01a7\u01a8\7T\2\2\u01a8"+
		"\u01a9\7G\2\2\u01a9\u01aa\7C\2\2\u01aa\u01ab\7F\2\2\u01ab\u01ac\7a\2\2"+
		"\u01ac\u01ad\7Q\2\2\u01ad\u01ae\7P\2\2\u01ae\u01af\7N\2\2\u01af\u01b0"+
		"\7[\2\2\u01b0l\3\2\2\2\u01b1\u01b2\7T\2\2\u01b2\u01b3\7G\2\2\u01b3\u01b4"+
		"\7C\2\2\u01b4\u01b5\7F\2\2\u01b5\u01b6\7a\2\2\u01b6\u01b7\7Y\2\2\u01b7"+
		"\u01b8\7T\2\2\u01b8\u01b9\7K\2\2\u01b9\u01ba\7V\2\2\u01ba\u01bb\7G\2\2"+
		"\u01bbn\3\2\2\2\u01bc\u01bd\7T\2\2\u01bd\u01be\7G\2\2\u01be\u01bf\7C\2"+
		"\2\u01bf\u01c0\7N\2\2\u01c0p\3\2\2\2\u01c1\u01c2\7U\2\2\u01c2\u01c3\7"+
		"V\2\2\u01c3\u01c4\7T\2\2\u01c4\u01c5\7K\2\2\u01c5\u01c6\7P\2\2\u01c6\u01c7"+
		"\7I\2\2\u01c7r\3\2\2\2\u01c8\u01c9\7V\2\2\u01c9\u01ca\7J\2\2\u01ca\u01cb"+
		"\7G\2\2\u01cb\u01cc\7P\2\2\u01cct\3\2\2\2\u01cd\u01ce\7,\2\2\u01cev\3"+
		"\2\2\2\u01cf\u01d0\7V\2\2\u01d0\u01d1\7T\2\2\u01d1\u01d2\7W\2\2\u01d2"+
		"\u01d3\7G\2\2\u01d3x\3\2\2\2\u01d4\u01d5\7X\2\2\u01d5\u01d6\7C\2\2\u01d6"+
		"\u01d7\7T\2\2\u01d7z\3\2\2\2\u01d8\u01d9\7X\2\2\u01d9\u01da\7C\2\2\u01da"+
		"\u01db\7T\2\2\u01db\u01dc\7a\2\2\u01dc\u01dd\7K\2\2\u01dd\u01de\7P\2\2"+
		"\u01de\u01df\7R\2\2\u01df\u01e0\7W\2\2\u01e0\u01e1\7V\2\2\u01e1|\3\2\2"+
		"\2\u01e2\u01e3\7X\2\2\u01e3\u01e4\7C\2\2\u01e4\u01e5\7T\2\2\u01e5\u01e6"+
		"\7a\2\2\u01e6\u01e7\7Q\2\2\u01e7\u01e8\7W\2\2\u01e8\u01e9\7V\2\2\u01e9"+
		"\u01ea\7R\2\2\u01ea\u01eb\7W\2\2\u01eb\u01ec\7V\2\2\u01ec~\3\2\2\2\u01ed"+
		"\u01ee\7X\2\2\u01ee\u01ef\7C\2\2\u01ef\u01f0\7T\2\2\u01f0\u01f1\7a\2\2"+
		"\u01f1\u01f2\7K\2\2\u01f2\u01f3\7P\2\2\u01f3\u01f4\7a\2\2\u01f4\u01f5"+
		"\7Q\2\2\u01f5\u01f6\7W\2\2\u01f6\u01f7\7V\2\2\u01f7\u0080\3\2\2\2\u01f8"+
		"\u01f9\7X\2\2\u01f9\u01fa\7C\2\2\u01fa\u01fb\7T\2\2\u01fb\u01fc\7a\2\2"+
		"\u01fc\u01fd\7C\2\2\u01fd\u01fe\7E\2\2\u01fe\u01ff\7E\2\2\u01ff\u0200"+
		"\7G\2\2\u0200\u0201\7U\2\2\u0201\u0202\7U\2\2\u0202\u0082\3\2\2\2\u0203"+
		"\u0204\7X\2\2\u0204\u0205\7C\2\2\u0205\u0206\7T\2\2\u0206\u0207\7a\2\2"+
		"\u0207\u0208\7I\2\2\u0208\u0209\7N\2\2\u0209\u020a\7Q\2\2\u020a\u020b"+
		"\7D\2\2\u020b\u020c\7C\2\2\u020c\u020d\7N\2\2\u020d\u0084\3\2\2\2\u020e"+
		"\u020f\7Y\2\2\u020f\u0210\7J\2\2\u0210\u0211\7K\2\2\u0211\u0212\7N\2\2"+
		"\u0212\u0213\7G\2\2\u0213\u0086\3\2\2\2\u0214\u0215\7Z\2\2\u0215\u0216"+
		"\7Q\2\2\u0216\u0217\7T\2\2\u0217\u0088\3\2\2\2\u0218\u021b\7a\2\2\u0219"+
		"\u021b\5\u008bF\2\u021a\u0218\3\2\2\2\u021a\u0219\3\2\2\2\u021b\u0221"+
		"\3\2\2\2\u021c\u0220\7a\2\2\u021d\u0220\5\u008bF\2\u021e\u0220\5\27\f"+
		"\2\u021f\u021c\3\2\2\2\u021f\u021d\3\2\2\2\u021f\u021e\3\2\2\2\u0220\u0223"+
		"\3\2\2\2\u0221\u021f\3\2\2\2\u0221\u0222\3\2\2\2\u0222\u008a\3\2\2\2\u0223"+
		"\u0221\3\2\2\2\u0224\u0225\t\7\2\2\u0225\u008c\3\2\2\2\23\2\u009c\u00a5"+
		"\u00ad\u00b0\u00b5\u00bb\u00c5\u00ce\u00db\u00e5\u00ef\u00fd\u010b\u021a"+
		"\u021f\u0221\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}