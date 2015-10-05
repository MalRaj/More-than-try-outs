package sorting;

import java.util.Arrays;

public class QuickSort {

	private static int unsortedArr[] = new int[] { 4, 7, 2, 1, 6, 3 };

	public static void main(String args[]) {

		// unsorted integer array
		System.out.println("Unsorted array :" + Arrays.toString(unsortedArr));

		// sorting integer array using quicksort algorithm
		quickSort(0, unsortedArr.length - 1);
		// printing sorted array
		System.out.println("Sorted array :" + Arrays.toString(unsortedArr));

	}

	/*
	 * This method implements in-place quicksort algorithm recursively.
	 */
	private static void quickSort(int low, int high) {
		int i = low;
		int j = high;

		// pivot is middle index
		int pivot = unsortedArr[0];

		// Divide into two arrays
		while (i <= j) {

			while (unsortedArr[i] < pivot) {
				i++;
			}
			while (unsortedArr[j] > pivot) {
				j--;
			}
			if (i <= j) {
				swap(i, j);
				// move index to next position on both sides
				i++;
				j--;
			}
		}

		// calls quickSort() method recursively
		if (low < j) {
			quickSort(low, j);
		}

		if (i < high) {
			quickSort(i, high);
		}
	}

	private static void swap(int i, int j) {
		int temp = unsortedArr[i];
		unsortedArr[i] = unsortedArr[j];
		unsortedArr[j] = temp;
	}
}
