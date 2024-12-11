package MapExamples;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
public class HashMapIterator {

	public static void main(String[] args) {
		HashMap<String,Integer> fruits = new HashMap<>();
		fruits.put("Banana", 10);
		fruits.put("Mango", 14);
		fruits.put("Orange", 17);
		fruits.put("Chickoo", 7);
		
		for(Map.Entry<String,Integer>entry : fruits.entrySet()) {
			System.out.println(entry.getKey()+" -  "+entry.getValue());
		}
		
		// using KeySet
		System.out.println("\n Using keySet and foreach: ");
		for(String key:fruits.keySet()) {
			System.out.println("Key= "+key+" - "+"Value: "+fruits.get(key));
		}
		
		System.out.println("\n Using forEach method: ");
		fruits.forEach((key,value)->System.out.println("Key: "+key+"Value: "+value));
		

	}

}
