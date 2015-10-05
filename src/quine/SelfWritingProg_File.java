package quine;

public class SelfWritingProg_File {
    
	public static void main(String[] args) {
		String y ="Nice to meet you";
		String s = "public class SelfWritingProg_File {%3$c%4$cpublic static void main (String[] args) {%3$c%4$c%4$cString y = %2$c%5$s%2$c;%3$c%4$c%4$cString s = %2$c%1$s%2$c;%3$c%4$c%4$cSystem.out.printf(s, s, 34, 10, 9, y);%3$c%4$c}%3$c}";
		System.out.printf(s, s, 34, 10, 9, y);
	}
	
}

/*
public static void main(String args[]) throws Exception {
FileReader f = new FileReader("/Users/malavika_parvathy/Desktop/All/Work/workspace/ProjectTryOuts/src/quine/SelfWritingProg_File.java");
BufferedReader b = new BufferedReader(f);
String s= null;
while ((s = b.readLine()) != null)
    System.out.println(s);
}
*/