package map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapIterating {

	public static void main(String[] args) {
		
		Map<Integer,String> map = new HashMap<>();
		map.put(1, "Apple");
		map.put(2, "Banana");
		map.put(3, "Mango");
		map.put(4, "Orange");
		map.put(5, "Cherry");
		
		// Using `entrySet` and a `for-each` loop
		System.out.println("Using entrySet and for-each loop: ");
		for(Map.Entry<Integer, String> entry: map.entrySet())
		{
			System.out.println("Key: "+entry.getKey()+" value: "+entry.getValue());
		}
		 System.out.println("\n----------------------------------------");

	        // Using `keySet` and a `for-each` loop
		 System.out.println("Using keySet and a for-each loop: ");
		 for(Integer key : map.keySet())
		 {
			 System.out.println("key = "+key+" "+"value = "+map.get(key));
		 }
		 
		 System.out.println("\n-----------------------------------------");

	        // Using values and for-each loop:
	        System.out.println("Using values and a for-each loop:");
	        
	        for(String value : map.values())
	        {
	        	System.out.println("Values: "+value);
	        }
	        

	        System.out.println("\n--------------------------------------");

	        // Using an `Iterator`:
	        System.out.println("Using an Iterator: ");
	        
	        Iterator<Map.Entry<Integer,String>> iterator = map.entrySet().iterator();
	        
	      /*  while(iterator.hasNext())
	        {
	        	System.out.println(iterator.next());
	        }
	        */
	        while(iterator.hasNext())
	        {
	        	Map.Entry<Integer, String> entry = iterator.next();
	        	System.out.println(entry);
	        }
	        
	        System.out.println("\n---------------------------------------");

	        // Using Java 8's `forEach` method:
	        System.out.println("Using Java 8's forEach method:");
	        map.forEach((key,value) -> System.out.println("Key: "+key+" Value: "+value));
	}

}
