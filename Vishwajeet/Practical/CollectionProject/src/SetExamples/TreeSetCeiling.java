package SetExamples;
import java.util.TreeSet;
public class TreeSetCeiling {

	public static void main(String[] args) {
		TreeSet <Integer> numbers = new TreeSet<>();
		numbers.add(11);
		numbers.add(22);
		numbers.add(33);
		numbers.add(44);
		
		System.out.println("TreeSet: "+numbers);
		
		// using higher
		System.out.println("Using higher: "+numbers.higher(33));
		
		System.out.println("Using lower: "+numbers.lower(33));
		
		System.out.println("Using Ceiling: "+numbers.ceiling(15)); // same gives the higher value as you pass
		
		System.out.println("Using floor: "+numbers.floor(15)); // gives lower value as you pass value as an argument and if the value is present then it gives same value as you pass
		
		
		
		
		

	}

}
