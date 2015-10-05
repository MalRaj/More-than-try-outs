package code_chefs;

import java.util.Scanner;

public class ATM2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int withDrawalAmt = scan.nextInt();
		double balance = scan.nextInt();
		
		if(balance < withDrawalAmt){
			System.out.println(balance);
		}else if(withDrawalAmt % 5 != 0){
			System.out.println(balance);
		}else{
			System.out.println(((balance - withDrawalAmt) - 0.50));
		}
		
	}

}
