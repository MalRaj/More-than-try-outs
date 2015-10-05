package hackerrank;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class LonelyInteger {

	 static int lonelyinteger(int[] a) {
//		 Map<Integer,Integer> lonelyMap = new HashMap<Integer, Integer>();
//		 for (int i = 0; i < a.length; i++) {
//			 int count=0;
//			 if(lonelyMap.containsKey(a[i])){
//				 count = lonelyMap.get(a[i]);
//			 }
//			 lonelyMap.put(a[i],count+1);
//		}
//		 for (Entry<Integer,Integer> entry : lonelyMap.entrySet()) {
//		        if (entry.getValue() == 1) {
//		            return entry.getKey();
//		        }
//		    }
		 
		 int result = 0;
		 for (int i = 0; i < a.length; i++) {
		     result = result ^ a[i];
		 }
		 return result;
	    }
	   public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        int res;
	        
	        int _a_size = Integer.parseInt(in.nextLine());
	        int[] _a = new int[_a_size];
	        int _a_item;
	        String next = in.nextLine();
	        String[] next_split = next.split(" ");
	        
	        for(int _a_i = 0; _a_i < _a_size; _a_i++) {
	            _a_item = Integer.parseInt(next_split[_a_i]);
	            _a[_a_i] = _a_item;
	        }
	        
	        res = lonelyinteger(_a);
	        System.out.println(res);
	        
	    }
	   
}
