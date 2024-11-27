import java.util.function.Function;
class FunctionExample 
{
	public static void main(String[] args) 
	{
		Function <Integer, Integer> square = x -> x * x;

		//apply to function to calculate the square of 5
		int result = square.apply(5);
		System.out.println("Square: "+result);

		Function <String, String> toUpperCase = str->str.toUpperCase();

		String result1 = toUpperCase.apply("vishwajeet");

		System.out.println("Uppercase: "+result1);
	}
}
