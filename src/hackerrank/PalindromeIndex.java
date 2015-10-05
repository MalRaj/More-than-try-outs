package hackerrank;

import java.util.Scanner;

public class PalindromeIndex {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for (int i = 0; i < t; i++) {
			String input = in.next();
			System.out.println(palindromePosition(input));
		}
	}

	private static int palindromePosition(String input) {
		int position = -1;
		int len = input.length();
		if (isPalindrome(input))
			return position;
		for (int i = 0; i <= len; ++i) {
			int j = i+1;
			if(input.charAt(i) != input.charAt(len-j))
			if (isPalindrome(deleteCharAt(input, i))) {
				return i;
			}else if(isPalindrome(deleteCharAt(input, len-j))){
				return len-j;
			}
		}
		return position;
	}

	private static String deleteCharAt(String strValue, int index) {
		return strValue.substring(0, index) + strValue.substring(index + 1);
	}

	private static boolean isPalindrome(String str) {
		StringBuilder strBuffer = new StringBuilder(str);
		return str.equalsIgnoreCase(strBuffer.reverse().toString());
	}
	// private static boolean checkPalindrome(String original) {
	// int length = original.length();
	// String reverse = "";
	// for (int i = length - 1; i >= 0; i--)
	// reverse = reverse + original.charAt(i);
	//
	// if (original.equals(reverse))
	// return true;
	//
	// return false;
	// }

}
