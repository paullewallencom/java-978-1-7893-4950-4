package packt.shape;

public class TestCircle
{
	public static void main(String [] args)
	{
		Circle c1 = new Circle(19, 36);
		Circle c2 = new Circle(34.887, 5, 5);
		
		double c1RadiusValue = c1.getRadius();
		System.out.println("c1 radius = " + 
							c1RadiusValue);
		double c2RadiusValue = c2.getRadius();
		System.out.println("c2 radius = " + 
							c2RadiusValue);
		c1.setRadius(12.546);
		c1RadiusValue = c1.getRadius();
		System.out.println("c1 radius = " + 
							c1RadiusValue);
		
		double areaC2 = c2.calculateArea();
		double perimeterC2 = c2.calculatePerimeter();
		System.out.println("c2 area = " + 
										areaC2);
		System.out.println("c2 perimeter = " + 
									perimeterC2);
		System.out.println(c2.toString());
	}
	
}








