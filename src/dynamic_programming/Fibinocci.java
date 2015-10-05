package dynamic_programming;

public class Fibinocci {

	public static void main(String[] args) {

	}
	
	public static long fibonacciSeries(int n) {
		if (n < 3) 
			return 1;
		return fibonacciSeries(n-2) + fibonacciSeries(n-1);
	}
}
