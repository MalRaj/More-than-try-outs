package hackerrank;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class CutTheSticks {
	
	static List<Integer> sizeList = new ArrayList<Integer>();
	List<Integer[]> dd = new ArrayList<Integer[]>();
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int noOfTC = scan.nextInt();
		 List<Integer> stickList = new ArrayList<Integer>();
		for (int i = 0; i < noOfTC; i++) {
			stickList.add(scan.nextInt());
		}
		Collections.sort(stickList);
		sizeList.add(stickList.size());
		for (Integer size : recusive(stickList)) {
			System.out.println(size);
		}
	}

	private static List<Integer> recusive(List<Integer> stickList) {
		List<Integer> newStickList = new ArrayList<Integer>();
		for (int i=0;i<stickList.size();i++) {
			if(stickList.get(i) - stickList.get(0) != 0){
				newStickList.add(stickList.get(i));
			}
		}
		if(newStickList.size() != 0){
			sizeList.add(newStickList.size());
			recusive(newStickList);		
		}
		return sizeList;
	}
}
