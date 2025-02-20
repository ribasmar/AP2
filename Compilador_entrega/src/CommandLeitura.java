
public class CommandLeitura extends Command{
	private String id;
	
	public CommandLeitura(String id) {
		this.id = id;
	}
	
	public String generateCode() {
		return "scanf(\"%d\", &" + id + ");\n";
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

}