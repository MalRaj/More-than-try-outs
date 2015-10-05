package design_pattern;

import java.util.HashMap;

public class ShapeFactory {

	//use getShape method to get object of type shape 
//	   public Shape getShape(String shapeType){
//	      if(shapeType == null){
//	         return null;
//	      }		
//	      if(shapeType.equalsIgnoreCase("CIRCLE")){
//	         return new Circle();
//	      } else if(shapeType.equalsIgnoreCase("RECTANGLE")){
//	         return new Rectangle();
//	      }
//	      return null;
//	   }
	   
	   private static final HashMap<String, Shape> circleMap = new HashMap();

	   public static Shape getCircle(String color) {
	      Circle circle = (Circle)circleMap.get(color);

	      if(circle == null) {
	         circle = new Circle(color);
	         circleMap.put(color, circle);
	         System.out.println("Creating circle of color : " + color);
	      }
	      return circle;
	   }

	public Shape getShape(String string) {
		// TODO Auto-generated method stub
		return null;
	}
	}
