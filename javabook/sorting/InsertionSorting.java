package sorting;

import hackerearth.reccuring_smallest;

public class InsertionSorting {

	public static void main(String[] args) {
		String charStr = "character";
		char[] arrToSort = charStr.toCharArray();
		System.out.println(insertionSort( arrToSort));
	}
	
	static char[] insertionSort(char[] arrToSort){
		int n = arrToSort.length;
		for (int i = 0; i < n; i++) {
			char curr = arrToSort[i];
			int j = i-1;
			while((j >= 0)&& arrToSort[j] > curr){
				arrToSort[j+1] = arrToSort[j--];
				arrToSort[j+1] = curr;
			}
				
		}
		return arrToSort;
	}

	//time taken wll be very huge if array is sorted in decreasing order.
}
