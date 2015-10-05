/**
 * 
 */
package hackerrank;

import java.util.Scanner;
import  java.lang.Math;

public class virus {
	
//		public static void main(String[] args) {
//			Scanner scan = new Scanner(System.in);
//			scan.nextLine();
//			String[] inputs = scan.nextLine().split("#");
//			
//			int tempMax = 0;int tempMin = 0;
//			int presMax = 0;int presMin = 0;
//			String infected = "";
//			if(inputs[0] != null){
//				String[] categorizedData = inputs[0].split(",");
//				for (int i = 0; i < categorizedData.length; i++) {
//					String[] singluarData = categorizedData[0].split("");
//					for (int j = 0; j < singluarData.length; j++) {
//						if(tempMax > Integer.parseInt(singluarData[0]))
//						tempMax = Integer.parseInt(singluarData[0]);
//						presMax = Integer.parseInt(singluarData[1]);
//						infected = singluarData[2];
//					}
//				}
//			}
//		}
		
		public static void main(String[] args) {
			int a = 0, b = a++;
			System.out.println(b);
			System.out.println(a);
			int c = --a;
			System.out.println(c);
			System.out.println(a);
			if (a > 0) {
				b++;
			++b;}
			else
				c++;
			if (c == 0 && b < 0) a++;
	 		else if (c > 0)
				c--;
			else
				b++;
			System.out.println(a * b + c);
		}

}
