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
		WRITE=1, READ=2, ARRAY=3, LBR=4, RBR=5, TRUE=6, FALSE=7, AND=8, OR=9, 
		XOR=10, NEG=11, ID=12, FLOAT=13, REAL=14, INT=15, STRING=16, ASSIGN=17, 
		ADD=18, SUB=19, MUL=20, DIV=21, LP=22, RP=23, NEWLINE=24, WS=25;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"WRITE", "READ", "ARRAY", "LBR", "RBR", "TRUE", "FALSE", "AND", "OR", 
			"XOR", "NEG", "ID", "FLOAT", "REAL", "INT", "STRING", "ASSIGN", "ADD", 
			"SUB", "MUL", "DIV", "LP", "RP", "NEWLINE", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'write'", "'read'", "'array'", "'['", "']'", "'true'", "'false'", 
			"'and'", "'or'", "'xor'", "'not'", null, null, null, null, null, "'='", 
			"'+'", "'-'", "'*'", "'/'", "'('", "')'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "WRITE", "READ", "ARRAY", "LBR", "RBR", "TRUE", "FALSE", "AND", 
			"OR", "XOR", "NEG", "ID", "FLOAT", "REAL", "INT", "STRING", "ASSIGN", 
			"ADD", "SUB", "MUL", "DIV", "LP", "RP", "NEWLINE", "WS"
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
		case 24:
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
		"\u0004\u0000\u0019\u00a7\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014"+
		"\u0002\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017"+
		"\u0002\u0018\u0007\u0018\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0004\u000bd\b"+
		"\u000b\u000b\u000b\f\u000be\u0001\f\u0004\fi\b\f\u000b\f\f\fj\u0001\f"+
		"\u0001\f\u0004\fo\b\f\u000b\f\f\fp\u0001\f\u0001\f\u0001\r\u0004\rv\b"+
		"\r\u000b\r\f\rw\u0001\r\u0001\r\u0004\r|\b\r\u000b\r\f\r}\u0001\u000e"+
		"\u0004\u000e\u0081\b\u000e\u000b\u000e\f\u000e\u0082\u0001\u000f\u0001"+
		"\u000f\u0005\u000f\u0087\b\u000f\n\u000f\f\u000f\u008a\t\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0012"+
		"\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0015"+
		"\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0017\u0003\u0017\u009d\b\u0017"+
		"\u0001\u0017\u0001\u0017\u0001\u0018\u0004\u0018\u00a2\b\u0018\u000b\u0018"+
		"\f\u0018\u00a3\u0001\u0018\u0001\u0018\u0000\u0000\u0019\u0001\u0001\u0003"+
		"\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011"+
		"\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e\u001d\u000f\u001f\u0010"+
		"!\u0011#\u0012%\u0013\'\u0014)\u0015+\u0016-\u0017/\u00181\u0019\u0001"+
		"\u0000\u0003\u0002\u0000AZaz\u0001\u0000\'\'\u0002\u0000\t\t  \u00af\u0000"+
		"\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000"+
		"\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000"+
		"\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r"+
		"\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011"+
		"\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015"+
		"\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019"+
		"\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000\u0000\u001d"+
		"\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000\u0000\u0000\u0000!\u0001"+
		"\u0000\u0000\u0000\u0000#\u0001\u0000\u0000\u0000\u0000%\u0001\u0000\u0000"+
		"\u0000\u0000\'\u0001\u0000\u0000\u0000\u0000)\u0001\u0000\u0000\u0000"+
		"\u0000+\u0001\u0000\u0000\u0000\u0000-\u0001\u0000\u0000\u0000\u0000/"+
		"\u0001\u0000\u0000\u0000\u00001\u0001\u0000\u0000\u0000\u00013\u0001\u0000"+
		"\u0000\u0000\u00039\u0001\u0000\u0000\u0000\u0005>\u0001\u0000\u0000\u0000"+
		"\u0007D\u0001\u0000\u0000\u0000\tF\u0001\u0000\u0000\u0000\u000bH\u0001"+
		"\u0000\u0000\u0000\rM\u0001\u0000\u0000\u0000\u000fS\u0001\u0000\u0000"+
		"\u0000\u0011W\u0001\u0000\u0000\u0000\u0013Z\u0001\u0000\u0000\u0000\u0015"+
		"^\u0001\u0000\u0000\u0000\u0017c\u0001\u0000\u0000\u0000\u0019h\u0001"+
		"\u0000\u0000\u0000\u001bu\u0001\u0000\u0000\u0000\u001d\u0080\u0001\u0000"+
		"\u0000\u0000\u001f\u0084\u0001\u0000\u0000\u0000!\u008d\u0001\u0000\u0000"+
		"\u0000#\u008f\u0001\u0000\u0000\u0000%\u0091\u0001\u0000\u0000\u0000\'"+
		"\u0093\u0001\u0000\u0000\u0000)\u0095\u0001\u0000\u0000\u0000+\u0097\u0001"+
		"\u0000\u0000\u0000-\u0099\u0001\u0000\u0000\u0000/\u009c\u0001\u0000\u0000"+
		"\u00001\u00a1\u0001\u0000\u0000\u000034\u0005w\u0000\u000045\u0005r\u0000"+
		"\u000056\u0005i\u0000\u000067\u0005t\u0000\u000078\u0005e\u0000\u0000"+
		"8\u0002\u0001\u0000\u0000\u00009:\u0005r\u0000\u0000:;\u0005e\u0000\u0000"+
		";<\u0005a\u0000\u0000<=\u0005d\u0000\u0000=\u0004\u0001\u0000\u0000\u0000"+
		">?\u0005a\u0000\u0000?@\u0005r\u0000\u0000@A\u0005r\u0000\u0000AB\u0005"+
		"a\u0000\u0000BC\u0005y\u0000\u0000C\u0006\u0001\u0000\u0000\u0000DE\u0005"+
		"[\u0000\u0000E\b\u0001\u0000\u0000\u0000FG\u0005]\u0000\u0000G\n\u0001"+
		"\u0000\u0000\u0000HI\u0005t\u0000\u0000IJ\u0005r\u0000\u0000JK\u0005u"+
		"\u0000\u0000KL\u0005e\u0000\u0000L\f\u0001\u0000\u0000\u0000MN\u0005f"+
		"\u0000\u0000NO\u0005a\u0000\u0000OP\u0005l\u0000\u0000PQ\u0005s\u0000"+
		"\u0000QR\u0005e\u0000\u0000R\u000e\u0001\u0000\u0000\u0000ST\u0005a\u0000"+
		"\u0000TU\u0005n\u0000\u0000UV\u0005d\u0000\u0000V\u0010\u0001\u0000\u0000"+
		"\u0000WX\u0005o\u0000\u0000XY\u0005r\u0000\u0000Y\u0012\u0001\u0000\u0000"+
		"\u0000Z[\u0005x\u0000\u0000[\\\u0005o\u0000\u0000\\]\u0005r\u0000\u0000"+
		"]\u0014\u0001\u0000\u0000\u0000^_\u0005n\u0000\u0000_`\u0005o\u0000\u0000"+
		"`a\u0005t\u0000\u0000a\u0016\u0001\u0000\u0000\u0000bd\u0007\u0000\u0000"+
		"\u0000cb\u0001\u0000\u0000\u0000de\u0001\u0000\u0000\u0000ec\u0001\u0000"+
		"\u0000\u0000ef\u0001\u0000\u0000\u0000f\u0018\u0001\u0000\u0000\u0000"+
		"gi\u000209\u0000hg\u0001\u0000\u0000\u0000ij\u0001\u0000\u0000\u0000j"+
		"h\u0001\u0000\u0000\u0000jk\u0001\u0000\u0000\u0000kl\u0001\u0000\u0000"+
		"\u0000ln\u0005.\u0000\u0000mo\u000209\u0000nm\u0001\u0000\u0000\u0000"+
		"op\u0001\u0000\u0000\u0000pn\u0001\u0000\u0000\u0000pq\u0001\u0000\u0000"+
		"\u0000qr\u0001\u0000\u0000\u0000rs\u0005f\u0000\u0000s\u001a\u0001\u0000"+
		"\u0000\u0000tv\u000209\u0000ut\u0001\u0000\u0000\u0000vw\u0001\u0000\u0000"+
		"\u0000wu\u0001\u0000\u0000\u0000wx\u0001\u0000\u0000\u0000xy\u0001\u0000"+
		"\u0000\u0000y{\u0005.\u0000\u0000z|\u000209\u0000{z\u0001\u0000\u0000"+
		"\u0000|}\u0001\u0000\u0000\u0000}{\u0001\u0000\u0000\u0000}~\u0001\u0000"+
		"\u0000\u0000~\u001c\u0001\u0000\u0000\u0000\u007f\u0081\u000209\u0000"+
		"\u0080\u007f\u0001\u0000\u0000\u0000\u0081\u0082\u0001\u0000\u0000\u0000"+
		"\u0082\u0080\u0001\u0000\u0000\u0000\u0082\u0083\u0001\u0000\u0000\u0000"+
		"\u0083\u001e\u0001\u0000\u0000\u0000\u0084\u0088\u0005\'\u0000\u0000\u0085"+
		"\u0087\b\u0001\u0000\u0000\u0086\u0085\u0001\u0000\u0000\u0000\u0087\u008a"+
		"\u0001\u0000\u0000\u0000\u0088\u0086\u0001\u0000\u0000\u0000\u0088\u0089"+
		"\u0001\u0000\u0000\u0000\u0089\u008b\u0001\u0000\u0000\u0000\u008a\u0088"+
		"\u0001\u0000\u0000\u0000\u008b\u008c\u0005\'\u0000\u0000\u008c \u0001"+
		"\u0000\u0000\u0000\u008d\u008e\u0005=\u0000\u0000\u008e\"\u0001\u0000"+
		"\u0000\u0000\u008f\u0090\u0005+\u0000\u0000\u0090$\u0001\u0000\u0000\u0000"+
		"\u0091\u0092\u0005-\u0000\u0000\u0092&\u0001\u0000\u0000\u0000\u0093\u0094"+
		"\u0005*\u0000\u0000\u0094(\u0001\u0000\u0000\u0000\u0095\u0096\u0005/"+
		"\u0000\u0000\u0096*\u0001\u0000\u0000\u0000\u0097\u0098\u0005(\u0000\u0000"+
		"\u0098,\u0001\u0000\u0000\u0000\u0099\u009a\u0005)\u0000\u0000\u009a."+
		"\u0001\u0000\u0000\u0000\u009b\u009d\u0005\r\u0000\u0000\u009c\u009b\u0001"+
		"\u0000\u0000\u0000\u009c\u009d\u0001\u0000\u0000\u0000\u009d\u009e\u0001"+
		"\u0000\u0000\u0000\u009e\u009f\u0005\n\u0000\u0000\u009f0\u0001\u0000"+
		"\u0000\u0000\u00a0\u00a2\u0007\u0002\u0000\u0000\u00a1\u00a0\u0001\u0000"+
		"\u0000\u0000\u00a2\u00a3\u0001\u0000\u0000\u0000\u00a3\u00a1\u0001\u0000"+
		"\u0000\u0000\u00a3\u00a4\u0001\u0000\u0000\u0000\u00a4\u00a5\u0001\u0000"+
		"\u0000\u0000\u00a5\u00a6\u0006\u0018\u0000\u0000\u00a62\u0001\u0000\u0000"+
		"\u0000\n\u0000ejpw}\u0082\u0088\u009c\u00a3\u0001\u0001\u0018\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}