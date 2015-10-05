package hackerearth;

import java.util.Scanner;

public class not_substring_match {
	/**
	 * @param args
	 */

	 public static void main(String[] args) {
	 // TODO Auto-generated method stub
	 Scanner scan = new Scanner(System.in);
	 String a = scan.nextLine();
	 String b = scan.nextLine();
	 String c = scan.nextLine();
	
	 String lcs = lcs(a,b);
	
	int len = lcs.length();
	for (int i = 0, j = c.length(); j <= lcs.length(); i++, j++) {
		String sub = lcs.substring(i, j);
		if (sub.equals(c)) {
			len--;
		}
	}
	System.out.println(len);
	
	 }

//	public static void main(String[] args) throws IOException {
//		// TODO Auto-generated method stub
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		String s1 = br.readLine().trim();
//		String s2 = br.readLine().trim();
//		String s3 = br.readLine().trim();
//		
//		char c1[] = s1.toCharArray();
//		char c2[] = s2.toCharArray();
//		
//		int lcs[][] = new int[s1.length() + 1][s2.length() + 1];
//		String comm = "";
//		
//		for (int i = 0; i <= s1.length(); i++) {
//			for (int j = 0; j <= s2.length(); j++) {
//				if (i == 0 | j == 0){
//					lcs[i][j] = 0;
//				}
//				else if ((c1[i - 1] == c2[j - 1])) {
//					lcs[i][j] = lcs[i - 1][j - 1] + 1;
//				} else
//					lcs[i][j] = Math.max(lcs[i - 1][j], lcs[i][j - 1]);
//			}
//		}
//		// System.out.println(lcs[s1.length()][s2.length()]);
//		int i = s1.length();
//		int j = s2.length();
//		while (i >= 1 && j >= 1) {
//			if (c1[i - 1] == c2[j - 1]) {
//				comm = c1[i - 1] + comm;
//				i--;
//				j--;
//			} else if (lcs[i][j - 1] > lcs[i - 1][j]) {
//				j--;
//			} else {
//				i--;
//			}
//		}
//		comm = comm.trim();
//		 System.out.println(comm.length());
//		int len = comm.length();
//		for (i = 0, j = s3.length(); j <= comm.length(); i++, j++) {
//			String sub = comm.substring(i, j);
//			if (sub.equals(s3)) {
//				len--;
//			}
//		}
//		System.out.println(len);
//	}

	public static String lcs(String a, String b) {
		int[][] lengths = new int[a.length() + 1][b.length() + 1];

		// row 0 and column 0 are initialized to 0 already

		for (int i = 0; i < a.length(); i++) {
			for (int j = 0; j < b.length(); j++) {
				if (a.charAt(i) == b.charAt(j)) {
					lengths[i + 1][j + 1] = lengths[i][j] + 1;
				} else {
					lengths[i + 1][j + 1] = Math.max(lengths[i + 1][j],
							lengths[i][j + 1]);
				}
			}
		}
		// read the substring out from the matrix
		StringBuffer sb = new StringBuffer();
		for (int x = a.length(), y = b.length(); x != 0 && y != 0;) {
			if (lengths[x][y] == lengths[x - 1][y])
				x--;
			else if (lengths[x][y] == lengths[x][y - 1])
				y--;
			else {
				assert a.charAt(x - 1) == b.charAt(y - 1);
				sb.append(a.charAt(x - 1));
				x--;
				y--;
			}
		}

		return sb.reverse().toString();
	}

	// public static int commonSubString(String a,String b,String c){
	// String reversec = new StringBuffer(c).reverse().toString();
	// System.out.println(reversec);
	// String commonSubString = "";
	// int maxLen = 0;
	// Set<String> subStringASet = generatePerm(a);
	// Set<String> subStringBSet = generatePerm(b);
	// subStringASet.retainAll(subStringBSet);
	// for (String string : subStringASet) {
	// //System.out.println(string);
	// if((!string.contains(c) || !string.contains(reversec)) && string.length()
	// > maxLen){
	// System.out.println(string);
	// maxLen = string.length();
	// commonSubString = string;
	// }
	// }
	// System.out.println(commonSubString);
	// return maxLen;
	// }
	//
	// //substring
	// public static Set<String> getSubstring(String text,String match){
	// Set<String> subStringSet = new HashSet<String>();
	// for( int c = 0 ; c < text.length() ; c++ ){
	// for( int i = 1 ; i <= text.length() - c ; i++ ){
	// String sub = text.substring(c, c+i);
	// System.out.println(sub);
	// if(!sub.contains(match) ){
	// //System.out.println(sub);
	// subStringSet.add(sub);
	// }
	// }
	// }
	// return subStringSet;
	// }
	//
	// //combination of all strings
	// public static Set<String> permutation(String str,String match) {
	// Set<String> subStringSet = new HashSet<String>();
	// permutation("", str, match,subStringSet);
	// for (String string : subStringSet) {
	// System.out.println(string);
	// }
	// return subStringSet;
	// }
	//
	// private static void permutation(String prefix, String str, String
	// match,Set<String> subStringSet) {
	//
	// int n = str.length();
	// if (n == 0) System.out.println(prefix);
	// else {
	// for (int i = 0; i < n; i++){
	// permutation(prefix + str.charAt(i), str.substring(0, i) +
	// str.substring(i+1, n));
	// }
	// }
	// }
	//
	// public static Set<String> generatePerm(String input) {
	// Set<String> set = new HashSet<String>();
	// if (input == "")
	// return set;
	//
	// Character a = input.charAt(0);
	//
	// if (input.length() > 1) {
	// input = input.substring(1);
	//
	// Set<String> permSet = generatePerm(input);
	//
	// for (String x : permSet) {
	// for (int i = 0; i <= x.length(); i++) {
	// set.add(x.substring(0, i) + a + x.substring(i));
	// }
	// }
	// } else {
	// set.add(a + "");
	// }
	// return set;
	// }
}
