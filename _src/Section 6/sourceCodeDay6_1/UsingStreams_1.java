package packt.lambda;

import java.util.ArrayList;
import java.util.List;

public class UsingStreams_1
{
	public static void main(String[] args)
	{
		List<Circle> circleList = new ArrayList<Circle>();

		circleList.add(new Circle(2.5));
		circleList.add(new Circle(88.0));
		circleList.add(new Circle(19.623));
		circleList.add(new Circle(101.01));
		circleList.add(new Circle(6.0));
		circleList.add(new Circle(10.0));
		circleList.add(new Circle(55));
		
		for (int pos = 0; pos < circleList.size(); pos++)
		{
			System.out.println("\nCircle " + pos + " radius = " + circleList.get(pos).getRadius());
			System.out.println("Circle " + pos + " area = " + circleList.get(pos).calculateArea());	
		}
		
		circleList.forEach(circle -> System.out.println( circle.toString()));
		
		
		
		//Let us use stream to filter out all the circle objects with a radius less than
		//15.0 and an area of less than 20.0
		System.out.println("\n============== Using Streams ===============");
		circleList.stream()
		.filter(c -> c.getRadius() < 15.0)
		.filter(c -> c.calculateArea() > 20.0)
		.forEach(c -> System.out.println("radius = " + c.getRadius() + "\t area = " + c.calculateArea()));
		
	}
}







