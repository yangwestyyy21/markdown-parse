import static org.junit.Assert.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

import org.junit.*;

public class MarkdownParseTest {
    @Test
    public void addition() {
        assertEquals(2, 1 + 1);
    }
    @Test
    public void mdparsetest1() {
        Path fileName = Path.of("test-file.md");
	    String contents = "";
        try{
            contents=Files.readString(fileName);
        } catch(IOException e){
            e.printStackTrace();
        }

        assertEquals(List.of("https://something.com", "some-page.html")
            , MarkdownParse.getLinks(contents));
    }
    @Test
    public void mdparsetest2() {
        Path fileName2 = Path.of("test-file2.md");
	    String contents = "";
        try{
            contents=Files.readString(fileName2);
        } catch(IOException e){
            e.printStackTrace();
        }

        assertEquals(List.of("https://something.com", "some-page.html"), MarkdownParse.getLinks(contents));
    }
    @Test
    public void mdparsetest3() {
        Path fileName3 = Path.of("test-file3.md");
	    String contents = "";
        try{
            contents=Files.readString(fileName3);
        } catch(IOException e){
            e.printStackTrace();
        }

        assertEquals(new ArrayList<String>(), MarkdownParse.getLinks(contents));
    }
    @Test
    public void mdparsetest4() {
        Path fileName4 = Path.of("test-file4.md");
	    String contents = "";
        try{
            contents=Files.readString(fileName4);
        } catch(IOException e){
            e.printStackTrace();
        }

        assertEquals(new ArrayList<String>(), MarkdownParse.getLinks(contents));
    }
    @Test
    public void mdparsetest5() {
        Path fileName5 = Path.of("test-file5.md");
	    String contents = "";
        try{
            contents=Files.readString(fileName5);
        } catch(IOException e){
            e.printStackTrace();
        }

        assertEquals(List.of("page.com"), MarkdownParse.getLinks(contents));
    }
    @Test
    public void mdparsetest6() {
        Path fileName6 = Path.of("test-file6.md");
	    String contents = "";
        try{
            contents=Files.readString(fileName6);
        } catch(IOException e){
            e.printStackTrace();
        }

        assertEquals(List.of("page.com"), MarkdownParse.getLinks(contents));
    }
    @Test
    public void mdparsetest7() {
        Path fileName7 = Path.of("test-file7.md");
	    String contents = "";
        try{
            contents=Files.readString(fileName7);
        } catch(IOException e){
            e.printStackTrace();
        }

        assertEquals(new ArrayList<String>(), MarkdownParse.getLinks(contents));
    }
    @Test
    public void mdparsetest8() {
        Path fileName8 = Path.of("test-file8.md");
	    String contents = "";
        try{
            contents=Files.readString(fileName8);
        } catch(IOException e){
            e.printStackTrace();
        }

        assertEquals(List.of("a link on the first line"), MarkdownParse.getLinks(contents));
    }
}