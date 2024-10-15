package Set;

import java.util.Arrays;
import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetAddExample {

	public static void main(String[] args) {
		
		//add() and addAll()
		
		TreeSet<Integer> evenum = new TreeSet<>();
		evenum.add(2);
		evenum.add(4);
		evenum.add(6);
		evenum.add(8);
		
		System.out.println("Using add(): "+evenum);
		
		TreeSet<Integer> treeset = new TreeSet<>();
		treeset.add(33);
		treeset.addAll(evenum);
		treeset.add(5);
		treeset.add(55);
		treeset.add(95);

		System.out.println("Using addAll(): "+treeset);
		System.out.println("------------------------------------");
		
		//Iterator()
		
		System.out.println("Using Iterator: ");
		Iterator<Integer> iterator = treeset.iterator();
		while(iterator.hasNext())
		{
			System.out.print(" "+iterator.next());
		}
		System.out.println("\n------------------------------------");
		
		//remove() and removeAll()
		TreeSet<Integer> numbers = new TreeSet<>();
		numbers.addAll(treeset);
		
		System.out.println("numbers: "+numbers);
		boolean b1 = numbers.remove(8);
		System.out.println("Is 8 removed? : "+b1);
		System.out.println("numbers: "+numbers);
		
		boolean b2 = numbers.removeAll(numbers);
		System.out.println("All numbers removed: "+b2);
		System.out.println("numbers: "+numbers);
		
		System.out.println("\n------------------------------------");
		
		//first() and last() method
		int firstnum = treeset.first();
		int lastnum = treeset.last();
		System.out.println("First Number: "+firstnum);
		System.out.println("Last Number: "+lastnum);
		
		System.out.println("\n------------------------------------");
		
		// ceiling(), floor(), higher() and lower() Methods
		
		System.out.println("Using ceiling(): "+treeset.ceiling(4));
		System.out.println("Using floor(): "+treeset.floor(4));
		System.out.println("Using higher(): "+treeset.higher(4));
		System.out.println("Using lower(): "+treeset.lower(4));
		
		System.out.println("\n------------------------------------");
		
	//  pollFirst() and pollLast() Methods
		System.out.println("pollFirst(): "+treeset.pollFirst());
		System.out.println("pollLast(): "+treeset.pollLast());
		
		System.out.println("\n------------------------------------");
		
		// The headSet()	, The tailSet() ,The subSet()
		System.out.println("TreeSet: "+treeset);
		System.out.println("headset(): "+treeset.headSet(8));
		System.out.println("tailSet(): "+treeset.tailSet(8));
		System.out.println("subset(): "+treeset.subSet(5,55));
		
		System.out.println("\n------------------------------------");
		System.out.println();
		
		// subset, difference, intersection, and union operations on TreeSet 
		
		TreeSet<Integer> set1 = new TreeSet<>();
		TreeSet<Integer> set2 = new TreeSet<>();
		
		set1.addAll(Arrays.asList(1,2,3,4,5));
		set2.addAll(Arrays.asList(4,5,6,7,8));
		
		// Displaying the original sets
        System.out.println("Set 1: " + set1);
        System.out.println("Set 2: " + set2);
        
        //Union operation
        TreeSet<Integer> union = new TreeSet<>(set1);
        union.addAll(set2);
        System.out.println("Union operation: "+union);
       
        //subset operation
        TreeSet<Integer> intersection = new TreeSet<>(set1);
        intersection.retainAll(set2);
        System.out.println("Subset operation: "+intersection);
      
        // Difference operation (set1 - set2)
        TreeSet<Integer> difference1 = new TreeSet<>(set1);
        System.out.println(difference1);
        difference1.removeAll(set2);
        System.out.println("Difference of set1 - set2: "+difference1);
        

        TreeSet<Integer> difference2 = new TreeSet<>(set2);
        System.out.println(difference2);
        difference2.removeAll(set1);
        System.out.println("Difference of set2 - set1: "+difference2);
        
        
	}
}
