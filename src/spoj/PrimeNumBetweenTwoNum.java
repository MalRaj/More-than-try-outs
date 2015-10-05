package spoj;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrimeNumBetweenTwoNum {
public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int noOfTC = scan.nextInt();
		for(int i=0;i<noOfTC;i++){
			listPrimeNums(scan.nextInt(),scan.nextInt());
		}
	}
	
	private static void listPrimeNums(int a,int b){
		List<Integer> primeNums = new ArrayList<Integer>();
		for (int i = a; i <= b; i++) {
			if(isPrime(i)){
				primeNums.add(i);
			}
		}
		for(Integer inter : primeNums){
			System.out.println(inter);
		}
		//return primeNums;
	}
	
	private static boolean isPrime(int numm) {
	    if (numm <= 1) {
	        return false;
	    }
	    if(numm == 2){
	        return true;
	    }
	    if(numm%2 == 0){
	        return false;
	    }
	    int counter = 3;
	    while ((counter * counter) <= numm) {
	        if (numm % counter == 0) {
	            return false;
	        } else {
	            counter +=2;
	        }
	    }
	 
	    return true;
	}
}
