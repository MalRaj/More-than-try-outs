package hackerrank;

import java.util.Scanner;

public class FunnyString {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int noOfTC = in.nextInt();
		for (int i = 0; i < noOfTC; i++) {
			String input = in.next();
			String reverse = new StringBuilder(input).reverse().toString();
			boolean funny = true;
			for (int j = 0; j < input.length(); j++) {
				if ((j + 1) < input.length()
						&& (Math.abs(input.charAt(j) - input.charAt(j + 1)) != Math
								.abs(reverse.charAt(j) - reverse.charAt(j + 1)))) {
					funny = false;
					break;
				}
			}
			if (funny)
				System.out.println("Funny");
			else
				System.out.println("Not Funny");

		}
	}
}
