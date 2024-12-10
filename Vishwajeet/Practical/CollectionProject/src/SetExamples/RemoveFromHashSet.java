package SetExamples;
import java.util.Arrays;
import java.util.HashSet;

public class RemoveFromHashSet {

	public static void main(String[] args) {
		HashSet<String>set= new HashSet<>();
		set.addAll(Arrays.asList("Apple","Banana","Mango","Cherry","Grapes"));
		
		System.out.println("Original HashSet: "+set);
		
		set.remove("Cherry");
		System.out.println(set);
		
		set.removeAll(Arrays.asList("Apple","Grapes"));
		System.out.println(set);
		
		// Using removeIf(Predicate<? super E> filter)
		set.removeIf(fruit -> fruit.startsWith("M"));
		System.out.println("\n After removeIf:\n"+set);
		

	}

}
