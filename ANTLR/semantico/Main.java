
import java.io.IOException;
import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CommonTokenStream;

public class Main {
	private static final String EXTENSION = "${fileExtension}";
	public static void main(String[] args) throws IOException {
		String program = args.length > 1 ? args[1] : "test/test." + EXTENSION;
		System.out.println("Interpreting file " + program);
		PracticaLexer lexer = new PracticaLexer(new ANTLRFileStream(program));
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		PracticaParser parser = new PracticaParser(tokens);
		PracticaParser.StartContext tree = parser.start();
		PracticaCustomVisitor visitor = new $PracticaCustomVisitor();
		visitor.visit(tree);
		System.out.println("Analisis Finalizado.");
	}
}
