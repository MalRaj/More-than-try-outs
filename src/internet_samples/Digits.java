package internet_samples;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Digits {

//    public static void main(String[] args) {
//    	/* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
//    	 List<Integer> numList = new ArrayList<Integer>();
//    	 Scanner in = new Scanner(System.in);
//	      while(in.hasNextInt()){
//	        numList.add(in.nextInt());
//	       }
//	        for (Integer num : numList) {
//	     	   int numCopy = num;
//	            List<Integer> intList = new ArrayList<Integer>();
//	            while(num >0){
//	            	int digits = num%10;
//	            	if(digits != 0  && (numCopy%digits == 0)){
//	            		if(numCopy != digits){
//	            			intList.add(digits);
//	            		}
//	            	}
//	            	 num = num/10;
//	            }
//	            if(intList.size() >0)
//	            System.out.println(intList.size());
//        
//	        }
//    }
	
	public static void main(String[] args){
		star(5,"from3");
		
	}
	static void star(int i,String x){
		System.out.println("comes here "+x +"with value "+i);
		if(i > 2){
			System.out.println("@@ "+i);
			star(i/2,"from1");
			System.out.println("** "+i);
			star(i/2,"from2");
			System.out.println("$$ "+i);
		}
		System.out.println("hello");
	}
}


