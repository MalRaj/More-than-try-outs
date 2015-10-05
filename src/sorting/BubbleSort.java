package sorting;

public class BubbleSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] unsortedArr = new int[]{4,7,2,1,6,3};
		bubbleSort(unsortedArr);
		for (int i : unsortedArr) {
			System.out.println(i);
		}

	}
	public static void bubbleSort(int[] unsortedArr){
		int k = 0;
		for (int j = unsortedArr.length; j >= 0; j--) {
			for (int i = 0; i < unsortedArr.length -1; i++) {
				k = i+1;
				if(unsortedArr[i] > unsortedArr[k]){
					swap(unsortedArr, i, k);
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
