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
		T__0=1, WRITE=2, READ=3, TRUE=4, FALSE=5, AND=6, OR=7, XOR=8, NEG=9, ID=10, 
		REAL=11, INT=12, ADD=13, SUB=14, MUL=15, DIV=16, LP=17, RP=18, NEWLINE=19, 
		WS=20;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "WRITE", "READ", "TRUE", "FALSE", "AND", "OR", "XOR", "NEG", 
			"ID", "REAL", "INT", "ADD", "SUB", "MUL", "DIV", "LP", "RP", "NEWLINE", 
			"WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'='", "'write'", "'read'", "'true'", "'false'", "'and'", "'or'", 
			"'xor'", "'not'", null, null, null, "'+'", "'-'", "'*'", "'/'", "'('", 
			"')'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, "WRITE", "READ", "TRUE", "FALSE", "AND", "OR", "XOR", "NEG", 
			"ID", "REAL", "INT", "ADD", "SUB", "MUL", "DIV", "LP", "RP", "NEWLINE", 
			"WS"
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
		case 19:
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
		"\u0004\u0000\u0014}\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002"+
		"\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002"+
		"\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0001\u0000\u0001\u0000\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t"+
		"\u0004\tR\b\t\u000b\t\f\tS\u0001\n\u0004\nW\b\n\u000b\n\f\nX\u0001\n\u0001"+
		"\n\u0004\n]\b\n\u000b\n\f\n^\u0001\u000b\u0004\u000bb\b\u000b\u000b\u000b"+
		"\f\u000bc\u0001\f\u0001\f\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001"+
		"\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001"+
		"\u0012\u0003\u0012s\b\u0012\u0001\u0012\u0001\u0012\u0001\u0013\u0004"+
		"\u0013x\b\u0013\u000b\u0013\f\u0013y\u0001\u0013\u0001\u0013\u0000\u0000"+
		"\u0014\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006"+
		"\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e"+
		"\u001d\u000f\u001f\u0010!\u0011#\u0012%\u0013\'\u0014\u0001\u0000\u0002"+
		"\u0002\u0000AZaz\u0002\u0000\t\t  \u0082\u0000\u0001\u0001\u0000\u0000"+
		"\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000"+
		"\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000"+
		"\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000"+
		"\u000f\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000"+
		"\u0013\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000"+
		"\u0017\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000"+
		"\u001b\u0001\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0000"+
		"\u001f\u0001\u0000\u0000\u0000\u0000!\u0001\u0000\u0000\u0000\u0000#\u0001"+
		"\u0000\u0000\u0000\u0000%\u0001\u0000\u0000\u0000\u0000\'\u0001\u0000"+
		"\u0000\u0000\u0001)\u0001\u0000\u0000\u0000\u0003+\u0001\u0000\u0000\u0000"+
		"\u00051\u0001\u0000\u0000\u0000\u00076\u0001\u0000\u0000\u0000\t;\u0001"+
		"\u0000\u0000\u0000\u000bA\u0001\u0000\u0000\u0000\rE\u0001\u0000\u0000"+
		"\u0000\u000fH\u0001\u0000\u0000\u0000\u0011L\u0001\u0000\u0000\u0000\u0013"+
		"Q\u0001\u0000\u0000\u0000\u0015V\u0001\u0000\u0000\u0000\u0017a\u0001"+
		"\u0000\u0000\u0000\u0019e\u0001\u0000\u0000\u0000\u001bg\u0001\u0000\u0000"+
		"\u0000\u001di\u0001\u0000\u0000\u0000\u001fk\u0001\u0000\u0000\u0000!"+
		"m\u0001\u0000\u0000\u0000#o\u0001\u0000\u0000\u0000%r\u0001\u0000\u0000"+
		"\u0000\'w\u0001\u0000\u0000\u0000)*\u0005=\u0000\u0000*\u0002\u0001\u0000"+
		"\u0000\u0000+,\u0005w\u0000\u0000,-\u0005r\u0000\u0000-.\u0005i\u0000"+
		"\u0000./\u0005t\u0000\u0000/0\u0005e\u0000\u00000\u0004\u0001\u0000\u0000"+
		"\u000012\u0005r\u0000\u000023\u0005e\u0000\u000034\u0005a\u0000\u0000"+
		"45\u0005d\u0000\u00005\u0006\u0001\u0000\u0000\u000067\u0005t\u0000\u0000"+
		"78\u0005r\u0000\u000089\u0005u\u0000\u00009:\u0005e\u0000\u0000:\b\u0001"+
		"\u0000\u0000\u0000;<\u0005f\u0000\u0000<=\u0005a\u0000\u0000=>\u0005l"+
		"\u0000\u0000>?\u0005s\u0000\u0000?@\u0005e\u0000\u0000@\n\u0001\u0000"+
		"\u0000\u0000AB\u0005a\u0000\u0000BC\u0005n\u0000\u0000CD\u0005d\u0000"+
		"\u0000D\f\u0001\u0000\u0000\u0000EF\u0005o\u0000\u0000FG\u0005r\u0000"+
		"\u0000G\u000e\u0001\u0000\u0000\u0000HI\u0005x\u0000\u0000IJ\u0005o\u0000"+
		"\u0000JK\u0005r\u0000\u0000K\u0010\u0001\u0000\u0000\u0000LM\u0005n\u0000"+
		"\u0000MN\u0005o\u0000\u0000NO\u0005t\u0000\u0000O\u0012\u0001\u0000\u0000"+
		"\u0000PR\u0007\u0000\u0000\u0000QP\u0001\u0000\u0000\u0000RS\u0001\u0000"+
		"\u0000\u0000SQ\u0001\u0000\u0000\u0000ST\u0001\u0000\u0000\u0000T\u0014"+
		"\u0001\u0000\u0000\u0000UW\u000209\u0000VU\u0001\u0000\u0000\u0000WX\u0001"+
		"\u0000\u0000\u0000XV\u0001\u0000\u0000\u0000XY\u0001\u0000\u0000\u0000"+
		"YZ\u0001\u0000\u0000\u0000Z\\\u0005.\u0000\u0000[]\u000209\u0000\\[\u0001"+
		"\u0000\u0000\u0000]^\u0001\u0000\u0000\u0000^\\\u0001\u0000\u0000\u0000"+
		"^_\u0001\u0000\u0000\u0000_\u0016\u0001\u0000\u0000\u0000`b\u000209\u0000"+
		"a`\u0001\u0000\u0000\u0000bc\u0001\u0000\u0000\u0000ca\u0001\u0000\u0000"+
		"\u0000cd\u0001\u0000\u0000\u0000d\u0018\u0001\u0000\u0000\u0000ef\u0005"+
		"+\u0000\u0000f\u001a\u0001\u0000\u0000\u0000gh\u0005-\u0000\u0000h\u001c"+
		"\u0001\u0000\u0000\u0000ij\u0005*\u0000\u0000j\u001e\u0001\u0000\u0000"+
		"\u0000kl\u0005/\u0000\u0000l \u0001\u0000\u0000\u0000mn\u0005(\u0000\u0000"+
		"n\"\u0001\u0000\u0000\u0000op\u0005)\u0000\u0000p$\u0001\u0000\u0000\u0000"+
		"qs\u0005\r\u0000\u0000rq\u0001\u0000\u0000\u0000rs\u0001\u0000\u0000\u0000"+
		"st\u0001\u0000\u0000\u0000tu\u0005\n\u0000\u0000u&\u0001\u0000\u0000\u0000"+
		"vx\u0007\u0001\u0000\u0000wv\u0001\u0000\u0000\u0000xy\u0001\u0000\u0000"+
		"\u0000yw\u0001\u0000\u0000\u0000yz\u0001\u0000\u0000\u0000z{\u0001\u0000"+
		"\u0000\u0000{|\u0006\u0013\u0000\u0000|(\u0001\u0000\u0000\u0000\u0007"+
		"\u0000SX^cry\u0001\u0001\u0013\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}