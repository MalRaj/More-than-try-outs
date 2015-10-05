package hackerrank_java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Looping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		Scanner scan = new Scanner(System.in);
		String strin = scan.nextLine();
		int len = scan.nextInt();
		List<String> strList = new ArrayList<String>();
		for (int i = 0; i+len <= strin.length(); i++) {
			strList.add(strin.substring(i, i+len));
		}
		 String small = "";
		    String large = "";
		    Collections.sort(strList);
		   
		for (String lexicalStr : strList) {
			System.out.println(lexicalStr);
//			char[] lexicalArr = lexicalStr.toCharArray();
//			int smallestValue = 0;
//			int largestValue = 0;
//		   
//			int value = lexicalArr[0] - lexicalArr[lexicalArr.length-1];
//			if(value < smallestValue){
//				smallestValue = value;
//				small = lexicalStr;
//			}else if(value > largestValue){
//				largestValue = value;
//				large = lexicalStr;
//			}
		}
//		System.out.println(small+" "+large);
	}
//	public static int CharToASCII(final char character){
//		return (int)character;
//	}
	
}
