package ListExamples;
import java.util.LinkedList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Spliterator;
public class LinkedListExample {

	public static void main(String[] args) {
		ArrayList <Integer> ar = new ArrayList<>();
		ar.add(10);
		ar.add(23);
		ar.add(13);
		ar.add(17);
		ar.add(77);
		ar.add(43);
		
		LinkedList<Integer> l1 = new LinkedList<>(ar);
		System.out.println(l1);
		System.out.println("Element at first: "+l1.element());
		System.out.println("Element at first: "+l1.peek());
		System.out.println("Element at first: "+l1.peekFirst());
		System.out.println("Element at first: "+l1.poll());
		System.out.println("Element at first: "+l1.pollFirst());
		
		System.out.println("Element at last: "+l1.pollLast());
		
		System.out.println(l1);
		l1.set(1, 88);
		System.out.println(l1);
		
		//add first
		l1.addFirst(11);
		l1.addLast(88);
		System.out.println(l1);
		
		//contains
		System.out.println("l1 contains 77?: "+l1.contains(77));
		
		
		Object []ob =l1.toArray();
		System.out.println(Arrays.toString(ob));
		
		//for each
		
		for(Object obj:l1) {
			System.out.println(obj);
		}
		
		// using iterator
		System.out.println("Elements are: using iterator ");
		Iterator <Integer> itr = l1.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("Elements are: using list Iterator ");
		ListIterator<Integer> ltr = l1.listIterator();
		while(ltr.hasNext()) {
			System.out.println(ltr.next());
		}
		System.out.println("Elements are using Spliterator");
		Spliterator<Integer> sob = l1.spliterator();
		System.out.println("\n using spiterator tryadvance()-I: ");
		while(sob.tryAdvance(element -> System.out.print(" "+element)));
			
		
	}

}
