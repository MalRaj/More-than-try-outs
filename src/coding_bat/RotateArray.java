package coding_bat;

public class RotateArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,2,3};
		System.out.println(rotateLeft3(nums));
	}
	
	public static int[] rotateLeft3(int[] nums) {
		   int[] rotaedArr = new int[nums.length];
		   int j=0;
		   for(int i=nums.length-1;i>=0;i--){
		      rotaedArr[i] = nums[j];
		      j++;
		   }
		      
		   return rotaedArr;
		}

}
