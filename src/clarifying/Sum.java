package clarifying;

import java.util.ArrayList;
import java.util.List;
import java.util.Map.Entry;
import java.util.TreeMap;

public class Sum {
	
	static int[] intValues = {10,20,5,25,10,15,25,5,5,5,10,100};
	
	public static void main(String[] args){
		
		//int[] sortedIntValues = sort(intValues);
		//int[] uniqueIntValues = unique(sortedIntValues);
		//count(uniqueIntValues);
		
		
		
		TreeMap<Integer, Integer> repetitions = new TreeMap<Integer, Integer>();

		  for (int i = 0; i < intValues.length; ++i) {
		      int item = intValues[i];

		      if (repetitions.containsKey(item))
		          repetitions.put(item, repetitions.get(item) + 1);
		      else
		          repetitions.put(item, 1);
		  }

		  // Now let's print the repetitions out
		  StringBuilder sb = new StringBuilder();

		  int overAllCount = 0;
		  List<Integer> finalArr = new ArrayList<Integer>();
		  for (Entry<Integer, Integer> e : repetitions.entrySet()) {
			  
		      if (e.getValue() > 1) {
		    	  finalArr.add(e.getKey() * e.getValue());
//		          overAllCount += 1;
//
//		          sb.append("\n");
//		          sb.append(e.getKey());
//		          sb.append(": ");
//		          sb.append(e.getValue());
//		          sb.append(" times");
	      }
		  }

//		  if (overAllCount > 0) {
//		      sb.insert(0, " repeated numbers:");
//		      sb.insert(0, overAllCount);
//		      sb.insert(0, "There are ");
//		  }
		
		System.out.println(finalArr);
		
	}

}
