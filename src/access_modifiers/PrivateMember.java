package access_modifiers;

import java.util.HashSet;

class PrivateMember {
	private int i;

	public PrivateMember() {
		i = 2;
	}

	public void printI() {
		System.out.println("i is: " + i);
	}

	public void messWithI(PrivateMember t) {
		t.i *= 2;
	}

	public static void main(String args[]) {
		PrivateMember sub = new PrivateMember();
		PrivateMember obj = new PrivateMember();
		obj.printI();
		sub.messWithI(obj);
		obj.printI();
		
		HashSet hs =new HashSet();
		hs.add("hi");
		hs.add(null);
		hs.add("hi");
		hs.add("hi");
		hs.add("hie");
		
		System.out.println(hs.toString());
	}
}
