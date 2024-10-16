package ListExamples;
import java.util.function.Predicate;
public class PredicateExample1 {

	public static void main(String[] args) {
		Predicate <Integer> isEven = new IsEvenPredicate();
		
		System.out.println("Is 4 Even?: "+isEven.test(4));
		System.out.println("Is 7 Even?: "+isEven.test(7));	

	}

}
class IsEvenPredicate implements Predicate<Integer>{
	public boolean test(Integer number) {
		return number %2 ==0;
	}
}
