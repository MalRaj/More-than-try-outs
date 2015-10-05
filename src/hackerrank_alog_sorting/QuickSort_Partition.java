package hackerrank_alog_sorting;

import java.util.*;

public class QuickSort_Partition {

	static void partition(int[] ar) {
		int[] arr = new int[ar.length];
		int pivot = ar[0];
		List<Integer> rightList = new ArrayList<Integer>();
		List<Integer> leftList = new ArrayList<Integer>();
		List<Integer> totalList = new ArrayList<Integer>();
		
		for (int i = 1; i < ar.length; i++) {
			if(ar[i]<= pivot){
				leftList.add(ar[i]);
			}else if(ar[i] > pivot){
				rightList.add(ar[i]);
			}
		}
		leftList.add(pivot);
		totalList.addAll(0, leftList);
		totalList.addAll(leftList.size(),rightList);
		for (int i = 0; i < ar.length; i++) {
			arr[i] = totalList.get(i);
		}		
		
		printArray(arr);
	}

	static void printArray(int[] ar) {
		for (int n : ar) {
			System.out.print(n + " ");
		}
		System.out.println("");
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] ar = new int[n];
		for (int i = 0; i < n; i++) {
			ar[i] = in.nextInt();
		}
		partition(ar);
	}
}
