package hackerrank;

import java.util.Scanner;

public class IsFibo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int noOfTC = scan.nextInt();
		for (int i = 0; i < noOfTC; i++) {
			long num = scan.nextLong();
			double firstPart = (num * num * 5) - 4;
			double secPart = (num * num * 5) + 4;
			if (isPerfectSquare(firstPart) || isPerfectSquare(secPart)) {
				System.out.println("IsFibo");
			} else {
				System.out.println("IsNotFibo");
			}

		}

	}

	static boolean isPerfectSquare(double x) {
		System.out.println(x);
		double s = Math.sqrt(x);
		return (s * s == x);
	}

}
