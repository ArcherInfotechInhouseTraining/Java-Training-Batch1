package map;

import java.util.HashMap;
import java.util.Map;

public class HashMapConstructorsExample {

	public static void main(String[] args) {
		
		//default constructor
		Map<String,Integer> defaultmap = new HashMap<String, Integer>();
		defaultmap.put("Key1", 1);
		defaultmap.put("Key2", 2);
		
		System.out.println("dafault constructor: "+defaultmap);
		System.out.println("\n------------------------------------");
		
		 // Using the constructor with initial capacity
		
		Map<String,Integer> capacitymap = new HashMap<>(5);
		capacitymap.put("Key1", 1);
		capacitymap.put("Key2", 2);
		capacitymap.put("Key3", 3);
		capacitymap.put("Key4", 4);
		capacitymap.put("Key5", 5);
		capacitymap.put("Key6", 6); //capacity increase
		
		System.out.println("Capacity constructor: "+capacitymap);
		System.out.println("\n------------------------------------");
		
        // Using the constructor with initial capacity and load factor
		Map<String,Integer> capacityloadfactorMap = new HashMap<>(10,0.7f);
		capacityloadfactorMap.put("Key1", 1);
		capacityloadfactorMap.put("Key2", 2);
		capacityloadfactorMap.put("Key3", 3);
		System.out.println("initial capacity and load factor constructor: "+capacityloadfactorMap);
		System.out.println("\n------------------------------------");
		
		// Using the copy constructor
		Map<String,Integer> existingmap = new HashMap<>();
		existingmap.put("KeyA", 111);
		existingmap.put("KeyB",222);
		
		Map<String,Integer> copymap = new HashMap<>(existingmap);
		System.out.println("Copy constructor: "+copymap);
	}

}