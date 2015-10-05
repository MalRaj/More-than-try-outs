package hackerrank;

import java.util.Scanner;

public class SherlockAndSquares {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int i = 0; i < t; i++){
            System.out.println(Solve(in.nextInt(), in.nextInt()));
        }
    }
    
    private static long Solve(int begin, int end){
        int count =0;
        for (int i = begin; i < end; i++) {
			if(sqrt(i) != 0) {
				count++;
			}
		}
        return count;
    }
    
    public static int sqrt(int number) {
    	int t;
     
    	int squareRoot = number / 2;
    	 System.out.println(squareRoot);
    	do {
    		t = squareRoot;
    		squareRoot = (t + (number / t)) / 2;
    	} while ((t - squareRoot) != 0);
     
    	return squareRoot;
    }
}
