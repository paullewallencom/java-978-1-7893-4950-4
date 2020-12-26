package packt.homework;

import java.util.Arrays;

public class Day4_Q1
{
	public static void main(String[] args)
	{
		double [ ] salaries = new double[200];
		double highest, lowest, sum = 0.0;
		
		for (int position = 0; position < salaries.length; position++)
		{
			salaries[position] = ((Math.random() * 20001) + 5000);
			sum = sum + salaries[position];
			System.out.println("salaries[" + position + "] = " + salaries[position]);
		}
		System.out.println("\nThe average salary is: " + (sum / salaries.length));
		
		highest = salaries[0];
		lowest  = salaries[0];
		for (int position = 0; position < salaries.length; position++)
		{
			if(highest < salaries[position])
			{
				highest = salaries[position];
			}
			if(lowest > salaries[position])
			{
				lowest = salaries[position];
			}
		}
		
		System.out.println("\nhighest = " + highest);
		System.out.println("lowest  = " + lowest);
		System.out.println("\n*************** Sorted Salaries Array *******************");
		Arrays.sort(salaries);
		for (int position = 0; position < salaries.length; position++)
		{
			System.out.println("salaries[" + position + "] = " + salaries[position]);
		}
		
		System.out.println("\n*************** Sorted Salaries Array + 5% Added *******************");
		for (int position = 0; position < salaries.length; position++)
		{
			salaries[position] = salaries[position] + (salaries[position] * 0.05);
			System.out.println("salaries[" + position + "] = " + salaries[position]);
		}
		
	}
}
