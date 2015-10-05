package hackerrank;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class panagram {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		Scanner scan = new Scanner(System.in);
		String pangram = scan.nextLine();
		Set<Character> alphaSet = new HashSet<Character>();
		char[] pangramArr = pangram.replaceAll("\\s","").toLowerCase().toCharArray();
		for (int i = 0; i < pangramArr.length; i++) {
			alphaSet.add(pangramArr[i]);
		}
		for (Character c : alphaSet) {
			sum = sum + CharToASCII(c);
		}
		if(sum == 2847){
			System.out.println("pangram");
		}else{
			System.out.println("not pangram");
		}
	}
	public static int CharToASCII(final char character){
		return (int)character;
	}
	
}

