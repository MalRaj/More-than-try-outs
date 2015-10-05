package design_pattern;

import java.util.HashMap;

public class Circle implements Shape {

	 private String color;
	   private int x;
	   private int y;
	   private int radius;

	   public Circle(String color){
	      this.color = color;		
	   }

	   public void setX(int x) {
	      this.x = x;
	   }

	   public void setY(int y) {
	      this.y = y;
	   }

	   public void setRadius(int radius) {
	      this.radius = radius;
	   }
	   private static HashMap<String, String> blah = new HashMap<String, String>();
	   
	   
	   public static void main(String args[]) {
		   blah.put(null, null);
		   blah.put("s", null);
		   blah.put("", null);
		   blah.put("", null);
		   System.out.println("sixe "+blah.size());
//	      System.out.println("Circle: Draw() [Color : " + color 
//	         +", x : " + x +", y :" + y +", radius :" + radius);
	   }

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		
	}
	   
	  
	   
}
