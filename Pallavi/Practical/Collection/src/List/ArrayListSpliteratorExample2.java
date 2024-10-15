package List;

import java.util.ArrayList;
import java.util.List;
import java.util.Spliterator;

public class ArrayListSpliteratorExample2 {

	public static void main(String[] args) {
		
		List<String> mylist = new ArrayList<>();
		mylist.add("apple");
		mylist.add("banana");
		mylist.add("mango");
		mylist.add("orange");
		mylist.add("grapes");
		mylist.add("Watermelon");
		
		Spliterator<String> spliterator = mylist.spliterator();
		

        // Sequential traversal using tryAdvance()
		System.out.println("Sequential traversal using tryAdvance(): ");
		while(spliterator.tryAdvance(System.out::print));

        // Reset the spliterator
		spliterator = mylist.spliterator();
		
		// Parallel traversal using trySplit()
		System.out.println("\n Parallel traversal using trySplit(): ");
		Spliterator<String> splitSpliterator = spliterator.trySplit();
		
		if(splitSpliterator != null)
		{
			// Process the first half of the list in parallel
			splitSpliterator.forEachRemaining(System.out::println);
		}
		
        // Process the second half of the list sequentially
		System.out.println("Processing remaining elements sequentially: ");
		spliterator.forEachRemaining(System.out::println);
	}

}
