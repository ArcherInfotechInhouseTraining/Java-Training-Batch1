package List;

import java.util.ArrayList;

public class RetainAllExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> list1 = new ArrayList<>();
		ArrayList<String> list2 = new ArrayList<>();
		list1.add("Mango");
		list1.add("Banana");
		list1.add("Orange");
		list1.add("Apple");
		
		 // Adding elements to the second ArrayList
		list2.add("Banana");
		list2.add("Orange");
		list2.add("Kiwi");
		
        // Printing the original lists
		System.out.println("List1: "+list1);
		System.out.println("List2: "+list2);
		
        // Retaining only the elements that are common in both lists
		boolean changed = list1.retainAll(list2);
		
        // Printing the modified list1
		System.out.println("Modified list1: "+list1);
		
		 // Checking if the list1 has been modified
		System.out.println("List1 has been modified: "+changed);
		
	}

}
