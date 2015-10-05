package internet_samples;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

// The part of the program involving reading from STDIN and writing to STDOUT has been provided by us.

public class Solution {
//	static BufferedReader in = new BufferedReader(new InputStreamReader(
//			System.in));
//	static StringBuilder out = new StringBuilder();
//
//	public static void main(String[] args) throws NumberFormatException,
//			IOException {
//		int numPackets = Integer.parseInt(in.readLine());
//		int numKids = Integer.parseInt(in.readLine());
//		int[] packets = new int[numPackets];
//
//		for (int i = 0; i < numPackets; i++) {
//			packets[i] = Integer.parseInt(in.readLine());
//		}
//
//		int unfairness = Integer.MAX_VALUE;
//		// Write your code here, to process numPackets N, numKids K, and the
//		// packets of candies
//		// Compute the ideal value for unfairness over here
//		int maxValue = 0;
//		int minValue = 0;
//		int tempUnfair = unfairness;
//		Arrays.sort(packets);
//		for (int i = 0; i < packets.length; i++) {
//			System.out.println(i + "fdhfkhsdkfhksdhfsdh "+(numKids-1) + "4653465634856348568346 gfkgdkgkdfgk "+(i + numKids - 1));
//			if ((numKids - 1) >= i) {
//				maxValue = packets[i + numKids - 1];
//				minValue = packets[i];
//				tempUnfair = (maxValue - minValue);
//				if (tempUnfair < unfairness)
//					unfairness = tempUnfair;
//			}
//		}
//
//		System.out.println(unfairness);
//	}
//}


	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int T = scan.nextInt();scan.nextLine();
		System.out.println(T);
		for(int i=0;i<T;i++)
		{
			System.out.println(i);
			String s = scan.nextLine();
			System.out.println(s);
			String[] sArr = s.split(" ");
			int res = -1;
			for (int j = 0; j < sArr.length; j++) {
				if(sArr[0].equals("hackerrank")){
					res = 1;
				}
				if(sArr[sArr.length - 1].equals("hackerrank")){
					res = 2;
				}
				if((sArr[0].equals("hackerrank")) && (sArr[sArr.length - 1].equals("hackerrank"))){
					res = 0;
				}
			}
			System.out.println(res);
			res = -1;
		}
 
	}
}