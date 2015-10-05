package internet_samples;

import java.util.Scanner;

public class multiples {
	public static void main(String[] args){
		
		for(int i =1 ;i <= 100 ;i++){
			String output = String.valueOf(i);
				if(i%3 == 0){
					output = "Fizz";
					if(i%5 == 0){
						output = "FizzBuzz";
					}
				}else if(i%5 == 0){
					output = "Buzz";
				}
				System.out.println(output);
			}
			
		}
	
	
	
//	public static void main(String[] args){
//		
//		Scanner scan = new Scanner(System.in);
//		int inputNums = scan.nextInt();
//		for(int i=0;i<inputNums;i++){
//			long a = scan.nextInt();
//			long b = scan.nextInt();
//			System.out.println(a+b);
//		}
//		
//		
//	}
//	
//	private static void multiples(int endRange){
//		for(int i =1 ;i <= endRange ;i++){
//			String output = String.valueOf(i);
//				if(i%3 == 0){
//					output = "Fizz";
//					if(i%5 == 0){
//						output = "FizzBuzz";
//					}
//				}else if(i%5 == 0){
//					output = "Buzz";
//				}
//				System.out.println(output);
//			}
//			
//		}
//		
//	private static void add(long a,long b){
//		
//	}
	/*public static void main(String[] args){
	 * 
	 * int sum = 0;
		for (int i = 0; i < 1000; i++) {
			if(i%5 == 0 || i%3 == 0){
				sum = sum+i;
			}
		}
		System.out.println("Sum "+sum);
		int i = 1;
		int j = 2;
		int nextNum = 0;
		int evenSum =  j     ;
		while(nextNum < 4000000){
		//for (int k = 0; k < 10; k++) {
		
			nextNum = i+j;
			System.out.println("next num "+nextNum);
			if(nextNum%2 == 0){
				System.out.println("evenSum before"+evenSum);
				evenSum = evenSum+nextNum;
				System.out.println("evenSum afetr"+evenSum);
			}
			 i = j;
			 j = nextNum;
				
		}
		//}
		 System.out.println("Sum "+evenSum);
		
	}
	public static void main(String[] args){
			       
			       String one = "Hello";
			      String two = "Hello";
			      
			       if(one == two) {
			           System.out.println("one == two");
			      }
			      else {
			         System.out.println("one != two");
			      }
	}*/
}
