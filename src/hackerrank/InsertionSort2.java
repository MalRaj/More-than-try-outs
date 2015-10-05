package hackerrank;


import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.ListIterator;
import java.util.Scanner;
import java.util.SortedSet;

public class InsertionSort2 {


    /* Tail starts here */
     public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int[] ar = new int[s];
         for(int i=0;i<s;i++){
            ar[i]=in.nextInt(); 
         }
         insertIntoSorted(ar);
    }
    
    private static void printArray(int[] ar) {
      for(int n: ar){
         System.out.print(n+" ");
      }
        System.out.println("");
   }
    
    public static void insertIntoSorted(int[] unsortedArr){
		for (int i = 0; i < unsortedArr.length-1; i++) {
			for (int j = i+1; j < unsortedArr.length-1; j++) {
				if(unsortedArr[j] < unsortedArr[i]){
					swap(unsortedArr,i, j);
					printArray(unsortedArr);
				}
			}
		}
	}
	private static void swap(int[] unsortedArr, int i, int j) {
		int temp = unsortedArr[i];
		unsortedArr[i] = unsortedArr[j];
		unsortedArr[j] = temp;
	}
}