
public class CommandEscrita extends Command{
	private String id;

	@Override
	public String generateCode() {
		return "printf(\"%d \"," + id + ");\n";
	}
	
	public CommandEscrita(String id) {
		this.id = id;
		
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

}