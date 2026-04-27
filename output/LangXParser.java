// Generated from LangX.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class LangXParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		WRITE=1, READ=2, LBR=3, RBR=4, TRUE=5, FALSE=6, AND=7, OR=8, XOR=9, NEG=10, 
		ID=11, FLOAT=12, REAL=13, INT=14, STRING=15, ASSIGN=16, ADD=17, SUB=18, 
		MUL=19, DIV=20, LP=21, RP=22, COLON=23, COMMA=24, NEWLINE=25, WS=26;
	public static final int
		RULE_prog = 0, RULE_stat = 1, RULE_writeArg = 2, RULE_expr = 3, RULE_value = 4, 
		RULE_indexItem = 5, RULE_array = 6;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "stat", "writeArg", "expr", "value", "indexItem", "array"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'write'", "'read'", "'['", "']'", "'true'", "'false'", "'and'", 
			"'or'", "'xor'", "'not'", null, null, null, null, null, "'='", "'+'", 
			"'-'", "'*'", "'/'", "'('", "')'", "':'", "','"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "WRITE", "READ", "LBR", "RBR", "TRUE", "FALSE", "AND", "OR", "XOR", 
			"NEG", "ID", "FLOAT", "REAL", "INT", "STRING", "ASSIGN", "ADD", "SUB", 
			"MUL", "DIV", "LP", "RP", "COLON", "COMMA", "NEWLINE", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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
	public String getGrammarFileName() { return "LangX.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public LangXParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(LangXParser.EOF, 0); }
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(LangXParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(LangXParser.NEWLINE, i);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangXListener ) ((LangXListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangXListener ) ((LangXListener)listener).exitProg(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(23);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(17);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NEWLINE) {
						{
						{
						setState(14);
						match(NEWLINE);
						}
						}
						setState(19);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(20);
					stat();
					}
					} 
				}
				setState(25);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			setState(29);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(26);
				match(NEWLINE);
				}
				}
				setState(31);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(32);
			match(EOF);
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

	@SuppressWarnings("CheckReturnValue")
	public static class StatContext extends ParserRuleContext {
		public StatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stat; }
	 
		public StatContext() { }
		public void copyFrom(StatContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ReadContext extends StatContext {
		public TerminalNode READ() { return getToken(LangXParser.READ, 0); }
		public TerminalNode ID() { return getToken(LangXParser.ID, 0); }
		public ReadContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangXListener ) ((LangXListener)listener).enterRead(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangXListener ) ((LangXListener)listener).exitRead(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArrayAssingContext extends StatContext {
		public TerminalNode ID() { return getToken(LangXParser.ID, 0); }
		public TerminalNode LBR() { return getToken(LangXParser.LBR, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode RBR() { return getToken(LangXParser.RBR, 0); }
		public TerminalNode ASSIGN() { return getToken(LangXParser.ASSIGN, 0); }
		public List<TerminalNode> COMMA() { return getTokens(LangXParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(LangXParser.COMMA, i);
		}
		public ArrayAssingContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangXListener ) ((LangXListener)listener).enterArrayAssing(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangXListener ) ((LangXListener)listener).exitArrayAssing(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ReadElemContext extends StatContext {
		public TerminalNode READ() { return getToken(LangXParser.READ, 0); }
		public TerminalNode ID() { return getToken(LangXParser.ID, 0); }
		public TerminalNode LBR() { return getToken(LangXParser.LBR, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RBR() { return getToken(LangXParser.RBR, 0); }
		public ReadElemContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangXListener ) ((LangXListener)listener).enterReadElem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangXListener ) ((LangXListener)listener).exitReadElem(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AssignElemContext extends StatContext {
		public TerminalNode ID() { return getToken(LangXParser.ID, 0); }
		public TerminalNode LBR() { return getToken(LangXParser.LBR, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode RBR() { return getToken(LangXParser.RBR, 0); }
		public TerminalNode ASSIGN() { return getToken(LangXParser.ASSIGN, 0); }
		public AssignElemContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangXListener ) ((LangXListener)listener).enterAssignElem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangXListener ) ((LangXListener)listener).exitAssignElem(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArrayDeclContext extends StatContext {
		public TerminalNode ID() { return getToken(LangXParser.ID, 0); }
		public TerminalNode LBR() { return getToken(LangXParser.LBR, 0); }
		public List<TerminalNode> INT() { return getTokens(LangXParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(LangXParser.INT, i);
		}
		public TerminalNode RBR() { return getToken(LangXParser.RBR, 0); }
		public List<TerminalNode> COMMA() { return getTokens(LangXParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(LangXParser.COMMA, i);
		}
		public ArrayDeclContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangXListener ) ((LangXListener)listener).enterArrayDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangXListener ) ((LangXListener)listener).exitArrayDecl(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class WriteContext extends StatContext {
		public TerminalNode WRITE() { return getToken(LangXParser.WRITE, 0); }
		public WriteArgContext writeArg() {
			return getRuleContext(WriteArgContext.class,0);
		}
		public WriteContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangXListener ) ((LangXListener)listener).enterWrite(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangXListener ) ((LangXListener)listener).exitWrite(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AssignContext extends StatContext {
		public TerminalNode ID() { return getToken(LangXParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(LangXParser.ASSIGN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AssignContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangXListener ) ((LangXListener)listener).enterAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangXListener ) ((LangXListener)listener).exitAssign(this);
		}
	}

	public final StatContext stat() throws RecognitionException {
		StatContext _localctx = new StatContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_stat);
		int _la;
		try {
			setState(79);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				_localctx = new WriteContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(34);
				match(WRITE);
				setState(35);
				writeArg();
				}
				break;
			case 2:
				_localctx = new ArrayDeclContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(36);
				match(ID);
				setState(37);
				match(LBR);
				setState(38);
				match(INT);
				setState(43);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(39);
					match(COMMA);
					setState(40);
					match(INT);
					}
					}
					setState(45);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(46);
				match(RBR);
				}
				break;
			case 3:
				_localctx = new ArrayAssingContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(47);
				match(ID);
				setState(48);
				match(LBR);
				setState(49);
				expr(0);
				setState(54);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(50);
					match(COMMA);
					setState(51);
					expr(0);
					}
					}
					setState(56);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(57);
				match(RBR);
				setState(58);
				match(ASSIGN);
				setState(59);
				expr(0);
				}
				break;
			case 4:
				_localctx = new AssignContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(61);
				match(ID);
				setState(62);
				match(ASSIGN);
				setState(63);
				expr(0);
				}
				break;
			case 5:
				_localctx = new AssignElemContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(64);
				match(ID);
				setState(65);
				match(LBR);
				setState(66);
				expr(0);
				setState(67);
				match(RBR);
				setState(68);
				match(ASSIGN);
				setState(69);
				expr(0);
				}
				break;
			case 6:
				_localctx = new ReadContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(71);
				match(READ);
				setState(72);
				match(ID);
				}
				break;
			case 7:
				_localctx = new ReadElemContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(73);
				match(READ);
				setState(74);
				match(ID);
				setState(75);
				match(LBR);
				setState(76);
				expr(0);
				setState(77);
				match(RBR);
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

	@SuppressWarnings("CheckReturnValue")
	public static class WriteArgContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(LangXParser.ID, 0); }
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public WriteArgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_writeArg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangXListener ) ((LangXListener)listener).enterWriteArg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangXListener ) ((LangXListener)listener).exitWriteArg(this);
		}
	}

	public final WriteArgContext writeArg() throws RecognitionException {
		WriteArgContext _localctx = new WriteArgContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_writeArg);
		try {
			setState(83);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(81);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(82);
				array();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExprContext extends ParserRuleContext {
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SingleContext extends ExprContext {
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public SingleContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangXListener ) ((LangXListener)listener).enterSingle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangXListener ) ((LangXListener)listener).exitSingle(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DivContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode DIV() { return getToken(LangXParser.DIV, 0); }
		public DivContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangXListener ) ((LangXListener)listener).enterDiv(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangXListener ) ((LangXListener)listener).exitDiv(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AddContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode ADD() { return getToken(LangXParser.ADD, 0); }
		public AddContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangXListener ) ((LangXListener)listener).enterAdd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangXListener ) ((LangXListener)listener).exitAdd(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NegContext extends ExprContext {
		public TerminalNode NEG() { return getToken(LangXParser.NEG, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public NegContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangXListener ) ((LangXListener)listener).enterNeg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangXListener ) ((LangXListener)listener).exitNeg(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SubContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode SUB() { return getToken(LangXParser.SUB, 0); }
		public SubContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangXListener ) ((LangXListener)listener).enterSub(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangXListener ) ((LangXListener)listener).exitSub(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ParensContext extends ExprContext {
		public TerminalNode LP() { return getToken(LangXParser.LP, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RP() { return getToken(LangXParser.RP, 0); }
		public ParensContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangXListener ) ((LangXListener)listener).enterParens(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangXListener ) ((LangXListener)listener).exitParens(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class OrContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode OR() { return getToken(LangXParser.OR, 0); }
		public OrContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangXListener ) ((LangXListener)listener).enterOr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangXListener ) ((LangXListener)listener).exitOr(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MulContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode MUL() { return getToken(LangXParser.MUL, 0); }
		public MulContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangXListener ) ((LangXListener)listener).enterMul(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangXListener ) ((LangXListener)listener).exitMul(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AndContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode AND() { return getToken(LangXParser.AND, 0); }
		public AndContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangXListener ) ((LangXListener)listener).enterAnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangXListener ) ((LangXListener)listener).exitAnd(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class XorContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode XOR() { return getToken(LangXParser.XOR, 0); }
		public XorContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangXListener ) ((LangXListener)listener).enterXor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangXListener ) ((LangXListener)listener).exitXor(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 6;
		enterRecursionRule(_localctx, 6, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NEG:
				{
				_localctx = new NegContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(86);
				match(NEG);
				setState(87);
				expr(10);
				}
				break;
			case LP:
				{
				_localctx = new ParensContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(88);
				match(LP);
				setState(89);
				expr(0);
				setState(90);
				match(RP);
				}
				break;
			case TRUE:
			case FALSE:
			case ID:
			case FLOAT:
			case REAL:
			case INT:
			case STRING:
				{
				_localctx = new SingleContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(92);
				value();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(118);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(116);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
					case 1:
						{
						_localctx = new MulContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(95);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(96);
						match(MUL);
						setState(97);
						expr(9);
						}
						break;
					case 2:
						{
						_localctx = new DivContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(98);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(99);
						match(DIV);
						setState(100);
						expr(8);
						}
						break;
					case 3:
						{
						_localctx = new AddContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(101);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(102);
						match(ADD);
						setState(103);
						expr(7);
						}
						break;
					case 4:
						{
						_localctx = new SubContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(104);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(105);
						match(SUB);
						setState(106);
						expr(6);
						}
						break;
					case 5:
						{
						_localctx = new AndContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(107);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(108);
						match(AND);
						setState(109);
						expr(5);
						}
						break;
					case 6:
						{
						_localctx = new XorContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(110);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(111);
						match(XOR);
						setState(112);
						expr(4);
						}
						break;
					case 7:
						{
						_localctx = new OrContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(113);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(114);
						match(OR);
						setState(115);
						expr(3);
						}
						break;
					}
					} 
				}
				setState(120);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ValueContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(LangXParser.ID, 0); }
		public TerminalNode LBR() { return getToken(LangXParser.LBR, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RBR() { return getToken(LangXParser.RBR, 0); }
		public TerminalNode INT() { return getToken(LangXParser.INT, 0); }
		public TerminalNode REAL() { return getToken(LangXParser.REAL, 0); }
		public TerminalNode FLOAT() { return getToken(LangXParser.FLOAT, 0); }
		public TerminalNode TRUE() { return getToken(LangXParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(LangXParser.FALSE, 0); }
		public TerminalNode STRING() { return getToken(LangXParser.STRING, 0); }
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangXListener ) ((LangXListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangXListener ) ((LangXListener)listener).exitValue(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_value);
		try {
			setState(135);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(121);
				match(ID);
				setState(126);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
				case 1:
					{
					setState(122);
					match(LBR);
					setState(123);
					expr(0);
					setState(124);
					match(RBR);
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(128);
				match(INT);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(129);
				match(REAL);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(130);
				match(FLOAT);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(131);
				match(TRUE);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(132);
				match(FALSE);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(133);
				match(STRING);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(134);
				array();
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

	@SuppressWarnings("CheckReturnValue")
	public static class IndexItemContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode COLON() { return getToken(LangXParser.COLON, 0); }
		public IndexItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_indexItem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangXListener ) ((LangXListener)listener).enterIndexItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangXListener ) ((LangXListener)listener).exitIndexItem(this);
		}
	}

	public final IndexItemContext indexItem() throws RecognitionException {
		IndexItemContext _localctx = new IndexItemContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_indexItem);
		try {
			setState(139);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TRUE:
			case FALSE:
			case NEG:
			case ID:
			case FLOAT:
			case REAL:
			case INT:
			case STRING:
			case LP:
				enterOuterAlt(_localctx, 1);
				{
				setState(137);
				expr(0);
				}
				break;
			case COLON:
				enterOuterAlt(_localctx, 2);
				{
				setState(138);
				match(COLON);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ArrayContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(LangXParser.ID, 0); }
		public TerminalNode LBR() { return getToken(LangXParser.LBR, 0); }
		public List<IndexItemContext> indexItem() {
			return getRuleContexts(IndexItemContext.class);
		}
		public IndexItemContext indexItem(int i) {
			return getRuleContext(IndexItemContext.class,i);
		}
		public TerminalNode RBR() { return getToken(LangXParser.RBR, 0); }
		public List<TerminalNode> COMMA() { return getTokens(LangXParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(LangXParser.COMMA, i);
		}
		public ArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangXListener ) ((LangXListener)listener).enterArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangXListener ) ((LangXListener)listener).exitArray(this);
		}
	}

	public final ArrayContext array() throws RecognitionException {
		ArrayContext _localctx = new ArrayContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_array);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(141);
			match(ID);
			setState(142);
			match(LBR);
			setState(143);
			indexItem();
			setState(148);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(144);
				match(COMMA);
				setState(145);
				indexItem();
				}
				}
				setState(150);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(151);
			match(RBR);
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
		case 3:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
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
			return precpred(_ctx, 3);
		case 6:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u001a\u009a\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0001\u0000\u0005\u0000"+
		"\u0010\b\u0000\n\u0000\f\u0000\u0013\t\u0000\u0001\u0000\u0005\u0000\u0016"+
		"\b\u0000\n\u0000\f\u0000\u0019\t\u0000\u0001\u0000\u0005\u0000\u001c\b"+
		"\u0000\n\u0000\f\u0000\u001f\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0005\u0001*\b\u0001\n\u0001\f\u0001-\t\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0005\u00015\b\u0001"+
		"\n\u0001\f\u00018\t\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0003\u0001P\b\u0001\u0001\u0002\u0001\u0002\u0003\u0002T\b\u0002\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0003\u0003^\b\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0005\u0003u\b\u0003\n\u0003\f\u0003x\t\u0003\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004\u007f\b\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0003\u0004\u0088\b\u0004\u0001\u0005\u0001\u0005\u0003\u0005\u008c"+
		"\b\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0005"+
		"\u0006\u0093\b\u0006\n\u0006\f\u0006\u0096\t\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0000\u0001\u0006\u0007\u0000\u0002\u0004\u0006\b\n\f\u0000"+
		"\u0000\u00b1\u0000\u0017\u0001\u0000\u0000\u0000\u0002O\u0001\u0000\u0000"+
		"\u0000\u0004S\u0001\u0000\u0000\u0000\u0006]\u0001\u0000\u0000\u0000\b"+
		"\u0087\u0001\u0000\u0000\u0000\n\u008b\u0001\u0000\u0000\u0000\f\u008d"+
		"\u0001\u0000\u0000\u0000\u000e\u0010\u0005\u0019\u0000\u0000\u000f\u000e"+
		"\u0001\u0000\u0000\u0000\u0010\u0013\u0001\u0000\u0000\u0000\u0011\u000f"+
		"\u0001\u0000\u0000\u0000\u0011\u0012\u0001\u0000\u0000\u0000\u0012\u0014"+
		"\u0001\u0000\u0000\u0000\u0013\u0011\u0001\u0000\u0000\u0000\u0014\u0016"+
		"\u0003\u0002\u0001\u0000\u0015\u0011\u0001\u0000\u0000\u0000\u0016\u0019"+
		"\u0001\u0000\u0000\u0000\u0017\u0015\u0001\u0000\u0000\u0000\u0017\u0018"+
		"\u0001\u0000\u0000\u0000\u0018\u001d\u0001\u0000\u0000\u0000\u0019\u0017"+
		"\u0001\u0000\u0000\u0000\u001a\u001c\u0005\u0019\u0000\u0000\u001b\u001a"+
		"\u0001\u0000\u0000\u0000\u001c\u001f\u0001\u0000\u0000\u0000\u001d\u001b"+
		"\u0001\u0000\u0000\u0000\u001d\u001e\u0001\u0000\u0000\u0000\u001e \u0001"+
		"\u0000\u0000\u0000\u001f\u001d\u0001\u0000\u0000\u0000 !\u0005\u0000\u0000"+
		"\u0001!\u0001\u0001\u0000\u0000\u0000\"#\u0005\u0001\u0000\u0000#P\u0003"+
		"\u0004\u0002\u0000$%\u0005\u000b\u0000\u0000%&\u0005\u0003\u0000\u0000"+
		"&+\u0005\u000e\u0000\u0000\'(\u0005\u0018\u0000\u0000(*\u0005\u000e\u0000"+
		"\u0000)\'\u0001\u0000\u0000\u0000*-\u0001\u0000\u0000\u0000+)\u0001\u0000"+
		"\u0000\u0000+,\u0001\u0000\u0000\u0000,.\u0001\u0000\u0000\u0000-+\u0001"+
		"\u0000\u0000\u0000.P\u0005\u0004\u0000\u0000/0\u0005\u000b\u0000\u0000"+
		"01\u0005\u0003\u0000\u000016\u0003\u0006\u0003\u000023\u0005\u0018\u0000"+
		"\u000035\u0003\u0006\u0003\u000042\u0001\u0000\u0000\u000058\u0001\u0000"+
		"\u0000\u000064\u0001\u0000\u0000\u000067\u0001\u0000\u0000\u000079\u0001"+
		"\u0000\u0000\u000086\u0001\u0000\u0000\u00009:\u0005\u0004\u0000\u0000"+
		":;\u0005\u0010\u0000\u0000;<\u0003\u0006\u0003\u0000<P\u0001\u0000\u0000"+
		"\u0000=>\u0005\u000b\u0000\u0000>?\u0005\u0010\u0000\u0000?P\u0003\u0006"+
		"\u0003\u0000@A\u0005\u000b\u0000\u0000AB\u0005\u0003\u0000\u0000BC\u0003"+
		"\u0006\u0003\u0000CD\u0005\u0004\u0000\u0000DE\u0005\u0010\u0000\u0000"+
		"EF\u0003\u0006\u0003\u0000FP\u0001\u0000\u0000\u0000GH\u0005\u0002\u0000"+
		"\u0000HP\u0005\u000b\u0000\u0000IJ\u0005\u0002\u0000\u0000JK\u0005\u000b"+
		"\u0000\u0000KL\u0005\u0003\u0000\u0000LM\u0003\u0006\u0003\u0000MN\u0005"+
		"\u0004\u0000\u0000NP\u0001\u0000\u0000\u0000O\"\u0001\u0000\u0000\u0000"+
		"O$\u0001\u0000\u0000\u0000O/\u0001\u0000\u0000\u0000O=\u0001\u0000\u0000"+
		"\u0000O@\u0001\u0000\u0000\u0000OG\u0001\u0000\u0000\u0000OI\u0001\u0000"+
		"\u0000\u0000P\u0003\u0001\u0000\u0000\u0000QT\u0005\u000b\u0000\u0000"+
		"RT\u0003\f\u0006\u0000SQ\u0001\u0000\u0000\u0000SR\u0001\u0000\u0000\u0000"+
		"T\u0005\u0001\u0000\u0000\u0000UV\u0006\u0003\uffff\uffff\u0000VW\u0005"+
		"\n\u0000\u0000W^\u0003\u0006\u0003\nXY\u0005\u0015\u0000\u0000YZ\u0003"+
		"\u0006\u0003\u0000Z[\u0005\u0016\u0000\u0000[^\u0001\u0000\u0000\u0000"+
		"\\^\u0003\b\u0004\u0000]U\u0001\u0000\u0000\u0000]X\u0001\u0000\u0000"+
		"\u0000]\\\u0001\u0000\u0000\u0000^v\u0001\u0000\u0000\u0000_`\n\b\u0000"+
		"\u0000`a\u0005\u0013\u0000\u0000au\u0003\u0006\u0003\tbc\n\u0007\u0000"+
		"\u0000cd\u0005\u0014\u0000\u0000du\u0003\u0006\u0003\bef\n\u0006\u0000"+
		"\u0000fg\u0005\u0011\u0000\u0000gu\u0003\u0006\u0003\u0007hi\n\u0005\u0000"+
		"\u0000ij\u0005\u0012\u0000\u0000ju\u0003\u0006\u0003\u0006kl\n\u0004\u0000"+
		"\u0000lm\u0005\u0007\u0000\u0000mu\u0003\u0006\u0003\u0005no\n\u0003\u0000"+
		"\u0000op\u0005\t\u0000\u0000pu\u0003\u0006\u0003\u0004qr\n\u0002\u0000"+
		"\u0000rs\u0005\b\u0000\u0000su\u0003\u0006\u0003\u0003t_\u0001\u0000\u0000"+
		"\u0000tb\u0001\u0000\u0000\u0000te\u0001\u0000\u0000\u0000th\u0001\u0000"+
		"\u0000\u0000tk\u0001\u0000\u0000\u0000tn\u0001\u0000\u0000\u0000tq\u0001"+
		"\u0000\u0000\u0000ux\u0001\u0000\u0000\u0000vt\u0001\u0000\u0000\u0000"+
		"vw\u0001\u0000\u0000\u0000w\u0007\u0001\u0000\u0000\u0000xv\u0001\u0000"+
		"\u0000\u0000y~\u0005\u000b\u0000\u0000z{\u0005\u0003\u0000\u0000{|\u0003"+
		"\u0006\u0003\u0000|}\u0005\u0004\u0000\u0000}\u007f\u0001\u0000\u0000"+
		"\u0000~z\u0001\u0000\u0000\u0000~\u007f\u0001\u0000\u0000\u0000\u007f"+
		"\u0088\u0001\u0000\u0000\u0000\u0080\u0088\u0005\u000e\u0000\u0000\u0081"+
		"\u0088\u0005\r\u0000\u0000\u0082\u0088\u0005\f\u0000\u0000\u0083\u0088"+
		"\u0005\u0005\u0000\u0000\u0084\u0088\u0005\u0006\u0000\u0000\u0085\u0088"+
		"\u0005\u000f\u0000\u0000\u0086\u0088\u0003\f\u0006\u0000\u0087y\u0001"+
		"\u0000\u0000\u0000\u0087\u0080\u0001\u0000\u0000\u0000\u0087\u0081\u0001"+
		"\u0000\u0000\u0000\u0087\u0082\u0001\u0000\u0000\u0000\u0087\u0083\u0001"+
		"\u0000\u0000\u0000\u0087\u0084\u0001\u0000\u0000\u0000\u0087\u0085\u0001"+
		"\u0000\u0000\u0000\u0087\u0086\u0001\u0000\u0000\u0000\u0088\t\u0001\u0000"+
		"\u0000\u0000\u0089\u008c\u0003\u0006\u0003\u0000\u008a\u008c\u0005\u0017"+
		"\u0000\u0000\u008b\u0089\u0001\u0000\u0000\u0000\u008b\u008a\u0001\u0000"+
		"\u0000\u0000\u008c\u000b\u0001\u0000\u0000\u0000\u008d\u008e\u0005\u000b"+
		"\u0000\u0000\u008e\u008f\u0005\u0003\u0000\u0000\u008f\u0094\u0003\n\u0005"+
		"\u0000\u0090\u0091\u0005\u0018\u0000\u0000\u0091\u0093\u0003\n\u0005\u0000"+
		"\u0092\u0090\u0001\u0000\u0000\u0000\u0093\u0096\u0001\u0000\u0000\u0000"+
		"\u0094\u0092\u0001\u0000\u0000\u0000\u0094\u0095\u0001\u0000\u0000\u0000"+
		"\u0095\u0097\u0001\u0000\u0000\u0000\u0096\u0094\u0001\u0000\u0000\u0000"+
		"\u0097\u0098\u0005\u0004\u0000\u0000\u0098\r\u0001\u0000\u0000\u0000\u000e"+
		"\u0011\u0017\u001d+6OS]tv~\u0087\u008b\u0094";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}