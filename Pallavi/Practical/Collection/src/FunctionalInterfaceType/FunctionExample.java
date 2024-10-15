package FunctionalInterfaceType;
import java.util.function.Function;
/*
public class FunctionExample {

	public static void main(String[] args) {

        // Creating a Function to get the length of a String
		Function<String,Integer> stringLength = (str)->str.length();
		
		 // Applying the Function to get the length of a String
		int length = stringLength.apply("Hello");
		System.out.println("length: "+length);
	}
}
*/
//----------------------------------------------------------------------

public class FunctionExample
{
	public static void main(String args[])
	{
		// Function to square a number (input: Integer, output: Integer)
		Function<Integer,Integer> square = x->x*x;
		
		 // Apply the function to calculate the square of 5
		int result = square.apply(5);
		System.out.println("Result: "+result);
		

        // Function to convert a string to uppercase (input: String, output: String)
		Function<String,String> toUpperCase = str->str.toUpperCase(); //lambda exper.
		
		// Apply the function to convert "hello" to uppercase
		String uppercase = toUpperCase.apply("hello");
		System.out.println(uppercase);
	}
}