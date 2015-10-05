package clarifying;

import java.util.ArrayList;
import java.util.List;

public class recursive {

    static String in = "12";

    public static void main(String[] args) {
    	allSubString();
    	//substrings(0,1);
        //System.out.println("**********");
       // substringsAsList();
    }	
    
    static void allSubString(){
    	List<String> allSubs = new ArrayList<String>();
    	for (int i = 0; i < in.length(); i++) {
    		allSubs.add(in.substring(i,i+1));
    		System.out.println("** "+allSubs.toString());
    		for (int j = 0; j < allSubs.size(); j++) {
				
    			String newString = allSubs.get(j);
    		}
    		List<String> allSubsNew = new ArrayList<String>();
    		for (int j = 0; j < allSubs.size(); j++) {
				String newStr = allSubs.get(j)+allSubs.get(i);
				allSubsNew.add(newStr);
			}
    		allSubs.addAll(allSubsNew);
		}
    	System.out.println(allSubs);
    	
    }
    
    static void substrings(int start, int end){
        if(start == in.length() && end == in.length()){
            return;
        }else{
            if(end == in.length()+1){
                substrings(start+1,start+1);
            }else{
                System.out.println(in.substring(start, end));
                substrings(start, end+1);
            }
        }
    }
    
    static List<String> substringsAsList(){
    	int start = 0, end = 1;
    	List<String> subStrList = new ArrayList<String>();
        if(start == in.length() && end == in.length()){
        	subStrList.add(in);
        }else{
            if(end == in.length()+1){
            	subStrList.add(in.substring(start, end));
                substrings(start+1,start+1);
            }else{
            	subStrList.add(in.substring(start, end));
            	//System.out.println(in.substring(start, end));
                substrings(start, end+1);
            }
        }
        for (String string : subStrList) {
			System.out.println(string);
		}
        return subStrList;
    }

}