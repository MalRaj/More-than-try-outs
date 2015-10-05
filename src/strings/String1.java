package strings;

public class String1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(replaceAllDigitsRegExp("44dfkgkdfghkdfhg kfdghkdfghdfk"));
	}
	
	private static String replaceAllDigitsRegExp(String input) {

		  return input.replaceAll("[0-9]", "#");
		}
	
	boolean arithmeticExpression(int A, int B, int C) {

		  if (A + B == C || A * C == C || A / B == C || A - B == C) {
		    return true;
		  }
		  return false;
		}

}
