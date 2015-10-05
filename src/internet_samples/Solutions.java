package internet_samples;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solutions {
///*
// * Complete the function below.
// */
//
//    static int maxXor(int l, int r) {
//    	int maxValue = 0;
//    	
//    	for (int i = l; i <= r; i++) {
//    		for (int j = l; j <= r; j++) {
//    			int bit = (i ^ j);
//    			if(maxValue < bit){
//    				maxValue = bit;
//    			}
//    		}
//		}
//    	return maxValue;
//
//    }
//
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int res;
//        int _l;
//        _l = Integer.parseInt(in.nextLine());
//        
//        int _r;
//        _r = Integer.parseInt(in.nextLine());
//        
//        res = maxXor(_l, _r);
//        System.out.println(res);
//        
//    }
	
	
	 public static void main(String args[] ) throws Exception {
	        /*
	         * Read input from stdin and provide input before running

	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        String line = br.readLine();
	        int N = Integer.parseInt(line);
	        for (int i = 0; i < N; i++) {
	            System.out.println("hello world");
	        }
	        */
			
	        Scanner scan = new Scanner(System.in);
	        while(scan.hasNextLong()){
		        long currentVal = scan.nextLong();
		        if((currentVal != -1) && (currentVal % 2 == 0)){
		        	System.out.println(currentVal+"\n");
		        }
	        }
	    }
}