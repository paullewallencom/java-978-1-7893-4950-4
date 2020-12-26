
public class TestingMethods
{
	public static void main(String[] args)
	{
		//We will use the String class.
		//Open you documentation to the String class.
		//See the Constructor methods.
		String name; //named memory location of data type String
		name = new String("Andre Jackson");//Constructed an object of type string.
		
		//Let us call a method you have seen before to print this to the screen.
		System.out.println(name);
		
		//Now let us learn how to call a general method.
		//Look at a method in the String class called char charAt(int index)
		//This method returns a char for a given position in the string
		char ch = name.charAt(1);
		System.out.println("char at position 1 = " + ch);
		
		//Now we will learn to call a static method.
		//Look up the Math class in your documentation.
		//Find the method called double random( )
		//This method returns a random double value from 0.0 to 0.999999.
		//It required no information on the parameter list.
		double randomValue;
		randomValue = Math.random() * 101;
		System.out.println("randomValue = " + randomValue);
	}
}
