package video2Day7;

public class UncheckedExceptions
{
	public static void main(String[] args)
	{
		System.out.println("========= Start of program ========\n");
		
		int a = 12, b = 0, answer = 0;
		
		try
		{
			answer = a / b;
			
			System.out.println("a = " + a + " b = " + b + 
											" answer = " + answer);
			
		}
		catch (ArithmeticException e)
		{
			System.out.println("======= An Arithmetic ERROR occurred ======");
			e.printStackTrace();
		}
		
		System.out.println("======= The statement after the first try-catch ======");
		
		double [ ] dValues = new double[3];
		
		dValues[0] = 44.77;
		dValues[1] = 99;
		dValues[2] = 12.6;
		//dValues[3] = 100.963;
		
		for (double d : dValues)
		{
			System.out.println("d = " + d);
		}
		
		System.out.println("========= End of program ========\n");
	}
}
