package MapExamples;
import java.util.Hashtable;

public class HashTableExample {

	public static void main(String[] args) {
		Hashtable <String, Integer> hashtable = new Hashtable<>();
		 hashtable.put("One",1);
		 hashtable.put("Two",2);
		 hashtable.put("Three",3);
		 
		 System.out.println("Hashtable: "+hashtable);
		 
		 System.out.println("Value for key Two: "+hashtable.get("Two"));
		 
		 hashtable.remove("Two");
		 System.out.println("After remivng two: "+hashtable);
		 
		 System.out.println("Check key Three ? "+hashtable.containsKey("Three"));
		 
		 System.out.println("Check value 1 ? "+hashtable.containsValue(1));
		 
		 System.out.println("Check value for 7 ? "+hashtable.containsValue(7));
		 
		 hashtable.replace("Three", 30);
		 System.out.println("Hashtable: "+hashtable);
		 
		 hashtable.putIfAbsent("Four", 40);
		 System.out.println("Hashtable: "+hashtable);
		 
		 hashtable.clear();
		 System.out.println("Hashtable: "+hashtable);	

	}

}
