package hackerrank;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SplitIntoSentences {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //String paragraph = in.next();
        List<String> sentences = new ArrayList<String>();
       
        String paragraph =  "This is how I tried to split a paragraph into a sentence.But, Dr. Meme there is a problem..!... My paragraph includes dates like Jan.13, 2014 , words like U.S and numbers like 2.2. They all got splitted by the above code.";
       /* Pattern re = Pattern.compile("(?<=[.?!])\\s+(?=[a-zA-Z])");       		//Pattern.compile("[^.!?\\s][^.!?]*(?:[.!?](?!['\"]?\\s|$)[^.!?]*)*[.!?]?['\"]?(?=\\s|$)", Pattern.MULTILINE | Pattern.COMMENTS);
        Matcher reMatcher = re.matcher(paragraph);
        while (reMatcher.find()) {
        	//sentences.add(reMatcher.group());
        	System.out.println(reMatcher.group());
        }*/
        
        String[] xx = paragraph.split("(?<=[.?!])\\s+(?=[a-zA-Z])");
        for (String x : xx) {
        	System.out.println(x);
		}
        
        
    }
}
