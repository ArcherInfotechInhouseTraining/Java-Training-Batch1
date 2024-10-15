package map;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {

	public static void main(String[] args) {
		
		Map<Integer,String> map = new HashMap<>();
		map.put(1, "Banana");
		map.put(2, "Apple");
		map.put(3, "Orange");
		
		// Accessing elements
		System.out.println("VAlue for key Apple: "+map.get(2));
		
		map.remove(3);
		System.out.println("After remove(): "+map);
		System.out.println("\n--------------------------------");
		
		 // Iterating over elements
		for(Map.Entry<Integer, String> entry : map.entrySet())
		{
			System.out.println(entry.getKey() +":"+entry.getValue());
		}
		System.out.println("\n--------------------------------");
		

        // Checking if a key exists
		System.out.println("Does key 2 exist ? : "+map.containsKey(2));
		System.out.println("Does key 3 exist ? : "+map.containsKey(3));
		
		 // Checking if a value exists
		System.out.println("Does value Apple exist ? : "+map.containsValue("Apple"));
		System.out.println("Does VAlue Orange exist ? : "+map.containsValue("Orange"));
		
		System.out.println("\n--------------------------------");
		
		 // Getting the size of the HashMap
		System.out.println("Size of the map: "+map.size() );
		
		// Clearing the HashMap
		map.clear();
		System.out.println("Is the map empty ? : "+map.isEmpty());
	}

}
