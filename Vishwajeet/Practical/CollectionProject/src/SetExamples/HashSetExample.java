package SetExamples;
import java.util.HashSet;
import java.util.Arrays;
import java.util.Collection;
public class HashSetExample {

	public static void main(String[] args) {
		HashSet<String> set1= new HashSet<>();
		set1.add("One");
		set1.add("Two");
		set1.add("Three");
		set1.add("Four");
		set1.add("One");
		
		System.out.println("Set1: "+set1);
		
		// using constructor that accepts collection
		Collection<String> collection = Arrays.asList("Four","Five","Six","Two");
		
		HashSet <String> set2 = new HashSet<>(collection);
		System.out.println("Set2: "+set2);
		
		HashSet<String> set3 = new HashSet<>(10);
		set3.add("Seven");
		set3.add("Eight");
		System.out.println("Set3: "+set3);
		
		HashSet<String> set4 = new HashSet<>(10,0.5f);
		set4.add("Nine");
		set4.add("Ten");
		System.out.println("Set4: "+set4);
		

	}

}
