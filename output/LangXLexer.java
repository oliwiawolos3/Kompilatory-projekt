// Generated from LangX.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class LangXLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		WRITE=1, READ=2, LBR=3, RBR=4, TRUE=5, FALSE=6, AND=7, OR=8, XOR=9, NEG=10, 
		ID=11, FLOAT=12, REAL=13, INT=14, STRING=15, ASSIGN=16, ADD=17, SUB=18, 
		MUL=19, DIV=20, LP=21, RP=22, COLON=23, COMMA=24, NEWLINE=25, WS=26;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"WRITE", "READ", "LBR", "RBR", "TRUE", "FALSE", "AND", "OR", "XOR", "NEG", 
			"ID", "FLOAT", "REAL", "INT", "STRING", "ASSIGN", "ADD", "SUB", "MUL", 
			"DIV", "LP", "RP", "COLON", "COMMA", "NEWLINE", "WS"
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


	public LangXLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "LangX.g4"; }

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

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 25:
			WS_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void WS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:
			 skip(); 
			break;
		}
	}

	public static final String _serializedATN =
		"\u0004\u0000\u001a\u00a7\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014"+
		"\u0002\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017"+
		"\u0002\u0018\u0007\u0018\u0002\u0019\u0007\u0019\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0003"+
		"\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\n\u0004\n`\b\n\u000b\n\f\na\u0001\u000b\u0004\u000be\b\u000b"+
		"\u000b\u000b\f\u000bf\u0001\u000b\u0001\u000b\u0004\u000bk\b\u000b\u000b"+
		"\u000b\f\u000bl\u0001\u000b\u0001\u000b\u0001\f\u0004\fr\b\f\u000b\f\f"+
		"\fs\u0001\f\u0001\f\u0004\fx\b\f\u000b\f\f\fy\u0001\r\u0004\r}\b\r\u000b"+
		"\r\f\r~\u0001\u000e\u0001\u000e\u0005\u000e\u0083\b\u000e\n\u000e\f\u000e"+
		"\u0086\t\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u0010"+
		"\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0013"+
		"\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0016"+
		"\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0018\u0003\u0018\u009d\b\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0019\u0004\u0019\u00a2\b\u0019\u000b\u0019"+
		"\f\u0019\u00a3\u0001\u0019\u0001\u0019\u0000\u0000\u001a\u0001\u0001\u0003"+
		"\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011"+
		"\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e\u001d\u000f\u001f\u0010"+
		"!\u0011#\u0012%\u0013\'\u0014)\u0015+\u0016-\u0017/\u00181\u00193\u001a"+
		"\u0001\u0000\u0003\u0002\u0000AZaz\u0001\u0000\'\'\u0002\u0000\t\t  \u00af"+
		"\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000"+
		"\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000"+
		"\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000"+
		"\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011"+
		"\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015"+
		"\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019"+
		"\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000\u0000\u001d"+
		"\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000\u0000\u0000\u0000!\u0001"+
		"\u0000\u0000\u0000\u0000#\u0001\u0000\u0000\u0000\u0000%\u0001\u0000\u0000"+
		"\u0000\u0000\'\u0001\u0000\u0000\u0000\u0000)\u0001\u0000\u0000\u0000"+
		"\u0000+\u0001\u0000\u0000\u0000\u0000-\u0001\u0000\u0000\u0000\u0000/"+
		"\u0001\u0000\u0000\u0000\u00001\u0001\u0000\u0000\u0000\u00003\u0001\u0000"+
		"\u0000\u0000\u00015\u0001\u0000\u0000\u0000\u0003;\u0001\u0000\u0000\u0000"+
		"\u0005@\u0001\u0000\u0000\u0000\u0007B\u0001\u0000\u0000\u0000\tD\u0001"+
		"\u0000\u0000\u0000\u000bI\u0001\u0000\u0000\u0000\rO\u0001\u0000\u0000"+
		"\u0000\u000fS\u0001\u0000\u0000\u0000\u0011V\u0001\u0000\u0000\u0000\u0013"+
		"Z\u0001\u0000\u0000\u0000\u0015_\u0001\u0000\u0000\u0000\u0017d\u0001"+
		"\u0000\u0000\u0000\u0019q\u0001\u0000\u0000\u0000\u001b|\u0001\u0000\u0000"+
		"\u0000\u001d\u0080\u0001\u0000\u0000\u0000\u001f\u0089\u0001\u0000\u0000"+
		"\u0000!\u008b\u0001\u0000\u0000\u0000#\u008d\u0001\u0000\u0000\u0000%"+
		"\u008f\u0001\u0000\u0000\u0000\'\u0091\u0001\u0000\u0000\u0000)\u0093"+
		"\u0001\u0000\u0000\u0000+\u0095\u0001\u0000\u0000\u0000-\u0097\u0001\u0000"+
		"\u0000\u0000/\u0099\u0001\u0000\u0000\u00001\u009c\u0001\u0000\u0000\u0000"+
		"3\u00a1\u0001\u0000\u0000\u000056\u0005w\u0000\u000067\u0005r\u0000\u0000"+
		"78\u0005i\u0000\u000089\u0005t\u0000\u00009:\u0005e\u0000\u0000:\u0002"+
		"\u0001\u0000\u0000\u0000;<\u0005r\u0000\u0000<=\u0005e\u0000\u0000=>\u0005"+
		"a\u0000\u0000>?\u0005d\u0000\u0000?\u0004\u0001\u0000\u0000\u0000@A\u0005"+
		"[\u0000\u0000A\u0006\u0001\u0000\u0000\u0000BC\u0005]\u0000\u0000C\b\u0001"+
		"\u0000\u0000\u0000DE\u0005t\u0000\u0000EF\u0005r\u0000\u0000FG\u0005u"+
		"\u0000\u0000GH\u0005e\u0000\u0000H\n\u0001\u0000\u0000\u0000IJ\u0005f"+
		"\u0000\u0000JK\u0005a\u0000\u0000KL\u0005l\u0000\u0000LM\u0005s\u0000"+
		"\u0000MN\u0005e\u0000\u0000N\f\u0001\u0000\u0000\u0000OP\u0005a\u0000"+
		"\u0000PQ\u0005n\u0000\u0000QR\u0005d\u0000\u0000R\u000e\u0001\u0000\u0000"+
		"\u0000ST\u0005o\u0000\u0000TU\u0005r\u0000\u0000U\u0010\u0001\u0000\u0000"+
		"\u0000VW\u0005x\u0000\u0000WX\u0005o\u0000\u0000XY\u0005r\u0000\u0000"+
		"Y\u0012\u0001\u0000\u0000\u0000Z[\u0005n\u0000\u0000[\\\u0005o\u0000\u0000"+
		"\\]\u0005t\u0000\u0000]\u0014\u0001\u0000\u0000\u0000^`\u0007\u0000\u0000"+
		"\u0000_^\u0001\u0000\u0000\u0000`a\u0001\u0000\u0000\u0000a_\u0001\u0000"+
		"\u0000\u0000ab\u0001\u0000\u0000\u0000b\u0016\u0001\u0000\u0000\u0000"+
		"ce\u000209\u0000dc\u0001\u0000\u0000\u0000ef\u0001\u0000\u0000\u0000f"+
		"d\u0001\u0000\u0000\u0000fg\u0001\u0000\u0000\u0000gh\u0001\u0000\u0000"+
		"\u0000hj\u0005.\u0000\u0000ik\u000209\u0000ji\u0001\u0000\u0000\u0000"+
		"kl\u0001\u0000\u0000\u0000lj\u0001\u0000\u0000\u0000lm\u0001\u0000\u0000"+
		"\u0000mn\u0001\u0000\u0000\u0000no\u0005f\u0000\u0000o\u0018\u0001\u0000"+
		"\u0000\u0000pr\u000209\u0000qp\u0001\u0000\u0000\u0000rs\u0001\u0000\u0000"+
		"\u0000sq\u0001\u0000\u0000\u0000st\u0001\u0000\u0000\u0000tu\u0001\u0000"+
		"\u0000\u0000uw\u0005.\u0000\u0000vx\u000209\u0000wv\u0001\u0000\u0000"+
		"\u0000xy\u0001\u0000\u0000\u0000yw\u0001\u0000\u0000\u0000yz\u0001\u0000"+
		"\u0000\u0000z\u001a\u0001\u0000\u0000\u0000{}\u000209\u0000|{\u0001\u0000"+
		"\u0000\u0000}~\u0001\u0000\u0000\u0000~|\u0001\u0000\u0000\u0000~\u007f"+
		"\u0001\u0000\u0000\u0000\u007f\u001c\u0001\u0000\u0000\u0000\u0080\u0084"+
		"\u0005\'\u0000\u0000\u0081\u0083\b\u0001\u0000\u0000\u0082\u0081\u0001"+
		"\u0000\u0000\u0000\u0083\u0086\u0001\u0000\u0000\u0000\u0084\u0082\u0001"+
		"\u0000\u0000\u0000\u0084\u0085\u0001\u0000\u0000\u0000\u0085\u0087\u0001"+
		"\u0000\u0000\u0000\u0086\u0084\u0001\u0000\u0000\u0000\u0087\u0088\u0005"+
		"\'\u0000\u0000\u0088\u001e\u0001\u0000\u0000\u0000\u0089\u008a\u0005="+
		"\u0000\u0000\u008a \u0001\u0000\u0000\u0000\u008b\u008c\u0005+\u0000\u0000"+
		"\u008c\"\u0001\u0000\u0000\u0000\u008d\u008e\u0005-\u0000\u0000\u008e"+
		"$\u0001\u0000\u0000\u0000\u008f\u0090\u0005*\u0000\u0000\u0090&\u0001"+
		"\u0000\u0000\u0000\u0091\u0092\u0005/\u0000\u0000\u0092(\u0001\u0000\u0000"+
		"\u0000\u0093\u0094\u0005(\u0000\u0000\u0094*\u0001\u0000\u0000\u0000\u0095"+
		"\u0096\u0005)\u0000\u0000\u0096,\u0001\u0000\u0000\u0000\u0097\u0098\u0005"+
		":\u0000\u0000\u0098.\u0001\u0000\u0000\u0000\u0099\u009a\u0005,\u0000"+
		"\u0000\u009a0\u0001\u0000\u0000\u0000\u009b\u009d\u0005\r\u0000\u0000"+
		"\u009c\u009b\u0001\u0000\u0000\u0000\u009c\u009d\u0001\u0000\u0000\u0000"+
		"\u009d\u009e\u0001\u0000\u0000\u0000\u009e\u009f\u0005\n\u0000\u0000\u009f"+
		"2\u0001\u0000\u0000\u0000\u00a0\u00a2\u0007\u0002\u0000\u0000\u00a1\u00a0"+
		"\u0001\u0000\u0000\u0000\u00a2\u00a3\u0001\u0000\u0000\u0000\u00a3\u00a1"+
		"\u0001\u0000\u0000\u0000\u00a3\u00a4\u0001\u0000\u0000\u0000\u00a4\u00a5"+
		"\u0001\u0000\u0000\u0000\u00a5\u00a6\u0006\u0019\u0000\u0000\u00a64\u0001"+
		"\u0000\u0000\u0000\n\u0000aflsy~\u0084\u009c\u00a3\u0001\u0001\u0019\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}