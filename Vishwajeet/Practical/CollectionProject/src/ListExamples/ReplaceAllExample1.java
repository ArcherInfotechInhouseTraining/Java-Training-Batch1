package ListExamples;
import java.util.ArrayList;
import java.util.function.Predicate;
import java.util.ArrayList;

public class ReplaceAllExample1 {

	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<>();
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		numbers.add(4);
		numbers.add(5);
		
		System.out.println("Numbers : "+numbers);
		numbers.replaceAll(n->n*n);
		
		System.out.println("Modified Numbers : "+numbers);
	}

}
