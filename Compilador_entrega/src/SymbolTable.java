import java.util.ArrayList;
import java.util.HashMap;

public class SymbolTable 
{
	private HashMap<String, Symbol> table;
	
	public HashMap<String, Symbol> getTable() {
		return table;
	}

	public void setTable(HashMap<String, Symbol> table) {
		this.table = table;
	}

	public SymbolTable() {
		table = new HashMap<String, Symbol>();
	}

	
	public void add(Symbol symbol) {
		table.put(symbol.getName(), symbol);
	}
	
	public boolean exists(String name) {
	    return table.containsKey(name);
	}

	
	public Symbol get(String symbolName) {
		return table.get(symbolName);
	}
	
	public ArrayList<Symbol> getAll(){
		ArrayList<Symbol> list = new ArrayList<Symbol>();
		for(Symbol symbol: table.values()) {
			list.add(symbol);
		}
		
		return list;
	}	
}