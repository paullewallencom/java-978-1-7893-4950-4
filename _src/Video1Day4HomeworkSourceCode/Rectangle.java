package packt.shape;

public class Rectangle extends TwoDShape implements DrawShape
{
	private double length;
	private double width;
	
	public Rectangle()
	{
		super(0,0);
		length = 1.0;
		width = 1.0;
	}

	public Rectangle(double length, double width, int x, int y)
	{
		super(x, y);
		if(length < 0.0 || width < 0.0)
		{
			this.length = 1.0;
			this.width = 1.0;
		}
		else
		{
			this.length = length;
			this.width = width;
		}
		
	}
	public double calculateArea( )
	{
		double area = length * width;
		return area;
	}
	public double calculatePerimeter( )
	{
		double perimeter = (2 * length) + (2 * width);
		return perimeter;
	}

	public double getLength()
	{
		return length;
	}

	public void setLength(double length)
	{
		if(length < 0)
		{
			this.length = 1.0;
		}
		else
		{
			this.length = length;
		}
	}

	public double getWidth()
	{
		return width;
	}

	public void setWidth(double width)
	{
		if(width < 0)
		{
			this.width = 1.0;
		}
		else
		{
			this.width = width;
		}
	}
	
	public boolean isSquare( )
	{
		if(length == width)
		{
			return true;
		}
		return false;
	}

	public String toString()
	{
		return "Rectangle [length=" + length + ", width=" + width + "]";
	}

	public void draw()
	{
		System.out.println("+-----------------------+");
		System.out.println("|                       |");
		System.out.println("|                       |");
		System.out.println("|                       |");
		System.out.println("|                       |");
		System.out.println("|                       |");
		System.out.println("+-----------------------+");
	}
	
	
}
