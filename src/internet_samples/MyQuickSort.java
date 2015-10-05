package internet_samples;
public class MyQuickSort {
    
    private int array[];
    private int length;
 
    public void sort(int[] inputArr) {
         
        if (inputArr == null || inputArr.length == 0) {
            return;
        }
        this.array = inputArr;
        length = inputArr.length;
        quickSort(0, length - 1);
    }
 
    private void quickSort(int lowerIndex, int higherIndex) {
        int i = lowerIndex;
        int j = higherIndex;
        // calculate pivot number, I am taking pivot as middle index number
        int pivot = array[lowerIndex+(higherIndex-lowerIndex)/2];
        System.out.println("Pivot position "+(lowerIndex+(higherIndex-lowerIndex)/2)+"Pivot value "+pivot);
        // Divide into two arrays
        while (i <= j) {
            /**
             * In each iteration, we will identify a number from left side which
             * is greater then the pivot value, and also we will identify a number
             * from right side which is less then the pivot value. Once the search
             * is done, then we exchange both numbers.
             */
        	 System.out.println(" \n Start i "+i + " array[i] "+array[i] );
        	 System.out.println(" Start j "+j +" array[j] "+array[j]);
            while (array[i] < pivot) {//right
            	System.out.println("in first while");
                i++;
                System.out.println("After while i value "+i);
            }
            while (array[j] > pivot) {//left
            	System.out.println("in second while");
                j--;
                System.out.println("After while j value "+j);
            }
           
            if (i <= j) {
            	System.out.println("In if case");
                exchangeNumbers(i, j);
                //move index to next position on both sides
                i++;
                j--;
                System.out.println("After exchange i now  "+i +" j now"+j);
            }
            System.out.println("Intermediate Array");
            for(int iu:this.array){
                System.out.print(iu);
                System.out.print("__");
            }
        }
        System.out.println("\n Final Array");
        for(int iu:this.array){
        	
            System.out.print(iu);
            System.out.print("__");
        }
        // call quickSort() method recursively
        if (lowerIndex < j){
        	System.out.println("\n OPOPO Lower index "+lowerIndex);
            System.out.println("Higher index "+j);
        	quickSort(lowerIndex, j);
        }
        if (i < higherIndex){
        	System.out.println("\n KAPPA Lower index "+i);
            System.out.println("Higher index "+higherIndex);
            quickSort(i, higherIndex);
        }
            
    }
 
    private void exchangeNumbers(int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
     
    public static void main(String a[]){
         
        MyQuickSort sorter = new MyQuickSort();
        //24,2,45,20,56,75,2,56,99,53,12
        int[] input = {8,5,4,1,6,9,0};//L
        //154 682
        //
        for(int i:input){
            System.out.print(i);
            System.out.print(" ");
        }
        sorter.sort(input);
    }
}
