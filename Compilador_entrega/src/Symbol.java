

public class Symbol {
	private String name;
	private int type;
	private String value;
	
	public static final int REAL = 1;
	public static final int INT = 0;
	
	public Symbol (String name, int type, String value) {
		this.name = name;
		this.type = type;
		this.value = value;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
	    if (this.type == 1)
	        return "REAL";
	    else
	        return "INT";
	}


	public void setType(int type) {
		this.type = type;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
	
	@Override
	public String toString() {
		
		return "GyhSymbol [name=" + this.name + ", type=" + type + ", value=" + value + "]";

	}
	
	public String generateCode() {
		
	    if (this.type == REAL) {
	        return "  double " + this.name + " = 0.0;\n";
	    } else {
	        return "  int " + this.name + " = 0;\n";
	    }
	}

	
	
}