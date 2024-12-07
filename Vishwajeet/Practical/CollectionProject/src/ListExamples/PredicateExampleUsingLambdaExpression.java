package ListExamples;
import java.util.function.Predicate;
public class PredicateExampleUsingLambdaExpression {

	public static void main(String[] args) {
		Predicate <Integer> isEven = (number)-> number%2==0;
		
		System.out.println("IsEven 4 ?: "+isEven.test(4));
		System.out.println("IsEven 7 ?: "+isEven.test(7));

	}

}
