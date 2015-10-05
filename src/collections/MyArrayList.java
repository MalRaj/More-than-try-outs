package collections;

import java.util.Arrays;



public class MyArrayList<E> {

  private int size = 0;

  private static final int DEFAULT_CAPACITY = 10;

  private Object elements[];

  

  public MyArrayList() {

    elements = new Object[DEFAULT_CAPACITY];

  }



  public void add(E e) {

    if (size == elements.length) {

      ensureCapa();

    }  

    elements[size++] = e;

  }
  @SuppressWarnings("unchecked")
  public void remove(int i) {
	  
	  if (i>= size || i <0) {

	      throw new IndexOutOfBoundsException("Index: " + i + ", Size " + i);

	    }
	   
	  	for (int j = i; j < size; j++) {
		  elements[i] = (E) elements[j];
	  	}
		
	  	size = --size;
	  }

 



  private void ensureCapa() {

    int newSize = elements.length * 2;

    elements = Arrays.copyOf(elements, newSize);

  }



  @SuppressWarnings("unchecked")

  public E get(int i) {

    if (i>= size || i <0) {

      throw new IndexOutOfBoundsException("Index: " + i + ", Size " + i);

    }

    return (E) elements[i];

  }
  public int size(){
	  return size;
  }

}
 