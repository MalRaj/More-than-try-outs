package internet_samples;

import java.io.IOException;
import java.util.Scanner;

public class fillingjars {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		Scanner scanner = new Scanner(System.in);
		
		long numJars = scanner.nextInt();
		long numOprns = scanner.nextInt();
		long finalCandies = 0;
		
		for (long i = 0; i < numOprns; i++) {
			
			long startIndex = scanner.nextInt();
			long endIndex = scanner.nextInt();
			long candies = scanner.nextInt();
			
			finalCandies = finalCandies+((endIndex-startIndex+1)*candies);
			
		}
		System.out.println((finalCandies/numJars));
	}
		
}

