package packt.shape;

public class TestingRectangle
{
	public static void main(String[] args)
	{
		Rectangle r1, r2;
		r1 = new Rectangle();
		r2 = new Rectangle(122, 66, 5, 15);
		
		System.out.println("r1 length = " + r1.getLength());
		System.out.println("r1 width = " + r1.getWidth());
		System.out.println("r1 X-Coordinate = " + r1.getXPos());
		System.out.println("r1 Y-Coordinate = " + r1.getYPos());
		System.out.println("r1 area = " + r1.calculateArea());
		System.out.println("r1 perimeter = " + r1.calculatePerimeter());
		System.out.println("r1 toString() method = " + r1.toString());
		r1.draw();

		System.out.println("\n******** r1 adjusted ****************\n");
		
		r1.setLength(33.788);
		r1.setWidth(12.902);
		System.out.println("r1 length = " + r1.getLength());
		System.out.println("r1 width = " + r1.getWidth());
		System.out.println("r1 X-Coordinate = " + r1.getXPos());
		System.out.println("r1 Y-Coordinate = " + r1.getYPos());
		System.out.println("r1 area = " + r1.calculateArea());
		System.out.println("r1 perimeter = " + r1.calculatePerimeter());
		System.out.println("r1 toString() method = " + r1.toString());
		r1.draw();
		
		System.out.println("\n******** r2 ****************\n");
		
		System.out.println("r2 length = " + r2.getLength());
		System.out.println("r2 width = " + r2.getWidth());
		System.out.println("r2 X-Coordinate = " + r2.getXPos());
		System.out.println("r2 Y-Coordinate = " + r2.getYPos());
		System.out.println("r2 area = " + r2.calculateArea());
		System.out.println("r2 perimeter = " + r2.calculatePerimeter());
		System.out.println("r1 toString() method = " + r1.toString());
		r1.draw();
		
		System.out.println("\n******** some fun ****************");
		
		TwoDShape tds = r1;
		System.out.println("r1 area " + tds.calculateArea());
		tds = r2;
		System.out.println("r2 area = " + tds.calculateArea());
		
		DrawShape ds;
		ds = r1;
		System.out.println("r1 toString( ) = " + ds.toString());
	}
}
