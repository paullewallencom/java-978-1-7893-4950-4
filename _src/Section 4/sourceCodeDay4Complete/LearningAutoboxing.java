import java.util.ArrayList;

public class LearningAutoboxing
{
	public static void main(String[] args)
	{
		int score  = 20;
		int intValue = 99;
		
		Integer iScore = new Integer(score);
		
		Integer i_Value = intValue;
		
		System.out.println("iScore = " + iScore.toString());
		System.out.println("i_Value = " + i_Value.toString());
		
		int scoreValue = iScore.intValue();
		
		int intValue2 = i_Value;
		
		System.out.println("scoreValue = " + scoreValue);
		System.out.println("intValue2 = " + intValue2);
		
		//Have Some fun here
		ArrayList<Double> numberList = new ArrayList<Double>( );
		
		numberList.add(22.66);
		numberList.add(0.098);
		numberList.add(99.1);
		numberList.add(3.702);
		numberList.add(100.5619);
		numberList.add(10.55);
		numberList.add(21.88);
		
		
		
		
	}
}
