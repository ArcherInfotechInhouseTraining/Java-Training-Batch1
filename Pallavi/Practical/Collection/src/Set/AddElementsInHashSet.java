package Set;
//Add Elements to HashSet

import java.util.HashSet;

public class AddElementsInHashSet {

	public static void main(String []args)
	{
		HashSet<String> set = new HashSet<>();
		set.add("Python");
		set.add("Java");
		set.add("JS");
		set.add("Python");
		set.add("Java");
		set.add("JS");
		
		System.out.println("Set is: ");
		for(String language:set)
		{
			System.out.println(language);
		}
	}
}
