package FunctionalInterfaceType;

import java.util.ArrayList;
import java.util.function.Predicate;
/*
public class PredicateExample {

	public static void main(String[] args) {
		
		// Creating a Predicate to check if a number is even
		Predicate<Integer> isEven = new IsEvenPredicate();
		

        // Testing the Predicate with some numbers
		System.out.println("4 is Even? : "+isEven.test(4));
		System.out.println("7 is Even? : "+isEven.test(7));
	}
}

class IsEvenPredicate implements Predicate<Integer>
{
	public boolean test(Integer number)
	{
		return number%2==0;
	}
}

//-----------------------------------------------------------------

//using lambda expression

class PredicateExample
{
	public static void main(String[] args)
	{
		Predicate<Integer> isEven = (number) -> number % 2 == 0;
		
		// Testing the Predicate with some numbers
		System.out.println("6 is Even ? : "+isEven.test(6));
		System.out.println("7 is even ? : "+isEven.test(7));
	}
}
*/
//------------------------------------------------------------


// using with arrayList

public class PredicateExample {

	public static void main(String[] args) {
		
		ArrayList <Integer> numbers = new ArrayList<>();
		numbers.add(10);
		numbers.add(23);
		numbers.add(30);
		numbers.add(45);
		numbers.add(50);
		
		 // Predicate to check if a number is even
		
		Predicate<Integer> isEven = (number) -> number % 2 == 0;
		

        // Remove all even numbers using removeIf and Predicate
		numbers.removeIf(isEven);
		System.out.println(numbers);
		
		// Another Predicate to check if a number is greater than 30
		
		Predicate<Integer> greaterthan30 = (number) -> number>30;
		numbers.removeIf(greaterthan30);
		System.out.println(numbers);
	}
}