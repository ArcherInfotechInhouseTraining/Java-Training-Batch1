package ListExamples;
import java.util.function.Function;
public class FunctionExample2 {

	public static void main(String[] args) {
		Function<Integer,Integer> square = x->x*x;
		
		int result=square.apply(5);
		System.out.println("Square of 5 is: "+result);
		
		Function <String,String> toUpperCase = str->str.toUpperCase();
		
		String uppercased = toUpperCase.apply("pawar");
		
		System.out.println("Uppercase: "+uppercased);

	}

}
