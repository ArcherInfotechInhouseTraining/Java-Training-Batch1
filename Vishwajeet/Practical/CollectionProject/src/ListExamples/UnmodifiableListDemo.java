package ListExamples;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
public class UnmodifiableListDemo {

	public static void main(String[] args) {
		LinkedList<String>fruits = new LinkedList<>();
		fruits.add("Banana");
		fruits.add("Mango");
		fruits.add("Chickoo");
		fruits.add("Grapes");
		
		System.out.println("Original linked list: ");
		printList(fruits);
		
		List<String> unmodifiableList = Collections.unmodifiableList(fruits);
		
		System.out.println("\n unmodifiable list: ");
		printList(unmodifiableList);
		
		try {
			unmodifiableList.addFirst("Mango");
			System.out.println("Successfully added Mango (should not happen!)");

		}
		catch(UnsupportedOperationException e) {
			System.out.println("Should not happen"+e);
		}
		fruits.addFirst("Grapes");
		System.out.println("\nAfter modifying original list (LinkedList): ");
        printList(fruits);
        
        System.out.println("\nUnmodifiable List (after modification): ");
        printList(unmodifiableList);	

	}
	private static void printList(List<String>list) {
		for(String fruit :list ) {
			System.out.println(fruit +" ");
			
		}
		System.out.println();
			
	}

}
