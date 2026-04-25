// Generated from c:/Users/klaud/OneDrive/Dokumenty/Pulpit/PW/Semestr1/Kompilatory/projekt/LangX.g4 by ANTLR 4.13.1
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
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, WRITE=2, READ=3, TRUE=4, FALSE=5, AND=6, OR=7, XOR=8, NEG=9, ID=10, 
		FLOAT=11, REAL=12, INT=13, ADD=14, SUB=15, MUL=16, DIV=17, LP=18, RP=19, 
		NEWLINE=20, WS=21;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "WRITE", "READ", "TRUE", "FALSE", "AND", "OR", "XOR", "NEG", 
			"ID", "FLOAT", "REAL", "INT", "ADD", "SUB", "MUL", "DIV", "LP", "RP", 
			"NEWLINE", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'='", "'write'", "'read'", "'true'", "'false'", "'and'", "'or'", 
			"'xor'", "'not'", null, null, null, null, "'+'", "'-'", "'*'", "'/'", 
			"'('", "')'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, "WRITE", "READ", "TRUE", "FALSE", "AND", "OR", "XOR", "NEG", 
			"ID", "FLOAT", "REAL", "INT", "ADD", "SUB", "MUL", "DIV", "LP", "RP", 
			"NEWLINE", "WS"
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
		case 20:
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
		"\u0004\u0000\u0015\u008c\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014"+
		"\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\t\u0004\tT\b\t\u000b\t\f\tU\u0001\n\u0004\nY"+
		"\b\n\u000b\n\f\nZ\u0001\n\u0001\n\u0004\n_\b\n\u000b\n\f\n`\u0001\n\u0001"+
		"\n\u0001\u000b\u0004\u000bf\b\u000b\u000b\u000b\f\u000bg\u0001\u000b\u0001"+
		"\u000b\u0004\u000bl\b\u000b\u000b\u000b\f\u000bm\u0001\f\u0004\fq\b\f"+
		"\u000b\f\f\fr\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000f\u0001"+
		"\u000f\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0012\u0001"+
		"\u0012\u0001\u0013\u0003\u0013\u0082\b\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0014\u0004\u0014\u0087\b\u0014\u000b\u0014\f\u0014\u0088\u0001\u0014"+
		"\u0001\u0014\u0000\u0000\u0015\u0001\u0001\u0003\u0002\u0005\u0003\u0007"+
		"\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b"+
		"\u0017\f\u0019\r\u001b\u000e\u001d\u000f\u001f\u0010!\u0011#\u0012%\u0013"+
		"\'\u0014)\u0015\u0001\u0000\u0002\u0002\u0000AZaz\u0002\u0000\t\t  \u0093"+
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
		"\u0001+\u0001\u0000\u0000\u0000\u0003-\u0001\u0000\u0000\u0000\u00053"+
		"\u0001\u0000\u0000\u0000\u00078\u0001\u0000\u0000\u0000\t=\u0001\u0000"+
		"\u0000\u0000\u000bC\u0001\u0000\u0000\u0000\rG\u0001\u0000\u0000\u0000"+
		"\u000fJ\u0001\u0000\u0000\u0000\u0011N\u0001\u0000\u0000\u0000\u0013S"+
		"\u0001\u0000\u0000\u0000\u0015X\u0001\u0000\u0000\u0000\u0017e\u0001\u0000"+
		"\u0000\u0000\u0019p\u0001\u0000\u0000\u0000\u001bt\u0001\u0000\u0000\u0000"+
		"\u001dv\u0001\u0000\u0000\u0000\u001fx\u0001\u0000\u0000\u0000!z\u0001"+
		"\u0000\u0000\u0000#|\u0001\u0000\u0000\u0000%~\u0001\u0000\u0000\u0000"+
		"\'\u0081\u0001\u0000\u0000\u0000)\u0086\u0001\u0000\u0000\u0000+,\u0005"+
		"=\u0000\u0000,\u0002\u0001\u0000\u0000\u0000-.\u0005w\u0000\u0000./\u0005"+
		"r\u0000\u0000/0\u0005i\u0000\u000001\u0005t\u0000\u000012\u0005e\u0000"+
		"\u00002\u0004\u0001\u0000\u0000\u000034\u0005r\u0000\u000045\u0005e\u0000"+
		"\u000056\u0005a\u0000\u000067\u0005d\u0000\u00007\u0006\u0001\u0000\u0000"+
		"\u000089\u0005t\u0000\u00009:\u0005r\u0000\u0000:;\u0005u\u0000\u0000"+
		";<\u0005e\u0000\u0000<\b\u0001\u0000\u0000\u0000=>\u0005f\u0000\u0000"+
		">?\u0005a\u0000\u0000?@\u0005l\u0000\u0000@A\u0005s\u0000\u0000AB\u0005"+
		"e\u0000\u0000B\n\u0001\u0000\u0000\u0000CD\u0005a\u0000\u0000DE\u0005"+
		"n\u0000\u0000EF\u0005d\u0000\u0000F\f\u0001\u0000\u0000\u0000GH\u0005"+
		"o\u0000\u0000HI\u0005r\u0000\u0000I\u000e\u0001\u0000\u0000\u0000JK\u0005"+
		"x\u0000\u0000KL\u0005o\u0000\u0000LM\u0005r\u0000\u0000M\u0010\u0001\u0000"+
		"\u0000\u0000NO\u0005n\u0000\u0000OP\u0005o\u0000\u0000PQ\u0005t\u0000"+
		"\u0000Q\u0012\u0001\u0000\u0000\u0000RT\u0007\u0000\u0000\u0000SR\u0001"+
		"\u0000\u0000\u0000TU\u0001\u0000\u0000\u0000US\u0001\u0000\u0000\u0000"+
		"UV\u0001\u0000\u0000\u0000V\u0014\u0001\u0000\u0000\u0000WY\u000209\u0000"+
		"XW\u0001\u0000\u0000\u0000YZ\u0001\u0000\u0000\u0000ZX\u0001\u0000\u0000"+
		"\u0000Z[\u0001\u0000\u0000\u0000[\\\u0001\u0000\u0000\u0000\\^\u0005."+
		"\u0000\u0000]_\u000209\u0000^]\u0001\u0000\u0000\u0000_`\u0001\u0000\u0000"+
		"\u0000`^\u0001\u0000\u0000\u0000`a\u0001\u0000\u0000\u0000ab\u0001\u0000"+
		"\u0000\u0000bc\u0005f\u0000\u0000c\u0016\u0001\u0000\u0000\u0000df\u0002"+
		"09\u0000ed\u0001\u0000\u0000\u0000fg\u0001\u0000\u0000\u0000ge\u0001\u0000"+
		"\u0000\u0000gh\u0001\u0000\u0000\u0000hi\u0001\u0000\u0000\u0000ik\u0005"+
		".\u0000\u0000jl\u000209\u0000kj\u0001\u0000\u0000\u0000lm\u0001\u0000"+
		"\u0000\u0000mk\u0001\u0000\u0000\u0000mn\u0001\u0000\u0000\u0000n\u0018"+
		"\u0001\u0000\u0000\u0000oq\u000209\u0000po\u0001\u0000\u0000\u0000qr\u0001"+
		"\u0000\u0000\u0000rp\u0001\u0000\u0000\u0000rs\u0001\u0000\u0000\u0000"+
		"s\u001a\u0001\u0000\u0000\u0000tu\u0005+\u0000\u0000u\u001c\u0001\u0000"+
		"\u0000\u0000vw\u0005-\u0000\u0000w\u001e\u0001\u0000\u0000\u0000xy\u0005"+
		"*\u0000\u0000y \u0001\u0000\u0000\u0000z{\u0005/\u0000\u0000{\"\u0001"+
		"\u0000\u0000\u0000|}\u0005(\u0000\u0000}$\u0001\u0000\u0000\u0000~\u007f"+
		"\u0005)\u0000\u0000\u007f&\u0001\u0000\u0000\u0000\u0080\u0082\u0005\r"+
		"\u0000\u0000\u0081\u0080\u0001\u0000\u0000\u0000\u0081\u0082\u0001\u0000"+
		"\u0000\u0000\u0082\u0083\u0001\u0000\u0000\u0000\u0083\u0084\u0005\n\u0000"+
		"\u0000\u0084(\u0001\u0000\u0000\u0000\u0085\u0087\u0007\u0001\u0000\u0000"+
		"\u0086\u0085\u0001\u0000\u0000\u0000\u0087\u0088\u0001\u0000\u0000\u0000"+
		"\u0088\u0086\u0001\u0000\u0000\u0000\u0088\u0089\u0001\u0000\u0000\u0000"+
		"\u0089\u008a\u0001\u0000\u0000\u0000\u008a\u008b\u0006\u0014\u0000\u0000"+
		"\u008b*\u0001\u0000\u0000\u0000\t\u0000UZ`gmr\u0081\u0088\u0001\u0001"+
		"\u0014\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}