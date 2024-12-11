package ListExamples;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
public class ConsumerExampleUsingLambdaExpression {

	public static void main(String[] args) {
		List<Integer>numbers=new ArrayList<>();
		numbers.add(11);
		numbers.add(22);
		numbers.add(33);
		numbers.add(44);
		numbers.add(55);
		
		Consumer<Integer>printNumber = (number)->System.out.println(number);
		numbers.forEach(printNumber);
		
		numbers.forEach((number)->System.out.println(number));

	}

}
