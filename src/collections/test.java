package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumMap;
import java.util.HashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.WeakHashMap;

public class test {

	/**
	 * @param args
	 */
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Doctor doc =new Doctor();
//		System.out.println(doc.getClass());
//		
//		Doctor sur = new Surgeon();
//		System.out.println(sur.getClass());
//		
//		Doctor sur2 = (Doctor)new Surgeon();
//		System.out.println(sur2.getClass());
//		
//		Surgeon surg =new Surgeon();
//		System.out.println(surg.getClass());
//		
//		Surgeon surgDoc =(Surgeon) new Doctor();
//		System.out.println(surgDoc.getClass());
//		
//	}
	
	
	
	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Animal animal = new Animal();
//		animal.makeNoise();
//		
//		animal = new Dog();
//		animal.makeNoise();
//		//animal.
//		
//		animal = new Cat();
//		animal.makeNoise();
//		
//		Animal dog = (Animal) new Dog();
//		dog.makeNoise();
//		
//		HashSet<Object> set = new HashSet<Object>();
//		set.add("Thomas");
//		set.add(1);
//		set.add(dog);
//		
//		System.out.println("set "+set);
//		
//		ListIterator<String> strList = new ListIterator<String>() {
//			
//			@Override
//			public void set(String arg0) {
//				// TODO Auto-generated method stub
//				
//			}
//			
//			@Override
//			public void remove() {
//				// TODO Auto-generated method stub
//				
//			}
//			
//			@Override
//			public int previousIndex() {
//				// TODO Auto-generated method stub
//				return 0;
//			}
//			
//			@Override
//			public String previous() {
//				// TODO Auto-generated method stub
//				return null;
//			}
//			
//			@Override
//			public int nextIndex() {
//				// TODO Auto-generated method stub
//				return 0;
//			}
//			
//			@Override
//			public String next() {
//				// TODO Auto-generated method stub
//				return null;
//			}
//			
//			@Override
//			public boolean hasPrevious() {
//				// TODO Auto-generated method stub
//				return false;
//			}
//			
//			@Override
//			public boolean hasNext() {
//				// TODO Auto-generated method stub
//				return false;
//			}
//			
//			@Override
//			public void add(String arg0) {
//				// TODO Auto-generated method stub
//				
//			}
//			
//		};
//		strList.add("hai");
//		strList.add("nainu");
		
	
		MyArrayList<String> myList = new MyArrayList<String>();
		myList.add("hai");
		myList.add("nainu");
		
		System.out.println(myList.size());
		
		myList.remove(1);
		
		System.out.println(myList.size());
		
	}
	
	

}
