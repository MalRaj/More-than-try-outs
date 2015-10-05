package clarifying;

import java.util.HashMap;
import java.util.HashSet;

public class Animal {

	public static void main(String[] args) {
		HashSet<AnimalHuge> aHuge = new HashSet<AnimalHuge>();
		aHuge.add(new AnimalHuge());
		aHuge.add(new AnimalHuge());
		
		for (AnimalHuge animalHuge : aHuge) {
			System.out.println(animalHuge.toString() +  animalHuge.hashCode());
		}
		
	}

}
class AnimalHuge{
	
	public int i =12;
	
	public AnimalHuge(){
		i =13;
	}
	public String toString(){
		return "Animal" + i;
	}
	
}
