package interview;

public class StaticBlock {

	 static int v =10; 
	 static{ 
		 StaticBlock j = new StaticBlock();
		 j.method("From static block");
		 
		 System.out.println("Hello world"); 
		 System.out.println("int in static "+v); 
		} 
	 
	private void method(String r){
		 v= v+9;
		 System.out.println("String "+r);
		 System.out.println("int "+v);
	}
	 
	public static void main(String args[]){
		v = v+10;
		 StaticBlock j = new StaticBlock();
		 j.method("From main");
	}
}
