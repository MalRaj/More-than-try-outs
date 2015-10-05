package hackerrank;

import java.util.Scanner;

public class ConnectedCellInGrid {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int rows = in.nextInt();
        int columns = in.nextInt();
        int[][] matrix = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
        	for (int j = 0; j < columns; j++) {
        		matrix[i][j]=in.nextInt();
			}
		}
//       for (int i = 0; i < matrix.length; i++) {
//		System.out.println(matrix[i][0]);
//		System.out.println(matrix[i][1]);
//		System.out.println(matrix[i][2]);
//		System.out.println(matrix[i][3]);
//       }
        //Need to check for 6 positions - check for 1 or X -> then make 1 as X
        //column+1,column-1
        //row-1->column,column+1,column-1
        //row+1->column,column-1,column+1
        
        //
//        for (int i = 0; i < rows; i++) {
//        	for (int j = 0; j < columns; j++) {
//        		
//        		int value = matrix[i][j];
//        		int top = matrix[i-1][j];
//        		int topRight = matrix[i-1][j-1];
//        		int topLeft = matrix[i-1][j+1];
//        		int bottom = matrix[i+1][j];
//        		int bottomRight = matrix[i+1][j-1];
//        		int bottomLeft = matrix[i+1][j+1];
//        		int left=matrix[i][j-1];
//        		int right=matrix[i][j+1];
//        		
//        		
//        		
//        	}
//        }
        findMaxValueInArray(matrix,rows,columns);
    }
    private static void findMaxValueInArray(int[][] array, int row, int column) {
        int maxValue=0;
        for(int i=0;i<row;i++)
        {
            for(int j=1;j<column;j++)
            {
                if(array[i][j]==1 && i==0)
                    array[i][j]=array[i][j-1]+1;
                if(array[i][j]==1 && i>0)
                    array[i][j]=Math.max(array[i][j-1], array[i-1][j])+1;
                if(array[i][j]>maxValue)
                    maxValue=array[i][j];
            }
        }
        System.out.println(maxValue);
    }


}
