package ListExamples;
import java.util.ArrayList;
import java.util.function.Predicate;
public class RemoveIfExample {

	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<>();
		numbers.add(11);
		numbers.add(22);
		numbers.add(33);
		numbers.add(44);
		numbers.add(55);
		
		System.out.println("Numbers before removal: "+numbers);
		
		boolean removed = numbers.removeIf(number->number%2==0);
		
		System.out.println("Numbers After removal: "+numbers);
		System.out.println("Elements removed: "+removed);

	}

}
