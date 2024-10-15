package FunctionalInterfaceType;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

/*
class PrintNumber implements Consumer<Integer>
{
	public void accept(Integer number)
	{
		System.out.println(number);
	}
}
public class ConsumerExample {

	public static void main(String[] args) {
		
		// Creating a list of integers
		List<Integer> numbers = new ArrayList<>();
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		numbers.add(4);
		numbers.add(5);
		
		// Creating a Consumer to print the elements of the list
		Consumer<Integer> printNumber = new PrintNumber();

		// Applying the Consumer to each element of the list
		numbers.forEach(printNumber);
	}
}

*/
//------------------------------------------------------------------------
//using lambda expression

class ConsumerExample
{
	public static void main(String args[])
	{
		List<Integer> numbers = new ArrayList<>();
		numbers.add(10);
		numbers.add(20);
		numbers.add(30);
		numbers.add(40);
		numbers.add(50);
		
		// Creating a Consumer to print the elements of the list
		
		Consumer<Integer> printNumber = (number)->System.out.println(number);
		

        // Applying the Consumer to each element of the list
		numbers.forEach(printNumber);
		
		System.out.println("Anathore way: ");
		numbers.forEach((number)->System.out.println(number));
	}
}






