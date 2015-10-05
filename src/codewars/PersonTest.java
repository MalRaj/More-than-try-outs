package codewars;

class Person {
	  String name;

	    public Person(String personName) {
	            name = personName;
	    }

	    public String greet(String yourName) {
	       return String.format("Hi %s, my name is %s", name, yourName);
	    }
	}

public class PersonTest{
	public static void main(String[] args){
		Person person = new Person("Mal");
		System.out.println(person.greet("raj"));
	}
}
