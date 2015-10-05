package interfac;

public interface Food extends Interface{
   int calorie = 100;
   
   int calculateCalorie(String foodName);
}

abstract class Fruit implements Food{
	
}

class Snack implements Food{

	@Override
	public int calculateCalorie(String foodName) {
		if(foodName.equalsIgnoreCase("snack"))
			return 1000;
		return 0;
	}
	
}