package ListExamples;
import java.util.function.Function;
import java.util.function.UnaryOperator;
public class FunctionExample3 {

	public static void main(String[] args) {
		UnaryOperator <Integer> not = a->a^1;
		System.out.println(not.apply(0));

	}
}
