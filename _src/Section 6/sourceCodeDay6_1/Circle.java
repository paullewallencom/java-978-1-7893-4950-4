package packt.lambda;

public class Circle implements Comparable<Circle>
{
	private double radius;

	public Circle(double radius)
	{
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

	public void setRadius(double radius)
	{
		this.radius = radius;
	}

	
	public String toString()
	{
		return "Circle [radius=" + radius + "]";
	}

	@Override
	public int compareTo(Circle inComingCircle)
	{
		if(this.radius == inComingCircle.getRadius())
		{
			return 0;
		}
		if(this.radius > inComingCircle.getRadius())
		{
			return 1;
		}
		return -1;
	}
	
}







