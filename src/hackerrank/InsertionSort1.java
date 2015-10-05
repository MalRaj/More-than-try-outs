package hackerrank;


import java.util.Scanner;

public class InsertionSort1 {

    public static void insertIntoSorted(int[] ar) {
        // Fill up this function  
        int element = ar[ar.length -1];
        for (int i = ar.length-1; i >= 0; i--) {
        	
        	if(i != 0 && element < ar[i-1]){
        		ar[i] = ar[i-1];
        	}else{
        		ar[i] = element;
        		printArray(ar);
        		break;
        	}
        	printArray(ar);
		}
        
    }


	private static void swap(int[] ar, int element, int i) {
		int temp = element;
		element = ar[i];
		ar[i] = temp;
	}
    
    
/* Tail starts here */
     public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int[] ar = new int[s];
         for(int i=0;i<s;i++){
            ar[i]=in.nextInt(); 
         }
         insertIntoSorted(ar);
    }
    
    
    private static void printArray(int[] ar) {
      for(int n: ar){
         System.out.print(n+" ");
      }
        System.out.println("");
   }
    
    
}