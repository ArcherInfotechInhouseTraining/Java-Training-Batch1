package Set;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;

public class HashSetExample {

	public static void main(String[] args) {
		
		HashSet<String> set1 = new HashSet<>();
		set1.add("One");
		set1.add("Two");
		set1.add("Three");
		set1.add("Two");
		set1.add("Three");
		set1.add("One");
		
		System.out.println("HashSet is: "+set1);


        // Using the constructor that accepts a Collection
		Collection<String> collection = Arrays.asList("Four","Five","Six");
		HashSet<String> set2 = new HashSet<>(collection);
		System.out.println("set2 using collection: "+set2);

        // Using the constructor that accepts an initial capacity
		HashSet<String> set3 = new HashSet<>(3);
		set3.add("One");
		set3.add("Two");
		set3.add("Three");
		System.out.println("checking capacity for set3: "+set3);
		set3.add("Four");
		set3.add("Five");
		set3.add("Six");
		set3.add("Seven");
		System.out.println("checking capacity for set3: "+set3);//it will expnd its capacity
		
		 // Using the constructor that accepts an initial capacity and load factor
		HashSet<String> set4 = new HashSet<>(3,0.5f);
		set4.add("Eight");
		set4.add("Nine");
		set4.add("Ten");
		set4.add("One");
		set4.add("Two");
		
		System.out.println("Set4 is: "+set4);
	}

}
