package hackerrank;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.TreeMap;

public class SimilarPairs {
	
	public static void main(String[] args) {
		TreeMap< Integer, List<Integer>> tree = new TreeMap<Integer, List<Integer>>();
		Scanner scan = new Scanner(System.in);
		int noOfTC = scan.nextInt();
		int T = scan.nextInt();
		for(int i=0;i<noOfTC;i++)
		{
			List<Integer> intList = new ArrayList<Integer>();
			int parent = scan.nextInt();
			int child = scan.nextInt();
			intList.add(child);
			if(tree.containsKey(parent)){
				//get child list and check if value present if not add the value
			}else{
				//search in the list of child values ->make new 
			}
			tree.put(parent, intList);
			
		}
	}

}
