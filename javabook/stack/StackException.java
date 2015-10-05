package stack;

public class StackException extends RuntimeException{
	public StackException(String string) {
		// TODO Auto-generated constructor stub
		super(string);
	}

	public void EmptyStackException(String error){
		throw new RuntimeException(error);
	}
	
	public void FullStackException(String error){
		throw new RuntimeException(error);
	}

}
