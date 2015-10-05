package hackerearth;

import java.util.Scanner;

public class Encryption {

	public static void main(String[] args) {
		 Scanner in = new Scanner(System.in);
	        String toEncrypt = in.next();
	        StringBuffer out = new StringBuffer();
	        int len = toEncrypt.length();
	        char[] toEncryptChar = toEncrypt.toCharArray();
	        int width = (int)Math.ceil(Math.sqrt(len));
	        for(int i=0;i<width;i++){
	            int j = i;
	            while(j<len){
	                out.append(toEncryptChar[j]);
	                j = j+width;
	            }
	            out.append(" ");
	        }
	        System.out.println(out);
	}

}
