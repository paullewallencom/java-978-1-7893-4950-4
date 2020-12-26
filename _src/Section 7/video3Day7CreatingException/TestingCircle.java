package video2Day7;

public class TestingCircle
{
	public static void main(String[] args)
	{
		System.out.println("======= Setting up the first Circle ========");
		Circle c1;
		try
		{
			c1 = new Circle(10);
			System.out.println(c1.toString());
		} catch (CircleException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		System.out.println("\n\n======= Setting up the second Circle ========");
		Circle c2;
		try
		{
			c2 = new Circle(-2);
			System.out.println(c2.toString());
		} catch (CircleException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Recovered from the error and can make ammends....");
	}
}
