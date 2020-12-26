package packt.section4;

import java.util.HashMap;

public class TestingHashMap
{
	public static void main(String[] args)
	{
		 HashMap<Integer, String> cityNamesMap = new HashMap<Integer, String>(); 
         
//	        if(cityNamesMap.isEmpty())
//	        {
//	        	System.out.println("\n cityNamesMap is empty");
//	        }
//	        else
//	        {
//	        	System.out.println("\n " + cityNamesMap);
//	        }
		 	print(cityNamesMap);
	        
	        cityNamesMap.put(1, "London"); 
	        cityNamesMap.put(2, "New Delhi"); 
	        cityNamesMap.put(3, "Rome");
	        cityNamesMap.put(4, "Miami");
	        cityNamesMap.put(5, "Hamburg");
	        cityNamesMap.put(6, "Prague");
	        cityNamesMap.put(7, "Auckland");
	          
	        System.out.println("\n Size of map is: " + cityNamesMap.size()); 
	        
	        print(cityNamesMap);
	        
	        cityNamesMap.putIfAbsent(8, "Cape Town");
	        
	        print(cityNamesMap);
	        
	        //Check if a key exists
	        if (cityNamesMap.containsKey(5))  
	        { 
	            String cityName = cityNamesMap.get(5); 
	            System.out.println("\n value for key \"5\" is: " + cityName); 
	        }
	        else
	        {
	        	System.out.println("No such Key");
	        }
	        
	        cityNamesMap.remove(6);
	        
	        print(cityNamesMap);
	          
	        cityNamesMap.clear(); 
	        
	        print(cityNamesMap);
	}
	
	public static void print(HashMap cityNamesMap )
	{
		if(cityNamesMap.isEmpty())
        {
        	System.out.println("\n cityNamesMap is empty");
        }
        else
        {
        	System.out.println("\n " + cityNamesMap);
        }
	}
}
