package SetExamples;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.List;
import java.util.Iterator;
public class HashSetFromCollections {
	public static void main(String[] args) {
		List<Integer>list = new ArrayList<>();
		list.add(11);
		list.add(22);
		list.add(33);
		list.add(44);
		list.add(55);
		
		List<Integer>list2 = new ArrayList<>();
		list2.add(10);
		list2.add(20);
		list2.add(30);
		list2.add(40);
		list2.add(50);
		
		
		//Creating hashset from another collection from arraylist
		Set<Integer> set = new HashSet<>(list);
		set.addAll(list2);
		
		System.out.println(set);
		
		//Accessing elements using Iterator
		System.out.println("\n Accessing elements using Iterator");
		Iterator<Integer>iterator = set.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}	

	}

}
