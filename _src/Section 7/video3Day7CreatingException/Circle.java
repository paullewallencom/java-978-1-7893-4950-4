package video2Day7;

public class Circle
{
	private double radius;

	public Circle(double radius) throws CircleException
	{
		if(radius < 0)
		{
			//System.out.println("Surely you know the radius cannot be negative...");
			//System.out.println("So the program is QUITTING...");
			//System.exit(0);
			throw new CircleException("Radius cannot be negative...");
		}
		this.radius = radius;
	}
	
	public double calculateArea( )
	{
		return Math.PI * radius * radius;
	}
	public double calculatePerimeter( )
	{
		return 2 * Math.PI * radius;
	}

	public double getRadius()
	{
		return radius;
	}

	public void setRadius(double radius) throws CircleException
	{
		if(radius < 0)
		{
//			System.out.println("Surely you know the radius cannot be negative...");
//			System.out.println("So the program is QUITTING...");
//			System.exit(0);
			throw new CircleException("Radius cannot be negative...");
			
		}
		this.radius = radius;
	}

	
	public String toString()
	{
		return "Circle [radius = " + radius + "]\t[area = " + this.calculateArea() + 
				"]\t[perimeter = " + this.calculatePerimeter() + "]";
	}

}







