package hackerearth;

import java.util.Scanner;

public class vowel_match {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int noOfTC = scan.nextInt();
		String[] urls = new String[noOfTC];
		for(int i=0;i<noOfTC;i++){
			urls[i] = scan.next();
			
		}
		for (String url : urls) {
			System.out.println(newBrowserLength(url)+"/"+url.length());
		}
	}
	
	private static int newBrowserLength(String url){
		String[] splitUrl = url.split("\\.");
		StringBuffer newUrl = new StringBuffer();
		newUrl.append(splitUrl[1].replaceAll("[aeiou]", ""));
		newUrl.append(".com");
		return newUrl.length() ;
	}
	
   
}
