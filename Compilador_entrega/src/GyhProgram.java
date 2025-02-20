import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class GyhProgram 
{
	private SymbolTable varTable; //<String, Symbol>
	private ArrayList<Command> command;
	
	public ArrayList<Command> getCommand() {
		return command;
	}

	public void setCommand(ArrayList<Command> command) {
		this.command = command;
	}

	public SymbolTable getVarTable() {
		return varTable;
	}

	public void setVarTable(SymbolTable varTable) {
		this.varTable = varTable;
	}

	public void generateTarget() {
		StringBuilder str = new StringBuilder();
		
		str.append("#include <stdio.h>\n");
		str.append("#include <stdlib.h>\n");
		str.append("#include <stdbool.h>\n");
		str.append("#include <string.h>");
		str.append("\n\nint main(void){\n");
		
		for(Symbol symbol: varTable.getAll()) {
			str.append(symbol.generateCode());
		}
		
		for(Command cmd:command) {
			str.append(cmd.generateCode());
		}
			
			
			
		str.append("\n\nreturn 0;\n");
		str.append("}\n");

		FileWriter file;
		try {
			file = new FileWriter(new File("programaGyh.c"));
			file.write(str.toString());
			file.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
