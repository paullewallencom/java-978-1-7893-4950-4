import java.util.ArrayList;
import java.util.Collections;

public class TestSortingArrayList
{
	public static void main(String[] args)
	{
		Circle c1 = new Circle(10);
		Circle c2 = new Circle(20);
		
		int isBigger =  c1.compareTo( c2 );
		
		if(isBigger > 0)
		{
			System.out.println("c1 is bigger than c2");
		}
		if(isBigger == 0)
		{
			System.out.println("c1 is equal to c2");
		}
		if(isBigger < 0)
		{
			System.out.println("c1 is smaller than c2");
		}
		
		ArrayList<Circle> circles = new ArrayList<Circle>();
		circles.add(new Circle(99.8));
		circles.add(new Circle(0.0456));
		circles.add(new Circle(44.951));
		circles.add(new Circle(12.03));
		circles.add(new Circle(3.7));
		circles.add(new Circle(105.3577));
		circles.add(new Circle(76.328));
		circles.add(new Circle(4.222));
		
		System.out.println("************ circles before sorting *************");
		for (int pos = 0; pos < circles.size(); pos++)
		{
			Circle tempCircle = circles.get(pos);
			double tempRadius = tempCircle.getRadius();
			System.out.println("circles[" + pos + "] radius = " + tempRadius);
		}
		
		
		System.out.println("************ circles after sorting *************");
		
		Collections.sort(circles);
		
		for (int pos = 0; pos < circles.size(); pos++)
		{
			Circle tempCircle = circles.get(pos);
			double tempRadius = tempCircle.getRadius();
			System.out.println("circles[" + pos + "] radius = " + tempRadius);
		}
		
	}
}
