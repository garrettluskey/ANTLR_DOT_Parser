import java.io.IOException;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

public class main {
	public static void main(String[] args) {
		CharStream s;
		try {
			s = CharStreams.fromFileName("src\\test.txt");
			DOTLexer l = new DOTLexer(s);
			CommonTokenStream cts = new CommonTokenStream(l);
			DOTParser p = new DOTParser(cts);
			ParseTree tree = p.graph(); // parse the content and get the tree
			
			System.out.print(p.graph().getText());

			Beautifier listener = new Beautifier();
			ParsePrinter parsePrinter = new ParsePrinter();
			ParseTreeWalker walker = new ParseTreeWalker();
			walker.walk(parsePrinter, tree);
			System.out.println("\n");
			walker.walk(listener, tree);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
