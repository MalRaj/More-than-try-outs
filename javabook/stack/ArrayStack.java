package stack;

public class ArrayStack<E> implements Stack<E> {
	
	//actual capacity of array
	protected int capacity;
	//total capacity of array
	public static final int CAPACITY =1000;
	//generic array to implement stack ADT
	public E s[];
	protected int top = -1;
	
	public ArrayStack() {
		this(CAPACITY);
	}
	

	public ArrayStack(int capacity2) {
		capacity = capacity2;
		s = (E[]) new Object[capacity];
	}


	@Override
	public int size() {
		return top+1;
	}

	@Override
	public boolean isEmpty() {
		return (top < 0);
	}

	@Override
	//Returns just the top element value
	public E top() throws StackException {
		if(isEmpty()) throw new StackException("Stack is empty");
		return s[top];
	}

	@Override
	public void push(E element) {
		if(size() == CAPACITY) throw new StackException("Stack is full");
		s[++top] = element;
	}

	@Override
	//Removes the top elemnt value
	public E pop() {
		E elemnt;
		if(isEmpty()) throw new StackException("Stack is empty");
		elemnt = s[top];
		s[top] = null; //dereferencing
		
		return elemnt;
	}
	
	public String toString(){
		String str = "";
		if(size() == 0) str += s[0];
		if(size() > 0){
			for(int i=0;i<size()-1;i++){
				str += s[i] +" ";
			}
		}
		return str;
	}
	
	public void status(String operation,Object element){
		System.out.println("-----------------------");
		System.out.println(",returns "+element);
		System.out.println("result size = "+size());
		System.out.println(",isEmpty() "+isEmpty());
		System.out.println(",stack "+this);
	}

}
