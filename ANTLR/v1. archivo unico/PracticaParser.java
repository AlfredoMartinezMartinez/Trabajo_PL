// Generated from Practica.g4 by ANTLR 4.7.1
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
		ASSIGN=1, OPCOMP=2, WHILE=3, UNTIL=4, UNLESS=5, IF=6, DO=7, THEN=8, ELSIF=9, 
		ELSE=10, END=11, PLUS=12, MINUS=13, MUL=14, DIV=15, INT=16, FLOAT=17, 
		ID=18, SEMICOLON=19, CRLF=20, WS=21;
	public static final int
		RULE_prog = 0, RULE_expression_list = 1, RULE_expression = 2, RULE_rvalue = 3, 
		RULE_bucle_if = 4, RULE_cons_unless = 5, RULE_cons_if = 6, RULE_bucle_while = 7, 
		RULE_assignment = 8, RULE_lvalue = 9, RULE_terminator = 10, RULE_crlf = 11;
	public static final String[] ruleNames = {
		"prog", "expression_list", "expression", "rvalue", "bucle_if", "cons_unless", 
		"cons_if", "bucle_while", "assignment", "lvalue", "terminator", "crlf"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'='", null, "'while'", "'until'", "'unless'", "'if'", "'do'", "'then'", 
		"'elsif'", "'else'", "'end'", "'+'", "'-'", "'*'", "'/'", null, null, 
		null, "';'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "ASSIGN", "OPCOMP", "WHILE", "UNTIL", "UNLESS", "IF", "DO", "THEN", 
		"ELSIF", "ELSE", "END", "PLUS", "MINUS", "MUL", "DIV", "INT", "FLOAT", 
		"ID", "SEMICOLON", "CRLF", "WS"
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
		public Expression_listContext expression_list() {
			return getRuleContext(Expression_listContext.class,0);
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(24);
			expression_list(0);
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

	public static class Expression_listContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminatorContext terminator() {
			return getRuleContext(TerminatorContext.class,0);
		}
		public Expression_listContext expression_list() {
			return getRuleContext(Expression_listContext.class,0);
		}
		public Expression_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PracticaListener ) ((PracticaListener)listener).enterExpression_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PracticaListener ) ((PracticaListener)listener).exitExpression_list(this);
		}
	}

	public final Expression_listContext expression_list() throws RecognitionException {
		return expression_list(0);
	}

	private Expression_listContext expression_list(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Expression_listContext _localctx = new Expression_listContext(_ctx, _parentState);
		Expression_listContext _prevctx = _localctx;
		int _startState = 2;
		enterRecursionRule(_localctx, 2, RULE_expression_list, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(31);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case WHILE:
			case UNTIL:
			case UNLESS:
			case IF:
			case INT:
			case FLOAT:
			case ID:
				{
				setState(27);
				expression();
				setState(28);
				terminator();
				}
				break;
			case SEMICOLON:
			case CRLF:
				{
				setState(30);
				terminator();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(39);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Expression_listContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expression_list);
					setState(33);
					if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
					setState(34);
					expression();
					setState(35);
					terminator();
					}
					} 
				}
				setState(41);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
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

	public static class ExpressionContext extends ParserRuleContext {
		public RvalueContext rvalue() {
			return getRuleContext(RvalueContext.class,0);
		}
		public Bucle_ifContext bucle_if() {
			return getRuleContext(Bucle_ifContext.class,0);
		}
		public Bucle_whileContext bucle_while() {
			return getRuleContext(Bucle_whileContext.class,0);
		}
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
			setState(45);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
			case FLOAT:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(42);
				rvalue(0);
				}
				break;
			case UNLESS:
			case IF:
				enterOuterAlt(_localctx, 2);
				{
				setState(43);
				bucle_if();
				}
				break;
			case WHILE:
			case UNTIL:
				enterOuterAlt(_localctx, 3);
				{
				setState(44);
				bucle_while();
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

	public static class RvalueContext extends ParserRuleContext {
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public LvalueContext lvalue() {
			return getRuleContext(LvalueContext.class,0);
		}
		public TerminalNode INT() { return getToken(PracticaParser.INT, 0); }
		public TerminalNode FLOAT() { return getToken(PracticaParser.FLOAT, 0); }
		public List<RvalueContext> rvalue() {
			return getRuleContexts(RvalueContext.class);
		}
		public RvalueContext rvalue(int i) {
			return getRuleContext(RvalueContext.class,i);
		}
		public TerminalNode OPCOMP() { return getToken(PracticaParser.OPCOMP, 0); }
		public TerminalNode MUL() { return getToken(PracticaParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(PracticaParser.DIV, 0); }
		public TerminalNode PLUS() { return getToken(PracticaParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(PracticaParser.MINUS, 0); }
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
		return rvalue(0);
	}

	private RvalueContext rvalue(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		RvalueContext _localctx = new RvalueContext(_ctx, _parentState);
		RvalueContext _prevctx = _localctx;
		int _startState = 6;
		enterRecursionRule(_localctx, 6, RULE_rvalue, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(52);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(48);
				assignment();
				}
				break;
			case 2:
				{
				setState(49);
				lvalue();
				}
				break;
			case 3:
				{
				setState(50);
				match(INT);
				}
				break;
			case 4:
				{
				setState(51);
				match(FLOAT);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(71);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(69);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
					case 1:
						{
						_localctx = new RvalueContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_rvalue);
						setState(54);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(55);
						match(OPCOMP);
						setState(56);
						rvalue(9);
						}
						break;
					case 2:
						{
						_localctx = new RvalueContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_rvalue);
						setState(57);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(58);
						match(MUL);
						setState(59);
						rvalue(8);
						}
						break;
					case 3:
						{
						_localctx = new RvalueContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_rvalue);
						setState(60);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(61);
						match(DIV);
						setState(62);
						rvalue(7);
						}
						break;
					case 4:
						{
						_localctx = new RvalueContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_rvalue);
						setState(63);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(64);
						match(PLUS);
						setState(65);
						rvalue(6);
						}
						break;
					case 5:
						{
						_localctx = new RvalueContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_rvalue);
						setState(66);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(67);
						match(MINUS);
						setState(68);
						rvalue(5);
						}
						break;
					}
					} 
				}
				setState(73);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
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

	public static class Bucle_ifContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(PracticaParser.IF, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode THEN() { return getToken(PracticaParser.THEN, 0); }
		public CrlfContext crlf() {
			return getRuleContext(CrlfContext.class,0);
		}
		public Expression_listContext expression_list() {
			return getRuleContext(Expression_listContext.class,0);
		}
		public Cons_ifContext cons_if() {
			return getRuleContext(Cons_ifContext.class,0);
		}
		public TerminalNode UNLESS() { return getToken(PracticaParser.UNLESS, 0); }
		public Cons_unlessContext cons_unless() {
			return getRuleContext(Cons_unlessContext.class,0);
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
		enterRule(_localctx, 8, RULE_bucle_if);
		try {
			setState(88);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IF:
				enterOuterAlt(_localctx, 1);
				{
				setState(74);
				match(IF);
				setState(75);
				expression();
				setState(76);
				match(THEN);
				setState(77);
				crlf();
				setState(78);
				expression_list(0);
				setState(79);
				cons_if();
				}
				break;
			case UNLESS:
				enterOuterAlt(_localctx, 2);
				{
				setState(81);
				match(UNLESS);
				setState(82);
				expression();
				setState(83);
				match(THEN);
				setState(84);
				crlf();
				setState(85);
				expression_list(0);
				setState(86);
				cons_unless();
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

	public static class Cons_unlessContext extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(PracticaParser.ELSE, 0); }
		public List<CrlfContext> crlf() {
			return getRuleContexts(CrlfContext.class);
		}
		public CrlfContext crlf(int i) {
			return getRuleContext(CrlfContext.class,i);
		}
		public Expression_listContext expression_list() {
			return getRuleContext(Expression_listContext.class,0);
		}
		public TerminalNode END() { return getToken(PracticaParser.END, 0); }
		public Cons_unlessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cons_unless; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PracticaListener ) ((PracticaListener)listener).enterCons_unless(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PracticaListener ) ((PracticaListener)listener).exitCons_unless(this);
		}
	}

	public final Cons_unlessContext cons_unless() throws RecognitionException {
		Cons_unlessContext _localctx = new Cons_unlessContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_cons_unless);
		try {
			setState(99);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ELSE:
				enterOuterAlt(_localctx, 1);
				{
				setState(90);
				match(ELSE);
				setState(91);
				crlf();
				setState(92);
				expression_list(0);
				setState(93);
				crlf();
				setState(94);
				match(END);
				}
				break;
			case CRLF:
				enterOuterAlt(_localctx, 2);
				{
				setState(96);
				crlf();
				setState(97);
				match(END);
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

	public static class Cons_ifContext extends ParserRuleContext {
		public TerminalNode ELSIF() { return getToken(PracticaParser.ELSIF, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode THEN() { return getToken(PracticaParser.THEN, 0); }
		public CrlfContext crlf() {
			return getRuleContext(CrlfContext.class,0);
		}
		public Expression_listContext expression_list() {
			return getRuleContext(Expression_listContext.class,0);
		}
		public Cons_ifContext cons_if() {
			return getRuleContext(Cons_ifContext.class,0);
		}
		public TerminalNode ELSE() { return getToken(PracticaParser.ELSE, 0); }
		public TerminalNode END() { return getToken(PracticaParser.END, 0); }
		public Cons_ifContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cons_if; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PracticaListener ) ((PracticaListener)listener).enterCons_if(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PracticaListener ) ((PracticaListener)listener).exitCons_if(this);
		}
	}

	public final Cons_ifContext cons_if() throws RecognitionException {
		Cons_ifContext _localctx = new Cons_ifContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_cons_if);
		try {
			setState(114);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ELSIF:
				enterOuterAlt(_localctx, 1);
				{
				setState(101);
				match(ELSIF);
				setState(102);
				expression();
				setState(103);
				match(THEN);
				setState(104);
				crlf();
				setState(105);
				expression_list(0);
				setState(106);
				cons_if();
				}
				break;
			case ELSE:
				enterOuterAlt(_localctx, 2);
				{
				setState(108);
				match(ELSE);
				setState(109);
				crlf();
				setState(110);
				expression_list(0);
				setState(111);
				match(END);
				}
				break;
			case END:
				enterOuterAlt(_localctx, 3);
				{
				setState(113);
				match(END);
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

	public static class Bucle_whileContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(PracticaParser.WHILE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<CrlfContext> crlf() {
			return getRuleContexts(CrlfContext.class);
		}
		public CrlfContext crlf(int i) {
			return getRuleContext(CrlfContext.class,i);
		}
		public TerminalNode DO() { return getToken(PracticaParser.DO, 0); }
		public Expression_listContext expression_list() {
			return getRuleContext(Expression_listContext.class,0);
		}
		public TerminalNode END() { return getToken(PracticaParser.END, 0); }
		public TerminatorContext terminator() {
			return getRuleContext(TerminatorContext.class,0);
		}
		public TerminalNode UNTIL() { return getToken(PracticaParser.UNTIL, 0); }
		public Bucle_whileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bucle_while; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PracticaListener ) ((PracticaListener)listener).enterBucle_while(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PracticaListener ) ((PracticaListener)listener).exitBucle_while(this);
		}
	}

	public final Bucle_whileContext bucle_while() throws RecognitionException {
		Bucle_whileContext _localctx = new Bucle_whileContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_bucle_while);
		try {
			setState(135);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(116);
				match(WHILE);
				setState(117);
				expression();
				setState(118);
				crlf();
				setState(119);
				match(DO);
				setState(120);
				crlf();
				setState(121);
				expression_list(0);
				setState(122);
				match(END);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(124);
				match(WHILE);
				setState(125);
				expression();
				setState(126);
				terminator();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(128);
				match(UNTIL);
				setState(129);
				expression();
				setState(130);
				crlf();
				setState(131);
				match(DO);
				setState(132);
				expression_list(0);
				setState(133);
				match(END);
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

	public static class AssignmentContext extends ParserRuleContext {
		public LvalueContext lvalue() {
			return getRuleContext(LvalueContext.class,0);
		}
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
		enterRule(_localctx, 16, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(137);
			lvalue();
			setState(138);
			match(ASSIGN);
			setState(139);
			rvalue(0);
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

	public static class LvalueContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(PracticaParser.ID, 0); }
		public LvalueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lvalue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PracticaListener ) ((PracticaListener)listener).enterLvalue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PracticaListener ) ((PracticaListener)listener).exitLvalue(this);
		}
	}

	public final LvalueContext lvalue() throws RecognitionException {
		LvalueContext _localctx = new LvalueContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_lvalue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(141);
			match(ID);
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

	public static class TerminatorContext extends ParserRuleContext {
		public TerminalNode SEMICOLON() { return getToken(PracticaParser.SEMICOLON, 0); }
		public CrlfContext crlf() {
			return getRuleContext(CrlfContext.class,0);
		}
		public TerminatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_terminator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PracticaListener ) ((PracticaListener)listener).enterTerminator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PracticaListener ) ((PracticaListener)listener).exitTerminator(this);
		}
	}

	public final TerminatorContext terminator() throws RecognitionException {
		TerminatorContext _localctx = new TerminatorContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_terminator);
		try {
			setState(145);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SEMICOLON:
				enterOuterAlt(_localctx, 1);
				{
				setState(143);
				match(SEMICOLON);
				}
				break;
			case CRLF:
				enterOuterAlt(_localctx, 2);
				{
				setState(144);
				crlf();
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

	public static class CrlfContext extends ParserRuleContext {
		public TerminalNode CRLF() { return getToken(PracticaParser.CRLF, 0); }
		public CrlfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_crlf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PracticaListener ) ((PracticaListener)listener).enterCrlf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PracticaListener ) ((PracticaListener)listener).exitCrlf(this);
		}
	}

	public final CrlfContext crlf() throws RecognitionException {
		CrlfContext _localctx = new CrlfContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_crlf);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(147);
			match(CRLF);
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
		case 1:
			return expression_list_sempred((Expression_listContext)_localctx, predIndex);
		case 3:
			return rvalue_sempred((RvalueContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_list_sempred(Expression_listContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 3);
		}
		return true;
	}
	private boolean rvalue_sempred(RvalueContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 8);
		case 2:
			return precpred(_ctx, 7);
		case 3:
			return precpred(_ctx, 6);
		case 4:
			return precpred(_ctx, 5);
		case 5:
			return precpred(_ctx, 4);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\27\u0098\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\3\2\3\2\3\3\3\3\3\3\3\3\3\3\5\3\"\n\3\3\3\3\3\3"+
		"\3\3\3\7\3(\n\3\f\3\16\3+\13\3\3\4\3\4\3\4\5\4\60\n\4\3\5\3\5\3\5\3\5"+
		"\3\5\5\5\67\n\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\7\5H\n\5\f\5\16\5K\13\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\5\6[\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7f\n\7"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\bu\n\b\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5"+
		"\t\u008a\n\t\3\n\3\n\3\n\3\n\3\13\3\13\3\f\3\f\5\f\u0094\n\f\3\r\3\r\3"+
		"\r\2\4\4\b\16\2\4\6\b\n\f\16\20\22\24\26\30\2\2\2\u009e\2\32\3\2\2\2\4"+
		"!\3\2\2\2\6/\3\2\2\2\b\66\3\2\2\2\nZ\3\2\2\2\fe\3\2\2\2\16t\3\2\2\2\20"+
		"\u0089\3\2\2\2\22\u008b\3\2\2\2\24\u008f\3\2\2\2\26\u0093\3\2\2\2\30\u0095"+
		"\3\2\2\2\32\33\5\4\3\2\33\3\3\2\2\2\34\35\b\3\1\2\35\36\5\6\4\2\36\37"+
		"\5\26\f\2\37\"\3\2\2\2 \"\5\26\f\2!\34\3\2\2\2! \3\2\2\2\")\3\2\2\2#$"+
		"\f\5\2\2$%\5\6\4\2%&\5\26\f\2&(\3\2\2\2\'#\3\2\2\2(+\3\2\2\2)\'\3\2\2"+
		"\2)*\3\2\2\2*\5\3\2\2\2+)\3\2\2\2,\60\5\b\5\2-\60\5\n\6\2.\60\5\20\t\2"+
		"/,\3\2\2\2/-\3\2\2\2/.\3\2\2\2\60\7\3\2\2\2\61\62\b\5\1\2\62\67\5\22\n"+
		"\2\63\67\5\24\13\2\64\67\7\22\2\2\65\67\7\23\2\2\66\61\3\2\2\2\66\63\3"+
		"\2\2\2\66\64\3\2\2\2\66\65\3\2\2\2\67I\3\2\2\289\f\n\2\29:\7\4\2\2:H\5"+
		"\b\5\13;<\f\t\2\2<=\7\20\2\2=H\5\b\5\n>?\f\b\2\2?@\7\21\2\2@H\5\b\5\t"+
		"AB\f\7\2\2BC\7\16\2\2CH\5\b\5\bDE\f\6\2\2EF\7\17\2\2FH\5\b\5\7G8\3\2\2"+
		"\2G;\3\2\2\2G>\3\2\2\2GA\3\2\2\2GD\3\2\2\2HK\3\2\2\2IG\3\2\2\2IJ\3\2\2"+
		"\2J\t\3\2\2\2KI\3\2\2\2LM\7\b\2\2MN\5\6\4\2NO\7\n\2\2OP\5\30\r\2PQ\5\4"+
		"\3\2QR\5\16\b\2R[\3\2\2\2ST\7\7\2\2TU\5\6\4\2UV\7\n\2\2VW\5\30\r\2WX\5"+
		"\4\3\2XY\5\f\7\2Y[\3\2\2\2ZL\3\2\2\2ZS\3\2\2\2[\13\3\2\2\2\\]\7\f\2\2"+
		"]^\5\30\r\2^_\5\4\3\2_`\5\30\r\2`a\7\r\2\2af\3\2\2\2bc\5\30\r\2cd\7\r"+
		"\2\2df\3\2\2\2e\\\3\2\2\2eb\3\2\2\2f\r\3\2\2\2gh\7\13\2\2hi\5\6\4\2ij"+
		"\7\n\2\2jk\5\30\r\2kl\5\4\3\2lm\5\16\b\2mu\3\2\2\2no\7\f\2\2op\5\30\r"+
		"\2pq\5\4\3\2qr\7\r\2\2ru\3\2\2\2su\7\r\2\2tg\3\2\2\2tn\3\2\2\2ts\3\2\2"+
		"\2u\17\3\2\2\2vw\7\5\2\2wx\5\6\4\2xy\5\30\r\2yz\7\t\2\2z{\5\30\r\2{|\5"+
		"\4\3\2|}\7\r\2\2}\u008a\3\2\2\2~\177\7\5\2\2\177\u0080\5\6\4\2\u0080\u0081"+
		"\5\26\f\2\u0081\u008a\3\2\2\2\u0082\u0083\7\6\2\2\u0083\u0084\5\6\4\2"+
		"\u0084\u0085\5\30\r\2\u0085\u0086\7\t\2\2\u0086\u0087\5\4\3\2\u0087\u0088"+
		"\7\r\2\2\u0088\u008a\3\2\2\2\u0089v\3\2\2\2\u0089~\3\2\2\2\u0089\u0082"+
		"\3\2\2\2\u008a\21\3\2\2\2\u008b\u008c\5\24\13\2\u008c\u008d\7\3\2\2\u008d"+
		"\u008e\5\b\5\2\u008e\23\3\2\2\2\u008f\u0090\7\24\2\2\u0090\25\3\2\2\2"+
		"\u0091\u0094\7\25\2\2\u0092\u0094\5\30\r\2\u0093\u0091\3\2\2\2\u0093\u0092"+
		"\3\2\2\2\u0094\27\3\2\2\2\u0095\u0096\7\26\2\2\u0096\31\3\2\2\2\r!)/\66"+
		"GIZet\u0089\u0093";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}