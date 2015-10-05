package access_modifiers;

import java.util.ArrayList;
import java.util.List;

class Test {
	private final List foo;

	public Test() {
		foo = new ArrayList();
		foo.add("foo"); // Modification-1
	}

	public void setFoo(List foo) {
		// this.foo = foo; //compile time error.
	}
}

interface A {
}

interface B {
	void b();
}

interface C {
	public void c();
}

abstract class D implements A, B, C {
}

class E extends D {
	public void b() {
	}

	public void c() {
	}
}
