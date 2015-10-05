package stack;



public class StackDemo{
	public static void main(String args[]){
		Object o;
		ArrayStack<Integer> A = new ArrayStack<Integer>();
		A.status("new array stack", null);
		
		A.isEmpty();
		
		A.push(1);
		A.push(2);
		A.push(3);
		
		A.size();
		
		A.isEmpty();
		
		A.pop();
		
		A.top();
		
		A.toString();
		
	}
}