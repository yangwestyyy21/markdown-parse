import static org.junit.Assert.*;


import org.junit.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;

public class MarkdownParseTest {

    @Test
    public void parse() throws IOException {
        ArrayList<String>[] list = new ArrayList[3];
        list[0] = new ArrayList();
        list[1] = new ArrayList();
        list[2] = new ArrayList();
        list[0].add("[`google.com]");
        list[1].add("[a.com, a.com(()), example.com]");
        list[2].add("[https://ucsd-cse15l-w22.github.io/]");

        for (int i = 0; i < 3; i++) {
            String file = load("snippet" + (i + 1) + ".md");
            assertEquals(list[i], MarkdownParse.getLinks(file));
        }
    }

    private String load(String words) throws IOException {
		Path fileName = Path.of(words);
	    String contents = Files.readString(fileName);
        return contents;
    }
}