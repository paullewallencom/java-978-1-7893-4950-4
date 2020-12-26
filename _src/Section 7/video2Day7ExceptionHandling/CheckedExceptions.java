package video2Day7;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class CheckedExceptions
{
	public static void main(String[] args)
	{
		File file;
		FileReader fr;
		BufferedReader br;
		
		String companyName = null;
		
		file = new File("resources/companies.txt");
		try
		{
			fr = new FileReader(file);
			br = new BufferedReader(fr);
			
			companyName = br.readLine();
			while(companyName != null)
			{
				System.out.println("Company name: " + companyName);
				companyName = br.readLine();
			}
		} catch (IOException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
