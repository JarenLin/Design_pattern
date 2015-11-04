package flyweight;

import java.util.HashMap;

public class ShapeFactory {
	public static HashMap<String,Circle> circleMap = new HashMap<String, Circle>();
	public Shape getCircle(String color){
		Circle circle = circleMap.get(color);
		
		if(circle == null){
			circle = new Circle(color);
			circleMap.put(color,circle);
			System.out.println("Creating circle of color : " + color);
		}
		return  circle;
	}
}
