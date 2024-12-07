package ListExamples;
import java.util.ArrayList;
import java.util.Collection;
public class RetainAllExample {

	public static void main(String[] args) {
		ArrayList<String> list1 = new ArrayList<>();
		ArrayList<String> list2 = new ArrayList<>();
		
		list1.add("one");
		list1.add("Two");
		list1.add("Three");
		list1.add("Four");
		
		list2.add("Two");
		list2.add("Five");
		list2.add("Four");
		
		System.out.println("Original list 1 : "+list1);
		System.out.println("Original list 2 : "+list2);
		
		// retaining only elements that are common in both list
		boolean changed = list1.retainAll(list2);
		
		System.out.println("Modified list 1: "+list1);
		
		System.out.println("Check if list 1  has been modified ? "+changed);
		

	}

}
