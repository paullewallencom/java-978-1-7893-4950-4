package packt.homework;

import java.util.ArrayList;
import java.util.Collections;

public class Day4_Q2
{
	public static void main(String[] args)
	{
		ArrayList<String> countries = new ArrayList<String>( );
		
		countries.add("India");
		countries.add("South Africa");
		countries.add("West Indies");
		countries.add("Australia");
		countries.add("New Zealand");
		countries.add("England");
		
		for (int position = 0; position < countries.size(); position++)
		{
			System.out.println("Cricket Country:  " +  countries.get(position));
		}
		
		Collections.sort(countries);
		System.out.println("\n******************* Counties Sorted ****************************");
		for (int position = 0; position < countries.size(); position++)
		{
			System.out.println("Cricket Country:  " +  countries.get(position));
		}
	}
}
