package ListExamples;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Predicate;
public class PredicateExample2 {

	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<>();
		numbers.add(11);
		numbers.add(20);
		numbers.add(31);
		numbers.add(40);
		numbers.add(51);
		
		Predicate <Integer> isEven = (number) -> number%2==0;
		
		numbers.removeIf(isEven);
		
		System.out.println("Numbers after removing even elements: "+numbers);

	}

}
