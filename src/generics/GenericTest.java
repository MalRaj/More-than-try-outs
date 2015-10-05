package generics;

import java.util.ArrayList;
import java.util.List;

class GenericClass<T extends GenericArray<T> , Serializable> {
	private T genericObj;

	public void set(T t) {
		this.genericObj = t;
	}

	public T get() {
		return genericObj;
	}
}

public class GenericTest {
	public static void main(String args[]) {
		GenericClass<String> stringTypeTest = new GenericClass<String>();
		stringTypeTest.set("Hi");
		//stringTypeTest.set(23);//compile time err
		
		List<String> list = new ArrayList<>();
	}
}



