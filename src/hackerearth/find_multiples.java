package hackerearth;

import java.util.Scanner;

public class find_multiples {

	/**
	 * @param args
	 */
	public static void main(String[] args){Scanner scan = new Scanner(System.in);int n = scan.nextInt();int c = 0;for(int i=0;i<n;i++){c=(scan.nextLong()%3==0)?c+1:c;}System.out.println(c);}}
