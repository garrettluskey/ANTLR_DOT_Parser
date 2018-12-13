import java.nio.file.Files;
import java.nio.file.Paths;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.nio.charset.*;
import java.io.FileInputStream;
import java.io.IOException;
public class main {
	public static void main(String[] args) {
        CharStream s;
		try {
			s = CharStreams.fromFileName("C:\\Users\\My\\eclipse-workspace\\ANTLR_DOT_Parser\\src/test.txt");
			DOTLexer l = new DOTLexer(s);
	        CommonTokenStream cts = new CommonTokenStream(l);
	        DOTParser p = new DOTParser(cts);
	        ParseTree tree = p.graph(); // parse the content and get the tree
	        
	        System.out.print(p.graph().getText());
	        
	        Beautifier listener = new Beautifier();

	        ParseTreeWalker walker = new ParseTreeWalker();
	        walker.walk(listener, tree);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
}
