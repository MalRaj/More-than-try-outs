package internet_samples;

import java.util.Calendar;


public class LargestPalindrome {

	public static void main(String[] args){
		long start = System.currentTimeMillis();
		//Get numbers between 100 and 999
		// product of every number
		//check if palindrome
		//return largest of the panidrome
		int largest = 0;
		int product =0;
		for (int i = 999; i >=100; i--) {
			for (int j = 999; j >=100; j--) {
				product = i * j;
				if(reverse(product) && largest < product){
					largest = product;
				}
			}
		}
		long end = System.currentTimeMillis();
		System.out.println(largest);
		// here's how to get the minutes
		System.out.println((end-start)+"end" + (end) +"start" +(start));
	}
	
	 public static boolean reverse(int num) {
		 int orginal = num;
	        int revNum = 0;
	        while (num > 0) {
	            int rem = num % 10;
	            revNum = (revNum * 10) + rem;
	            num = num / 10;
	        }
	        return revNum == orginal;
	    }
	
}
