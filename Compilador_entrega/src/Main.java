/* 
 * Murilo Fontana Muniz - 2478498
 * Rafael Ribas de Lima - 2461650
 * Vinicius Silvino - 2461684
 * 
 * 	PARTE 1: https://youtu.be/GDABMATn_QU?si=ImJyrvxefVHLCfih
	PARTE 2: https://youtu.be/5SrJnsLAhGM?si=SOSAdpzdv_GtQNiI
 * 
 */


import java.io.IOException;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Token;
import org.antlr.runtime.RecognitionException;



public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			CharStream cs = CharStreams.fromFileName("programa1.gyh");
			GyhLangLexer lexer = new GyhLangLexer(cs);
			CommonTokenStream token = new CommonTokenStream(lexer);
			
			GyhLangParser parser = new GyhLangParser(token);
			System.out.println("Compilação Lexico OK!");		
			
			
			
			parser.programa();
			parser.generateCommand();
			
			
		} catch (IOException e) {
		    System.err.println("Erro ao ler o arquivo: " + e.getMessage());
		} catch (Exception e) {
		    System.err.println("Erro inesperado: " + e.getMessage());
		}


	}

}