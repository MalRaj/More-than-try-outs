package internet_samples;

public class sum_Equals_Array {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] arr = {2,4,4,5,3,1};
		checkIFSumEquals(arr);
	}
	
	private static void checkIFSumEquals(int[] arr){
		int sumStart = 0;
		int sumRest = 0;
		for (int i = 0; i < arr.length; i++){
			sumStart +=arr[i];
			for (int j = i+1; j < arr.length; j++) {
				sumRest += arr[j];
			}
			if(sumRest == sumStart){
				System.out.println("sum equals at index :: "+i);
				break;
			}else{
				sumRest = 0;
			}
		}
		
		//System.out.println("no sum equals");
		
	}
	
	
}


//public static void main(String args[]) {
//int[] array1 = { 2, 4, 4, 5, 4, 1 };
//for (int index = 0; index < array1.length - 1; index++)
//if (getMiddleIndex(array1, 0, index) == getMiddleIndex(array1,
//index + 1, array1.length - 1))
//System.out.println("MiddleIndex :" + index + ".");
//}
//
//private static int getMiddleIndex(int[] array1, int i, int index) {
//if (i > index)
//return 0;
//else
//return array1[i] + getMiddleIndex(array1, i + 1, index);
//}
//}
