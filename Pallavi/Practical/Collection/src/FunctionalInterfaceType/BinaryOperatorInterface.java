package FunctionalInterfaceType;
import java.util.function.Function;
import java.util.function.BinaryOperator;
public class BinaryOperatorInterface {

	public static void main(String[] args) {
		
		BinaryOperator<Integer> ob =(a,b)->a&b;
		System.out.println(ob.apply(12, 4));

	}

}
