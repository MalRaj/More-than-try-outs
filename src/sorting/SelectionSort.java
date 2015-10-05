package sorting;

public class SelectionSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] unsortedArr = new int[]{4,7,2,1,6,3};
		selectionSort(unsortedArr);
		for (int i : unsortedArr) {
			System.out.println(i);
		}

	}
	public static void selectionSort(int[] unsortedArr){
		for (int i = 0; i < unsortedArr.length-1; i++) {
			int position = i;
			for (int j = i+1; j < unsortedArr.length; j++) {
				if(unsortedArr[j] < unsortedArr[position]){
					position=j;
				}
			}
				swap(unsortedArr, position, i);
		}
	}
	
	private static void swap(int[] unsortedArr, int i, int j) {
		int temp = unsortedArr[i];
		unsortedArr[i] = unsortedArr[j];
		unsortedArr[j] = temp;
	}
}

/*
 * 
 for (int i = 0; i < arr.length - 1; i++)
        {
int index = i;
for (int j = i + 1; j < arr.length; j++)
    if (arr[j] < arr[index])
        index = j;

int smallerNumber = arr[index]; 
arr[index] = arr[i];
arr[i] = smallerNumber;
- See more at: http://www.java2novice.com/java-sorting-algorithms/selection-sort/#sthash.qG2cM6l9.dpuf
*/