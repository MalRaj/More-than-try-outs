package boxing;

public class Autoboxing {
	public void method(int x, int y) {
		System.out.println("method(Long x, Long y)");
	}

	public static void main(String[] args) {
		 int x, y;
		x = y = 0;
		Autoboxing s = new Autoboxing();
		s.method(x, y); // Passing long values
	}
}

