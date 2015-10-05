package internet_samples;

//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.util.ArrayList;
//import java.util.List;
//
//public class Solution {
//	
//	static  int count = 0;
//
//    public static void main(String[] args) {
//    	/* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
//    	 List<String> strList = new ArrayList<String>();
//    	 
//    	 try{
//    		 BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
//    		    String s;
//    		    while ((s = in.readLine()) != null && s.length() != 0)
//    		    	strList.add(s);
//    	 
//    		}catch(IOException io){
//    			io.printStackTrace();
//    		}	
//    	 
//    	 	strList.remove(0);
//    	 
//	        for (String inputString : strList) {
//	        	isPalindrome(inputString);
//	        	System.out.println(count);
//	        	count =0;
//	        }
//    }	
//    
//    private static boolean  isPalindrome(String inputString){
//    	boolean ret = false;
//    	StringBuilder inputStringBuilder = new StringBuilder(inputString);
//    	//check if the string is palindrome
//    	int length  = inputString.length();
//        int i, begin, end, middle;
//     
//        begin  = 0;
//        end    = length - 1;
//        middle = (begin + end)/2;
//     
//        for (i = begin; i <= middle; i++) {
//          if (inputString.charAt(begin) == inputString.charAt(end)) {
//            begin++;
//            end--;
//          }
//          else {
//        	  //change the string 
//        	  char beginChar = inputString.charAt(begin);
//        	  char endChar = inputString.charAt(end);
//        	  if(beginChar < endChar){
//        		  inputStringBuilder.setCharAt(end, (char)(endChar-1));
//        	  }else if(endChar < beginChar){
//        		  inputStringBuilder.setCharAt(begin, (char)(beginChar-1));
//        	  }
//        	  count++;
//        	  break;
//          }
//        }
//        if (i == middle + 1) {
//            ret = true;
//        }
//        else {
//        	  isPalindrome(inputStringBuilder.toString());
//        } 	
//        return ret;
//    }
//}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Palindrom {

	/**
	 * @param args
	 */
//	public static void main(String[] args) 
//	{
//		Scanner scan = new Scanner(System.in);
//		int T = scan.nextInt();scan.nextLine();
//		System.out.println("T "+T);
//		for(int i=0;i<T;i++)
//		{
//			String s = scan.nextLine();
//			int count=0;
//			for(int j=0;j<s.length()/2;j++){
//				System.out.println(s.length()-1-j);
//				count+=Math.abs(s.charAt(j)-s.charAt(s.length()-1-j));
//			System.out.println(count);
//		}
//	}
	
	static  int count = 0;

    public static void main(String[] args) {
    	/* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    	 List<String> strList = new ArrayList<String>();
    	 
    	 try{
    		 BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    		    String s;
    		    while ((s = in.readLine()) != null && s.length() != 0)
                    	strList.add(s);
    	 
    		}catch(IOException io){
    			io.printStackTrace();
    		}
        strList.remove(0);
	        for (String inputString : strList) {
             
	        	isPalindrome(inputString);
	        	System.out.println(count);
               
	        	count =0;
	        }
    }	
    
    private static boolean  isPalindrome(String inputString){
    	boolean ret = false;
    	StringBuilder inputStringBuilder = new StringBuilder(inputString);
    	//check if the string is palindrome
    	int length  = inputString.length();
        int i, begin, end, middle;
     
        begin  = 0;
        end    = length - 1;
        middle = (begin + end)/2;
     
        for (i = begin; i <= middle; i++) {
          if (inputString.charAt(begin) == inputString.charAt(end)) {
            begin++;
            end--;
          }
          else {
        	  //change the string 
        	  char beginChar = inputString.charAt(begin);
        	  char endChar = inputString.charAt(end);
        	  if(beginChar < endChar){
        		  inputStringBuilder.setCharAt(end, (char)(endChar-1));
        	  }else if(endChar < beginChar){
        		  inputStringBuilder.setCharAt(begin, (char)(beginChar-1));
        	  }
        	  count++;
        	  break;
          }
        }
        if (i == middle + 1) {
            ret = true;
        }
        else {
        	  isPalindrome(inputStringBuilder.toString());
        } 	
        return ret;
    }
}

