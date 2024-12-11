package ListExamples;
import java.util.ArrayList;
public class ArrayListExamples3 {

	public static void main(String[] args) {

		ArrayList<String> arraylist=new ArrayList<>(9); 
		arraylist.add("C++");
		arraylist.add("Java");
		arraylist.add(0,"C");
		System.out.println(arraylist); 

		ArrayList<String> al=new ArrayList<>(); 
		al.add("Android");
		al.addAll(arraylist);
		System.out.println(al); 
		
		ArrayList<String> a2=new ArrayList<>(); 
		a2.add("SQL");
		a2.add("NoSQL");
		a2.addAll(1,al);
		System.out.println(a2); 
		
		a2.set(5, "Oracle");
		System.out.println(a2);
	}
}

