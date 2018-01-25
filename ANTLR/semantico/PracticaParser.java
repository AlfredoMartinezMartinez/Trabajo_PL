// Generated from Practica.g4 by ANTLR 4.7.1

	package tools;
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
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ASSIGN=1, OPCOMP=2, IF=3, THEN=4, ELSE=5, END=6, PLUS=7, MINUS=8, MUL=9, 
		DIV=10, PRINT=11, INT=12, BOOLEAN=13, ID=14, SEMICOLON=15, CRLF=16, WS=17, 
		COMMENT=18;
	public static final int
		RULE_prog = 0, RULE_sentence = 1, RULE_expression = 2, RULE_print = 3, 
		RULE_rvalue = 4, RULE_plus = 5, RULE_minus = 6, RULE_mul = 7, RULE_div = 8, 
		RULE_bucle_if = 9, RULE_assignment = 10, RULE_reference = 11, RULE_number = 12;
	public static final String[] ruleNames = {
		"prog", "sentence", "expression", "print", "rvalue", "plus", "minus", 
		"mul", "div", "bucle_if", "assignment", "reference", "number"
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
		public TerminalNode CRLF() { return getToken(PracticaParser.CRLF, 0); }
		public List<SentenceContext> sentence() {
			return getRuleContexts(SentenceContext.class);
		}
		public SentenceContext sentence(int i) {
			return getRuleContext(SentenceContext.class,i);
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
			setState(32);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << PRINT) | (1L << INT) | (1L << ID))) != 0)) {
				{
				{
				setState(27);
				((ProgContext)_localctx).sentence = sentence();
				body.add(((ProgContext)_localctx).sentence.node);
				}
				}
				setState(34);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(35);
			match(CRLF);
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
			setState(53);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(38);
				((SentenceContext)_localctx).print = print();
				((SentenceContext)_localctx).node =  ((SentenceContext)_localctx).print.node;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(41);
				((SentenceContext)_localctx).assignment = assignment();
				((SentenceContext)_localctx).node = ((SentenceContext)_localctx).assignment.node;
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(44);
				((SentenceContext)_localctx).reference = reference();
				((SentenceContext)_localctx).node = ((SentenceContext)_localctx).reference.node;
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(47);
				((SentenceContext)_localctx).rvalue = rvalue();
				((SentenceContext)_localctx).node =  ((SentenceContext)_localctx).rvalue.node;
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(50);
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
			setState(55);
			((ExpressionContext)_localctx).BOOLEAN = match(BOOLEAN);
			((ExpressionContext)_localctx).node =  new Constante(Boolean.parseBoolean((((ExpressionContext)_localctx).BOOLEAN!=null?((ExpressionContext)_localctx).BOOLEAN.getText():null)));
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
		public ExpressionContext expression;
		public TerminalNode PRINT() { return getToken(PracticaParser.PRINT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
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
			enterOuterAlt(_localctx, 1);
			{
			setState(58);
			match(PRINT);
			setState(59);
			((PrintContext)_localctx).expression = expression();
			((PrintContext)_localctx).node =  new Print(((PrintContext)_localctx).expression.node);
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
			setState(77);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(62);
				((RvalueContext)_localctx).plus = plus();
				((RvalueContext)_localctx).node =  ((RvalueContext)_localctx).plus.node;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(65);
				((RvalueContext)_localctx).minus = minus();
				((RvalueContext)_localctx).node =  ((RvalueContext)_localctx).minus.node;
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(68);
				((RvalueContext)_localctx).mul = mul();
				((RvalueContext)_localctx).node =  ((RvalueContext)_localctx).mul.node;
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(71);
				((RvalueContext)_localctx).div = div();
				((RvalueContext)_localctx).node =  ((RvalueContext)_localctx).div.node;
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(74);
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
			setState(79);
			((PlusContext)_localctx).n1 = number();
			((PlusContext)_localctx).node =  ((PlusContext)_localctx).n1.node;
			setState(87);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PLUS) {
				{
				{
				setState(81);
				match(PLUS);
				setState(82);
				((PlusContext)_localctx).n2 = number();
				((PlusContext)_localctx).node =  new Addition(_localctx.node, ((PlusContext)_localctx).n2.node);
				}
				}
				setState(89);
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
			setState(90);
			((MinusContext)_localctx).n1 = number();
			((MinusContext)_localctx).node =  ((MinusContext)_localctx).n1.node;
			setState(98);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MINUS) {
				{
				{
				setState(92);
				match(MINUS);
				setState(93);
				((MinusContext)_localctx).n2 = number();
				((MinusContext)_localctx).node =  new Substract(_localctx.node, ((MinusContext)_localctx).n2.node);
				}
				}
				setState(100);
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
			setState(101);
			((MulContext)_localctx).n1 = number();
			((MulContext)_localctx).node =  ((MulContext)_localctx).n1.node;
			setState(109);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MUL) {
				{
				{
				setState(103);
				match(MUL);
				setState(104);
				((MulContext)_localctx).n2 = number();
				((MulContext)_localctx).node =  new Multiplication(_localctx.node, ((MulContext)_localctx).n2.node);
				}
				}
				setState(111);
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
			setState(112);
			((DivContext)_localctx).n1 = number();
			((DivContext)_localctx).node =  ((DivContext)_localctx).n1.node;
			setState(120);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DIV) {
				{
				{
				setState(114);
				match(DIV);
				setState(115);
				((DivContext)_localctx).n2 = number();
				((DivContext)_localctx).node =  new Division(_localctx.node, ((DivContext)_localctx).n2.node);
				}
				}
				setState(122);
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
			setState(123);
			match(IF);
			setState(124);
			((Bucle_ifContext)_localctx).expression = expression();
			List <ASTNode> ifbody = new ArrayList <ASTNode>();
			setState(126);
			match(THEN);
			setState(127);
			match(CRLF);
			setState(133);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << PRINT) | (1L << INT) | (1L << ID))) != 0)) {
				{
				{
				setState(128);
				((Bucle_ifContext)_localctx).e1 = sentence();
				ifbody.add(((Bucle_ifContext)_localctx).e1.node);
				}
				}
				setState(135);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(136);
			match(ELSE);
			List <ASTNode> elsebody = new ArrayList <ASTNode>();
			setState(138);
			match(CRLF);
			setState(144);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << PRINT) | (1L << INT) | (1L << ID))) != 0)) {
				{
				{
				setState(139);
				((Bucle_ifContext)_localctx).e2 = sentence();
				elsebody.add(((Bucle_ifContext)_localctx).e2.node);
				}
				}
				setState(146);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(147);
			match(CRLF);
			setState(148);
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
			setState(151);
			((AssignmentContext)_localctx).ID = match(ID);
			setState(152);
			match(ASSIGN);
			setState(153);
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
			setState(156);
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
			setState(159);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\24\u00a5\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\3\2\3\2\3\2\3\2\7\2!\n\2\f\2\16\2$\13"+
		"\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\5\38\n\3\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6P\n\6\3\7\3\7\3\7\3\7\3\7\3\7\7\7"+
		"X\n\7\f\7\16\7[\13\7\3\b\3\b\3\b\3\b\3\b\3\b\7\bc\n\b\f\b\16\bf\13\b\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\7\tn\n\t\f\t\16\tq\13\t\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\7\ny\n\n\f\n\16\n|\13\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\7\13"+
		"\u0086\n\13\f\13\16\13\u0089\13\13\3\13\3\13\3\13\3\13\3\13\3\13\7\13"+
		"\u0091\n\13\f\13\16\13\u0094\13\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f"+
		"\3\f\3\r\3\r\3\r\3\16\3\16\3\16\3\16\2\2\17\2\4\6\b\n\f\16\20\22\24\26"+
		"\30\32\2\2\2\u00a6\2\34\3\2\2\2\4\67\3\2\2\2\69\3\2\2\2\b<\3\2\2\2\nO"+
		"\3\2\2\2\fQ\3\2\2\2\16\\\3\2\2\2\20g\3\2\2\2\22r\3\2\2\2\24}\3\2\2\2\26"+
		"\u0099\3\2\2\2\30\u009e\3\2\2\2\32\u00a1\3\2\2\2\34\"\b\2\1\2\35\36\5"+
		"\4\3\2\36\37\b\2\1\2\37!\3\2\2\2 \35\3\2\2\2!$\3\2\2\2\" \3\2\2\2\"#\3"+
		"\2\2\2#%\3\2\2\2$\"\3\2\2\2%&\7\22\2\2&\'\b\2\1\2\'\3\3\2\2\2()\5\b\5"+
		"\2)*\b\3\1\2*8\3\2\2\2+,\5\26\f\2,-\b\3\1\2-8\3\2\2\2./\5\30\r\2/\60\b"+
		"\3\1\2\608\3\2\2\2\61\62\5\n\6\2\62\63\b\3\1\2\638\3\2\2\2\64\65\5\24"+
		"\13\2\65\66\b\3\1\2\668\3\2\2\2\67(\3\2\2\2\67+\3\2\2\2\67.\3\2\2\2\67"+
		"\61\3\2\2\2\67\64\3\2\2\28\5\3\2\2\29:\7\17\2\2:;\b\4\1\2;\7\3\2\2\2<"+
		"=\7\r\2\2=>\5\6\4\2>?\b\5\1\2?\t\3\2\2\2@A\5\f\7\2AB\b\6\1\2BP\3\2\2\2"+
		"CD\5\16\b\2DE\b\6\1\2EP\3\2\2\2FG\5\20\t\2GH\b\6\1\2HP\3\2\2\2IJ\5\22"+
		"\n\2JK\b\6\1\2KP\3\2\2\2LM\5\32\16\2MN\b\6\1\2NP\3\2\2\2O@\3\2\2\2OC\3"+
		"\2\2\2OF\3\2\2\2OI\3\2\2\2OL\3\2\2\2P\13\3\2\2\2QR\5\32\16\2RY\b\7\1\2"+
		"ST\7\t\2\2TU\5\32\16\2UV\b\7\1\2VX\3\2\2\2WS\3\2\2\2X[\3\2\2\2YW\3\2\2"+
		"\2YZ\3\2\2\2Z\r\3\2\2\2[Y\3\2\2\2\\]\5\32\16\2]d\b\b\1\2^_\7\n\2\2_`\5"+
		"\32\16\2`a\b\b\1\2ac\3\2\2\2b^\3\2\2\2cf\3\2\2\2db\3\2\2\2de\3\2\2\2e"+
		"\17\3\2\2\2fd\3\2\2\2gh\5\32\16\2ho\b\t\1\2ij\7\13\2\2jk\5\32\16\2kl\b"+
		"\t\1\2ln\3\2\2\2mi\3\2\2\2nq\3\2\2\2om\3\2\2\2op\3\2\2\2p\21\3\2\2\2q"+
		"o\3\2\2\2rs\5\32\16\2sz\b\n\1\2tu\7\f\2\2uv\5\32\16\2vw\b\n\1\2wy\3\2"+
		"\2\2xt\3\2\2\2y|\3\2\2\2zx\3\2\2\2z{\3\2\2\2{\23\3\2\2\2|z\3\2\2\2}~\7"+
		"\5\2\2~\177\5\6\4\2\177\u0080\b\13\1\2\u0080\u0081\7\6\2\2\u0081\u0087"+
		"\7\22\2\2\u0082\u0083\5\4\3\2\u0083\u0084\b\13\1\2\u0084\u0086\3\2\2\2"+
		"\u0085\u0082\3\2\2\2\u0086\u0089\3\2\2\2\u0087\u0085\3\2\2\2\u0087\u0088"+
		"\3\2\2\2\u0088\u008a\3\2\2\2\u0089\u0087\3\2\2\2\u008a\u008b\7\7\2\2\u008b"+
		"\u008c\b\13\1\2\u008c\u0092\7\22\2\2\u008d\u008e\5\4\3\2\u008e\u008f\b"+
		"\13\1\2\u008f\u0091\3\2\2\2\u0090\u008d\3\2\2\2\u0091\u0094\3\2\2\2\u0092"+
		"\u0090\3\2\2\2\u0092\u0093\3\2\2\2\u0093\u0095\3\2\2\2\u0094\u0092\3\2"+
		"\2\2\u0095\u0096\7\22\2\2\u0096\u0097\7\b\2\2\u0097\u0098\b\13\1\2\u0098"+
		"\25\3\2\2\2\u0099\u009a\7\20\2\2\u009a\u009b\7\3\2\2\u009b\u009c\5\n\6"+
		"\2\u009c\u009d\b\f\1\2\u009d\27\3\2\2\2\u009e\u009f\7\20\2\2\u009f\u00a0"+
		"\b\r\1\2\u00a0\31\3\2\2\2\u00a1\u00a2\7\16\2\2\u00a2\u00a3\b\16\1\2\u00a3"+
		"\33\3\2\2\2\13\"\67OYdoz\u0087\u0092";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}