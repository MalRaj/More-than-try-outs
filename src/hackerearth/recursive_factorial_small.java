package hackerearth;

import java.math.BigInteger;
import java.util.Scanner;

public class recursive_factorial_small {
	static BigInteger fact;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int noOfTC = scan.nextInt();
		for(int i=0;i<noOfTC;i++){
			int factnum = scan.nextInt();
			if(factnum <= 100)
				fact = new BigInteger("1");
				factorial(factnum);
			System.out.println(fact);
		}
	}
	
	private static void factorial(int num){
		fact = fact.multiply(BigInteger.valueOf(num));
		num--;
		if(num >1){
			factorial(num);	
		}
	}
   
}
