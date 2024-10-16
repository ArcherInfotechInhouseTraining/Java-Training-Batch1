package SetExamples;
import java.util.*;
public class TreeSetConstructorsExample {

	public static void main(String[] args) {
		TreeSet<Integer> treeSet1 = new TreeSet<>();
		treeSet1.add(11);
		treeSet1.add(22);
		treeSet1.add(33);
		
		System.out.println("TreeSet created with default constructor: "+treeSet1);
		
		//using constructor with collection parameter
		List<Integer>list=Arrays.asList(10,20,30);
		TreeSet<Integer> treeSet2 = new TreeSet<>(list);
		
		System.out.println("TreeSet created with collection constructor: "+treeSet2);
		
		// using constructor with comparator parameter
		TreeSet<String> treeSet3 = new TreeSet<>(Comparator.reverseOrder());
		treeSet3.add("Banana");
		treeSet3.add("Mango");
		treeSet3.add("Chickoo");
		
		System.out.println("Constructor using comparator operator: "+treeSet3);

	}

}
