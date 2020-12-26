package packt.lambda;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class HomeworkDay5_Q1
{
	public static void main(String[] args)
	{
		ArrayList<String> names = new ArrayList<String>();
		
		File file = null;
		FileReader fr = null;
		BufferedReader br = null;
		FileWriter fw = null;
		PrintWriter pw = null;
		String surname = null;
		
		System.out.println("=============== Reading the names from cricketNames.list ================");
		
		try
		{
			file = new File("resources/cricketNames.list");
			fr = new FileReader(file);
			br = new BufferedReader(fr);
			
			while( (surname = br.readLine()) != null  )
			{
				names.add(surname);
			}
			
			br.close();
			fr.close();
		} catch (Exception e)
		{
			e.printStackTrace();
		}
		Collections.sort(names);
		
		for (String name : names)
		{
			System.out.println("name: " + name);
		}
		
		System.out.println("=============== Writing the names to cricketNames.bak ================");
		
		try
		{
			file = new File("resources/cricketNames.bak");
			fw = new FileWriter(file);
			pw = new PrintWriter(fw);
			
			for (String name : names)
			{
				pw.println(name);
			}
			
			pw.close();
			fw.close();
			
			System.out.println("\n======== File Saved ========");
		} catch (Exception e)
		{
			System.out.println("\n======== File NOT Saved ========");
			e.printStackTrace();
		}
		
	}
}
