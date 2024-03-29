package hackerrank;

import java.util.Scanner;

public class Choclates {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int i = 0; i < t; i++){
            System.out.println(Solve(in.nextInt(), in.nextInt(), in.nextInt()));
        }
    }
    
    private static long Solve(int N, int C, int M){
        int numOfChocs = N/C;
        int wrap  = numOfChocs;
        while(wrap >= M){
        	 wrap = (wrap - M)+1;
        	 numOfChocs += 1;
        }
        return numOfChocs;
    }
}
