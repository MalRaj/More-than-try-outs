package hackerrank;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Common_Child {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String first = in.next();
		String second = in.next();
		System.out.println(commonChild(first,second));
	}

	private static int commonChild(String first,String second) {
		List<String> subStringoFSmallerString  = new ArrayList<String>();
		int stringLen = 0;
		if(first.length() > second.length()){
			subStringoFSmallerString = listOfSubStrings(second);
			stringLen = findCommonChildren(subStringoFSmallerString, first,second.length());
		}else{
			subStringoFSmallerString = listOfSubStrings(first);
			stringLen = findCommonChildren(subStringoFSmallerString, second,first.length());
		}
		return stringLen;
	}

	private static List<String> listOfSubStrings(String str){
		String copy = str;
		List<String> subSingleStrings = new ArrayList<String>();;
		List<String> subStrings = new ArrayList<String>();;
		int len = str.length();
		for (int i = 0; i < len; i++) {
			String newStr = str.substring(i,i+1);
			System.out.println(newStr);
			subSingleStrings.add(newStr);
		}
		
		for (int i = 0; i < len; i++) {
			subStrings.add(subSingleStrings.get(i)+subSingleStrings.get(i+1));
		}
		
		//System.out.println(subStrings.toString());
		return subStrings;
	}
	
	private static int findCommonChildren(List<String> subStringoFSmallerString,String str,int maxLen){
		List<String> subStrings = new ArrayList<String>();;
		Collections.sort(subStringoFSmallerString);
		for (String subString : subStringoFSmallerString) {
			if(str.contains(subString)){
				subStrings.add(subString);
			}
		}
		Collections.sort(subStrings);
		System.out.println(subStrings.toString());
		return subStrings.get(0).length();
	}
	
}
