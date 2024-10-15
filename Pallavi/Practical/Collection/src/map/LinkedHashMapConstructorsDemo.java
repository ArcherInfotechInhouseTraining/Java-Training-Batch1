package map;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapConstructorsDemo {

	public static void main(String[] args) {
		
		LinkedHashMap<String,Integer> defaultMap = new LinkedHashMap<>();
		defaultMap.put("One", 1);
		defaultMap.put("Two", 2);

        System.out.println("Default constructor: " + defaultMap);
        System.out.println("\n-----------------------------------------");

        // 2. Constructor with initial capacity
        LinkedHashMap<String,Integer> initialCapacityMap = new LinkedHashMap<>(10);
        initialCapacityMap.put("Three", 3);
        initialCapacityMap.put("Four", 4);

        System.out.println("Initial Capacity constructor: " + initialCapacityMap);
        System.out.println("\n-----------------------------------------");
        
        // 3. Constructor with initial capacity and load factor
        LinkedHashMap<String,Integer> initialCapacityLoadFactorMap = new LinkedHashMap<>(10,0.7f);
        initialCapacityLoadFactorMap.put("Five", 5);
        initialCapacityLoadFactorMap.put("Six",6);

        System.out.println("Initial Capacity and Load Factor constructor: " + initialCapacityMap);
        System.out.println("\n-----------------------------------------");
        
        // 4. Constructor with initial capacity, load factor, and access order
        LinkedHashMap<String, Integer> accessOrderMap = new LinkedHashMap<>(10, 0.75f, true);
        accessOrderMap.put("Seven", 7);
        accessOrderMap.put("Eight", 8);
        accessOrderMap.put("Nine", 9);
        accessOrderMap.put("Ten", 10);
        // Accessing one of the elements to change order if accessOrder is true
        accessOrderMap.get("Seven");
        System.out.println("Constructor with initial capacity, load factor, and access order: \n" + accessOrderMap);
	
        LinkedHashMap<String, Integer> accessOrderMap1 = new LinkedHashMap<>(10,0.75f,false);
        accessOrderMap1.put("Seven", 7);
        accessOrderMap1.put("Eight", 8);
        accessOrderMap1.put("Nine", 9);
        accessOrderMap1.put("Ten", 10);
        
        accessOrderMap1.get("Seven");
        System.out.println("Constructor with initial capacity, load factor, and access order(false): \n" + accessOrderMap);
        
        System.out.println("\n-----------------------------------------");

        
     // 5. Copy constructor
        Map<String,Integer> existingmap = new LinkedHashMap<>();
        existingmap.put("One", 1);
        existingmap.put("Two",2);
        
        Map<String,Integer> copymap = new LinkedHashMap<>(existingmap);
        System.out.println("Copy Constructor: "+copymap);
	}

}
