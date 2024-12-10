package SetExamples;
import java.util.TreeSet;
public class TreeSetFirstLast {

	public static void main(String[] args) {
		TreeSet <Integer> numbers = new TreeSet<>();
		numbers.add(11);
		numbers.add(22);
		numbers.add(33);
		numbers.add(44);
		
		System.out.println("TreeSet: "+numbers);
		
		int first = numbers.first();
		System.out.println("First element: "+first);
		
		int last = numbers.last();
		System.out.println("last element: "+last);

	}

}
