package hackerrank;

import java.util.Scanner;

public class TwoStrings {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int noOFTC = in.nextInt();
		for (int i = 0; i < noOFTC; i++) {
			String a = in.next();
			String b = in.next();
			String flag = "NO";
			for(char c : "abcdefghijklmnopqrstuvwxyz".toCharArray())
			{
		        if(a.indexOf(c) > -1 && b.indexOf(c) > -1)
		        flag = "YES";
			}
			System.out.println(flag);
		}
	}
//	public static void main(String[] args) {
//		Scanner in = new Scanner(System.in);
//		int noOFTC = in.nextInt();
//		for (int i = 0; i < noOFTC; i++) {
//			String a = in.next();
//			char[] aArr = a.toCharArray();
//			String b = in.next();
//			char[] bArr = b.toCharArray();
//			boolean present = false;
//			for (char aa : aArr) {
//				for (char bb : bArr) {
//					if (aa == bb) {
//						present = true;
//						break;
//					}
//				}
//				if (present) {
//					System.out.println("YES");
//					break;
//				}
//			}
//			if (!present) {
//				System.out.println("NO");
//			}
//		}
//	}
}
