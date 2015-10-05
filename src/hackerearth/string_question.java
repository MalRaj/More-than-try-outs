package hackerearth;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class string_question {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<String> indexArr = new ArrayList<String>();
		Scanner scan = new Scanner(System.in);
		String testStr = scan.nextLine();
		char[] testArr = testStr.toCharArray();
		String pattStr = scan.nextLine();
		for (int i = 0; i < testArr.length - 1; i++) {
			String newStr = "";
			for (int j = 0; j < pattStr.length();  j++) {
				if((j+i) <= testArr.length - 1)
				newStr += testArr[j+i];
			}
			if (newStr.equalsIgnoreCase(pattStr)) {
				indexArr.add("Pattern found at index "+i);
			}
		}
		if(indexArr.isEmpty()){
			indexArr.add("Pattern not found");
		}
		for (String c : indexArr) {
			System.out.println(c);
		}
	}
}
