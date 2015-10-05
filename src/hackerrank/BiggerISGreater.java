package hackerrank;

import java.util.Scanner;

public class BiggerISGreater {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int noOfTC = in.nextInt();
        for(int i = 0; i < noOfTC; i++){
        	int totalNumberOfStones = in.nextInt();
            int diffA = in.nextInt();
            for (int j = 1; j < totalNumberOfStones; j++) {
				int[] trailAArr = new int[totalNumberOfStones];
            	trailAArr[0] = 0;
				trailAArr[j] = 0+diffA+trailAArr[j-1];
				
			}
            int diffB = in.nextInt();
            for (int j = 1; j < totalNumberOfStones; j++) {
				int[] trailBArr = new int[totalNumberOfStones];
				trailBArr[0] = 0;
				trailBArr[j] = 0+diffB+trailBArr[j-1];
				
			}
            
        }
    }
}
