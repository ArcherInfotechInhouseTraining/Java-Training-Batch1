package MapExamples;
import java.util.Map;
import java.util.TreeMap;
public class TreeMapExample {

	public static void main(String[] args) {
		TreeMap<Integer,String> treemap = new TreeMap<>();
		treemap.put(1, "Mercedes");
		treemap.put(2, "BMW");
		treemap.put(3, "Audi");
		
		System.out.println("TreeMap: "+treemap);
		
		System.out.println("Get value for key 2: "+treemap.get(2));
		
		treemap.remove(3);
		System.out.println("TreeMap: "+treemap);
		
		System.out.println("Contains key 3? "+treemap.containsKey(3));
		
		System.out.println("Map.Entry");
		for(Map.Entry<Integer, String>entry:treemap.entrySet()) {
			System.out.println("Key: "+entry.getKey()+"- "+entry.getValue());
		}

	}

}
