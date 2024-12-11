package ListExamples;
import java.util.ArrayList;
import java.util.List;
public class ArrayListExamples4 {

	public static void main(String[] args) {

		ArrayList<String> arraylist=new ArrayList<>(9); 
		arraylist.add("C++");
		arraylist.add("Java");
		arraylist.add(0,"C");
		System.out.println("Arraylist contains Java: "+arraylist.contains("Java")); 

		ArrayList<String> al=new ArrayList<>(); 
		al.add("Android");
		al.addAll(arraylist);
		System.out.println(al); 
		System.out.println("2nd element in al: "+al.get(2)); 
		
		ArrayList<String> a2=new ArrayList<>(); 
		a2.add("SQL");
		a2.add("NoSQL");
		a2.addAll(1,al);
		System.out.println("a2 contains arraylist: "+a2.containsAll(arraylist)); 		
		a2.set(5, "Oracle");
		System.out.println(a2);
		
		List<String> sl=a2.subList(2, 5);
		System.out.println("Sublist: "+sl);
		
		if(a2.indexOf("Java")!=-1)
		{
			System.out.println("Java present at "+a2.indexOf("Java")+" position");
		}
		else
		{
			System.out.println("Java is not present in the List");
		}
		
		a2.add("C");
		System.out.println(a2);
		System.out.println("Last index of C in a2: "+a2.lastIndexOf("C"));
		
		a2.remove("C"); //      remove first occurance
		System.out.println(a2);
		
		a2.removeAll(arraylist); // remove all occurance  in arraylist from a2
		System.out.println(a2);
	}
}

