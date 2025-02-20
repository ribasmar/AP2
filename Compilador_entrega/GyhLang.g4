grammar GyhLang;

@header {
    import java.util.ArrayList;
}

@members {
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
}

// ========================== REGRAS LÉXICAS ==========================

PCDec: 'DEC';
PCInt: 'INT';
PCReal: 'REAL';
PCProg: 'PROG';
PCLer: 'LER';
PCImprimir: 'IMPRIMIR';
PCSe: 'SE';
PCEntao: 'ENTAO';
PCSenao: 'SENAO';
PCEnqto: 'ENQTO';
PCIni: 'INI';
PCFim: 'FIM';

OpArit: '+' | '-' | '*' | '/';
OpAritSoma: '+';
OpAritSub: '-';
OpAritMult: '*';
OpAritDiv: '/';

OpRel: '<' | '>' | '<=' | '>=' | '==' | '!=';

OpBool: 'E' | 'OU';

Delim: ':';
Atrib: ':=';

Par: '(' | ')';
AbrePar: '(';
FechaPar: ')';

Var: [a-z] ([0-9] | [A-Z] | [a-z])*;

NumInt: [0-9]+;
NumReal: [0-9]+ '.' [0-9]+;

Cadeia: '"' .*? '"';

Coment: '#' ~[\r\n]* -> skip; // Comentário inicia com # e vai até o final da linha
WS: [ \t\r\n]+ -> skip; // Ignora espaços em branco

// ========================== REGRAS SINTÁTICAS ==========================

programa: Delim PCDec listaDeclaracoes Delim PCProg listaComandos EOF {
    System.out.println("Programa ---> VarTable");
    program.setVarTable(symbolTable);
    program.setCommand(listCmd);
};

listaDeclaracoes: declaracao listaDeclaracoes2;

listaDeclaracoes2: listaDeclaracoes | ;

declaracao: Var Delim tipoVar {
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
};

tipoVar: PCInt {_varType = 0;} | PCReal {_varType = 1;};

listaComandos: (comando { listCmd.addAll(listAux); listAux.clear(); })+;

comando: comandoAtribuicao
    | comandoEntrada
    | comandoSaida
    | comandoCondicao
    | comandoRepeticao
    | subAlgoritmo;

comandoAtribuicao: Var {
    verificarVar(_input.LT(-1).getText());
    _expVar = _input.LT(-1).getText();
}
Atrib {_expContent = "";} expressaoAritmetica {
    CommandAtribuicao cmd = new CommandAtribuicao(_expVar, _expContent);
    listAux.add(cmd);
};

comandoEntrada: PCLer Var {
    _readVar = _input.LT(-1).getText();
    CommandLeitura cmd = new CommandLeitura(_readVar);
    listCmd.add(cmd);
    System.out.println(cmd.toString());
};

comandoSaida: PCImprimir Var {
    verificarVar(_input.LT(-1).getText());
    _writeVar = _input.LT(-1).getText();
    CommandEscrita cmd = new CommandEscrita(_writeVar);
    listCmd.add(cmd);
    System.out.println(cmd.toString());
}
| PCImprimir Cadeia;

comandoCondicao: PCSe {_condition = "";} expressaoRelacional PCEntao comando {
    _condTrue.addAll(listAux);
    listAux.clear();
}
(PCSenao comando {
    _condFalse.addAll(listAux);
    listAux.clear();
})?
{
    CommandCondicao cmd = new CommandCondicao(_condition, _condTrue, _condFalse);
    listAux.add(cmd);
};

comandoRepeticao: PCEnqto expressaoRelacional comando;

subAlgoritmo: PCIni listaComandos PCFim;

expressaoAritmetica: termoAritmetico expressaoAritmetica2;

expressaoAritmetica2: OpAritSoma {_expContent += " + ";} termoAritmetico expressaoAritmetica2
    | OpAritSub {_expContent += " - ";} termoAritmetico expressaoAritmetica2
    | ;

termoAritmetico: fatorAritmetico termoAritmetico2;

termoAritmetico2: OpAritMult {_expContent += " * ";} fatorAritmetico termoAritmetico2
    | OpAritDiv {_expContent += " / ";} fatorAritmetico termoAritmetico2
    | ;

fatorAritmetico: NumInt {_expContent += _input.LT(-1).getText();}
    | NumReal {_expContent += _input.LT(-1).getText();}
    | Var {_expContent += _input.LT(-1).getText();}
    | AbrePar expressaoAritmetica FechaPar;

expressaoRelacional: termoRelacional expressaoRelacional2;

expressaoRelacional2: OpBool {_condition += " "; _condition += _input.LT(-1).getText();} termoRelacional expressaoRelacional2
    | termoRelacional {_condition += " "; _condition += _expContent; _expContent = "";}
    ;

termoRelacional: {_expContent = "";} expressaoAritmetica OpRel {_condition += " "; _condition += _input.LT(-1).getText();} expressaoAritmetica
    | AbrePar {_condition = " (";} expressaoRelacional FechaPar {_condition += ") ";};

