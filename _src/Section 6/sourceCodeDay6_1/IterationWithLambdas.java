package packt.lambda;

import java.util.*;

public class IterationWithLambdas
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
		
		//Ways to loop through the ArrayList
		//1. Using a plain for loop----external iterator
		System.out.println("\n============== Using a plain for loop ================");
		for (int position = 0; position < circleList.size(); position++)
		{
			System.out.println(  circleList.get(position).toString()  );
		}
		
		//2. Using the for each loop----external iterator
		System.out.println("\n============== Using the for each loop ================");
		
		for (Circle circle : circleList)
		{
			System.out.println( circle.toString() );
		}
		
		//3. Using the new method developed in Java 1.8 called forEach to be used on collections
		
		System.out.println("\n============== Using the for each method on a collection ================");
		
		circleList.forEach((circle -> System.out.println(circle.toString())));
	}
}
