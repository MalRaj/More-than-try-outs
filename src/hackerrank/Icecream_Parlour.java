package hackerrank;

import java.util.Scanner;

public class Icecream_Parlour {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int noOFTC = scan.nextInt();
		for (int i = 0; i < noOFTC; i++) {
			int price = scan.nextInt();
			int flavours = scan.nextInt();
			int[] flavoursArr = new int[flavours];
			for (int j = 0; j < flavours; j++) {
				flavoursArr[j] = scan.nextInt();
			}
			boolean ifPresent = false;
			for (int k = 0; k < flavoursArr.length; k++) {
				int diff = price - flavoursArr[k];
				for (int j = k + 1; j < flavours; j++) {
					if (diff == flavoursArr[j]) {
						ifPresent = true;
						System.out.println((k + 1) + " " + (j + 1));
						break;
					}
				}
				if (ifPresent) {
					break;
				}
			}

		}

	}

}
