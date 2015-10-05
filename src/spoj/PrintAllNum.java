package spoj;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class PrintAllNum {

	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner(System.in);
		List<Integer> intList = new ArrayList<Integer>();
		while(scan.hasNext()){
			int newInt = scan.nextInt();
			if(newInt == 42)
			{
				break;
			}else {
				intList.add(newInt);
			}
		}
		Collections.sort(intList);
		for (Integer integer : intList) {
			System.out.println(integer);
		}
		
		
	}
}

