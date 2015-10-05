package internet_samples;
public class Person {
	  static String name;

	    public Person(String personName) {
	            name = personName;
	    }

	    public String greet(String yourName) {
	    	return String.format("Hi %s, my name is %s", name, yourName);
	    }
	    
	    public static void main(String[] args){
	    	System.out.println(new Person("Mal").greet("Mal"));
	    }
	}
