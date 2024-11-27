package ListExamples;
import java.util.function.Function;
public class FunctionExample1 {

	public static void main(String[] args) {
		//creating a function to get length of string
		Function <String,Integer> stringLength = (str)->str.length();
		
		//appy function to get length of string
		int length = stringLength.apply("Hello");
		
		System.out.println("Length of string: "+length);

	}

}
