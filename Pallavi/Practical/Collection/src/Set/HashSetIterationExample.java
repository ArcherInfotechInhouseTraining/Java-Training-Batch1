package Set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Spliterator;


public class HashSetIterationExample {

	public static void main(String[] args) {
		
		HashSet<Integer> set = new HashSet<>();
		set.add(1);
		set.add(2);
		set.add(3);
		set.add(4);
		set.add(5);
		
		// Using iterator()
		Iterator<Integer> iterator = set.iterator();
		while(iterator.hasNext())
		{
			System.out.print(" "+iterator.next());
		}
		
		// Using spliterator()
		System.out.println("\nUsing spliterator(): ");
		Spliterator<Integer> spliterator = set.spliterator();
		spliterator.forEachRemaining( (i) -> System.out.print(" "+i));
		
		System.out.println("\n Using forEach(): ");
		set.forEach( (i) -> System.out.print(" "+i));
	}
}
