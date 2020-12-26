public class TestDiceClass
{
	public static void main(String[] args)
	{
		Dice d1, d2;
		d1 = new Dice( );
		d2 = new Dice( );
		int d1FaceValue = d1.getFaceValue();
		int d2FaceValue = d2.getFaceValue();
		System.out.println("d1 face value = " + d1FaceValue);
		System.out.println("d2 face value = " + d2FaceValue);
		d1.rollDice();
		d2.rollDice();
		d1FaceValue = d1.getFaceValue();
		d2FaceValue = d2.getFaceValue();
		System.out.println("d1 face value = " + d1FaceValue);
		System.out.println("d2 face value = " + d2FaceValue);
	}
}
