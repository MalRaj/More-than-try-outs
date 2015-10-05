package hackerrank;

import java.util.Scanner;

public class UtopianTrees {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int noOfTC = scan.nextInt();
		for(int i=0;i<noOfTC;i++)
		{
			boolean spring = true;
			int height = 1;
			int cycle = scan.nextInt();
			for (int j = 0; j < cycle; j++) {
				if(spring){
					height = height*2;
					spring=false;
				}else{
					height = height+1;
					spring=true;
				}
			}
			System.out.println(height);
			
		}
		
	}

}
