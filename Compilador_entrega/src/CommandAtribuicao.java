
public class CommandAtribuicao extends Command{
	
	private String id;
	private String exp;
	
	public CommandAtribuicao(String id, String exp) {
		this.id = id;
		this.exp = exp;
	}//constructor 

	@Override
	public String generateCode() {		
		return " " + id + " = " + exp + ";\n"; // id = exp;
	}//generateCode

	public String getId() {
		return id;
	}//getId

	public void setId(String id) {
		this.id = id;
	}//setID
	
	public String getExp() {
		return exp;
	}//getExp

	public void setExp(String exp) {
		this.exp = exp;
	}
}