package hackerrank;

import java.util.Scanner;

public class DiagonalDifference {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sizeN = in.nextInt();
        int[][] matrix = new int[sizeN][sizeN];
        for(int i = 0; i < sizeN; i++){
        	 for(int j = 0; j < sizeN; j++){
        		 matrix[i][j] = in.nextInt();
        	 }
        }
        int sum = 0;
        for (int i = 0; i < sizeN; i++) {
			sum += matrix[i][i];
		}
        for (int i = 0; i < sizeN; i++) {
			sum -= matrix[sizeN-i-1][i];
		}
        System.out.println(Math.abs(sum));
    }
}
