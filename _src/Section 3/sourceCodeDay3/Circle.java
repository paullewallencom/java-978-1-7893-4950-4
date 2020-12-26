package packt.shape;

public class Circle extends TwoDShape implements DrawShape
{
	private double radius;
	
	public Circle(int x, int y )
	{
		super(x,y);
		radius = 1.0;
	}
	public Circle( double newValue, int x, int y)
	{
		super(x,y);
		radius = newValue;
	}
	public double getRadius( )
	{
		return radius;
	}
	public void setRadius(double newRadiusValue)
	{
		if(newRadiusValue < 0)
		{
			radius = 1;
		}
		else
		{
			radius = newRadiusValue;
		}
	}
	public double calculateArea( )
	{
		double area;
		area = Math.PI * radius * radius;
		return area;
	}
	public double calculatePerimeter( )
	{
		double perimeter;
		perimeter = Math.PI * 2 * radius;
		return perimeter;
	}
	
	public String toString( )
	{
		return "radius = " + radius;
	}
	public void draw()
	{
		System.out.println("     **");
		System.out.println("   *     *");
		System.out.println("  *       *");
		System.out.println("  *       *");
		System.out.println("   *     *");
		System.out.println("     **");
		
	}
}








