package generics;

import java.util.ArrayList;

public class GenericsSample {

	public static void main(String args[]) {
		ArrayList<String> genericsList = new ArrayList<String>();
		genericsList.add("name");
		// genericsList.add(1); // can add only String type parameters to the
		// list else shows compile time err

		// Assuming all of list values are String
		// We can obtain the values as
		for (String strValue : genericsList) {
			System.out.println("String is: " + strValue);// No type casting
															// required
		}

	}
}

/*
public static void main(String args[]) {
ArrayList nonGenericsList = new ArrayList();
nonGenericsList.add("name");
nonGenericsList.add(1); // able to add any type of parameters to the list

//Assuming all of list values are String
//We can obtain the values as
for (Object strValue : nonGenericsList) {
	String s = (String)strValue;// type casting required
	System.out.println("String is: " + s);//will throw run time exception
}

}
*/