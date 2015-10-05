package hackerearth;

import java.util.Scanner;

public class date_with_avni {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int noOFTC = scan.nextInt();
		for (int i = 0; i < noOFTC; i++) {
			String word = scan.next();
			char[] wordArr = word.toCharArray();
			char current = wordArr[0];
			boolean check = false;
				for (int j = 1;j<wordArr.length;j++) {
					if(current == wordArr[j]){
						System.out.println("SLAP");
						check = true;
						break;
					}
					current = wordArr[j];
				}
				if(!check){
				System.out.println("KISS");
				}
				
			}
			
			
		}	
}
