package SetExamples;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Spliterator;
public class LinkedHashSetExample {

	public static void main(String[] args) {
		LinkedHashSet<Integer> linkedhashset = new LinkedHashSet<>();
		linkedhashset.add(11);
		linkedhashset.add(22);
		linkedhashset.add(33);
		linkedhashset.add(44);
		linkedhashset.add(55);
		linkedhashset.add(66);
		
		System.out.println("LinkedHashSet: "+linkedhashset);
		
		Collection<Integer> collection = Arrays.asList(1,2,3,4,5);
		
		//Constructs a new linked hash set with the same elements as the specified collection.
		LinkedHashSet <Integer> linkedhashset2 = new LinkedHashSet<>(collection);
		System.out.println("linkedhashset: "+linkedhashset2);
		
		
		LinkedHashSet<Integer> linkedhashset3 = new LinkedHashSet<>(16);
		linkedhashset3.add(7);
		linkedhashset3.add(8);
		System.out.println("linkedhashset3: "+linkedhashset3);
		
		LinkedHashSet<Integer> linkedhashset4 = new LinkedHashSet<>(16,0.75f);
		linkedhashset4.add(9);
		linkedhashset4.add(10);
		System.out.println("linkedhashset4: "+linkedhashset4);
		
		System.out.println("\n Accessing elements using Iterator");
		Iterator<Integer>iterator = linkedhashset.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		System.out.println("\n Accessing elements using Spliterator");
		Spliterator<Integer> spliterator = linkedhashset.spliterator();
		spliterator.forEachRemaining((Integer i)->System.out.println(i));
		
		linkedhashset.clear();
		System.out.println("LinkedHashSet: "+linkedhashset);
		
		boolean value1 =linkedhashset.isEmpty();
		System.out.println("is empty: "+value1);
		
		boolean value2 = linkedhashset2.contains(3);
		System.out.println("is contains 3: "+value2);
	}

}
