package hackerrank;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class MakeItAnagram {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] lenArr = new int[2];
		String text1 = scan.next();
		lenArr[0] = text1.length();
		String text2 = scan.next();
		lenArr[1] = text2.length();
		List<Character> h1 = new ArrayList<Character>(), h2 = new ArrayList<Character>();
		for (int i = 0; i < text1.length(); i++) {
			h1.add(text1.charAt(i));
		}
		for (int i = 0; i < text2.length(); i++) {
			h2.add(text2.charAt(i));
		}
		List<Character> intersected = intersect(h1, h2);

		int sum = 0;
		for (int i : lenArr) {
			sum = sum + (i - intersected.size());
		}
		System.out.println(Math.abs(sum));
	}

	public static <T> List<T> intersect(List<? extends T> a, List<? extends T> b) {
		List<T> result = new ArrayList<T>();

		for (T t : a) {
			if (b.remove(t))
				result.add(t);
		}

		return result;
	}

}
