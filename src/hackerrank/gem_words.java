package hackerrank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class gem_words {
	/**
	 * @param args
	 */
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Scanner scan = new Scanner(System.in);
//		int numofTC= scan.nextInt();
//		List<String> listOfValues = new ArrayList<String>();
//		for(int i=0;i<= numofTC;i++)
//		{
//			if(scan.hasNextLine())
//				listOfValues.add(scan.nextLine());
//		}
//		listOfValues.remove(0);
//		String comp = listOfValues.get(0);
//		listOfValues.remove(0);
//		gemStone(comp,listOfValues);
//	}
//	
//	public static void gemStone(String comp,List<String> listString){
//		int charCount = 1;
//		char probableChar = 0;
//		String needyStr = "";
//		Set<Character> probableCharArr = new HashSet<Character>();
//		char[] compareStr = comp.toCharArray();
//		for (String inputString : listString) {
//			System.out.println("in here"+inputString);
//			for (int i = 0; i < compareStr.length; i++) {
//				System.out.println(i);
//				if((inputString.indexOf(compareStr[i]) != -1) || (inputString.indexOf(probableChar) != -1)){
//					probableChar = compareStr[i];
//					probableCharArr.add(compareStr[i]);
//					charCount++;
//				}
//			}
//		}
//		System.out.println(probableCharArr.size());
//	for (char c : probableCharArr) {
//		System.out.println(c);
//	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int numofTC= scan.nextInt();
		List<String> listOfValues = new ArrayList<String>();
		for(int i=0;i<= numofTC;i++)
		{
			listOfValues.add(scan.nextLine());
		}
		listOfValues.remove(0);
		int count = 0;
		Map<Character,Integer> matchingString = mapMatchingChars(listOfValues);
		for (Entry<Character, Integer> matches : matchingString.entrySet()) {
			if(matches.getValue() >= numofTC )
				count++;
		}
		System.out.println(count);
	}
	
	
	public static Map<Character,Integer> mapMatchingChars(List<String> listStrings){
		Map<Character,Integer> listOfValues = new HashMap<Character,Integer>();
		for (String inputString : listStrings) {
			char[] outStr = removeDuplicates(inputString).toCharArray();
			for (int i = 0; i < outStr.length; i++) {
				int cout = 0;
				if(listOfValues.keySet().contains(outStr[i])){
					cout = listOfValues.get(outStr[i]);
				}
				listOfValues.put(outStr[i], cout+1);
			}
		}
		return listOfValues;
	}
	
	private static String removeDuplicates(String userKeyword){

        int charLength = userKeyword.length();
        String modifiedKeyword="";
        for(int i=0;i<charLength;i++)
            {
             if(!modifiedKeyword.contains(userKeyword.charAt(i)+""))
                 modifiedKeyword+=userKeyword.charAt(i);
            }
        return modifiedKeyword;
    }
	
}

