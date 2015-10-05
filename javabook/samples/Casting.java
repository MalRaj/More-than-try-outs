package samples;

public class Casting {

	public static void main(String[] args) {
		cast();
	}

	static void cast(){
		Number n = new Integer(2); // wide cast - compiler checks for casting and does it automatically
		Integer i = (Integer)n; // narrow cast - throws compile time error as needs explicit cast
		
		Number a;
		Integer b;
		
		a = new Integer(3);
		
		b = (Integer)a;
		
		System.out.println(b);
		
		a = new Double(4.011);
		
		b = (Integer)a; // will not throw compile time error as it 
		
		System.out.println(b);
	}
}	
