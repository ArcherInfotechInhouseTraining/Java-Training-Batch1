package ListExamples;
import java.util.function.Function;
import java.util.function.BinaryOperator;
public class FunctionExample4 {

	public static void main(String[] args) {
		BinaryOperator <Integer> and = (a,b)-> a&b;
		System.out.println(and.apply(12, 4));

	}

}
