package interfac;

 interface interfacePizza
{
	String eat();
}

public class Pizza implements interfacePizza
{
	public String eat()
	{
		return "mmm, yummy";
	}

public static void Main()
{
	// programming to an interface
	interfacePizza myPizza = new Pizza();
	myPizza.eat(); 
}
}