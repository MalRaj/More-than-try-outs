package hackerrank;

import java.util.Scanner;

public class HaloweenParty {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int noOfTC = scan.nextInt();
		
		for (int i = 0; i < noOfTC; i++) {
			long prevPieces = 0;
			long noOfCuts = scan.nextLong();
			for (long j = noOfCuts; j > 0; --j) {
				long maxPieces = (noOfCuts - j) * j;
				if(maxPieces > prevPieces){
					prevPieces = maxPieces;
				}
			}
			System.out.println(prevPieces);
		}
		 
	}

	
}
