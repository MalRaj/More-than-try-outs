package hackerearth;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class matrix_nbyn {
	/**
	 * @param args
	 */

	 public static void main(String[] args) {
	 // TODO Auto-generated method stub
	 Scanner scan = new Scanner(System.in);
	 int noOfTC = scan.nextInt();
	 for (int i=0;i<=noOfTC;i++) {
		 System.out.println(isMatrix(scan.nextInt()));
	 }
	}
	 
	 private static String isMatrix(int order){
		 String yes ="Yes";
		 
		List<Integer> matrixArray1 = new ArrayList<Integer>();
		List<Integer> matrixArray2 = new ArrayList<Integer>();
		
		
		
		for (int i=1;i <= order;i++) {
			matrixArray1.add(i);
			matrixArray2.add(i);
		}
		 
		 //list of all combinations
		HashSet<Integer> matrix = new HashSet<Integer>();
		for (Integer one : matrixArray1) {
			for (Integer two : matrixArray2) {
				List<Integer> matrixArray = new ArrayList<Integer>();
				matrixArray.add(one);
				matrixArray.add(two);
				matrix.addAll(matrixArray);
			}
		}
		 return yes;
	 }
	 
	

}