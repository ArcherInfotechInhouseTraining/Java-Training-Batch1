package Set;

import java.util.Arrays;
import java.util.HashSet;

public class RemoveFromHashSet {

	public static void main(String[] args) {
		
		HashSet<String> set = new HashSet<>();
		set.addAll(Arrays.asList("Apple","Banana","Cherry"));
		
		System.out.println("Original set: "+set);
		

        // Using remove(Object o)
		set.remove("Cherry");
		System.out.println("After remove(Cherry): "+set);
		
		 // Using removeAll(Collection c)
		set.removeAll(Arrays.asList("Apple","Banana"));
		System.out.println("After removeAll(): "+set);
		
		// Using removeIf(Predicate<? super E> filter)
		set.removeIf(fruit -> fruit.startsWith("E"));
		System.out.println("After removeIf(): "+set);
	}
}
