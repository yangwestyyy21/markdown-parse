// File reading code from https://howtodoinjava.com/java/io/java-read-file-to-string-examples/
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;

public class MarkdownParse {
    public static ArrayList<String> getLinks(String markdown) {
        ArrayList<String> toReturn = new ArrayList<>();
        // find the next [, then find the ], then find the (, then take up to
        // the next )
        int currentIndex = 0;
        while(currentIndex < markdown.length()) {
            int nextOpenBracket = markdown.indexOf("[", currentIndex);
            int nextCloseBracket = markdown.indexOf("]", nextOpenBracket);
            int openParen = markdown.indexOf("(", nextCloseBracket);
            int followingOpenBracket = markdown.indexOf("[", openParen);

            //check the normal brackets for exceptions
            if(nextOpenBracket<0||nextCloseBracket<0||openParen<0) break;

            //check if it is the last [ to make sure no outofboundsexception
            if(followingOpenBracket<0){
                int closeParen = markdown.indexOf(")", openParen);
                if(closeParen<0){
                    break;
                }                
                toReturn.add(markdown.substring(openParen + 1, closeParen));                
                currentIndex = closeParen + 1;
            }
            else{
                String tmp=markdown.substring(0, followingOpenBracket);
                int closeParen = tmp.indexOf(")", openParen);
                if(closeParen<0){
                    break;
                }                
                toReturn.add(markdown.substring(openParen + 1, closeParen));                
                currentIndex = closeParen + 1;
            }
        }
        return toReturn;
    }
    public static void main(String[] args) throws IOException {
		Path fileName = Path.of(args[0]);
	    String contents = Files.readString(fileName);
        ArrayList<String> links = getLinks(contents);
        System.out.println(links);
    }
}