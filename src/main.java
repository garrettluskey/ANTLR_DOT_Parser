import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.charset.*;
import java.io.IOException;
import DOTLexer;
import DOTParser;
public class main {
	public static void main(String[] args) {
        // Prints "Hello, World" to the terminal window.
        System.out.println("Hello, World");
        String content = readFile("test.txt", StandardCharsets.UTF_8);
        DOTLexer l = new DOTLexer(content)
        DOTParser p = new DOTParser(l.getTokenNames())
        System.out.println("Hello, World");
    }
	static String readFile(String path, Charset encoding) 
			  throws IOException 
			{
			  byte[] encoded = Files.readAllBytes(Paths.get(path));
			  return new String(encoded, encoding);
			}
}
