// Generated from Practica.g4 by ANTLR 4.7
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PracticaLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ASSIGN=1, OPCOMP=2, TRUE=3, FALSE=4, WHILE=5, UNTIL=6, UNLESS=7, IF=8, 
		DO=9, THEN=10, ELSIF=11, ELSE=12, END=13, PLUS=14, MINUS=15, MUL=16, DIV=17, 
		PRINT=18, STRING=19, INT=20, FLOAT=21, ID=22, SEMICOLON=23, CRLF=24, WS=25, 
		COMMENT=26;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"ASSIGN", "OPCOMP", "TRUE", "FALSE", "WHILE", "UNTIL", "UNLESS", "IF", 
		"DO", "THEN", "ELSIF", "ELSE", "END", "PLUS", "MINUS", "MUL", "DIV", "PRINT", 
		"STRING", "INT", "FLOAT", "ID", "SEMICOLON", "CRLF", "WS", "COMMENT"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'='", null, "'TRUE'", "'FALSE'", "'while'", "'until'", "'unless'", 
		"'if'", "'do'", "'then'", "'elsif'", "'else'", "'end'", "'+'", "'-'", 
		"'*'", "'/'", "'puts'", null, null, null, null, "';'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "ASSIGN", "OPCOMP", "TRUE", "FALSE", "WHILE", "UNTIL", "UNLESS", 
		"IF", "DO", "THEN", "ELSIF", "ELSE", "END", "PLUS", "MINUS", "MUL", "DIV", 
		"PRINT", "STRING", "INT", "FLOAT", "ID", "SEMICOLON", "CRLF", "WS", "COMMENT"
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


	public PracticaLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Practica.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\34\u00d3\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3N\n\3\3\4\3\4\3\4\3\4"+
		"\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3"+
		"\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3"+
		"\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\23\3\23\3"+
		"\23\3\24\3\24\3\24\3\24\7\24\u0099\n\24\f\24\16\24\u009c\13\24\3\24\3"+
		"\24\3\25\6\25\u00a1\n\25\r\25\16\25\u00a2\3\26\7\26\u00a6\n\26\f\26\16"+
		"\26\u00a9\13\26\3\26\3\26\6\26\u00ad\n\26\r\26\16\26\u00ae\3\27\3\27\7"+
		"\27\u00b3\n\27\f\27\16\27\u00b6\13\27\3\30\3\30\3\31\5\31\u00bb\n\31\3"+
		"\31\3\31\3\32\6\32\u00c0\n\32\r\32\16\32\u00c1\3\32\3\32\3\33\3\33\7\33"+
		"\u00c8\n\33\f\33\16\33\u00cb\13\33\3\33\5\33\u00ce\n\33\3\33\3\33\3\33"+
		"\3\33\2\2\34\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16"+
		"\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34"+
		"\3\2\t\t\2$$^^ddhhppttvv\6\2\f\f$$GHQQ\3\2\62;\5\2C\\aac|\6\2\62;C\\a"+
		"ac|\4\2\13\13\"\"\4\2\f\f\17\17\2\u00e5\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3"+
		"\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2"+
		"\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35"+
		"\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)"+
		"\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2"+
		"\65\3\2\2\2\3\67\3\2\2\2\5M\3\2\2\2\7O\3\2\2\2\tT\3\2\2\2\13Z\3\2\2\2"+
		"\r`\3\2\2\2\17f\3\2\2\2\21m\3\2\2\2\23p\3\2\2\2\25s\3\2\2\2\27x\3\2\2"+
		"\2\31~\3\2\2\2\33\u0083\3\2\2\2\35\u0087\3\2\2\2\37\u0089\3\2\2\2!\u008b"+
		"\3\2\2\2#\u008d\3\2\2\2%\u008f\3\2\2\2\'\u0094\3\2\2\2)\u00a0\3\2\2\2"+
		"+\u00a7\3\2\2\2-\u00b0\3\2\2\2/\u00b7\3\2\2\2\61\u00ba\3\2\2\2\63\u00bf"+
		"\3\2\2\2\65\u00c5\3\2\2\2\678\7?\2\28\4\3\2\2\29:\7?\2\2:N\7?\2\2;<\7"+
		"#\2\2<N\7?\2\2=>\7?\2\2>N\7\u0080\2\2?@\7>\2\2@A\7?\2\2AN\7@\2\2BN\7@"+
		"\2\2CD\7@\2\2DN\7?\2\2EN\7>\2\2FG\7>\2\2GN\7?\2\2HI\7?\2\2IJ\7?\2\2JN"+
		"\7?\2\2KL\7#\2\2LN\7\u0080\2\2M9\3\2\2\2M;\3\2\2\2M=\3\2\2\2M?\3\2\2\2"+
		"MB\3\2\2\2MC\3\2\2\2ME\3\2\2\2MF\3\2\2\2MH\3\2\2\2MK\3\2\2\2N\6\3\2\2"+
		"\2OP\7V\2\2PQ\7T\2\2QR\7W\2\2RS\7G\2\2S\b\3\2\2\2TU\7H\2\2UV\7C\2\2VW"+
		"\7N\2\2WX\7U\2\2XY\7G\2\2Y\n\3\2\2\2Z[\7y\2\2[\\\7j\2\2\\]\7k\2\2]^\7"+
		"n\2\2^_\7g\2\2_\f\3\2\2\2`a\7w\2\2ab\7p\2\2bc\7v\2\2cd\7k\2\2de\7n\2\2"+
		"e\16\3\2\2\2fg\7w\2\2gh\7p\2\2hi\7n\2\2ij\7g\2\2jk\7u\2\2kl\7u\2\2l\20"+
		"\3\2\2\2mn\7k\2\2no\7h\2\2o\22\3\2\2\2pq\7f\2\2qr\7q\2\2r\24\3\2\2\2s"+
		"t\7v\2\2tu\7j\2\2uv\7g\2\2vw\7p\2\2w\26\3\2\2\2xy\7g\2\2yz\7n\2\2z{\7"+
		"u\2\2{|\7k\2\2|}\7h\2\2}\30\3\2\2\2~\177\7g\2\2\177\u0080\7n\2\2\u0080"+
		"\u0081\7u\2\2\u0081\u0082\7g\2\2\u0082\32\3\2\2\2\u0083\u0084\7g\2\2\u0084"+
		"\u0085\7p\2\2\u0085\u0086\7f\2\2\u0086\34\3\2\2\2\u0087\u0088\7-\2\2\u0088"+
		"\36\3\2\2\2\u0089\u008a\7/\2\2\u008a \3\2\2\2\u008b\u008c\7,\2\2\u008c"+
		"\"\3\2\2\2\u008d\u008e\7\61\2\2\u008e$\3\2\2\2\u008f\u0090\7r\2\2\u0090"+
		"\u0091\7w\2\2\u0091\u0092\7v\2\2\u0092\u0093\7u\2\2\u0093&\3\2\2\2\u0094"+
		"\u009a\7$\2\2\u0095\u0096\7^\2\2\u0096\u0099\t\2\2\2\u0097\u0099\n\3\2"+
		"\2\u0098\u0095\3\2\2\2\u0098\u0097\3\2\2\2\u0099\u009c\3\2\2\2\u009a\u0098"+
		"\3\2\2\2\u009a\u009b\3\2\2\2\u009b\u009d\3\2\2\2\u009c\u009a\3\2\2\2\u009d"+
		"\u009e\7$\2\2\u009e(\3\2\2\2\u009f\u00a1\t\4\2\2\u00a0\u009f\3\2\2\2\u00a1"+
		"\u00a2\3\2\2\2\u00a2\u00a0\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3*\3\2\2\2"+
		"\u00a4\u00a6\t\4\2\2\u00a5\u00a4\3\2\2\2\u00a6\u00a9\3\2\2\2\u00a7\u00a5"+
		"\3\2\2\2\u00a7\u00a8\3\2\2\2\u00a8\u00aa\3\2\2\2\u00a9\u00a7\3\2\2\2\u00aa"+
		"\u00ac\7\60\2\2\u00ab\u00ad\t\4\2\2\u00ac\u00ab\3\2\2\2\u00ad\u00ae\3"+
		"\2\2\2\u00ae\u00ac\3\2\2\2\u00ae\u00af\3\2\2\2\u00af,\3\2\2\2\u00b0\u00b4"+
		"\t\5\2\2\u00b1\u00b3\t\6\2\2\u00b2\u00b1\3\2\2\2\u00b3\u00b6\3\2\2\2\u00b4"+
		"\u00b2\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5.\3\2\2\2\u00b6\u00b4\3\2\2\2"+
		"\u00b7\u00b8\7=\2\2\u00b8\60\3\2\2\2\u00b9\u00bb\7\17\2\2\u00ba\u00b9"+
		"\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc\u00bd\7\f\2\2\u00bd"+
		"\62\3\2\2\2\u00be\u00c0\t\7\2\2\u00bf\u00be\3\2\2\2\u00c0\u00c1\3\2\2"+
		"\2\u00c1\u00bf\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c3\u00c4"+
		"\b\32\2\2\u00c4\64\3\2\2\2\u00c5\u00c9\7%\2\2\u00c6\u00c8\n\b\2\2\u00c7"+
		"\u00c6\3\2\2\2\u00c8\u00cb\3\2\2\2\u00c9\u00c7\3\2\2\2\u00c9\u00ca\3\2"+
		"\2\2\u00ca\u00cd\3\2\2\2\u00cb\u00c9\3\2\2\2\u00cc\u00ce\7\17\2\2\u00cd"+
		"\u00cc\3\2\2\2\u00cd\u00ce\3\2\2\2\u00ce\u00cf\3\2\2\2\u00cf\u00d0\7\f"+
		"\2\2\u00d0\u00d1\3\2\2\2\u00d1\u00d2\b\33\2\2\u00d2\66\3\2\2\2\16\2M\u0098"+
		"\u009a\u00a2\u00a7\u00ae\u00b4\u00ba\u00c1\u00c9\u00cd\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}