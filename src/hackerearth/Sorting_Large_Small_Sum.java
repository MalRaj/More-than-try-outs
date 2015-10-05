package hackerearth;

import java.util.Scanner;

public class Sorting_Large_Small_Sum {
	private static int[] unsortedArr = null;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int noOfTC = scan.nextInt();
		for(int i=0;i<noOfTC;i++){
			int sizeOFArray = scan.nextInt();
			unsortedArr = new int[sizeOFArray];
			for (int arrVal =0;arrVal <= sizeOFArray-1;arrVal++) {
				unsortedArr[arrVal] = scan.nextInt();
			}
			int largestVal = scan.nextInt();
			int smallVal = scan.nextInt();
			System.out.println(sum(unsortedArr,largestVal,smallVal));
		}
	}
	
	private static long sum(int[] unsortedArr,int largestVal,int smallVal){
		quickSort(0,(unsortedArr.length-1));
		for (int i : unsortedArr) {
			System.out.println(i);
		}
		System.out.println("*** "+unsortedArr[unsortedArr.length-largestVal]);
		System.out.println(unsortedArr[smallVal-1]);
		
		return unsortedArr[unsortedArr.length-largestVal] + unsortedArr[smallVal-1];
	}
	
    private static void quickSort(int lowerIndex, int higherIndex) {
        int i = lowerIndex;
        int j = higherIndex;
        // calculate pivot number, I am taking pivot as middle index number
        int pivot = unsortedArr[lowerIndex+(higherIndex-lowerIndex)/2];
        // Divide into two arrays
        while (i <= j) {
            while (unsortedArr[i] < pivot) {//right
                i++;
            }
            while (unsortedArr[j] > pivot) {//left
                j--;
            }
           
            if (i <= j) {
                exchangeNumbers(i, j);
                //move index to next position on both sides
                i++;
                j--;
            }
        }
        // call quickSort() method recursively
        if (lowerIndex < j){
        	quickSort(lowerIndex, j);
        }
        if (i < higherIndex){
            quickSort(i, higherIndex);
        }
                    
    }
    private static void exchangeNumbers(int i, int j) {
        int temp = unsortedArr[i];
        unsortedArr[i] = unsortedArr[j];
        unsortedArr[j] = temp;
    }
}
