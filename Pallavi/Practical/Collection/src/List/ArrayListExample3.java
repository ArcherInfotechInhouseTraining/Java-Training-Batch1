package List;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList <String> arraylist = new ArrayList<>();
		arraylist.add("Java");
		arraylist.add(0,"C");
		arraylist.add("C++");
		
		System.out.println("arraylist ccontains java"+arraylist.contains("Java"));
		
		ArrayList<String> al = new ArrayList<>();
		al.add("Android");
		al.addAll(arraylist);
		
		System.out.println("2nd element is al2: "+al.get(2));
		
		ArrayList <String> a2 = new ArrayList<>();
		a2.add("Sql");
		a2.add("NoSql");
		a2.addAll(1,al);
		System.out.println("a2 contains arraylist: "+a2.containsAll(arraylist));
		System.out.println(a2);
		
		a2.set(5, "Oracle");
		System.out.println(a2);
		
		List<String> sl = a2.subList(2, 5);
		System.out.println("Sublist is: "+sl);
		
		if(a2.indexOf("Java")!=-1)
		{
			System.out.println("Java present at: "+a2.indexOf("Java")+" position");
		}
		else
		{
			System.out.println("Java is not present in the list");
		}
		
		a2.add("C");
		System.out.println(a2);
		System.out.println("Last index of c in a2 is: "+a2.lastIndexOf("C"));
		
		a2.remove("C");
		System.out.println(a2);
		
		a2.removeAll(arraylist);
		System.out.println(a2);
	}
}
