// Generated from Practica.g4 by ANTLR 4.7

	import java.util.*;

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
		ASSIGN=1, OPCOMP=2, IF=3, THEN=4, ELSE=5, END=6, PLUS=7, MINUS=8, MUL=9, 
		DIV=10, PRINT=11, INT=12, BOOLEAN=13, ID=14, STRING=15, SEMICOLON=16, 
		CRLF=17, WS=18, COMMENT=19;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"ASSIGN", "OPCOMP", "IF", "THEN", "ELSE", "END", "PLUS", "MINUS", "MUL", 
		"DIV", "PRINT", "INT", "BOOLEAN", "ID", "STRING", "SEMICOLON", "CRLF", 
		"WS", "COMMENT"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'='", null, "'if'", "'then'", "'else'", "'end'", "'+'", "'-'", 
		"'*'", "'/'", "'puts'", null, null, null, null, "';'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "ASSIGN", "OPCOMP", "IF", "THEN", "ELSE", "END", "PLUS", "MINUS", 
		"MUL", "DIV", "PRINT", "INT", "BOOLEAN", "ID", "STRING", "SEMICOLON", 
		"CRLF", "WS", "COMMENT"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\25\u009d\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3@\n\3\3\4\3\4\3\4\3\5"+
		"\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b\3\t\3\t\3"+
		"\n\3\n\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\r\6\ra\n\r\r\r\16\rb\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16n\n\16\3\17\3\17\7\17r\n\17\f"+
		"\17\16\17u\13\17\3\20\3\20\3\20\3\20\7\20{\n\20\f\20\16\20~\13\20\3\20"+
		"\3\20\3\21\3\21\3\22\5\22\u0085\n\22\3\22\3\22\3\23\6\23\u008a\n\23\r"+
		"\23\16\23\u008b\3\23\3\23\3\24\3\24\7\24\u0092\n\24\f\24\16\24\u0095\13"+
		"\24\3\24\5\24\u0098\n\24\3\24\3\24\3\24\3\24\2\2\25\3\3\5\4\7\5\t\6\13"+
		"\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'"+
		"\25\3\2\t\3\2\62;\5\2C\\aac|\6\2\62;C\\aac|\t\2$$^^ddhhppttvv\6\2\f\f"+
		"$$GHQQ\4\2\13\13\"\"\4\2\f\f\17\17\2\u00ae\2\3\3\2\2\2\2\5\3\2\2\2\2\7"+
		"\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2"+
		"\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2"+
		"\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2"+
		"\3)\3\2\2\2\5?\3\2\2\2\7A\3\2\2\2\tD\3\2\2\2\13I\3\2\2\2\rN\3\2\2\2\17"+
		"R\3\2\2\2\21T\3\2\2\2\23V\3\2\2\2\25X\3\2\2\2\27Z\3\2\2\2\31`\3\2\2\2"+
		"\33m\3\2\2\2\35o\3\2\2\2\37v\3\2\2\2!\u0081\3\2\2\2#\u0084\3\2\2\2%\u0089"+
		"\3\2\2\2\'\u008f\3\2\2\2)*\7?\2\2*\4\3\2\2\2+,\7?\2\2,@\7?\2\2-.\7#\2"+
		"\2.@\7?\2\2/\60\7?\2\2\60@\7\u0080\2\2\61\62\7>\2\2\62\63\7?\2\2\63@\7"+
		"@\2\2\64@\7@\2\2\65\66\7@\2\2\66@\7?\2\2\67@\7>\2\289\7>\2\29@\7?\2\2"+
		":;\7?\2\2;<\7?\2\2<@\7?\2\2=>\7#\2\2>@\7\u0080\2\2?+\3\2\2\2?-\3\2\2\2"+
		"?/\3\2\2\2?\61\3\2\2\2?\64\3\2\2\2?\65\3\2\2\2?\67\3\2\2\2?8\3\2\2\2?"+
		":\3\2\2\2?=\3\2\2\2@\6\3\2\2\2AB\7k\2\2BC\7h\2\2C\b\3\2\2\2DE\7v\2\2E"+
		"F\7j\2\2FG\7g\2\2GH\7p\2\2H\n\3\2\2\2IJ\7g\2\2JK\7n\2\2KL\7u\2\2LM\7g"+
		"\2\2M\f\3\2\2\2NO\7g\2\2OP\7p\2\2PQ\7f\2\2Q\16\3\2\2\2RS\7-\2\2S\20\3"+
		"\2\2\2TU\7/\2\2U\22\3\2\2\2VW\7,\2\2W\24\3\2\2\2XY\7\61\2\2Y\26\3\2\2"+
		"\2Z[\7r\2\2[\\\7w\2\2\\]\7v\2\2]^\7u\2\2^\30\3\2\2\2_a\t\2\2\2`_\3\2\2"+
		"\2ab\3\2\2\2b`\3\2\2\2bc\3\2\2\2c\32\3\2\2\2de\7v\2\2ef\7t\2\2fg\7w\2"+
		"\2gn\7g\2\2hi\7h\2\2ij\7c\2\2jk\7n\2\2kl\7u\2\2ln\7g\2\2md\3\2\2\2mh\3"+
		"\2\2\2n\34\3\2\2\2os\t\3\2\2pr\t\4\2\2qp\3\2\2\2ru\3\2\2\2sq\3\2\2\2s"+
		"t\3\2\2\2t\36\3\2\2\2us\3\2\2\2v|\7$\2\2wx\7^\2\2x{\t\5\2\2y{\n\6\2\2"+
		"zw\3\2\2\2zy\3\2\2\2{~\3\2\2\2|z\3\2\2\2|}\3\2\2\2}\177\3\2\2\2~|\3\2"+
		"\2\2\177\u0080\7$\2\2\u0080 \3\2\2\2\u0081\u0082\7=\2\2\u0082\"\3\2\2"+
		"\2\u0083\u0085\7\17\2\2\u0084\u0083\3\2\2\2\u0084\u0085\3\2\2\2\u0085"+
		"\u0086\3\2\2\2\u0086\u0087\7\f\2\2\u0087$\3\2\2\2\u0088\u008a\t\7\2\2"+
		"\u0089\u0088\3\2\2\2\u008a\u008b\3\2\2\2\u008b\u0089\3\2\2\2\u008b\u008c"+
		"\3\2\2\2\u008c\u008d\3\2\2\2\u008d\u008e\b\23\2\2\u008e&\3\2\2\2\u008f"+
		"\u0093\7%\2\2\u0090\u0092\n\b\2\2\u0091\u0090\3\2\2\2\u0092\u0095\3\2"+
		"\2\2\u0093\u0091\3\2\2\2\u0093\u0094\3\2\2\2\u0094\u0097\3\2\2\2\u0095"+
		"\u0093\3\2\2\2\u0096\u0098\7\17\2\2\u0097\u0096\3\2\2\2\u0097\u0098\3"+
		"\2\2\2\u0098\u0099\3\2\2\2\u0099\u009a\7\f\2\2\u009a\u009b\3\2\2\2\u009b"+
		"\u009c\b\24\2\2\u009c(\3\2\2\2\r\2?bmsz|\u0084\u008b\u0093\u0097\3\b\2"+
		"\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}