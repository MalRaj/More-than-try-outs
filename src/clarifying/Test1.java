package clarifying;

public class Test1 {
	public static void main(String args[]) {
		boolean x = false;
		int a;
	if(x) a = x ? 1: 2;
		else a = x ? 3: 4;
		System.out.println(a);
	}
}
/*String equals
 * public class Test1 {
    public static void main(String args[]) {
        char ch;
    String test2 = "abcd";
        String test = new String("abcd");
    if(test.equals(test2)) {
        if(test == test2)
            ch = test.charAt(0);
            else
                ch = test.charAt(1);	           
        }
        else {
        if(test == test2)
            ch = test.charAt(2);
        else                
            ch = test.charAt(3);
    }
        System.out.println(ch);
    }
}*/

/*public class Test1 {
	   public static void main(String args[]) { 
	      int i=0, j=2;
	      do {
	         i=++i;
	         j--;
	      } while(j>0);
	      System.out.println(i);
	   }
	} */