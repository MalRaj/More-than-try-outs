package internet_samples;

class Grandparent {
    public void Print() {
        System.out.println("Grandparent's Print()");
    }
}
 
class Parent extends Grandparent {
    public void Print() {
        super.Print();
        System.out.println("Parent's Print()");
    }
}
 
class Child extends Parent {
    public void Print() {
        super.Print();
        System.out.println("Child's Print()");
    }
}
 
public class test1 {
    public static void main(String[] args) {
//        Child c = new Child();
//        c.Print();
    	Base obj = new Derived();
	      obj.fun();
    }
}

class Base {
	  public void fun() {
	     System.out.println("Base fun");     
	  }
	}
	   
	class Derived extends Base {
	  public void fun() {
	     System.out.println("Derived fun");  
	  }
	  
	}
