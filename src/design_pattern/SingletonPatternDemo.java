package design_pattern;

public class SingletonPatternDemo {
	   public static void main(String[] args) {

	      //illegal construct
	      //Compile Time Error: The constructor SingleObject() is not visible
	      //SingleObject object = new SingleObject();

	      //Get the only object available
	      SingleObject object = SingleObject.getInstance();
	      System.out.println(object.getMessage());
	      //show the message
	      object.showMessage();
	      object.setMessage("wowow");
	      object.showMessage();
	      System.out.println(object.getMessage());
	   }
	}