package leetcode;

import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(longestValidParentheses(")()())","first"));
	}
	
	public static int longestValidParentheses(String s,String f) {
        if(s.length() < 2){
        	return 0;
        }else if(s.substring(0,2).equalsIgnoreCase("()")){
        	return 1+longestValidParentheses(s.substring(2),"2");
        }
         return longestValidParentheses(s.substring(1),"3");
    }
}
