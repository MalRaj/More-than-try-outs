package sorting;

public class InsertionSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] unsortedArr = new int[]{4,7,2,1,6,3};
		insertionSort(unsortedArr);
		for (int i : unsortedArr) {
			System.out.println(i);
		}

	}
	public static void insertionSort(int[] unsortedArr){
		for (int i = 1; i < unsortedArr.length; i++) {
			for (int j = i; j > 0; j--) {
				if(unsortedArr[j] < unsortedArr[j-1]){
					swap(unsortedArr, j, j-1);
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
