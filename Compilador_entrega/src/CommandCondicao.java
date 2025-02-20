
import java.util.ArrayList;

public class CommandCondicao extends Command{
	private String condition;
	private ArrayList<Command> listTrue;
	private ArrayList<Command> listFalse;
	
	public CommandCondicao(String cond, ArrayList<Command> lt, ArrayList<Command> lf) {
		this.condition=cond;
		this.listTrue=lt;
		this.listFalse=lf;
	}
	
	public String generateCode() {
		String str = "if (" +(condition)+") {\n";// if cond()
		for(Command cmd: listTrue) {
			str+=cmd.generateCode();
		}
		str+="}\n";
		
		if(listFalse.size()>0) {
			str+="else{\n";
			for(Command cmd:listFalse) {
				str+=cmd.generateCode();
			}
			str+="}\n";
		}
		return str;
	}
}