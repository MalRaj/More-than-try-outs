package inheritance;

public class test {

	 public static void main(String[] args) {
	        Cat myCat = new Cat();
	        myCat.testInstanceMethod();
	        Cat.testClassMethod();
	        
	        Animal animal = new Animal();
	        animal.testInstanceMethod();
	        animal.testClassMethod();
	        
	        Animal myAnimal = myCat;
	        myAnimal.testClassMethod();
	        myAnimal.testInstanceMethod();
	        
	        //myCat = (Cat)new Animal();
	        //myCat.testInstanceMethod();
	        //myCat.testClassMethod();
	    }
}
