package Queue;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Spliterator;

public class PriorityQueueExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Min heap(default)
		Queue<Integer> prq = new PriorityQueue<>();
		prq.add(45);
		prq.add(89);
		prq.add(12);
		prq.add(6);
		prq.add(33);
		prq.add(23);
		prq.add(77);
		
		System.out.println(prq);
		System.out.println("Size: "+prq.size());
		System.out.println(prq.remove(12));
		System.out.println("Size: "+prq.size());
		System.out.println(prq);
		System.out.println("\n-----------------------------------------");
		
		System.out.println(prq.peek());
		System.out.println("peek(): "+prq);
		System.out.println("\n-----------------------------------------");
		
		System.out.println(prq.poll());
		System.out.println("poll(): "+prq);
		System.out.println("\n-----------------------------------------");
		
		System.out.println(prq.offer(27));
		System.out.println("offer(): "+prq);
		System.out.println("\n-----------------------------------------");
		
	Object[] array = prq.toArray();
	System.out.println("Queue in Array: "+java.util.Arrays.toString(array));
	for(Object num:array)
	{
		System.out.print(" "+num);
	}
	System.out.println("\n-----------------------------------------");
	
	// Using iterator() to print all elements
	System.out.println("\n Using Iterator: ");
	
	var iterator = prq.iterator();
	while(iterator.hasNext())
	{
		System.out.print(" "+iterator.next());
	}
	
	// Using listIterator() to traverse forward and backward, modifying elements

	

    // Using spliterator() to split and process the list
	   
	System.out.println("\n-----------------------------------------");
	System.out.println("\n Using spliterator():I ");
	
	Spliterator<Integer> spliterator1 = prq.spliterator();
	Spliterator<Integer> spliterator2 = spliterator1.trySplit();
	
	//first half
	spliterator1.forEachRemaining(element -> System.out.print(" "+element));
	
	//second half
	System.out.println("\n Using spliterator():II ");
	spliterator2.forEachRemaining(el -> System.out.print(" "+el));
	System.out.println("\n-----------------------------------------");
	
	System.out.println("\n contains(77): "+prq.contains(77));
	System.out.println(prq.hashCode());
	
	System.out.println("\n-----------------------------------------");
	}
}
