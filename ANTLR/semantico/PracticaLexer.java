// Generated from Practica.g4 by ANTLR 4.7

	package tools;
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
		DIV=10, PRINT=11, INT=12, BOOLEAN=13, ID=14, SEMICOLON=15, CRLF=16, WS=17, 
		COMMENT=18;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"ASSIGN", "OPCOMP", "IF", "THEN", "ELSE", "END", "PLUS", "MINUS", "MUL", 
		"DIV", "PRINT", "INT", "BOOLEAN", "ID", "SEMICOLON", "CRLF", "WS", "COMMENT"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'='", null, "'if'", "'then'", "'else'", "'end'", "'+'", "'-'", 
		"'*'", "'/'", "'puts'", null, null, null, "';'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "ASSIGN", "OPCOMP", "IF", "THEN", "ELSE", "END", "PLUS", "MINUS", 
		"MUL", "DIV", "PRINT", "INT", "BOOLEAN", "ID", "SEMICOLON", "CRLF", "WS", 
		"COMMENT"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\24\u0090\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3>\n\3\3\4\3\4\3\4\3\5\3\5\3\5\3"+
		"\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13"+
		"\3\13\3\f\3\f\3\f\3\f\3\f\3\r\6\r_\n\r\r\r\16\r`\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\5\16l\n\16\3\17\3\17\7\17p\n\17\f\17\16\17s\13"+
		"\17\3\20\3\20\3\21\5\21x\n\21\3\21\3\21\3\22\6\22}\n\22\r\22\16\22~\3"+
		"\22\3\22\3\23\3\23\7\23\u0085\n\23\f\23\16\23\u0088\13\23\3\23\5\23\u008b"+
		"\n\23\3\23\3\23\3\23\3\23\2\2\24\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23"+
		"\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\3\2\7\3\2\62;\5\2C\\"+
		"aac|\6\2\62;C\\aac|\4\2\13\13\"\"\4\2\f\f\17\17\2\u009f\2\3\3\2\2\2\2"+
		"\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2"+
		"\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2"+
		"\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2"+
		"\3\'\3\2\2\2\5=\3\2\2\2\7?\3\2\2\2\tB\3\2\2\2\13G\3\2\2\2\rL\3\2\2\2\17"+
		"P\3\2\2\2\21R\3\2\2\2\23T\3\2\2\2\25V\3\2\2\2\27X\3\2\2\2\31^\3\2\2\2"+
		"\33k\3\2\2\2\35m\3\2\2\2\37t\3\2\2\2!w\3\2\2\2#|\3\2\2\2%\u0082\3\2\2"+
		"\2\'(\7?\2\2(\4\3\2\2\2)*\7?\2\2*>\7?\2\2+,\7#\2\2,>\7?\2\2-.\7?\2\2."+
		">\7\u0080\2\2/\60\7>\2\2\60\61\7?\2\2\61>\7@\2\2\62>\7@\2\2\63\64\7@\2"+
		"\2\64>\7?\2\2\65>\7>\2\2\66\67\7>\2\2\67>\7?\2\289\7?\2\29:\7?\2\2:>\7"+
		"?\2\2;<\7#\2\2<>\7\u0080\2\2=)\3\2\2\2=+\3\2\2\2=-\3\2\2\2=/\3\2\2\2="+
		"\62\3\2\2\2=\63\3\2\2\2=\65\3\2\2\2=\66\3\2\2\2=8\3\2\2\2=;\3\2\2\2>\6"+
		"\3\2\2\2?@\7k\2\2@A\7h\2\2A\b\3\2\2\2BC\7v\2\2CD\7j\2\2DE\7g\2\2EF\7p"+
		"\2\2F\n\3\2\2\2GH\7g\2\2HI\7n\2\2IJ\7u\2\2JK\7g\2\2K\f\3\2\2\2LM\7g\2"+
		"\2MN\7p\2\2NO\7f\2\2O\16\3\2\2\2PQ\7-\2\2Q\20\3\2\2\2RS\7/\2\2S\22\3\2"+
		"\2\2TU\7,\2\2U\24\3\2\2\2VW\7\61\2\2W\26\3\2\2\2XY\7r\2\2YZ\7w\2\2Z[\7"+
		"v\2\2[\\\7u\2\2\\\30\3\2\2\2]_\t\2\2\2^]\3\2\2\2_`\3\2\2\2`^\3\2\2\2`"+
		"a\3\2\2\2a\32\3\2\2\2bc\7v\2\2cd\7t\2\2de\7w\2\2el\7g\2\2fg\7h\2\2gh\7"+
		"c\2\2hi\7n\2\2ij\7u\2\2jl\7g\2\2kb\3\2\2\2kf\3\2\2\2l\34\3\2\2\2mq\t\3"+
		"\2\2np\t\4\2\2on\3\2\2\2ps\3\2\2\2qo\3\2\2\2qr\3\2\2\2r\36\3\2\2\2sq\3"+
		"\2\2\2tu\7=\2\2u \3\2\2\2vx\7\17\2\2wv\3\2\2\2wx\3\2\2\2xy\3\2\2\2yz\7"+
		"\f\2\2z\"\3\2\2\2{}\t\5\2\2|{\3\2\2\2}~\3\2\2\2~|\3\2\2\2~\177\3\2\2\2"+
		"\177\u0080\3\2\2\2\u0080\u0081\b\22\2\2\u0081$\3\2\2\2\u0082\u0086\7%"+
		"\2\2\u0083\u0085\n\6\2\2\u0084\u0083\3\2\2\2\u0085\u0088\3\2\2\2\u0086"+
		"\u0084\3\2\2\2\u0086\u0087\3\2\2\2\u0087\u008a\3\2\2\2\u0088\u0086\3\2"+
		"\2\2\u0089\u008b\7\17\2\2\u008a\u0089\3\2\2\2\u008a\u008b\3\2\2\2\u008b"+
		"\u008c\3\2\2\2\u008c\u008d\7\f\2\2\u008d\u008e\3\2\2\2\u008e\u008f\b\23"+
		"\2\2\u008f&\3\2\2\2\13\2=`kqw~\u0086\u008a\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}