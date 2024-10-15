package Iterable;

import java.util.ArrayList;

import java.util.Iterator;
import java.util.ListIterator;

public class ListIteratorExample {

	public static void main(String[] args) {

		ArrayList <String> fruits = new ArrayList();
		fruits.add("banana");
		fruits.add("apple");
		fruits.add("orange");
		fruits.add("mango");
		
		System.out.println("Fruits: "+fruits);
		
		// Use iterator() for forward traversal
		System.out.println("\n Use Iterator() for Forward traversal: ");
		
		Iterator<String> iterator = fruits.iterator();
		
		while(iterator.hasNext())
		{
			System.out.println(iterator.next());
		}
		
		/*for(String i:fruits)
		{
			System.out.println(i);
		}*/
		
		
		// Use listIterator() for both forward and backward traversal
		System.out.println("\n\n Using listIterator() for forward and backward traversal:");
		
		ListIterator<String> listIterator = fruits.listIterator();
		while(listIterator.hasNext())
		{
			String fruit = listIterator.next();
			System.out.println(fruit+" ");
		}

		System.out.println("\n Backward traversal: ");
		while(listIterator.hasPrevious())
		{
			String fruit = listIterator.previous();
			System.out.println(fruit+" ");
		}
		
		// Use listIterator(int index) to start traversal from a specific position
		System.out.println("\n\n Use listIterator(int index) to start traversal from a specific position: ");
		
		listIterator = fruits.listIterator(3);
		while(listIterator.hasNext())
		{
			System.out.println(listIterator.next());
		}
	}
}
