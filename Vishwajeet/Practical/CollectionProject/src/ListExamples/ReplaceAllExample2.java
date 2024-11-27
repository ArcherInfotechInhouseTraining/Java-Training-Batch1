package ListExamples;
import java.util.ArrayList;
import java.util.function.Predicate;
import java.util.ArrayList;
public class ReplaceAllExample2 {

	public static void main(String[] args) {
		ArrayList<String> fruits = new ArrayList<>();
		fruits.add("banana");
		fruits.add("mango");
		fruits.add("chickoo");
		fruits.add("grapes");
		
		System.out.println("Fruits: "+fruits);
		fruits.replaceAll(fruit->fruit.toUpperCase());
		
		System.out.println("Uppercase fruits names: "+fruits);	

	}

}
