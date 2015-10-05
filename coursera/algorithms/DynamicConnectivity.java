package algorithms;

import java.util.Scanner;

public class DynamicConnectivity {

	public static void main(String[] args) {
		Scanner sacn = new Scanner(System.in);
//		UnionF uf = new UnionF(sacn.nextInt()); 
//		while(!sacn.hasNext()){
//			
//			int p=sacn.nextInt();
//			int q=sacn.nextInt();
//			if(!uf.connected(p, q)){
//				uf.union(p, q);
//				System.out.println(p + " "+ q);
//			}
//			
//		}
		
		
		QuickFindUF qfuf = new QuickFindUF(sacn.nextInt()); 
		while(!sacn.hasNext()){
			
			int p=sacn.nextInt();
			int q=sacn.nextInt();
			if(!qfuf.connected(p, q)){
				qfuf.union(p, q);
				System.out.println(p + " "+ q);
			}
			
		}
	}

}
