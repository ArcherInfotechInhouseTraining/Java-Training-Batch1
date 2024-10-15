package Set;

import java.util.ArrayList;
import java.util.HashSet;

import java.util.Iterator;

// Create HashSet from Another Collection

public class HashSetFromCollections {

	public static void main(String[] args) {
		
		ArrayList<Integer> list1 = new ArrayList<>();
		list1.add(12);
		list1.add(34);
		list1.add(56);
		list1.add(78);
		list1.add(90);
		list1.add(43);
		
		ArrayList<Integer> list2 = new ArrayList<>();
		list2.add(32);
		list2.add(55);
		list2.add(16);
		list2.add(75);
		list2.add(39);
		list2.add(56);
		
		HashSet<Integer> set = new HashSet<>(list1);
		set.addAll(list2);
		
		System.out.println("set: "+set);
		
		//also we can print 
		Iterator<Integer> iterator = set.iterator();
		while(iterator.hasNext())
		{
			System.out.print(" "+iterator.next());
		}
	}
}
