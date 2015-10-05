package hackerearth;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class common_matching_string {
	/**
	 * @param args
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int numofTC= 3;
		int smallLen = 100;
		String smallString = "";
		List<String> listOfValues = new ArrayList<String>();
		for(int i=0;i<= numofTC;i++)
		{
			String inputStr = scan.nextLine();
			if(inputStr.length() != 0 ){
				if( smallLen > inputStr.length()){
				smallLen = inputStr.length();
				smallString = inputStr;
				}
				listOfValues.add(inputStr);
			}
				
		}
		String matchingString = mapMatchingString(smallLen,smallString,listOfValues);
		System.out.println(matchingString);
	}
	
	
	public static String mapMatchingString(Integer smallLen ,String smallString, List<String> listStrings){
		Map<String,Integer> listOfValues = new HashMap<String,Integer>();
		int count = 0,i=0,j=1;
		String prevSearch = "";
		for (String inputString : listStrings) {
			System.out.println("inputString "+inputString);
			if(j <= smallLen){
				String toSearch = smallString.substring(i, j);
				System.out.println("toSearch "+toSearch);
				if(inputString.contains(toSearch)){
					System.out.println("in if");
					j++;
					if(listOfValues.containsKey(toSearch)){
						System.out.println("count "+count);
						count = listOfValues.get(toSearch);
						System.out.println("count after"+count);
					}
					listOfValues.put(toSearch, count+1);
					
				}else{
					System.out.println("in else");
					i++;
					j++;
					listOfValues.remove(toSearch);
					prevSearch = toSearch;
					break;
				}
			}
		}
		System.out.println("length  listOfValues "+listOfValues.size());
		for (Entry<String, Integer> keyValue : listOfValues.entrySet()) {
			System.out.println(keyValue.getKey());
			System.out.println(keyValue.getValue());
		}
		return "listOfValues";
	}
	
}

