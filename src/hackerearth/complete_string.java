package hackerearth;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class complete_string {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int noOFTC = scan.nextInt();
		for (int i = 0; i < noOFTC; i++) {
			int sum = 0;
			String pangram = scan.next();
			Set<Character> alphaSet = new HashSet<Character>();
			char[] pangramArr = pangram.toCharArray();
			for (int j = 0; j < pangramArr.length; j++) {
				alphaSet.add(pangramArr[j]);
			}
			if(alphaSet.size()==26){
				System.out.println("yes");
			}else{
				System.out.println("no");
			}
//			for (Character c : alphaSet) {
//				sum = sum + CharToASCII(c);
//			}
//			System.out.println(sum);
//			if(sum == 2847){
//				System.out.println("yes");
//			}else{
//				System.out.println("no");
//			}
		}
		
	}
	public static int CharToASCII(final char character){
		return (int)character;
	}
	
	
}
