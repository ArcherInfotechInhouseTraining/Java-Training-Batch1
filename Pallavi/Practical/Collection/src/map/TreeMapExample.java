package map;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeMap<String,Integer> treemap = new TreeMap<>();
		treemap.put("one", 1);
		treemap.put("two", 2);
		treemap.put("three", 3);
		treemap.put("four", 4);
		treemap.put("six", 6);
		
		System.out.println("Treemap: "+treemap);
		System.out.println("Contains key two: "+treemap.containsKey("two"));
		System.out.println("Contains key five: "+treemap.containsKey("five"));
		
		System.out.println("using for each: ");
		for(Map.Entry<String,Integer> entry : treemap.entrySet())
		{
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
		
		System.out.println("Ceiling: "+treemap.ceilingKey("four"));
		System.out.println("higherKey: "+treemap.higherKey("four"));
		System.out.println("Floor: "+treemap.floorKey("four"));
		System.out.println("lowerKey: "+treemap.lowerKey("six"));
		
		treemap.put("nine", null);
		treemap.put("ten", null);
		//treemap.put(null, 10);
		System.out.println(treemap);
		

	}

}
