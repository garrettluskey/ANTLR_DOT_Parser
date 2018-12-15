import java.io.IOException;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

public class main {
	public static void main(String[] args) {
		test(3);
	}

	public static void test(int numTests) {
		CharStream s;
		

			try {
				String testFileStr = "src\\Prog4_" + numTests + ".in";
				s = CharStreams.fromFileName(testFileStr);
				DOTLexer l = new DOTLexer(s);
				CommonTokenStream cts = new CommonTokenStream(l);
				DOTParser p = new DOTParser(cts);
				SyntaxErrorListener errorListener = new SyntaxErrorListener();
				p.addErrorListener(errorListener);
				ParseTree tree = p.graph(); // parse the content and get the tree

				System.out.print(p.graph().getText());
				//System.out.println(errorListener.getSyntaxErrors().get(0).getMessage());
				
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


