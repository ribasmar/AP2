// Generated from .\GyhLang.g4 by ANTLR 4.7.2

    import java.util.ArrayList;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GyhLangLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PCDec=1, PCInt=2, PCReal=3, PCProg=4, PCLer=5, PCImprimir=6, PCSe=7, PCEntao=8, 
		PCSenao=9, PCEnqto=10, PCIni=11, PCFim=12, OpArit=13, OpAritSoma=14, OpAritSub=15, 
		OpAritMult=16, OpAritDiv=17, OpRel=18, OpBool=19, Delim=20, Atrib=21, 
		Par=22, AbrePar=23, FechaPar=24, Var=25, NumInt=26, NumReal=27, Cadeia=28, 
		Coment=29, WS=30;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"PCDec", "PCInt", "PCReal", "PCProg", "PCLer", "PCImprimir", "PCSe", 
			"PCEntao", "PCSenao", "PCEnqto", "PCIni", "PCFim", "OpArit", "OpAritSoma", 
			"OpAritSub", "OpAritMult", "OpAritDiv", "OpRel", "OpBool", "Delim", "Atrib", 
			"Par", "AbrePar", "FechaPar", "Var", "NumInt", "NumReal", "Cadeia", "Coment", 
			"WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'DEC'", "'INT'", "'REAL'", "'PROG'", "'LER'", "'IMPRIMIR'", "'SE'", 
			"'ENTAO'", "'SENAO'", "'ENQTO'", "'INI'", "'FIM'", null, "'+'", "'-'", 
			"'*'", "'/'", null, null, "':'", "':='", null, "'('", "')'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "PCDec", "PCInt", "PCReal", "PCProg", "PCLer", "PCImprimir", "PCSe", 
			"PCEntao", "PCSenao", "PCEnqto", "PCIni", "PCFim", "OpArit", "OpAritSoma", 
			"OpAritSub", "OpAritMult", "OpAritDiv", "OpRel", "OpBool", "Delim", "Atrib", 
			"Par", "AbrePar", "FechaPar", "Var", "NumInt", "NumReal", "Cadeia", "Coment", 
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


	    private String _varName;
	    private int _varType;
	    private String _varValue;
	    private Symbol _varSymbol;
	    private SymbolTable symbolTable = new SymbolTable();
	    private String _expVar;
	    private String _expContent;
	    private String _condition;
	    private ArrayList<Command> _condTrue = new ArrayList<Command>();
	    private ArrayList<Command> _condFalse = new ArrayList<Command>();
	    private String _writeVar;
	    private String _readVar;	
	    private ArrayList<Command> listCmd = new ArrayList<Command>();
	    private ArrayList<Command> listAux = new ArrayList<Command>();
	    private GyhProgram program = new GyhProgram();
	    
	    //--------
	    
	    public void generateCommand(){
	    	program.generateTarget();
	    	System.out.println("\n\n ------> Gerando Código!");
	    }
	    
	    public void verificarVar(String nomeVar){
	    	if(!symbolTable.exists(nomeVar)){
	    		System.out.println("Erro semântico: variáveis não reconhecidas!");
	    	}
	    }


	public GyhLangLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "GyhLang.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2 \u00d0\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\3\2\3\2\3"+
		"\2\3\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6"+
		"\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3"+
		"\f\3\f\3\f\3\r\3\r\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22"+
		"\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u008f\n\23\3\24"+
		"\3\24\3\24\5\24\u0094\n\24\3\25\3\25\3\26\3\26\3\26\3\27\3\27\3\30\3\30"+
		"\3\31\3\31\3\32\3\32\7\32\u00a3\n\32\f\32\16\32\u00a6\13\32\3\33\6\33"+
		"\u00a9\n\33\r\33\16\33\u00aa\3\34\6\34\u00ae\n\34\r\34\16\34\u00af\3\34"+
		"\3\34\6\34\u00b4\n\34\r\34\16\34\u00b5\3\35\3\35\7\35\u00ba\n\35\f\35"+
		"\16\35\u00bd\13\35\3\35\3\35\3\36\3\36\7\36\u00c3\n\36\f\36\16\36\u00c6"+
		"\13\36\3\36\3\36\3\37\6\37\u00cb\n\37\r\37\16\37\u00cc\3\37\3\37\3\u00bb"+
		"\2 \3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35"+
		"\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36"+
		";\37= \3\2\t\5\2,-//\61\61\4\2>>@@\3\2c|\5\2\62;C\\c|\3\2\62;\4\2\f\f"+
		"\17\17\5\2\13\f\17\17\"\"\2\u00db\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2"+
		"\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3"+
		"\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2"+
		"\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2"+
		"\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2"+
		"\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\3?\3\2\2\2\5C\3\2\2"+
		"\2\7G\3\2\2\2\tL\3\2\2\2\13Q\3\2\2\2\rU\3\2\2\2\17^\3\2\2\2\21a\3\2\2"+
		"\2\23g\3\2\2\2\25m\3\2\2\2\27s\3\2\2\2\31w\3\2\2\2\33{\3\2\2\2\35}\3\2"+
		"\2\2\37\177\3\2\2\2!\u0081\3\2\2\2#\u0083\3\2\2\2%\u008e\3\2\2\2\'\u0093"+
		"\3\2\2\2)\u0095\3\2\2\2+\u0097\3\2\2\2-\u009a\3\2\2\2/\u009c\3\2\2\2\61"+
		"\u009e\3\2\2\2\63\u00a0\3\2\2\2\65\u00a8\3\2\2\2\67\u00ad\3\2\2\29\u00b7"+
		"\3\2\2\2;\u00c0\3\2\2\2=\u00ca\3\2\2\2?@\7F\2\2@A\7G\2\2AB\7E\2\2B\4\3"+
		"\2\2\2CD\7K\2\2DE\7P\2\2EF\7V\2\2F\6\3\2\2\2GH\7T\2\2HI\7G\2\2IJ\7C\2"+
		"\2JK\7N\2\2K\b\3\2\2\2LM\7R\2\2MN\7T\2\2NO\7Q\2\2OP\7I\2\2P\n\3\2\2\2"+
		"QR\7N\2\2RS\7G\2\2ST\7T\2\2T\f\3\2\2\2UV\7K\2\2VW\7O\2\2WX\7R\2\2XY\7"+
		"T\2\2YZ\7K\2\2Z[\7O\2\2[\\\7K\2\2\\]\7T\2\2]\16\3\2\2\2^_\7U\2\2_`\7G"+
		"\2\2`\20\3\2\2\2ab\7G\2\2bc\7P\2\2cd\7V\2\2de\7C\2\2ef\7Q\2\2f\22\3\2"+
		"\2\2gh\7U\2\2hi\7G\2\2ij\7P\2\2jk\7C\2\2kl\7Q\2\2l\24\3\2\2\2mn\7G\2\2"+
		"no\7P\2\2op\7S\2\2pq\7V\2\2qr\7Q\2\2r\26\3\2\2\2st\7K\2\2tu\7P\2\2uv\7"+
		"K\2\2v\30\3\2\2\2wx\7H\2\2xy\7K\2\2yz\7O\2\2z\32\3\2\2\2{|\t\2\2\2|\34"+
		"\3\2\2\2}~\7-\2\2~\36\3\2\2\2\177\u0080\7/\2\2\u0080 \3\2\2\2\u0081\u0082"+
		"\7,\2\2\u0082\"\3\2\2\2\u0083\u0084\7\61\2\2\u0084$\3\2\2\2\u0085\u008f"+
		"\t\3\2\2\u0086\u0087\7>\2\2\u0087\u008f\7?\2\2\u0088\u0089\7@\2\2\u0089"+
		"\u008f\7?\2\2\u008a\u008b\7?\2\2\u008b\u008f\7?\2\2\u008c\u008d\7#\2\2"+
		"\u008d\u008f\7?\2\2\u008e\u0085\3\2\2\2\u008e\u0086\3\2\2\2\u008e\u0088"+
		"\3\2\2\2\u008e\u008a\3\2\2\2\u008e\u008c\3\2\2\2\u008f&\3\2\2\2\u0090"+
		"\u0094\7G\2\2\u0091\u0092\7Q\2\2\u0092\u0094\7W\2\2\u0093\u0090\3\2\2"+
		"\2\u0093\u0091\3\2\2\2\u0094(\3\2\2\2\u0095\u0096\7<\2\2\u0096*\3\2\2"+
		"\2\u0097\u0098\7<\2\2\u0098\u0099\7?\2\2\u0099,\3\2\2\2\u009a\u009b\4"+
		"*+\2\u009b.\3\2\2\2\u009c\u009d\7*\2\2\u009d\60\3\2\2\2\u009e\u009f\7"+
		"+\2\2\u009f\62\3\2\2\2\u00a0\u00a4\t\4\2\2\u00a1\u00a3\t\5\2\2\u00a2\u00a1"+
		"\3\2\2\2\u00a3\u00a6\3\2\2\2\u00a4\u00a2\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5"+
		"\64\3\2\2\2\u00a6\u00a4\3\2\2\2\u00a7\u00a9\t\6\2\2\u00a8\u00a7\3\2\2"+
		"\2\u00a9\u00aa\3\2\2\2\u00aa\u00a8\3\2\2\2\u00aa\u00ab\3\2\2\2\u00ab\66"+
		"\3\2\2\2\u00ac\u00ae\t\6\2\2\u00ad\u00ac\3\2\2\2\u00ae\u00af\3\2\2\2\u00af"+
		"\u00ad\3\2\2\2\u00af\u00b0\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1\u00b3\7\60"+
		"\2\2\u00b2\u00b4\t\6\2\2\u00b3\u00b2\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5"+
		"\u00b3\3\2\2\2\u00b5\u00b6\3\2\2\2\u00b68\3\2\2\2\u00b7\u00bb\7$\2\2\u00b8"+
		"\u00ba\13\2\2\2\u00b9\u00b8\3\2\2\2\u00ba\u00bd\3\2\2\2\u00bb\u00bc\3"+
		"\2\2\2\u00bb\u00b9\3\2\2\2\u00bc\u00be\3\2\2\2\u00bd\u00bb\3\2\2\2\u00be"+
		"\u00bf\7$\2\2\u00bf:\3\2\2\2\u00c0\u00c4\7%\2\2\u00c1\u00c3\n\7\2\2\u00c2"+
		"\u00c1\3\2\2\2\u00c3\u00c6\3\2\2\2\u00c4\u00c2\3\2\2\2\u00c4\u00c5\3\2"+
		"\2\2\u00c5\u00c7\3\2\2\2\u00c6\u00c4\3\2\2\2\u00c7\u00c8\b\36\2\2\u00c8"+
		"<\3\2\2\2\u00c9\u00cb\t\b\2\2\u00ca\u00c9\3\2\2\2\u00cb\u00cc\3\2\2\2"+
		"\u00cc\u00ca\3\2\2\2\u00cc\u00cd\3\2\2\2\u00cd\u00ce\3\2\2\2\u00ce\u00cf"+
		"\b\37\2\2\u00cf>\3\2\2\2\r\2\u008e\u0093\u00a2\u00a4\u00aa\u00af\u00b5"+
		"\u00bb\u00c4\u00cc\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}