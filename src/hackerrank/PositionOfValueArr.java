package hackerrank;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PositionOfValueArr {

	public static void main(String[] args) {
		List<Integer> listOfValues = new ArrayList<Integer>();
	
		Scanner scan = new Scanner(System.in);
		int numToBeSearched = scan.nextInt();
		int sizeOfArr = scan.nextInt();
		
		for(int i=0;i<sizeOfArr;i++)
		{
			listOfValues.add(scan.nextInt());
		}
		if(listOfValues.contains(numToBeSearched)){
			System.out.println(listOfValues.indexOf(numToBeSearched));
		}
	}

}
