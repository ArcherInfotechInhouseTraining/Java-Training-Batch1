package MapExamples;
import java.util.HashMap;
import java.util.Map;
public class HashMapExample {

	public static void main(String[] args) {
		HashMap<String,Integer>fruits=new HashMap<>();
		fruits.put("Apple",10);
		fruits.put("Mango",15);
		fruits.put("Banana",17);
		fruits.put("Grapes",9);
		
		System.out.println("Accesing the value of Apple: "+fruits.get("Apple"));
		
		// iterating the all fruits and their value
		for(Map.Entry<String,Integer>entry:fruits.entrySet()) {
			System.out.println(entry.getKey()+"-"+entry.getValue());
		}
		//checking if key exists
		System.out.println("Checking if Orange key is exits?: "+fruits.containsKey("Mango"));
		
		System.out.println("Does value 15 exits?: "+fruits.containsValue(15));
		
		//Getting the size of hashmap
		System.out.println("Size of fruits: "+fruits.size());
		
		

	}

}
