package SetExamples;
import java.util.TreeSet;

public class TreeSetAddExample {

	public static void main(String[] args) {
		TreeSet<Integer> evenNumbers = new TreeSet<>();
		evenNumbers.add(2);
		evenNumbers.add(4);
		evenNumbers.add(6);
		evenNumbers.add(8);
		
		TreeSet<Integer> numbers = new TreeSet<>();
		numbers.add(1);
		
		numbers.addAll(evenNumbers);
		System.out.println(numbers);
		

	}

}
