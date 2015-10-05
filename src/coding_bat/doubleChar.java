package coding_bat;

import java.util.Arrays;

public class doubleChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringChange();
		System.out.println();
	}
	
	
public static void StringChange(){
	
	String s = "some text";
	s.substring(0,4);
	System.out.println(s); // still printing "some text"
	s = s.substring(0,4);
	//String a = s.substring(0,4);
	//System.out.println(a); // prints "some"
	System.out.println(s);
}
	public static int bigDiff(int[] nums) {
		Arrays.sort(nums);
		return Math.abs(nums[0] - nums[nums.length-1]);
	}

	
	public static boolean xyBalance(String str) {
		boolean ret = false;
		  for(int i=0;i<str.length();i++){
			  System.out.println("i "+i);
		   if(str.charAt(i) == 'x'){
			   ret = false;
		     for(int j=i;j<=str.length()-1;j++){
		      if(str.charAt(j) == 'y'){
		        ret = true;
		        i = j;
		        System.out.println("j "+j);
		        break;
		      }
		     }
		   }
		  }
		  return ret;
		}

	
	public static boolean bobThere(String str) {
		  for(int i=0;i<str.length()-1;i++){
		   if((str.charAt(i) =='b' )&& (str.charAt(i+2) == 'b')){
		    return true;
		   }
		  }
		  return false;
		}

	public static String doubleChar(String str) {
		  String newStr = "";
		  for(int i=0;i<str.length();i++){
		   newStr += str.substring(i,i+1)+str.substring(i,i+1);
		  }
		  return newStr;
		}
	
	public static int countHi(String str) {
		  int count = 0;
		  for(int i=0;i<str.length()-1;i++){
		   if(str.substring(i,i+2).equalsIgnoreCase("hi")){
		     count++; 
		   }
		  }
		  return count;
		}
	public static boolean catDog(String str) {
		  int catCount = 0;
		  int dogCount = 0;
		   for(int i=0;i<str.length()-2;i++){
			  
		    if(str.substring(i,i+3).equals("cat")){
		       catCount++; 
		     }else if(str.substring(i,i+3).equals("dog")){
		      dogCount++;
		     }
		   }
		  
		   if(catCount == dogCount){
		    return true;
		   }
		  
		  return false;
		}
	
	public  static int countCode(String str) {
		  int count = 0;
		  for(int i=0;i<str.length()-3;i++){	
		    String sub = str.substring(i,i+4);  
		    if(sub.startsWith("co") && sub.endsWith("e")) count ++; 
		  }
		  return count;
		}
	
	
	public static String withoutString(String base, String remove) {
		return base.replace(remove, "");
	}
	
	public static boolean endOther(String a,String b) {
		String toCompare = (a.length() < b.length() ? a : b);
		System.out.println(toCompare);
		System.out.println(a.endsWith(toCompare));
		System.out.println(b.endsWith(toCompare));
		if(a.endsWith(toCompare)&&b.endsWith(toCompare)) return true;
		return false;
	}
	
	public static boolean xyzThere(String str) {
		if(str.contains(".xyz")) return false;
		else if(str.contains("xyz")) return true;
		return false;
	}
	
	public static boolean xyzThere2(String str) {
		 for(int i=0;i<str.length();i++){
		  if(str.charAt(i) == 'x' && str.charAt(i+1) =='y' && str.charAt(i+2) == 'z'){
			  if(str.charAt(i-1)  !='.')
				  return true;
		  }
		 }
		 return false;
		}

}
