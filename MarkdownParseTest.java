import static org.junit.Assert.*;
import org.junit.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;

public class MarkdownParseTest {

    @Test
    public void parse1() throws IOException {
        ArrayList<String> list = new ArrayList<String>();
        list.add("`google.com");
        String file = load("snippet1.md");
        assertEquals(list, MarkdownParse.getLinks(file));
    }

    @Test
    public void parse2() throws IOException {
        ArrayList<String> list = new ArrayList<String>();
        list.add("a.com");
        list.add("a.com(())");
        list.add("example.com");
        String file = load("snippet2.md");
        assertEquals(list, MarkdownParse.getLinks(file));
    }

    @Test
    public void parse3() throws IOException {
        ArrayList<String> list = new ArrayList<String>();
        list.add("https://ucsd-cse15l-w22.github.io/");
        String file = load("snippet3.md");
        assertEquals(list, MarkdownParse.getLinks(file));
    }

    private String load(String words) throws IOException {
		Path fileName = Path.of(words);
	    String contents = Files.readString(fileName);
        return contents;
    }
}