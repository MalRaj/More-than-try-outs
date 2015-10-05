package exception;

public class Exceptions {
	public static void main(String args[]) {
		try{
			invalidMeth();
			System.out.println("1");
		}catch(Exception e){
			
			System.out.println("2");
		}finally{
			System.out.println("3");
		}
		System.out.println("22");
	}
	public static void invalidMeth(){
		throw new RuntimeException();
	}
}
