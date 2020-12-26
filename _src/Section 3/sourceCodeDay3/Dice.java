public class Dice
{
	private int faceValue;
	
	//constructor
	public Dice( )
	{
		faceValue = (int) ((Math.random() * 6) + 1);
	}
	//General Method (instance method)
	public int getFaceValue()
	{
		return faceValue;
	}
	public void rollDice( )
	{
		faceValue = (int) ((Math.random() * 6) + 1);
	}
}
