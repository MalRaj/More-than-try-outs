package hackerrank_alog_sorting;

import java.util.*;

public class QuickSort_Sorting {

	static void quickSortMine(int[] ar) {
		int[] arr = new int[ar.length];
		int pivot = ar[0];
		int[] rightList = new int[ar.length];
		int[] leftList= new int[ar.length];
		int[] totalList = new int[ar.length];
		
		for (int i = 1; i < ar.length; i++) {
			if(ar[i]<= pivot){
				leftList[i-1] = ar[i];
			}else if(ar[i] > pivot){
				rightList[i-1] = ar[i];
			}
		}
		//printArray(arr);
		quickSortMine(leftList);
		quickSortMine(rightList);
		int index = 0;
		for (int i = 0; i < leftList.length; i++) {
			 totalList[index++] = leftList[i];
		}	
		for (int i = 0; i < rightList.length; i++) {
			 totalList[index++] = rightList[i];
		}
		
		
	}

	// returns index of pivot element
    static int partition(int[] ar, int left, int right) {
        int len = right-left+1;
        int p = ar[left];
        int len1 = 0, len2 = 0;
        int[] ar1 = new int[len];
        int[] ar2 = new int[len];
        for(int i=1+left; i<len+left; i++){
            if(ar[i]<=p){
                ar1[len1++] = ar[i];
            } else{
                ar2[len2++] = ar[i];
            }
        }
        
        int i;
        
        for(i=0; i<len1; i++){
            ar[i+left] = ar1[i];
        }
        
        int pivotIndex = i+left;
        ar[i+left] = p;
        
        for(i=0; i<len2; i++){
            ar[left+len1+1+i] = ar2[i];
        }
                
        return pivotIndex;
    }   
    
    static void quickSort(int[] ar, int left, int right) {        
        int pivotIndex = partition(ar, left, right);
        
        if(pivotIndex-1>left){
            quickSort(ar, left, pivotIndex-1);
            printArray(ar, left, pivotIndex-1);
        }
        
        if(pivotIndex+1<right){
            quickSort(ar, pivotIndex+1, right);
            printArray(ar, pivotIndex+1, right);
        }                
    }   

/* Tail starts here */
 
 static void printArray(int[] ar, int left, int right) {
         for(int i=left; i<=right; i++){
            System.out.print(ar[i]+" ");
         }
           System.out.println("");
      }
       
      public static void main(String[] args) {
           Scanner in = new Scanner(System.in);
           int n = in.nextInt();
           int[] ar = new int[n];
           for(int i=0;i<n;i++){
              ar[i]=in.nextInt(); 
           }
           int len = ar.length;
           quickSort(ar, 0, len-1);
           printArray(ar, 0, len-1);
       }    
	
	
	
}
