// Generated from Practica.g4 by ANTLR 4.7

	import java.util.*;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PracticaParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ASSIGN=1, OPCOMP=2, IF=3, THEN=4, ELSE=5, END=6, PLUS=7, MINUS=8, MUL=9, 
		DIV=10, PRINT=11, INT=12, BOOLEAN=13, ID=14, STRING=15, SEMICOLON=16, 
		CRLF=17, WS=18, COMMENT=19;
	public static final int
		RULE_prog = 0, RULE_sentence = 1, RULE_expression = 2, RULE_print = 3, 
		RULE_rvalue = 4, RULE_plus = 5, RULE_minus = 6, RULE_mul = 7, RULE_div = 8, 
		RULE_bucle_if = 9, RULE_assignment = 10, RULE_reference = 11, RULE_number = 12, 
		RULE_string = 13;
	public static final String[] ruleNames = {
		"prog", "sentence", "expression", "print", "rvalue", "plus", "minus", 
		"mul", "div", "bucle_if", "assignment", "reference", "number", "string"
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

	@Override
	public String getGrammarFileName() { return "Practica.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }



	public PracticaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgContext extends ParserRuleContext {
		public SentenceContext sentence;
		public List<SentenceContext> sentence() {
			return getRuleContexts(SentenceContext.class);
		}
		public SentenceContext sentence(int i) {
			return getRuleContext(SentenceContext.class,i);
		}
		public List<TerminalNode> CRLF() { return getTokens(PracticaParser.CRLF); }
		public TerminalNode CRLF(int i) {
			return getToken(PracticaParser.CRLF, i);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PracticaListener ) ((PracticaListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PracticaListener ) ((PracticaListener)listener).exitProg(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			List<ASTNode> body = new ArrayList<ASTNode>(); Map <String, Object> symbolTable = new HashMap<String, Object>();
			setState(35);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << PRINT) | (1L << INT) | (1L << ID))) != 0)) {
				{
				{
				setState(29);
				((ProgContext)_localctx).sentence = sentence();
				setState(30);
				match(CRLF);
				body.add(((ProgContext)_localctx).sentence.node);
				}
				}
				setState(37);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			for (ASTNode n: body) {
				    n.execute(symbolTable);
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

	public static class SentenceContext extends ParserRuleContext {
		public ASTNode node;
		public PrintContext print;
		public AssignmentContext assignment;
		public ReferenceContext reference;
		public RvalueContext rvalue;
		public Bucle_ifContext bucle_if;
		public PrintContext print() {
			return getRuleContext(PrintContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public ReferenceContext reference() {
			return getRuleContext(ReferenceContext.class,0);
		}
		public RvalueContext rvalue() {
			return getRuleContext(RvalueContext.class,0);
		}
		public Bucle_ifContext bucle_if() {
			return getRuleContext(Bucle_ifContext.class,0);
		}
		public SentenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentence; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PracticaListener ) ((PracticaListener)listener).enterSentence(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PracticaListener ) ((PracticaListener)listener).exitSentence(this);
		}
	}

	public final SentenceContext sentence() throws RecognitionException {
		SentenceContext _localctx = new SentenceContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_sentence);
		try {
			setState(55);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(40);
				((SentenceContext)_localctx).print = print();
				((SentenceContext)_localctx).node =  ((SentenceContext)_localctx).print.node;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(43);
				((SentenceContext)_localctx).assignment = assignment();
				((SentenceContext)_localctx).node = ((SentenceContext)_localctx).assignment.node;
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(46);
				((SentenceContext)_localctx).reference = reference();
				((SentenceContext)_localctx).node = ((SentenceContext)_localctx).reference.node;
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(49);
				((SentenceContext)_localctx).rvalue = rvalue();
				((SentenceContext)_localctx).node =  ((SentenceContext)_localctx).rvalue.node;
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(52);
				((SentenceContext)_localctx).bucle_if = bucle_if();
				((SentenceContext)_localctx).node =  ((SentenceContext)_localctx).bucle_if.node;
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

	public static class ExpressionContext extends ParserRuleContext {
		public ASTNode node;
		public Token BOOLEAN;
		public TerminalNode BOOLEAN() { return getToken(PracticaParser.BOOLEAN, 0); }
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PracticaListener ) ((PracticaListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PracticaListener ) ((PracticaListener)listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(57);
			((ExpressionContext)_localctx).BOOLEAN = match(BOOLEAN);
			((ExpressionContext)_localctx).node =  new Bool(Boolean.parseBoolean((((ExpressionContext)_localctx).BOOLEAN!=null?((ExpressionContext)_localctx).BOOLEAN.getText():null)));
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

	public static class PrintContext extends ParserRuleContext {
		public ASTNode node;
		public ReferenceContext reference;
		public RvalueContext rvalue;
		public StringContext string;
		public TerminalNode PRINT() { return getToken(PracticaParser.PRINT, 0); }
		public ReferenceContext reference() {
			return getRuleContext(ReferenceContext.class,0);
		}
		public RvalueContext rvalue() {
			return getRuleContext(RvalueContext.class,0);
		}
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public PrintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PracticaListener ) ((PracticaListener)listener).enterPrint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PracticaListener ) ((PracticaListener)listener).exitPrint(this);
		}
	}

	public final PrintContext print() throws RecognitionException {
		PrintContext _localctx = new PrintContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_print);
		try {
			setState(72);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(60);
				match(PRINT);
				setState(61);
				((PrintContext)_localctx).reference = reference();
				((PrintContext)_localctx).node =  new Print(((PrintContext)_localctx).reference.node);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(64);
				match(PRINT);
				setState(65);
				((PrintContext)_localctx).rvalue = rvalue();
				((PrintContext)_localctx).node =  new Print(((PrintContext)_localctx).rvalue.node);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(68);
				match(PRINT);
				setState(69);
				((PrintContext)_localctx).string = string();
				((PrintContext)_localctx).node =  new Print(((PrintContext)_localctx).string.node);
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

	public static class RvalueContext extends ParserRuleContext {
		public ASTNode node;
		public PlusContext plus;
		public MinusContext minus;
		public MulContext mul;
		public DivContext div;
		public NumberContext number;
		public PlusContext plus() {
			return getRuleContext(PlusContext.class,0);
		}
		public MinusContext minus() {
			return getRuleContext(MinusContext.class,0);
		}
		public MulContext mul() {
			return getRuleContext(MulContext.class,0);
		}
		public DivContext div() {
			return getRuleContext(DivContext.class,0);
		}
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public RvalueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rvalue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PracticaListener ) ((PracticaListener)listener).enterRvalue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PracticaListener ) ((PracticaListener)listener).exitRvalue(this);
		}
	}

	public final RvalueContext rvalue() throws RecognitionException {
		RvalueContext _localctx = new RvalueContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_rvalue);
		try {
			setState(89);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(74);
				((RvalueContext)_localctx).plus = plus();
				((RvalueContext)_localctx).node =  ((RvalueContext)_localctx).plus.node;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(77);
				((RvalueContext)_localctx).minus = minus();
				((RvalueContext)_localctx).node =  ((RvalueContext)_localctx).minus.node;
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(80);
				((RvalueContext)_localctx).mul = mul();
				((RvalueContext)_localctx).node =  ((RvalueContext)_localctx).mul.node;
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(83);
				((RvalueContext)_localctx).div = div();
				((RvalueContext)_localctx).node =  ((RvalueContext)_localctx).div.node;
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(86);
				((RvalueContext)_localctx).number = number();
				((RvalueContext)_localctx).node =  ((RvalueContext)_localctx).number.node;
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

	public static class PlusContext extends ParserRuleContext {
		public ASTNode node;
		public NumberContext n1;
		public NumberContext n2;
		public List<NumberContext> number() {
			return getRuleContexts(NumberContext.class);
		}
		public NumberContext number(int i) {
			return getRuleContext(NumberContext.class,i);
		}
		public List<TerminalNode> PLUS() { return getTokens(PracticaParser.PLUS); }
		public TerminalNode PLUS(int i) {
			return getToken(PracticaParser.PLUS, i);
		}
		public PlusContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_plus; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PracticaListener ) ((PracticaListener)listener).enterPlus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PracticaListener ) ((PracticaListener)listener).exitPlus(this);
		}
	}

	public final PlusContext plus() throws RecognitionException {
		PlusContext _localctx = new PlusContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_plus);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			((PlusContext)_localctx).n1 = number();
			((PlusContext)_localctx).node =  ((PlusContext)_localctx).n1.node;
			setState(99);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PLUS) {
				{
				{
				setState(93);
				match(PLUS);
				setState(94);
				((PlusContext)_localctx).n2 = number();
				((PlusContext)_localctx).node =  new Addition(_localctx.node, ((PlusContext)_localctx).n2.node);
				}
				}
				setState(101);
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

	public static class MinusContext extends ParserRuleContext {
		public ASTNode node;
		public NumberContext n1;
		public NumberContext n2;
		public List<NumberContext> number() {
			return getRuleContexts(NumberContext.class);
		}
		public NumberContext number(int i) {
			return getRuleContext(NumberContext.class,i);
		}
		public List<TerminalNode> MINUS() { return getTokens(PracticaParser.MINUS); }
		public TerminalNode MINUS(int i) {
			return getToken(PracticaParser.MINUS, i);
		}
		public MinusContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_minus; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PracticaListener ) ((PracticaListener)listener).enterMinus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PracticaListener ) ((PracticaListener)listener).exitMinus(this);
		}
	}

	public final MinusContext minus() throws RecognitionException {
		MinusContext _localctx = new MinusContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_minus);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(102);
			((MinusContext)_localctx).n1 = number();
			((MinusContext)_localctx).node =  ((MinusContext)_localctx).n1.node;
			setState(110);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MINUS) {
				{
				{
				setState(104);
				match(MINUS);
				setState(105);
				((MinusContext)_localctx).n2 = number();
				((MinusContext)_localctx).node =  new Substract(_localctx.node, ((MinusContext)_localctx).n2.node);
				}
				}
				setState(112);
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

	public static class MulContext extends ParserRuleContext {
		public ASTNode node;
		public NumberContext n1;
		public NumberContext n2;
		public List<NumberContext> number() {
			return getRuleContexts(NumberContext.class);
		}
		public NumberContext number(int i) {
			return getRuleContext(NumberContext.class,i);
		}
		public List<TerminalNode> MUL() { return getTokens(PracticaParser.MUL); }
		public TerminalNode MUL(int i) {
			return getToken(PracticaParser.MUL, i);
		}
		public MulContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mul; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PracticaListener ) ((PracticaListener)listener).enterMul(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PracticaListener ) ((PracticaListener)listener).exitMul(this);
		}
	}

	public final MulContext mul() throws RecognitionException {
		MulContext _localctx = new MulContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_mul);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(113);
			((MulContext)_localctx).n1 = number();
			((MulContext)_localctx).node =  ((MulContext)_localctx).n1.node;
			setState(121);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MUL) {
				{
				{
				setState(115);
				match(MUL);
				setState(116);
				((MulContext)_localctx).n2 = number();
				((MulContext)_localctx).node =  new Multiplication(_localctx.node, ((MulContext)_localctx).n2.node);
				}
				}
				setState(123);
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

	public static class DivContext extends ParserRuleContext {
		public ASTNode node;
		public NumberContext n1;
		public NumberContext n2;
		public List<NumberContext> number() {
			return getRuleContexts(NumberContext.class);
		}
		public NumberContext number(int i) {
			return getRuleContext(NumberContext.class,i);
		}
		public List<TerminalNode> DIV() { return getTokens(PracticaParser.DIV); }
		public TerminalNode DIV(int i) {
			return getToken(PracticaParser.DIV, i);
		}
		public DivContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_div; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PracticaListener ) ((PracticaListener)listener).enterDiv(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PracticaListener ) ((PracticaListener)listener).exitDiv(this);
		}
	}

	public final DivContext div() throws RecognitionException {
		DivContext _localctx = new DivContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_div);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(124);
			((DivContext)_localctx).n1 = number();
			((DivContext)_localctx).node =  ((DivContext)_localctx).n1.node;
			setState(132);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DIV) {
				{
				{
				setState(126);
				match(DIV);
				setState(127);
				((DivContext)_localctx).n2 = number();
				((DivContext)_localctx).node =  new Division(_localctx.node, ((DivContext)_localctx).n2.node);
				}
				}
				setState(134);
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

	public static class Bucle_ifContext extends ParserRuleContext {
		public ASTNode node;
		public ExpressionContext expression;
		public SentenceContext e1;
		public SentenceContext e2;
		public TerminalNode IF() { return getToken(PracticaParser.IF, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode THEN() { return getToken(PracticaParser.THEN, 0); }
		public List<TerminalNode> CRLF() { return getTokens(PracticaParser.CRLF); }
		public TerminalNode CRLF(int i) {
			return getToken(PracticaParser.CRLF, i);
		}
		public TerminalNode ELSE() { return getToken(PracticaParser.ELSE, 0); }
		public TerminalNode END() { return getToken(PracticaParser.END, 0); }
		public List<SentenceContext> sentence() {
			return getRuleContexts(SentenceContext.class);
		}
		public SentenceContext sentence(int i) {
			return getRuleContext(SentenceContext.class,i);
		}
		public Bucle_ifContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bucle_if; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PracticaListener ) ((PracticaListener)listener).enterBucle_if(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PracticaListener ) ((PracticaListener)listener).exitBucle_if(this);
		}
	}

	public final Bucle_ifContext bucle_if() throws RecognitionException {
		Bucle_ifContext _localctx = new Bucle_ifContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_bucle_if);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(135);
			match(IF);
			setState(136);
			((Bucle_ifContext)_localctx).expression = expression();
			List <ASTNode> ifbody = new ArrayList <ASTNode>();
			setState(138);
			match(THEN);
			setState(139);
			match(CRLF);
			setState(146);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << PRINT) | (1L << INT) | (1L << ID))) != 0)) {
				{
				{
				setState(140);
				((Bucle_ifContext)_localctx).e1 = sentence();
				setState(141);
				match(CRLF);
				ifbody.add(((Bucle_ifContext)_localctx).e1.node);
				}
				}
				setState(148);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(149);
			match(ELSE);
			List <ASTNode> elsebody = new ArrayList <ASTNode>();
			setState(151);
			match(CRLF);
			setState(157);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << PRINT) | (1L << INT) | (1L << ID))) != 0)) {
				{
				{
				setState(152);
				((Bucle_ifContext)_localctx).e2 = sentence();
				elsebody.add(((Bucle_ifContext)_localctx).e2.node);
				}
				}
				setState(159);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(160);
			match(CRLF);
			setState(161);
			match(END);
			((Bucle_ifContext)_localctx).node =  new If(((Bucle_ifContext)_localctx).expression.node, ifbody, elsebody);
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

	public static class AssignmentContext extends ParserRuleContext {
		public ASTNode node;
		public Token ID;
		public RvalueContext rvalue;
		public TerminalNode ID() { return getToken(PracticaParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(PracticaParser.ASSIGN, 0); }
		public RvalueContext rvalue() {
			return getRuleContext(RvalueContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PracticaListener ) ((PracticaListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PracticaListener ) ((PracticaListener)listener).exitAssignment(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(164);
			((AssignmentContext)_localctx).ID = match(ID);
			setState(165);
			match(ASSIGN);
			setState(166);
			((AssignmentContext)_localctx).rvalue = rvalue();
			((AssignmentContext)_localctx).node =  new Assignment((((AssignmentContext)_localctx).ID!=null?((AssignmentContext)_localctx).ID.getText():null),((AssignmentContext)_localctx).rvalue.node);
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

	public static class ReferenceContext extends ParserRuleContext {
		public ASTNode node;
		public Token ID;
		public TerminalNode ID() { return getToken(PracticaParser.ID, 0); }
		public ReferenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_reference; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PracticaListener ) ((PracticaListener)listener).enterReference(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PracticaListener ) ((PracticaListener)listener).exitReference(this);
		}
	}

	public final ReferenceContext reference() throws RecognitionException {
		ReferenceContext _localctx = new ReferenceContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_reference);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(169);
			((ReferenceContext)_localctx).ID = match(ID);
			((ReferenceContext)_localctx).node =  new Reference((((ReferenceContext)_localctx).ID!=null?((ReferenceContext)_localctx).ID.getText():null));
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

	public static class NumberContext extends ParserRuleContext {
		public ASTNode node;
		public Token INT;
		public TerminalNode INT() { return getToken(PracticaParser.INT, 0); }
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PracticaListener ) ((PracticaListener)listener).enterNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PracticaListener ) ((PracticaListener)listener).exitNumber(this);
		}
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_number);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(172);
			((NumberContext)_localctx).INT = match(INT);
			((NumberContext)_localctx).node =  new Constante(Integer.parseInt((((NumberContext)_localctx).INT!=null?((NumberContext)_localctx).INT.getText():null)));
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

	public static class StringContext extends ParserRuleContext {
		public ASTNode node;
		public Token STRING;
		public TerminalNode STRING() { return getToken(PracticaParser.STRING, 0); }
		public StringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PracticaListener ) ((PracticaListener)listener).enterString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PracticaListener ) ((PracticaListener)listener).exitString(this);
		}
	}

	public final StringContext string() throws RecognitionException {
		StringContext _localctx = new StringContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_string);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(175);
			((StringContext)_localctx).STRING = match(STRING);
			((StringContext)_localctx).node =  new Cadena(String.valueOf((((StringContext)_localctx).STRING!=null?((StringContext)_localctx).STRING.getText():null)));
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\25\u00b5\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\3\2\3\2\3\2\3\2\3\2\7\2$\n\2"+
		"\f\2\16\2\'\13\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\5\3:\n\3\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\5\5K\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\5\6\\\n\6\3\7\3\7\3\7\3\7\3\7\3\7\7\7d\n\7\f\7\16\7g\13"+
		"\7\3\b\3\b\3\b\3\b\3\b\3\b\7\bo\n\b\f\b\16\br\13\b\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\7\tz\n\t\f\t\16\t}\13\t\3\n\3\n\3\n\3\n\3\n\3\n\7\n\u0085\n\n\f\n"+
		"\16\n\u0088\13\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\7\13\u0093"+
		"\n\13\f\13\16\13\u0096\13\13\3\13\3\13\3\13\3\13\3\13\3\13\7\13\u009e"+
		"\n\13\f\13\16\13\u00a1\13\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3"+
		"\r\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\17\3\17\2\2\20\2\4\6\b\n\f\16\20"+
		"\22\24\26\30\32\34\2\2\2\u00b7\2\36\3\2\2\2\49\3\2\2\2\6;\3\2\2\2\bJ\3"+
		"\2\2\2\n[\3\2\2\2\f]\3\2\2\2\16h\3\2\2\2\20s\3\2\2\2\22~\3\2\2\2\24\u0089"+
		"\3\2\2\2\26\u00a6\3\2\2\2\30\u00ab\3\2\2\2\32\u00ae\3\2\2\2\34\u00b1\3"+
		"\2\2\2\36%\b\2\1\2\37 \5\4\3\2 !\7\23\2\2!\"\b\2\1\2\"$\3\2\2\2#\37\3"+
		"\2\2\2$\'\3\2\2\2%#\3\2\2\2%&\3\2\2\2&(\3\2\2\2\'%\3\2\2\2()\b\2\1\2)"+
		"\3\3\2\2\2*+\5\b\5\2+,\b\3\1\2,:\3\2\2\2-.\5\26\f\2./\b\3\1\2/:\3\2\2"+
		"\2\60\61\5\30\r\2\61\62\b\3\1\2\62:\3\2\2\2\63\64\5\n\6\2\64\65\b\3\1"+
		"\2\65:\3\2\2\2\66\67\5\24\13\2\678\b\3\1\28:\3\2\2\29*\3\2\2\29-\3\2\2"+
		"\29\60\3\2\2\29\63\3\2\2\29\66\3\2\2\2:\5\3\2\2\2;<\7\17\2\2<=\b\4\1\2"+
		"=\7\3\2\2\2>?\7\r\2\2?@\5\30\r\2@A\b\5\1\2AK\3\2\2\2BC\7\r\2\2CD\5\n\6"+
		"\2DE\b\5\1\2EK\3\2\2\2FG\7\r\2\2GH\5\34\17\2HI\b\5\1\2IK\3\2\2\2J>\3\2"+
		"\2\2JB\3\2\2\2JF\3\2\2\2K\t\3\2\2\2LM\5\f\7\2MN\b\6\1\2N\\\3\2\2\2OP\5"+
		"\16\b\2PQ\b\6\1\2Q\\\3\2\2\2RS\5\20\t\2ST\b\6\1\2T\\\3\2\2\2UV\5\22\n"+
		"\2VW\b\6\1\2W\\\3\2\2\2XY\5\32\16\2YZ\b\6\1\2Z\\\3\2\2\2[L\3\2\2\2[O\3"+
		"\2\2\2[R\3\2\2\2[U\3\2\2\2[X\3\2\2\2\\\13\3\2\2\2]^\5\32\16\2^e\b\7\1"+
		"\2_`\7\t\2\2`a\5\32\16\2ab\b\7\1\2bd\3\2\2\2c_\3\2\2\2dg\3\2\2\2ec\3\2"+
		"\2\2ef\3\2\2\2f\r\3\2\2\2ge\3\2\2\2hi\5\32\16\2ip\b\b\1\2jk\7\n\2\2kl"+
		"\5\32\16\2lm\b\b\1\2mo\3\2\2\2nj\3\2\2\2or\3\2\2\2pn\3\2\2\2pq\3\2\2\2"+
		"q\17\3\2\2\2rp\3\2\2\2st\5\32\16\2t{\b\t\1\2uv\7\13\2\2vw\5\32\16\2wx"+
		"\b\t\1\2xz\3\2\2\2yu\3\2\2\2z}\3\2\2\2{y\3\2\2\2{|\3\2\2\2|\21\3\2\2\2"+
		"}{\3\2\2\2~\177\5\32\16\2\177\u0086\b\n\1\2\u0080\u0081\7\f\2\2\u0081"+
		"\u0082\5\32\16\2\u0082\u0083\b\n\1\2\u0083\u0085\3\2\2\2\u0084\u0080\3"+
		"\2\2\2\u0085\u0088\3\2\2\2\u0086\u0084\3\2\2\2\u0086\u0087\3\2\2\2\u0087"+
		"\23\3\2\2\2\u0088\u0086\3\2\2\2\u0089\u008a\7\5\2\2\u008a\u008b\5\6\4"+
		"\2\u008b\u008c\b\13\1\2\u008c\u008d\7\6\2\2\u008d\u0094\7\23\2\2\u008e"+
		"\u008f\5\4\3\2\u008f\u0090\7\23\2\2\u0090\u0091\b\13\1\2\u0091\u0093\3"+
		"\2\2\2\u0092\u008e\3\2\2\2\u0093\u0096\3\2\2\2\u0094\u0092\3\2\2\2\u0094"+
		"\u0095\3\2\2\2\u0095\u0097\3\2\2\2\u0096\u0094\3\2\2\2\u0097\u0098\7\7"+
		"\2\2\u0098\u0099\b\13\1\2\u0099\u009f\7\23\2\2\u009a\u009b\5\4\3\2\u009b"+
		"\u009c\b\13\1\2\u009c\u009e\3\2\2\2\u009d\u009a\3\2\2\2\u009e\u00a1\3"+
		"\2\2\2\u009f\u009d\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0\u00a2\3\2\2\2\u00a1"+
		"\u009f\3\2\2\2\u00a2\u00a3\7\23\2\2\u00a3\u00a4\7\b\2\2\u00a4\u00a5\b"+
		"\13\1\2\u00a5\25\3\2\2\2\u00a6\u00a7\7\20\2\2\u00a7\u00a8\7\3\2\2\u00a8"+
		"\u00a9\5\n\6\2\u00a9\u00aa\b\f\1\2\u00aa\27\3\2\2\2\u00ab\u00ac\7\20\2"+
		"\2\u00ac\u00ad\b\r\1\2\u00ad\31\3\2\2\2\u00ae\u00af\7\16\2\2\u00af\u00b0"+
		"\b\16\1\2\u00b0\33\3\2\2\2\u00b1\u00b2\7\21\2\2\u00b2\u00b3\b\17\1\2\u00b3"+
		"\35\3\2\2\2\f%9J[ep{\u0086\u0094\u009f";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}