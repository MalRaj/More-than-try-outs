package clarifying;

public class StringConcatetion {
	
	public static void main(String[] args){
	 String s = "Hello"; System.out.println(s);
	 String str = " Java";System.out.println(str);
	 String str2 = s.concat(str);System.out.println(str2); System.out.println(s);System.out.println(str);
	 String str1 = "Bye ".concat("Java"); System.out.println(str1);    //works with string literals too. System.out.println(str1);
	 s = s + str1;	System.out.println(s);System.out.println(str);
		
	
	 int i =9;
	 Integer o = Integer.valueOf(i);
	
	}
}
