import static org.junit.Assert.*;

import java.io.IOException;
import java.nio.file.Files;

import org.junit.*;

public class MarkdownParseTest {
    @Test
    public void addition() {
        assertEquals(2, 1 + 1);
    }
    public void mdparsetest1() {
        Path fileName = Path.of("test-file.md");
	    String contents = "";
        try{
            contents=Files.readString(fileName);
        } catch(IOException e){
            e.printStackTrace();
        }

        assertEquals(List.of("https://something.com", "some-page.html"), MarkdownParse.getLinks(contents));
    }
    public void mdparsetest2() {
        Path fileName = Path.of("test-file.md");
	    String contents = "";
        try{
            contents=Files.readString(fileName);
        } catch(IOException e){
            e.printStackTrace();
        }

        assertEquals(List.of("https://something.com", "some-page.html"), MarkdownParse.getLinks(fileName));
    }
    public void mdparsetest3() {
        Path fileName = Path.of("test-file.md");
	    String contents = "";
        try{
            contents=Files.readString(fileName);
        } catch(IOException e){
            e.printStackTrace();
        }

        assertEquals(List.of("https://something.com", "some-page.html"), MarkdownParse.getLinks(fileName));
    }
    public void mdparsetest4() {
        Path fileName = Path.of("test-file.md");
	    String contents = "";
        try{
            contents=Files.readString(fileName);
        } catch(IOException e){
            e.printStackTrace();
        }

        assertEquals(List.of("https://something.com", "some-page.html"), MarkdownParse.getLinks(fileName));
    }
    public void mdparsetest5() {
        Path fileName = Path.of("test-file.md");
	    String contents = "";
        try{
            contents=Files.readString(fileName);
        } catch(IOException e){
            e.printStackTrace();
        }

        assertEquals(List.of("https://something.com", "some-page.html"), MarkdownParse.getLinks(fileName));
    }
    public void mdparsetest6() {
        Path fileName = Path.of("test-file.md");
	    String contents = "";
        try{
            contents=Files.readString(fileName);
        } catch(IOException e){
            e.printStackTrace();
        }

        assertEquals(List.of("https://something.com", "some-page.html"), MarkdownParse.getLinks(fileName));
    }
    public void mdparsetest7() {
        Path fileName = Path.of("test-file.md");
	    String contents = "";
        try{
            contents=Files.readString(fileName);
        } catch(IOException e){
            e.printStackTrace();
        }

        assertEquals(List.of("https://something.com", "some-page.html"), MarkdownParse.getLinks(fileName));
    }
    public void mdparsetest8() {
        Path fileName = Path.of("test-file.md");
	    String contents = "";
        try{
            contents=Files.readString(fileName);
        } catch(IOException e){
            e.printStackTrace();
        }

        assertEquals(List.of("https://something.com", "some-page.html"), MarkdownParse.getLinks(fileName));
    }
}