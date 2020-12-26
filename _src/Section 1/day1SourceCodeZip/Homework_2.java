
public class Homework_2
{
	public static void main(String[] args)
	{
		double a = 10.0;
		double b = 3.0;
		double c = 14.0;
		double answer = 0.0;
		boolean isTrue = false;
		
		answer = a * b + (2*b);
		System.out.println("Answer is equal to " + answer);
		
		isTrue = b < a || a > 14;
		System.out.println("b < a || a > 14 is ?  " + isTrue);
	}
}
