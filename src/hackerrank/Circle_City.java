package hackerrank;

import java.util.Scanner;

public class Circle_City {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for (int i = 0; i < t; i++) {
			findCircleLatticePoints(in.nextInt(), in.nextInt(),i);
		}
	}

	private static void findCircleLatticePoints(int d, int k,int h) {
		int count = 0;
		for (int i = 0; i < Math.ceil(Math.sqrt(d)); i++) {
			int j =  (int) Math.ceil(Math.sqrt(d-(i*i)));
				if (((i * i) + (j * j)) == d) {
					count++;
				}
		}
		if (count * 4 <= k) {
			System.out.println("possible");
		} else {
			System.out.println("impossible");
		}
	}
}