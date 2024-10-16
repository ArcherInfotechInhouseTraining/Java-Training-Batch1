package ListExamples;
import java.util.ArrayList;
public class ArrayListExamples2 {

	public static void main(String[] args) {

		ArrayList<String> arraylist=new ArrayList<>(9); 
		arraylist.add("hello");
		arraylist.add(null);
		arraylist.add(null);
		arraylist.add("C");
		arraylist.add("C++");
		arraylist.add("Java");
		System.out.println(arraylist); // displays , separated the elements within [ ]

		ArrayList<String> al=new ArrayList<>(arraylist); 
		System.out.println(al); // displays , separated the elements within [ ]
		
	}
}



