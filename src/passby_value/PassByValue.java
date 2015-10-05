package passby_value;

public class PassByValue {
	
	public static void  main(String[] args){
		Dog aDog = new Dog();
		aDog.setName("Malu");
		change(aDog);
		System.out.println("NAme after 2"+aDog.getName());
	}
	
	private static void change(Dog dog){
		System.out.println("NAme before"+dog.getName());
		dog = new Dog();
		dog.setName("Rajesh");
		System.out.println("NAme after"+dog.getName());
	}
	
}
