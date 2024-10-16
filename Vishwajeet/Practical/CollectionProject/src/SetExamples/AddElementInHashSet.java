package SetExamples;
import java.util.HashSet;
import java.util.Arrays;
import java.util.Collection;

public class AddElementInHashSet {

	public static void main(String[] args) {
		HashSet<String> set = new HashSet<>();
		set.add("Java");
		set.add("C");
		set.add("C++");
		set.add("Python");
		set.add("SQL");
		
		for(String language:set) {
			System.out.println(language);
		}

	}

}
