package FunctionalInterfaceType;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class UnaryOperatorInterface {

	public static void main(String[] args) {


		UnaryOperator<Integer> ob = a->a^1;
		System.out.println(ob.apply(0));
	}
}
