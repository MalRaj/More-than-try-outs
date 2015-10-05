package codewars;

public class CafeineBuzz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(caffeineBuzz(3));
		System.out.println(caffeineBuzz(12));
		System.out.println(caffeineBuzz(1));
		System.out.println(caffeineBuzz(6));
	}

	public static String caffeineBuzz(int n) {
		String returnValue = "mocha_missing";
		if (n % 3 == 0) {
			returnValue = "Java";
			if (n % 4 == 0) {
				returnValue = "Coffee";
			}
			if (n % 2 == 0) {
				returnValue = returnValue.concat("Script");
			}
		}
		return returnValue;
	}
}
