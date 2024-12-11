package MapExamples;
import java.util.LinkedHashMap;
import java.util.Map;
public class LinkedHashMapExample {

	public static void main(String[] args) {
		LinkedHashMap<String,Integer> dayNumberMapping = new LinkedHashMap<>();
		dayNumberMapping.put("Mon", 1);
		dayNumberMapping.put("Tue", 2);
		dayNumberMapping.put("Wed", 3);
		dayNumberMapping.put("Thr", 4);
		dayNumberMapping.put("Fri", 5);
		dayNumberMapping.put("Sat", 6);
		
		
		System.out.println("Initial map: "+dayNumberMapping);
		
		System.out.println("value for key Thr:"+dayNumberMapping.get("Thr"));
		
		dayNumberMapping.remove("Wed");
		
		System.out.println("After removing wednesday: "+dayNumberMapping);
		
		System.out.println("Contains key Fri? "+dayNumberMapping.containsKey("Fri"));
		
		dayNumberMapping.forEach((key,value)->System.out.println("Key:"+key+"  value:"+value));
		
		System.out.println("\n Using Entry set");
		for(Map.Entry<String, Integer>entry:dayNumberMapping.entrySet()) {
			System.out.println("Key: "+entry.getKey()+" value: "+entry.getValue());
			
		}
		
		dayNumberMapping.putIfAbsent("Sun", 7);
		System.out.println(dayNumberMapping);
		
		dayNumberMapping.replace("Sun", 0);
		System.out.println(dayNumberMapping);
		
		dayNumberMapping.computeIfAbsent("Wen", k->3);
		System.out.println(dayNumberMapping);
		
		dayNumberMapping.clear();
		System.out.println(dayNumberMapping);
		

		

		
		

	}

}
