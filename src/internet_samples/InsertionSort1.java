package internet_samples;


import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class InsertionSort1 {
    
    

    public static void insertIntoSorted(int[] ar) {
        // Fill up this function  
        int element = ar[ar.length -1];
        
        for(int i=ar.length-1;i>=0;i--){
            if(element < ar[i]){
                ar[i-1] = ar[i];
            }else{
            	ar[i-1] = element;
            }
            printArray(ar);
        }
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