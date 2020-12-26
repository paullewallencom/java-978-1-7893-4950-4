package packt.shape;

public class TestInheritance
{
	public static void main(String[] args)
	{
		int xpos, ypos;
		
		//TwoDShape tds = new TwoDShape(12, 33);
		
		//xpos = tds.getXPos();
		
		//ypos = tds.getYPos();
		//System.out.println("tds x position = " + xpos +
		//		"    y position = " + ypos + "\n");
		
		//tds.setXPos(77);
		//xpos = tds.getXPos();
		//System.out.println("tds x position = " + xpos +
		//		"    y position = " + ypos + "\n");
		
		//System.out.println("tds toString() method = " + 
		//					tds.toString() + "\n");
		
		Circle c1 = new Circle(10.759, 14, 55);
		
		xpos = c1.getXPos();
		
		ypos = c1.getYPos();
		
		System.out.println("c1 x position = " + 
			xpos + 	"    y position = " + ypos + "\n");
		
		double area = c1.calculateArea();
		
		double perimeter = c1.calculatePerimeter();
		
		System.out.println("c1 area = " + area +
				"  c1 perimeter = " + perimeter + "\n");
		
		
		//System.out.println("tds toString() method = " + 
		//		tds.toString() + "\n");
		
		System.out.println("c1 toString() method = " + 
				c1.toString() + "\n");
		
		System.out.println("testing polymorphism \n");
		
		//tds = c1; //Making tds look like c1
		
		//System.out.println("tds toString() method = " + 
		//		tds.toString() + "\n");
		//System.out.println("radius = " + tds.getRadius());
		TwoDShape tds2;
		tds2 = c1;
		area = tds2.calculateArea();
		perimeter = tds2.calculatePerimeter();
		System.out.println("c1 area = " + area +
				"  c1 perimeter = " + perimeter + "\n");
		
		DrawShape ds;
		
		ds = c1;
		
		ds.draw();
		
	}
}











