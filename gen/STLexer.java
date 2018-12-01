// Generated from C:/Users/weibin/IdeaProjects/Compiler/src\ST.g4 by ANTLR 4.7
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
		T__0=1, T__1=2, REAL_EXPONENT=3, FIX_POINT=4, UNSIGNED_INT=5, NULL=6, 
		ONETONINE=7, STRING_VALUE=8, WSTRING_VALUE=9, PRAGMA=10, WSFULL=11, LINE_COMMENT=12, 
		C_LINE_COMMENT=13, SINGLE_LINE_COMMENT=14, AND=15, DIV=16, EQ=17, FALSE=18, 
		GE=19, GT=20, LE=21, LT=22, MOD=23, MINUS=24, NEQ=25, NOT=26, OR=27, PLUS=28, 
		POT=29, TIMES=30, TRUE=31, XOR=32;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "REAL_EXPONENT", "FIX_POINT", "UNSIGNED_INT", "EXPONENT", 
		"DIGIT", "NULL", "ONETONINE", "STRING_VALUE", "WSTRING_VALUE", "CHAR_SYMBOL", 
		"WCHAR_SYMBOL", "PRAGMA", "WSFULL", "LINE_COMMENT", "C_LINE_COMMENT", 
		"SINGLE_LINE_COMMENT", "AND", "DIV", "EQ", "FALSE", "GE", "GT", "LE", 
		"LT", "MOD", "MINUS", "NEQ", "NOT", "OR", "PLUS", "POT", "TIMES", "TRUE", 
		"XOR"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'('", "')'", null, null, null, "'0'", null, null, null, null, null, 
		null, null, null, "'AND'", "'/'", "'=='", "'FALSE'", "'>='", "'>'", "'<='", 
		"'<'", "'MOD'", "'-'", "'<>'", "'NOT'", "'OR'", "'+'", "'**'", "'*'", 
		"'TRUE'", "'XOR'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, "REAL_EXPONENT", "FIX_POINT", "UNSIGNED_INT", "NULL", 
		"ONETONINE", "STRING_VALUE", "WSTRING_VALUE", "PRAGMA", "WSFULL", "LINE_COMMENT", 
		"C_LINE_COMMENT", "SINGLE_LINE_COMMENT", "AND", "DIV", "EQ", "FALSE", 
		"GE", "GT", "LE", "LT", "MOD", "MINUS", "NEQ", "NOT", "OR", "PLUS", "POT", 
		"TIMES", "TRUE", "XOR"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\"\u00fb\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\3\2\3\2\3\3\3\3\3\4\3\4\5\4R\n\4\3\4\3\4"+
		"\3\5\3\5\3\5\7\5Y\n\5\f\5\16\5\\\13\5\3\6\3\6\7\6`\n\6\f\6\16\6c\13\6"+
		"\3\7\3\7\3\7\5\7h\n\7\3\7\3\7\3\b\3\b\5\bn\n\b\3\t\3\t\3\n\3\n\3\13\3"+
		"\13\7\13v\n\13\f\13\16\13y\13\13\3\13\3\13\3\f\3\f\7\f\177\n\f\f\f\16"+
		"\f\u0082\13\f\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\7\17\u008c\n\17\f\17"+
		"\16\17\u008f\13\17\3\17\3\17\3\17\3\17\3\20\6\20\u0096\n\20\r\20\16\20"+
		"\u0097\3\20\3\20\3\21\3\21\3\21\3\21\7\21\u00a0\n\21\f\21\16\21\u00a3"+
		"\13\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\7\22\u00ae\n\22\f"+
		"\22\16\22\u00b1\13\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\7\23"+
		"\u00bc\n\23\f\23\16\23\u00bf\13\23\3\23\3\23\3\24\3\24\3\24\3\24\3\25"+
		"\3\25\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\31"+
		"\3\31\3\32\3\32\3\32\3\33\3\33\3\34\3\34\3\34\3\34\3\35\3\35\3\36\3\36"+
		"\3\36\3\37\3\37\3\37\3\37\3 \3 \3 \3!\3!\3\"\3\"\3\"\3#\3#\3$\3$\3$\3"+
		"$\3$\3%\3%\3%\3%\5\u008d\u00a1\u00af\2&\3\3\5\4\7\5\t\6\13\7\r\2\17\2"+
		"\21\b\23\t\25\n\27\13\31\2\33\2\35\f\37\r!\16#\17%\20\'\21)\22+\23-\24"+
		"/\25\61\26\63\27\65\30\67\319\32;\33=\34?\35A\36C\37E G!I\"\3\2\7\3\2"+
		"\63;\6\2\f\f\17\17&&))\6\2\f\f\17\17$$&&\5\2\13\f\16\17\"\"\4\2\f\f\17"+
		"\17\2\u0103\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2"+
		"\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\35\3\2\2\2\2"+
		"\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2"+
		"+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2"+
		"\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2"+
		"C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\3K\3\2\2\2\5M\3\2\2\2\7Q\3"+
		"\2\2\2\tU\3\2\2\2\13]\3\2\2\2\rd\3\2\2\2\17m\3\2\2\2\21o\3\2\2\2\23q\3"+
		"\2\2\2\25s\3\2\2\2\27|\3\2\2\2\31\u0085\3\2\2\2\33\u0087\3\2\2\2\35\u0089"+
		"\3\2\2\2\37\u0095\3\2\2\2!\u009b\3\2\2\2#\u00a9\3\2\2\2%\u00b7\3\2\2\2"+
		"\'\u00c2\3\2\2\2)\u00c6\3\2\2\2+\u00c8\3\2\2\2-\u00cb\3\2\2\2/\u00d1\3"+
		"\2\2\2\61\u00d4\3\2\2\2\63\u00d6\3\2\2\2\65\u00d9\3\2\2\2\67\u00db\3\2"+
		"\2\29\u00df\3\2\2\2;\u00e1\3\2\2\2=\u00e4\3\2\2\2?\u00e8\3\2\2\2A\u00eb"+
		"\3\2\2\2C\u00ed\3\2\2\2E\u00f0\3\2\2\2G\u00f2\3\2\2\2I\u00f7\3\2\2\2K"+
		"L\7*\2\2L\4\3\2\2\2MN\7+\2\2N\6\3\2\2\2OR\5\t\5\2PR\5\13\6\2QO\3\2\2\2"+
		"QP\3\2\2\2RS\3\2\2\2ST\5\r\7\2T\b\3\2\2\2UV\5\13\6\2VZ\7\60\2\2WY\5\17"+
		"\b\2XW\3\2\2\2Y\\\3\2\2\2ZX\3\2\2\2Z[\3\2\2\2[\n\3\2\2\2\\Z\3\2\2\2]a"+
		"\5\23\n\2^`\5\17\b\2_^\3\2\2\2`c\3\2\2\2a_\3\2\2\2ab\3\2\2\2b\f\3\2\2"+
		"\2ca\3\2\2\2dg\7G\2\2eh\5A!\2fh\59\35\2ge\3\2\2\2gf\3\2\2\2gh\3\2\2\2"+
		"hi\3\2\2\2ij\5\13\6\2j\16\3\2\2\2kn\5\21\t\2ln\5\23\n\2mk\3\2\2\2ml\3"+
		"\2\2\2n\20\3\2\2\2op\7\62\2\2p\22\3\2\2\2qr\t\2\2\2r\24\3\2\2\2sw\7)\2"+
		"\2tv\5\31\r\2ut\3\2\2\2vy\3\2\2\2wu\3\2\2\2wx\3\2\2\2xz\3\2\2\2yw\3\2"+
		"\2\2z{\7)\2\2{\26\3\2\2\2|\u0080\7$\2\2}\177\5\33\16\2~}\3\2\2\2\177\u0082"+
		"\3\2\2\2\u0080~\3\2\2\2\u0080\u0081\3\2\2\2\u0081\u0083\3\2\2\2\u0082"+
		"\u0080\3\2\2\2\u0083\u0084\7$\2\2\u0084\30\3\2\2\2\u0085\u0086\n\3\2\2"+
		"\u0086\32\3\2\2\2\u0087\u0088\n\4\2\2\u0088\34\3\2\2\2\u0089\u008d\7}"+
		"\2\2\u008a\u008c\13\2\2\2\u008b\u008a\3\2\2\2\u008c\u008f\3\2\2\2\u008d"+
		"\u008e\3\2\2\2\u008d\u008b\3\2\2\2\u008e\u0090\3\2\2\2\u008f\u008d\3\2"+
		"\2\2\u0090\u0091\7\177\2\2\u0091\u0092\3\2\2\2\u0092\u0093\b\17\2\2\u0093"+
		"\36\3\2\2\2\u0094\u0096\t\5\2\2\u0095\u0094\3\2\2\2\u0096\u0097\3\2\2"+
		"\2\u0097\u0095\3\2\2\2\u0097\u0098\3\2\2\2\u0098\u0099\3\2\2\2\u0099\u009a"+
		"\b\20\2\2\u009a \3\2\2\2\u009b\u009c\7*\2\2\u009c\u009d\7,\2\2\u009d\u00a1"+
		"\3\2\2\2\u009e\u00a0\13\2\2\2\u009f\u009e\3\2\2\2\u00a0\u00a3\3\2\2\2"+
		"\u00a1\u00a2\3\2\2\2\u00a1\u009f\3\2\2\2\u00a2\u00a4\3\2\2\2\u00a3\u00a1"+
		"\3\2\2\2\u00a4\u00a5\7,\2\2\u00a5\u00a6\7+\2\2\u00a6\u00a7\3\2\2\2\u00a7"+
		"\u00a8\b\21\2\2\u00a8\"\3\2\2\2\u00a9\u00aa\7\61\2\2\u00aa\u00ab\7,\2"+
		"\2\u00ab\u00af\3\2\2\2\u00ac\u00ae\13\2\2\2\u00ad\u00ac\3\2\2\2\u00ae"+
		"\u00b1\3\2\2\2\u00af\u00b0\3\2\2\2\u00af\u00ad\3\2\2\2\u00b0\u00b2\3\2"+
		"\2\2\u00b1\u00af\3\2\2\2\u00b2\u00b3\7,\2\2\u00b3\u00b4\7\61\2\2\u00b4"+
		"\u00b5\3\2\2\2\u00b5\u00b6\b\22\2\2\u00b6$\3\2\2\2\u00b7\u00b8\7\61\2"+
		"\2\u00b8\u00b9\7\61\2\2\u00b9\u00bd\3\2\2\2\u00ba\u00bc\n\6\2\2\u00bb"+
		"\u00ba\3\2\2\2\u00bc\u00bf\3\2\2\2\u00bd\u00bb\3\2\2\2\u00bd\u00be\3\2"+
		"\2\2\u00be\u00c0\3\2\2\2\u00bf\u00bd\3\2\2\2\u00c0\u00c1\b\23\2\2\u00c1"+
		"&\3\2\2\2\u00c2\u00c3\7C\2\2\u00c3\u00c4\7P\2\2\u00c4\u00c5\7F\2\2\u00c5"+
		"(\3\2\2\2\u00c6\u00c7\7\61\2\2\u00c7*\3\2\2\2\u00c8\u00c9\7?\2\2\u00c9"+
		"\u00ca\7?\2\2\u00ca,\3\2\2\2\u00cb\u00cc\7H\2\2\u00cc\u00cd\7C\2\2\u00cd"+
		"\u00ce\7N\2\2\u00ce\u00cf\7U\2\2\u00cf\u00d0\7G\2\2\u00d0.\3\2\2\2\u00d1"+
		"\u00d2\7@\2\2\u00d2\u00d3\7?\2\2\u00d3\60\3\2\2\2\u00d4\u00d5\7@\2\2\u00d5"+
		"\62\3\2\2\2\u00d6\u00d7\7>\2\2\u00d7\u00d8\7?\2\2\u00d8\64\3\2\2\2\u00d9"+
		"\u00da\7>\2\2\u00da\66\3\2\2\2\u00db\u00dc\7O\2\2\u00dc\u00dd\7Q\2\2\u00dd"+
		"\u00de\7F\2\2\u00de8\3\2\2\2\u00df\u00e0\7/\2\2\u00e0:\3\2\2\2\u00e1\u00e2"+
		"\7>\2\2\u00e2\u00e3\7@\2\2\u00e3<\3\2\2\2\u00e4\u00e5\7P\2\2\u00e5\u00e6"+
		"\7Q\2\2\u00e6\u00e7\7V\2\2\u00e7>\3\2\2\2\u00e8\u00e9\7Q\2\2\u00e9\u00ea"+
		"\7T\2\2\u00ea@\3\2\2\2\u00eb\u00ec\7-\2\2\u00ecB\3\2\2\2\u00ed\u00ee\7"+
		",\2\2\u00ee\u00ef\7,\2\2\u00efD\3\2\2\2\u00f0\u00f1\7,\2\2\u00f1F\3\2"+
		"\2\2\u00f2\u00f3\7V\2\2\u00f3\u00f4\7T\2\2\u00f4\u00f5\7W\2\2\u00f5\u00f6"+
		"\7G\2\2\u00f6H\3\2\2\2\u00f7\u00f8\7Z\2\2\u00f8\u00f9\7Q\2\2\u00f9\u00fa"+
		"\7T\2\2\u00faJ\3\2\2\2\17\2QZagmw\u0080\u008d\u0097\u00a1\u00af\u00bd"+
		"\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}