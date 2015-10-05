package hackerrank;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Euler_PrimeNum {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		int inputNums = scan.nextInt();
		for(int i=0;i<inputNums;i++){
			System.out.println(listPrimeNums(scan.nextInt()));
			//System.out.println(sumPrimeNums(scan.nextInt()));
		}
		
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
	
	@SuppressWarnings("unused")
	public static int listPrimeNums(int nPrime){
		List<Integer> primeNumList = new ArrayList<Integer>();
		int  i = 0;
		while(primeNumList.size() != nPrime){
			if(isPrime(i)){
				primeNumList.add(i);
			}
			i++;
		}	
		return primeNumList.get(nPrime-2);
	}
	
	
	@SuppressWarnings("unused")
	public static long sumPrimeNums(long nPrime){
		long sum = 0;
		int  i = 0;
		while(i <= nPrime){
			if(isPrime(i)){
				sum = sum+i;
			}
			i++;
		}	
		return sum;
	}

}

