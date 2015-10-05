package hackerrank;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class MaxMIn {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		 List<Integer> numList = new ArrayList<Integer>();
		 int noOfTC = scan.nextInt();
		 int size = scan.nextInt();
		for (int i = 0; i <noOfTC ; i++) {
			numList.add(scan.nextInt());
		}
		Collections.sort(numList);
		int diff = 0;
		int prevDiff = numList.get(numList.size()-1);
		for (int i = 0; i <= numList.size(); i++) {
			if((i+size-1) < numList.size()){
//				System.out.println("i :: "+i+"numList.get(i) :: "+numList.get(i));
//				System.out.println("i+3  :: "+(i+size-1)+"numList.get(i+size) :: "+numList.get(i+size-1));
				diff = numList.get(i+size-1) - numList.get(i);
				if(diff < prevDiff)
					prevDiff = diff;
			}
		}
		System.out.println(prevDiff);
		
	}

}
