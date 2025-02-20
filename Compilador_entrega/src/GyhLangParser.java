// Generated from .\GyhLang.g4 by ANTLR 4.7.2

    import java.util.ArrayList;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GyhLangParser extends Parser {
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
	public static final int
		RULE_programa = 0, RULE_listaDeclaracoes = 1, RULE_listaDeclaracoes2 = 2, 
		RULE_declaracao = 3, RULE_tipoVar = 4, RULE_listaComandos = 5, RULE_comando = 6, 
		RULE_comandoAtribuicao = 7, RULE_comandoEntrada = 8, RULE_comandoSaida = 9, 
		RULE_comandoCondicao = 10, RULE_comandoRepeticao = 11, RULE_subAlgoritmo = 12, 
		RULE_expressaoAritmetica = 13, RULE_expressaoAritmetica2 = 14, RULE_termoAritmetico = 15, 
		RULE_termoAritmetico2 = 16, RULE_fatorAritmetico = 17, RULE_expressaoRelacional = 18, 
		RULE_expressaoRelacional2 = 19, RULE_termoRelacional = 20;
	private static String[] makeRuleNames() {
		return new String[] {
			"programa", "listaDeclaracoes", "listaDeclaracoes2", "declaracao", "tipoVar", 
			"listaComandos", "comando", "comandoAtribuicao", "comandoEntrada", "comandoSaida", 
			"comandoCondicao", "comandoRepeticao", "subAlgoritmo", "expressaoAritmetica", 
			"expressaoAritmetica2", "termoAritmetico", "termoAritmetico2", "fatorAritmetico", 
			"expressaoRelacional", "expressaoRelacional2", "termoRelacional"
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

	@Override
	public String getGrammarFileName() { return "GyhLang.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


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

	public GyhLangParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramaContext extends ParserRuleContext {
		public List<TerminalNode> Delim() { return getTokens(GyhLangParser.Delim); }
		public TerminalNode Delim(int i) {
			return getToken(GyhLangParser.Delim, i);
		}
		public TerminalNode PCDec() { return getToken(GyhLangParser.PCDec, 0); }
		public ListaDeclaracoesContext listaDeclaracoes() {
			return getRuleContext(ListaDeclaracoesContext.class,0);
		}
		public TerminalNode PCProg() { return getToken(GyhLangParser.PCProg, 0); }
		public ListaComandosContext listaComandos() {
			return getRuleContext(ListaComandosContext.class,0);
		}
		public TerminalNode EOF() { return getToken(GyhLangParser.EOF, 0); }
		public ProgramaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programa; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GyhLangListener ) ((GyhLangListener)listener).enterPrograma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GyhLangListener ) ((GyhLangListener)listener).exitPrograma(this);
		}
	}

	public final ProgramaContext programa() throws RecognitionException {
		ProgramaContext _localctx = new ProgramaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_programa);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(42);
			match(Delim);
			setState(43);
			match(PCDec);
			setState(44);
			listaDeclaracoes();
			setState(45);
			match(Delim);
			setState(46);
			match(PCProg);
			setState(47);
			listaComandos();
			setState(48);
			match(EOF);

			    System.out.println("Programa ---> VarTable");
			    program.setVarTable(symbolTable);
			    program.setCommand(listCmd);

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

	public static class ListaDeclaracoesContext extends ParserRuleContext {
		public DeclaracaoContext declaracao() {
			return getRuleContext(DeclaracaoContext.class,0);
		}
		public ListaDeclaracoes2Context listaDeclaracoes2() {
			return getRuleContext(ListaDeclaracoes2Context.class,0);
		}
		public ListaDeclaracoesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listaDeclaracoes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GyhLangListener ) ((GyhLangListener)listener).enterListaDeclaracoes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GyhLangListener ) ((GyhLangListener)listener).exitListaDeclaracoes(this);
		}
	}

	public final ListaDeclaracoesContext listaDeclaracoes() throws RecognitionException {
		ListaDeclaracoesContext _localctx = new ListaDeclaracoesContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_listaDeclaracoes);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(51);
			declaracao();
			setState(52);
			listaDeclaracoes2();
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

	public static class ListaDeclaracoes2Context extends ParserRuleContext {
		public ListaDeclaracoesContext listaDeclaracoes() {
			return getRuleContext(ListaDeclaracoesContext.class,0);
		}
		public ListaDeclaracoes2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listaDeclaracoes2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GyhLangListener ) ((GyhLangListener)listener).enterListaDeclaracoes2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GyhLangListener ) ((GyhLangListener)listener).exitListaDeclaracoes2(this);
		}
	}

	public final ListaDeclaracoes2Context listaDeclaracoes2() throws RecognitionException {
		ListaDeclaracoes2Context _localctx = new ListaDeclaracoes2Context(_ctx, getState());
		enterRule(_localctx, 4, RULE_listaDeclaracoes2);
		try {
			setState(56);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Var:
				enterOuterAlt(_localctx, 1);
				{
				setState(54);
				listaDeclaracoes();
				}
				break;
			case Delim:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class DeclaracaoContext extends ParserRuleContext {
		public TerminalNode Var() { return getToken(GyhLangParser.Var, 0); }
		public TerminalNode Delim() { return getToken(GyhLangParser.Delim, 0); }
		public TipoVarContext tipoVar() {
			return getRuleContext(TipoVarContext.class,0);
		}
		public DeclaracaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GyhLangListener ) ((GyhLangListener)listener).enterDeclaracao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GyhLangListener ) ((GyhLangListener)listener).exitDeclaracao(this);
		}
	}

	public final DeclaracaoContext declaracao() throws RecognitionException {
		DeclaracaoContext _localctx = new DeclaracaoContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_declaracao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(58);
			match(Var);
			setState(59);
			match(Delim);
			setState(60);
			tipoVar();

			    _varName = _input.LT(-3).getText();
			    _varType = 0; // Tipo do valor (defina conforme necessário)
			    _varValue = null;
			    _varSymbol = new Symbol(_varName, _varType, _varValue);

			    if (!symbolTable.exists(_varName)) {
			        symbolTable.add(_varSymbol);
			        System.out.println("Adicionei um símbolo: " + _varSymbol);
			    } else {
			        System.out.println("Erro semântico, tentando adicionar novamente " + _varSymbol);
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

	public static class TipoVarContext extends ParserRuleContext {
		public TerminalNode PCInt() { return getToken(GyhLangParser.PCInt, 0); }
		public TerminalNode PCReal() { return getToken(GyhLangParser.PCReal, 0); }
		public TipoVarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipoVar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GyhLangListener ) ((GyhLangListener)listener).enterTipoVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GyhLangListener ) ((GyhLangListener)listener).exitTipoVar(this);
		}
	}

	public final TipoVarContext tipoVar() throws RecognitionException {
		TipoVarContext _localctx = new TipoVarContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_tipoVar);
		try {
			setState(67);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PCInt:
				enterOuterAlt(_localctx, 1);
				{
				setState(63);
				match(PCInt);
				_varType = 0;
				}
				break;
			case PCReal:
				enterOuterAlt(_localctx, 2);
				{
				setState(65);
				match(PCReal);
				_varType = 1;
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

	public static class ListaComandosContext extends ParserRuleContext {
		public List<ComandoContext> comando() {
			return getRuleContexts(ComandoContext.class);
		}
		public ComandoContext comando(int i) {
			return getRuleContext(ComandoContext.class,i);
		}
		public ListaComandosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listaComandos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GyhLangListener ) ((GyhLangListener)listener).enterListaComandos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GyhLangListener ) ((GyhLangListener)listener).exitListaComandos(this);
		}
	}

	public final ListaComandosContext listaComandos() throws RecognitionException {
		ListaComandosContext _localctx = new ListaComandosContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_listaComandos);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(72); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(69);
				comando();
				 listCmd.addAll(listAux); listAux.clear(); 
				}
				}
				setState(74); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PCLer) | (1L << PCImprimir) | (1L << PCSe) | (1L << PCEnqto) | (1L << PCIni) | (1L << Var))) != 0) );
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

	public static class ComandoContext extends ParserRuleContext {
		public ComandoAtribuicaoContext comandoAtribuicao() {
			return getRuleContext(ComandoAtribuicaoContext.class,0);
		}
		public ComandoEntradaContext comandoEntrada() {
			return getRuleContext(ComandoEntradaContext.class,0);
		}
		public ComandoSaidaContext comandoSaida() {
			return getRuleContext(ComandoSaidaContext.class,0);
		}
		public ComandoCondicaoContext comandoCondicao() {
			return getRuleContext(ComandoCondicaoContext.class,0);
		}
		public ComandoRepeticaoContext comandoRepeticao() {
			return getRuleContext(ComandoRepeticaoContext.class,0);
		}
		public SubAlgoritmoContext subAlgoritmo() {
			return getRuleContext(SubAlgoritmoContext.class,0);
		}
		public ComandoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comando; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GyhLangListener ) ((GyhLangListener)listener).enterComando(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GyhLangListener ) ((GyhLangListener)listener).exitComando(this);
		}
	}

	public final ComandoContext comando() throws RecognitionException {
		ComandoContext _localctx = new ComandoContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_comando);
		try {
			setState(82);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Var:
				enterOuterAlt(_localctx, 1);
				{
				setState(76);
				comandoAtribuicao();
				}
				break;
			case PCLer:
				enterOuterAlt(_localctx, 2);
				{
				setState(77);
				comandoEntrada();
				}
				break;
			case PCImprimir:
				enterOuterAlt(_localctx, 3);
				{
				setState(78);
				comandoSaida();
				}
				break;
			case PCSe:
				enterOuterAlt(_localctx, 4);
				{
				setState(79);
				comandoCondicao();
				}
				break;
			case PCEnqto:
				enterOuterAlt(_localctx, 5);
				{
				setState(80);
				comandoRepeticao();
				}
				break;
			case PCIni:
				enterOuterAlt(_localctx, 6);
				{
				setState(81);
				subAlgoritmo();
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

	public static class ComandoAtribuicaoContext extends ParserRuleContext {
		public TerminalNode Var() { return getToken(GyhLangParser.Var, 0); }
		public TerminalNode Atrib() { return getToken(GyhLangParser.Atrib, 0); }
		public ExpressaoAritmeticaContext expressaoAritmetica() {
			return getRuleContext(ExpressaoAritmeticaContext.class,0);
		}
		public ComandoAtribuicaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comandoAtribuicao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GyhLangListener ) ((GyhLangListener)listener).enterComandoAtribuicao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GyhLangListener ) ((GyhLangListener)listener).exitComandoAtribuicao(this);
		}
	}

	public final ComandoAtribuicaoContext comandoAtribuicao() throws RecognitionException {
		ComandoAtribuicaoContext _localctx = new ComandoAtribuicaoContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_comandoAtribuicao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(84);
			match(Var);

			    verificarVar(_input.LT(-1).getText());
			    _expVar = _input.LT(-1).getText();

			setState(86);
			match(Atrib);
			_expContent = "";
			setState(88);
			expressaoAritmetica();

			    CommandAtribuicao cmd = new CommandAtribuicao(_expVar, _expContent);
			    listAux.add(cmd);

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

	public static class ComandoEntradaContext extends ParserRuleContext {
		public TerminalNode PCLer() { return getToken(GyhLangParser.PCLer, 0); }
		public TerminalNode Var() { return getToken(GyhLangParser.Var, 0); }
		public ComandoEntradaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comandoEntrada; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GyhLangListener ) ((GyhLangListener)listener).enterComandoEntrada(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GyhLangListener ) ((GyhLangListener)listener).exitComandoEntrada(this);
		}
	}

	public final ComandoEntradaContext comandoEntrada() throws RecognitionException {
		ComandoEntradaContext _localctx = new ComandoEntradaContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_comandoEntrada);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			match(PCLer);
			setState(92);
			match(Var);

			    _readVar = _input.LT(-1).getText();
			    CommandLeitura cmd = new CommandLeitura(_readVar);
			    listCmd.add(cmd);
			    System.out.println(cmd.toString());

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

	public static class ComandoSaidaContext extends ParserRuleContext {
		public TerminalNode PCImprimir() { return getToken(GyhLangParser.PCImprimir, 0); }
		public TerminalNode Var() { return getToken(GyhLangParser.Var, 0); }
		public TerminalNode Cadeia() { return getToken(GyhLangParser.Cadeia, 0); }
		public ComandoSaidaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comandoSaida; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GyhLangListener ) ((GyhLangListener)listener).enterComandoSaida(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GyhLangListener ) ((GyhLangListener)listener).exitComandoSaida(this);
		}
	}

	public final ComandoSaidaContext comandoSaida() throws RecognitionException {
		ComandoSaidaContext _localctx = new ComandoSaidaContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_comandoSaida);
		try {
			setState(100);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(95);
				match(PCImprimir);
				setState(96);
				match(Var);

				    verificarVar(_input.LT(-1).getText());
				    _writeVar = _input.LT(-1).getText();
				    CommandEscrita cmd = new CommandEscrita(_writeVar);
				    listCmd.add(cmd);
				    System.out.println(cmd.toString());

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(98);
				match(PCImprimir);
				setState(99);
				match(Cadeia);
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

	public static class ComandoCondicaoContext extends ParserRuleContext {
		public TerminalNode PCSe() { return getToken(GyhLangParser.PCSe, 0); }
		public ExpressaoRelacionalContext expressaoRelacional() {
			return getRuleContext(ExpressaoRelacionalContext.class,0);
		}
		public TerminalNode PCEntao() { return getToken(GyhLangParser.PCEntao, 0); }
		public List<ComandoContext> comando() {
			return getRuleContexts(ComandoContext.class);
		}
		public ComandoContext comando(int i) {
			return getRuleContext(ComandoContext.class,i);
		}
		public TerminalNode PCSenao() { return getToken(GyhLangParser.PCSenao, 0); }
		public ComandoCondicaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comandoCondicao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GyhLangListener ) ((GyhLangListener)listener).enterComandoCondicao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GyhLangListener ) ((GyhLangListener)listener).exitComandoCondicao(this);
		}
	}

	public final ComandoCondicaoContext comandoCondicao() throws RecognitionException {
		ComandoCondicaoContext _localctx = new ComandoCondicaoContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_comandoCondicao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(102);
			match(PCSe);
			_condition = "";
			setState(104);
			expressaoRelacional();
			setState(105);
			match(PCEntao);
			setState(106);
			comando();

			    _condTrue.addAll(listAux);
			    listAux.clear();

			setState(112);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(108);
				match(PCSenao);
				setState(109);
				comando();

				    _condFalse.addAll(listAux);
				    listAux.clear();

				}
				break;
			}

			    CommandCondicao cmd = new CommandCondicao(_condition, _condTrue, _condFalse);
			    listAux.add(cmd);

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

	public static class ComandoRepeticaoContext extends ParserRuleContext {
		public TerminalNode PCEnqto() { return getToken(GyhLangParser.PCEnqto, 0); }
		public ExpressaoRelacionalContext expressaoRelacional() {
			return getRuleContext(ExpressaoRelacionalContext.class,0);
		}
		public ComandoContext comando() {
			return getRuleContext(ComandoContext.class,0);
		}
		public ComandoRepeticaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comandoRepeticao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GyhLangListener ) ((GyhLangListener)listener).enterComandoRepeticao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GyhLangListener ) ((GyhLangListener)listener).exitComandoRepeticao(this);
		}
	}

	public final ComandoRepeticaoContext comandoRepeticao() throws RecognitionException {
		ComandoRepeticaoContext _localctx = new ComandoRepeticaoContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_comandoRepeticao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
			match(PCEnqto);
			setState(117);
			expressaoRelacional();
			setState(118);
			comando();
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

	public static class SubAlgoritmoContext extends ParserRuleContext {
		public TerminalNode PCIni() { return getToken(GyhLangParser.PCIni, 0); }
		public ListaComandosContext listaComandos() {
			return getRuleContext(ListaComandosContext.class,0);
		}
		public TerminalNode PCFim() { return getToken(GyhLangParser.PCFim, 0); }
		public SubAlgoritmoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subAlgoritmo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GyhLangListener ) ((GyhLangListener)listener).enterSubAlgoritmo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GyhLangListener ) ((GyhLangListener)listener).exitSubAlgoritmo(this);
		}
	}

	public final SubAlgoritmoContext subAlgoritmo() throws RecognitionException {
		SubAlgoritmoContext _localctx = new SubAlgoritmoContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_subAlgoritmo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			match(PCIni);
			setState(121);
			listaComandos();
			setState(122);
			match(PCFim);
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

	public static class ExpressaoAritmeticaContext extends ParserRuleContext {
		public TermoAritmeticoContext termoAritmetico() {
			return getRuleContext(TermoAritmeticoContext.class,0);
		}
		public ExpressaoAritmetica2Context expressaoAritmetica2() {
			return getRuleContext(ExpressaoAritmetica2Context.class,0);
		}
		public ExpressaoAritmeticaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressaoAritmetica; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GyhLangListener ) ((GyhLangListener)listener).enterExpressaoAritmetica(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GyhLangListener ) ((GyhLangListener)listener).exitExpressaoAritmetica(this);
		}
	}

	public final ExpressaoAritmeticaContext expressaoAritmetica() throws RecognitionException {
		ExpressaoAritmeticaContext _localctx = new ExpressaoAritmeticaContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_expressaoAritmetica);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(124);
			termoAritmetico();
			setState(125);
			expressaoAritmetica2();
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

	public static class ExpressaoAritmetica2Context extends ParserRuleContext {
		public TerminalNode OpAritSoma() { return getToken(GyhLangParser.OpAritSoma, 0); }
		public TermoAritmeticoContext termoAritmetico() {
			return getRuleContext(TermoAritmeticoContext.class,0);
		}
		public ExpressaoAritmetica2Context expressaoAritmetica2() {
			return getRuleContext(ExpressaoAritmetica2Context.class,0);
		}
		public TerminalNode OpAritSub() { return getToken(GyhLangParser.OpAritSub, 0); }
		public ExpressaoAritmetica2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressaoAritmetica2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GyhLangListener ) ((GyhLangListener)listener).enterExpressaoAritmetica2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GyhLangListener ) ((GyhLangListener)listener).exitExpressaoAritmetica2(this);
		}
	}

	public final ExpressaoAritmetica2Context expressaoAritmetica2() throws RecognitionException {
		ExpressaoAritmetica2Context _localctx = new ExpressaoAritmetica2Context(_ctx, getState());
		enterRule(_localctx, 28, RULE_expressaoAritmetica2);
		try {
			setState(138);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OpAritSoma:
				enterOuterAlt(_localctx, 1);
				{
				setState(127);
				match(OpAritSoma);
				_expContent += " + ";
				setState(129);
				termoAritmetico();
				setState(130);
				expressaoAritmetica2();
				}
				break;
			case OpAritSub:
				enterOuterAlt(_localctx, 2);
				{
				setState(132);
				match(OpAritSub);
				_expContent += " - ";
				setState(134);
				termoAritmetico();
				setState(135);
				expressaoAritmetica2();
				}
				break;
			case EOF:
			case PCLer:
			case PCImprimir:
			case PCSe:
			case PCEntao:
			case PCSenao:
			case PCEnqto:
			case PCIni:
			case PCFim:
			case OpRel:
			case OpBool:
			case AbrePar:
			case FechaPar:
			case Var:
			case NumInt:
			case NumReal:
				enterOuterAlt(_localctx, 3);
				{
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

	public static class TermoAritmeticoContext extends ParserRuleContext {
		public FatorAritmeticoContext fatorAritmetico() {
			return getRuleContext(FatorAritmeticoContext.class,0);
		}
		public TermoAritmetico2Context termoAritmetico2() {
			return getRuleContext(TermoAritmetico2Context.class,0);
		}
		public TermoAritmeticoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_termoAritmetico; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GyhLangListener ) ((GyhLangListener)listener).enterTermoAritmetico(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GyhLangListener ) ((GyhLangListener)listener).exitTermoAritmetico(this);
		}
	}

	public final TermoAritmeticoContext termoAritmetico() throws RecognitionException {
		TermoAritmeticoContext _localctx = new TermoAritmeticoContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_termoAritmetico);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
			fatorAritmetico();
			setState(141);
			termoAritmetico2();
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

	public static class TermoAritmetico2Context extends ParserRuleContext {
		public TerminalNode OpAritMult() { return getToken(GyhLangParser.OpAritMult, 0); }
		public FatorAritmeticoContext fatorAritmetico() {
			return getRuleContext(FatorAritmeticoContext.class,0);
		}
		public TermoAritmetico2Context termoAritmetico2() {
			return getRuleContext(TermoAritmetico2Context.class,0);
		}
		public TerminalNode OpAritDiv() { return getToken(GyhLangParser.OpAritDiv, 0); }
		public TermoAritmetico2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_termoAritmetico2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GyhLangListener ) ((GyhLangListener)listener).enterTermoAritmetico2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GyhLangListener ) ((GyhLangListener)listener).exitTermoAritmetico2(this);
		}
	}

	public final TermoAritmetico2Context termoAritmetico2() throws RecognitionException {
		TermoAritmetico2Context _localctx = new TermoAritmetico2Context(_ctx, getState());
		enterRule(_localctx, 32, RULE_termoAritmetico2);
		try {
			setState(154);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OpAritMult:
				enterOuterAlt(_localctx, 1);
				{
				setState(143);
				match(OpAritMult);
				_expContent += " * ";
				setState(145);
				fatorAritmetico();
				setState(146);
				termoAritmetico2();
				}
				break;
			case OpAritDiv:
				enterOuterAlt(_localctx, 2);
				{
				setState(148);
				match(OpAritDiv);
				_expContent += " / ";
				setState(150);
				fatorAritmetico();
				setState(151);
				termoAritmetico2();
				}
				break;
			case EOF:
			case PCLer:
			case PCImprimir:
			case PCSe:
			case PCEntao:
			case PCSenao:
			case PCEnqto:
			case PCIni:
			case PCFim:
			case OpAritSoma:
			case OpAritSub:
			case OpRel:
			case OpBool:
			case AbrePar:
			case FechaPar:
			case Var:
			case NumInt:
			case NumReal:
				enterOuterAlt(_localctx, 3);
				{
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

	public static class FatorAritmeticoContext extends ParserRuleContext {
		public TerminalNode NumInt() { return getToken(GyhLangParser.NumInt, 0); }
		public TerminalNode NumReal() { return getToken(GyhLangParser.NumReal, 0); }
		public TerminalNode Var() { return getToken(GyhLangParser.Var, 0); }
		public TerminalNode AbrePar() { return getToken(GyhLangParser.AbrePar, 0); }
		public ExpressaoAritmeticaContext expressaoAritmetica() {
			return getRuleContext(ExpressaoAritmeticaContext.class,0);
		}
		public TerminalNode FechaPar() { return getToken(GyhLangParser.FechaPar, 0); }
		public FatorAritmeticoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fatorAritmetico; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GyhLangListener ) ((GyhLangListener)listener).enterFatorAritmetico(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GyhLangListener ) ((GyhLangListener)listener).exitFatorAritmetico(this);
		}
	}

	public final FatorAritmeticoContext fatorAritmetico() throws RecognitionException {
		FatorAritmeticoContext _localctx = new FatorAritmeticoContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_fatorAritmetico);
		try {
			setState(166);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NumInt:
				enterOuterAlt(_localctx, 1);
				{
				setState(156);
				match(NumInt);
				_expContent += _input.LT(-1).getText();
				}
				break;
			case NumReal:
				enterOuterAlt(_localctx, 2);
				{
				setState(158);
				match(NumReal);
				_expContent += _input.LT(-1).getText();
				}
				break;
			case Var:
				enterOuterAlt(_localctx, 3);
				{
				setState(160);
				match(Var);
				_expContent += _input.LT(-1).getText();
				}
				break;
			case AbrePar:
				enterOuterAlt(_localctx, 4);
				{
				setState(162);
				match(AbrePar);
				setState(163);
				expressaoAritmetica();
				setState(164);
				match(FechaPar);
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

	public static class ExpressaoRelacionalContext extends ParserRuleContext {
		public TermoRelacionalContext termoRelacional() {
			return getRuleContext(TermoRelacionalContext.class,0);
		}
		public ExpressaoRelacional2Context expressaoRelacional2() {
			return getRuleContext(ExpressaoRelacional2Context.class,0);
		}
		public ExpressaoRelacionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressaoRelacional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GyhLangListener ) ((GyhLangListener)listener).enterExpressaoRelacional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GyhLangListener ) ((GyhLangListener)listener).exitExpressaoRelacional(this);
		}
	}

	public final ExpressaoRelacionalContext expressaoRelacional() throws RecognitionException {
		ExpressaoRelacionalContext _localctx = new ExpressaoRelacionalContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_expressaoRelacional);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(168);
			termoRelacional();
			setState(169);
			expressaoRelacional2();
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

	public static class ExpressaoRelacional2Context extends ParserRuleContext {
		public TerminalNode OpBool() { return getToken(GyhLangParser.OpBool, 0); }
		public TermoRelacionalContext termoRelacional() {
			return getRuleContext(TermoRelacionalContext.class,0);
		}
		public ExpressaoRelacional2Context expressaoRelacional2() {
			return getRuleContext(ExpressaoRelacional2Context.class,0);
		}
		public ExpressaoRelacional2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressaoRelacional2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GyhLangListener ) ((GyhLangListener)listener).enterExpressaoRelacional2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GyhLangListener ) ((GyhLangListener)listener).exitExpressaoRelacional2(this);
		}
	}

	public final ExpressaoRelacional2Context expressaoRelacional2() throws RecognitionException {
		ExpressaoRelacional2Context _localctx = new ExpressaoRelacional2Context(_ctx, getState());
		enterRule(_localctx, 38, RULE_expressaoRelacional2);
		try {
			setState(179);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OpBool:
				enterOuterAlt(_localctx, 1);
				{
				setState(171);
				match(OpBool);
				_condition += " "; _condition += _input.LT(-1).getText();
				setState(173);
				termoRelacional();
				setState(174);
				expressaoRelacional2();
				}
				break;
			case AbrePar:
			case Var:
			case NumInt:
			case NumReal:
				enterOuterAlt(_localctx, 2);
				{
				setState(176);
				termoRelacional();
				_condition += " "; _condition += _expContent; _expContent = "";
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

	public static class TermoRelacionalContext extends ParserRuleContext {
		public List<ExpressaoAritmeticaContext> expressaoAritmetica() {
			return getRuleContexts(ExpressaoAritmeticaContext.class);
		}
		public ExpressaoAritmeticaContext expressaoAritmetica(int i) {
			return getRuleContext(ExpressaoAritmeticaContext.class,i);
		}
		public TerminalNode OpRel() { return getToken(GyhLangParser.OpRel, 0); }
		public TerminalNode AbrePar() { return getToken(GyhLangParser.AbrePar, 0); }
		public ExpressaoRelacionalContext expressaoRelacional() {
			return getRuleContext(ExpressaoRelacionalContext.class,0);
		}
		public TerminalNode FechaPar() { return getToken(GyhLangParser.FechaPar, 0); }
		public TermoRelacionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_termoRelacional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GyhLangListener ) ((GyhLangListener)listener).enterTermoRelacional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GyhLangListener ) ((GyhLangListener)listener).exitTermoRelacional(this);
		}
	}

	public final TermoRelacionalContext termoRelacional() throws RecognitionException {
		TermoRelacionalContext _localctx = new TermoRelacionalContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_termoRelacional);
		try {
			setState(193);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				_expContent = "";
				setState(182);
				expressaoAritmetica();
				setState(183);
				match(OpRel);
				_condition += " "; _condition += _input.LT(-1).getText();
				setState(185);
				expressaoAritmetica();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(187);
				match(AbrePar);
				_condition = " (";
				setState(189);
				expressaoRelacional();
				setState(190);
				match(FechaPar);
				_condition += ") ";
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3 \u00c6\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\3\3\3\3\3\3\4\3\4\5\4;\n\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3"+
		"\6\5\6F\n\6\3\7\3\7\3\7\6\7K\n\7\r\7\16\7L\3\b\3\b\3\b\3\b\3\b\3\b\5\b"+
		"U\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13"+
		"\3\13\5\13g\n\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\fs\n\f\3\f"+
		"\3\f\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u008d\n\20\3\21\3\21\3\21"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u009d\n\22"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u00a9\n\23\3\24"+
		"\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u00b6\n\25\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\5\26\u00c4\n\26"+
		"\3\26\2\2\27\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*\2\2\2\u00c3"+
		"\2,\3\2\2\2\4\65\3\2\2\2\6:\3\2\2\2\b<\3\2\2\2\nE\3\2\2\2\fJ\3\2\2\2\16"+
		"T\3\2\2\2\20V\3\2\2\2\22]\3\2\2\2\24f\3\2\2\2\26h\3\2\2\2\30v\3\2\2\2"+
		"\32z\3\2\2\2\34~\3\2\2\2\36\u008c\3\2\2\2 \u008e\3\2\2\2\"\u009c\3\2\2"+
		"\2$\u00a8\3\2\2\2&\u00aa\3\2\2\2(\u00b5\3\2\2\2*\u00c3\3\2\2\2,-\7\26"+
		"\2\2-.\7\3\2\2./\5\4\3\2/\60\7\26\2\2\60\61\7\6\2\2\61\62\5\f\7\2\62\63"+
		"\7\2\2\3\63\64\b\2\1\2\64\3\3\2\2\2\65\66\5\b\5\2\66\67\5\6\4\2\67\5\3"+
		"\2\2\28;\5\4\3\29;\3\2\2\2:8\3\2\2\2:9\3\2\2\2;\7\3\2\2\2<=\7\33\2\2="+
		">\7\26\2\2>?\5\n\6\2?@\b\5\1\2@\t\3\2\2\2AB\7\4\2\2BF\b\6\1\2CD\7\5\2"+
		"\2DF\b\6\1\2EA\3\2\2\2EC\3\2\2\2F\13\3\2\2\2GH\5\16\b\2HI\b\7\1\2IK\3"+
		"\2\2\2JG\3\2\2\2KL\3\2\2\2LJ\3\2\2\2LM\3\2\2\2M\r\3\2\2\2NU\5\20\t\2O"+
		"U\5\22\n\2PU\5\24\13\2QU\5\26\f\2RU\5\30\r\2SU\5\32\16\2TN\3\2\2\2TO\3"+
		"\2\2\2TP\3\2\2\2TQ\3\2\2\2TR\3\2\2\2TS\3\2\2\2U\17\3\2\2\2VW\7\33\2\2"+
		"WX\b\t\1\2XY\7\27\2\2YZ\b\t\1\2Z[\5\34\17\2[\\\b\t\1\2\\\21\3\2\2\2]^"+
		"\7\7\2\2^_\7\33\2\2_`\b\n\1\2`\23\3\2\2\2ab\7\b\2\2bc\7\33\2\2cg\b\13"+
		"\1\2de\7\b\2\2eg\7\36\2\2fa\3\2\2\2fd\3\2\2\2g\25\3\2\2\2hi\7\t\2\2ij"+
		"\b\f\1\2jk\5&\24\2kl\7\n\2\2lm\5\16\b\2mr\b\f\1\2no\7\13\2\2op\5\16\b"+
		"\2pq\b\f\1\2qs\3\2\2\2rn\3\2\2\2rs\3\2\2\2st\3\2\2\2tu\b\f\1\2u\27\3\2"+
		"\2\2vw\7\f\2\2wx\5&\24\2xy\5\16\b\2y\31\3\2\2\2z{\7\r\2\2{|\5\f\7\2|}"+
		"\7\16\2\2}\33\3\2\2\2~\177\5 \21\2\177\u0080\5\36\20\2\u0080\35\3\2\2"+
		"\2\u0081\u0082\7\20\2\2\u0082\u0083\b\20\1\2\u0083\u0084\5 \21\2\u0084"+
		"\u0085\5\36\20\2\u0085\u008d\3\2\2\2\u0086\u0087\7\21\2\2\u0087\u0088"+
		"\b\20\1\2\u0088\u0089\5 \21\2\u0089\u008a\5\36\20\2\u008a\u008d\3\2\2"+
		"\2\u008b\u008d\3\2\2\2\u008c\u0081\3\2\2\2\u008c\u0086\3\2\2\2\u008c\u008b"+
		"\3\2\2\2\u008d\37\3\2\2\2\u008e\u008f\5$\23\2\u008f\u0090\5\"\22\2\u0090"+
		"!\3\2\2\2\u0091\u0092\7\22\2\2\u0092\u0093\b\22\1\2\u0093\u0094\5$\23"+
		"\2\u0094\u0095\5\"\22\2\u0095\u009d\3\2\2\2\u0096\u0097\7\23\2\2\u0097"+
		"\u0098\b\22\1\2\u0098\u0099\5$\23\2\u0099\u009a\5\"\22\2\u009a\u009d\3"+
		"\2\2\2\u009b\u009d\3\2\2\2\u009c\u0091\3\2\2\2\u009c\u0096\3\2\2\2\u009c"+
		"\u009b\3\2\2\2\u009d#\3\2\2\2\u009e\u009f\7\34\2\2\u009f\u00a9\b\23\1"+
		"\2\u00a0\u00a1\7\35\2\2\u00a1\u00a9\b\23\1\2\u00a2\u00a3\7\33\2\2\u00a3"+
		"\u00a9\b\23\1\2\u00a4\u00a5\7\31\2\2\u00a5\u00a6\5\34\17\2\u00a6\u00a7"+
		"\7\32\2\2\u00a7\u00a9\3\2\2\2\u00a8\u009e\3\2\2\2\u00a8\u00a0\3\2\2\2"+
		"\u00a8\u00a2\3\2\2\2\u00a8\u00a4\3\2\2\2\u00a9%\3\2\2\2\u00aa\u00ab\5"+
		"*\26\2\u00ab\u00ac\5(\25\2\u00ac\'\3\2\2\2\u00ad\u00ae\7\25\2\2\u00ae"+
		"\u00af\b\25\1\2\u00af\u00b0\5*\26\2\u00b0\u00b1\5(\25\2\u00b1\u00b6\3"+
		"\2\2\2\u00b2\u00b3\5*\26\2\u00b3\u00b4\b\25\1\2\u00b4\u00b6\3\2\2\2\u00b5"+
		"\u00ad\3\2\2\2\u00b5\u00b2\3\2\2\2\u00b6)\3\2\2\2\u00b7\u00b8\b\26\1\2"+
		"\u00b8\u00b9\5\34\17\2\u00b9\u00ba\7\24\2\2\u00ba\u00bb\b\26\1\2\u00bb"+
		"\u00bc\5\34\17\2\u00bc\u00c4\3\2\2\2\u00bd\u00be\7\31\2\2\u00be\u00bf"+
		"\b\26\1\2\u00bf\u00c0\5&\24\2\u00c0\u00c1\7\32\2\2\u00c1\u00c2\b\26\1"+
		"\2\u00c2\u00c4\3\2\2\2\u00c3\u00b7\3\2\2\2\u00c3\u00bd\3\2\2\2\u00c4+"+
		"\3\2\2\2\r:ELTfr\u008c\u009c\u00a8\u00b5\u00c3";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}