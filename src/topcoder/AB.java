package topcoder;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AB {

	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		String S = scan.next();
		String K = scan.next();
		//System.out.println(createString(K,S));
		createString(K,S);
	}
	public static void createString(String K,String S){
		Pattern pattern = Pattern.compile(K);
		Matcher matcher = pattern.matcher(S);
		 while (matcher.find()) {
		      //System.out.print("Start index: " + matcher.start());
		      //System.out.print(" End index: " + matcher.end() + " ");
		      System.out.println(matcher.group());
		    }
	}
}
