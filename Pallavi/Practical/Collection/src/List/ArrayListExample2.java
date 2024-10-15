package List;

import java.util.ArrayList;

public class ArrayListExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList <String> arraylist = new ArrayList<>();
		arraylist.add("Hello");
		arraylist.add("null");
		arraylist.add("null");
		arraylist.add("Java");
		arraylist.add("C");
		arraylist.add("C++");
		
		System.out.println(arraylist);
		
		ArrayList<String> al = new ArrayList<>(arraylist);
		System.out.println(al);
		
		arraylist.add(0,"C");
		System.out.println(arraylist);
		
		ArrayList<String> al2 = new ArrayList<>();
		al2.add("Android");
		al2.addAll(arraylist);
		
		System.out.println(al2);
		
		ArrayList <String> a2 = new ArrayList<>();
		a2.add("Sql");
		a2.add("NoSql");
		a2.addAll(1,al2);
		System.out.println(a2);
		
		a2.set(5, "Oracle");
		System.out.println(a2);
	}
}
