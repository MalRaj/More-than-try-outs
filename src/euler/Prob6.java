package euler;

public class Prob6 {
	public static void main(String[] args){
		diff(100);
	}

	public  static void diff(long N){
		
		long sum = N * (N+1)/ 2; // Formula for getting sum of first n numbers
		long squaredSum = sum * ((2 * N + 1)) / 3; // Formula for getting the square of first n numbers N * (N+1) * (2 * N +1) / 6
		long result = (sum*sum) - squaredSum;
		System.out.println(result);
	}
	
	 
	 
	
}
