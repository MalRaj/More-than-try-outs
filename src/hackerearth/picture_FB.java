package hackerearth;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class picture_FB {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int L = scan.nextInt();
		int noOfTC = scan.nextInt();
		//int[][] WH = new int[3][];
		Map<Integer,Integer> WH = new HashMap<Integer, Integer>();
		for(int i=0;i<noOfTC;i++){
			int W = scan.nextInt();
			int H = scan.nextInt();
			WH.put(W, H);
			if(W < L || H < L){
				System.out.println("UPLOAD ANOTHER");
			}else if( W == H && (W >= L || H >= L)){
				System.out.println("ACCEPTED");
			}else{
				System.out.println("CROP IT");
			}
		}
		
	}
}
