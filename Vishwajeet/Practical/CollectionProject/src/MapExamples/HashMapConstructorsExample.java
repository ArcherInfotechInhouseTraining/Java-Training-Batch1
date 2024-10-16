package MapExamples;
import java.util.HashMap;
import java.util.Map;
public class HashMapConstructorsExample {

	public static void main(String[] args) {
		HashMap<String,Integer> defaultMap=new HashMap<>();
		defaultMap.put("Key1", 1);
		defaultMap.put("Key2", 2);
		
		System.out.println("Default Constructor:"+defaultMap);
		
		//with initial capacity
		HashMap<String,Integer> InitialMap=new HashMap<>(10);
		InitialMap.put("Key3", 2);
		InitialMap.put("Key4", 4);
		
		System.out.println("InitialMap Constructor:"+InitialMap);
		
		// Capacity load factor map
		HashMap<String,Integer> capacityloadfactorMap=new HashMap<>(10,0.75f);
		capacityloadfactorMap.put("Key5", 5);
		capacityloadfactorMap.put("Key6", 6);
		
		System.out.println("capacityloadfactorMap Constructor:"+capacityloadfactorMap);
		
		Map<String,Integer> existingMap=new HashMap<>();
		existingMap.put("Key7", 77);
		
		HashMap<String,Integer> copyMap=new HashMap<>(existingMap);
		System.out.println("CopyMap: "+copyMap);
		

	}

}
