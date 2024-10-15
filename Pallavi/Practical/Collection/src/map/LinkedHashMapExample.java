package map;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapExample {

	public static void main(String[] args) {
		
		 // Initialize the LinkedHashMap
        LinkedHashMap<String, Integer> dayNumberMapping = new LinkedHashMap<>();

        // Adding new key-value pairs to the LinkedHashMap
        dayNumberMapping.put("Mon", 1);
        dayNumberMapping.put("Tus", 2);
        dayNumberMapping.put("Wen", 3);
        dayNumberMapping.put("Thu", 4);
        dayNumberMapping.put("Fri", 5);
        dayNumberMapping.put("Sat", 6);

        // Display the map
        System.out.println("Initial map: " + dayNumberMapping);

        // Access an element
        System.out.println("Value for key 'Thu': " + dayNumberMapping.get("Thu"));

        // Remove an element
        dayNumberMapping.remove("Wen");
        System.out.println("After removing key 'Wen': " + dayNumberMapping);

        // Check for key and value
        System.out.println("Contains key 'Fri'? " + dayNumberMapping.containsKey("Fri"));
        System.out.println("Contains value 5? " + dayNumberMapping.containsValue(5));

        // Iterate over the map using forEach
        dayNumberMapping.forEach((key, value) -> System.out.println(key + ": " + value));

        // Using entrySet to iterate over the map
        for (Map.Entry<String, Integer> entry : dayNumberMapping.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        // Use putIfAbsent
        dayNumberMapping.putIfAbsent("Sun", 7);
        System.out.println("After putIfAbsent 'Sun': " + dayNumberMapping);

        // Replace an entry
        dayNumberMapping.replace("Sun", 0);
        System.out.println("After replace 'Sun' with 0: " + dayNumberMapping);

        // Compute a value if absent
        dayNumberMapping.computeIfAbsent("Wen", k -> 3);
        dayNumberMapping.putIfAbsent("holiday", 8);
        System.out.println("After computeIfAbsent 'Wen': " + dayNumberMapping);

        // Clear the map
        dayNumberMapping.clear();
        System.out.println("After clear: " + dayNumberMapping.isEmpty());
	}

}
