package List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Spliterator;

public class SpliteratorExample {

	public static void main(String[] args) {
		
		ArrayList <Integer> arlst = new ArrayList<>();
		
		arlst.add(24);
		arlst.add(324);
		arlst.add(94);
		arlst.add(12);
		arlst.add(134);
		arlst.add(20);
		arlst.add(242);
		arlst.add(4);
		arlst.add(400);
		
		System.out.println("Arraylist : "+arlst);
		System.out.println("\n-------------------------------------------------");
		
		System.out.println("ArrayList using Iterator: ");
		
		Iterator<Integer> ob = arlst.iterator();
		while(ob.hasNext())
		{
			System.out.print(" "+ob.next());
		}
		System.out.println("\n-------------------------------------------------");
		
		ob = arlst.iterator();
		System.out.println("\n Arraylist using foreach: ");
		ob.forEachRemaining(element -> System.out.print(" "+element));
		System.out.println("\n-------------------------------------------------");
		
		Spliterator<Integer> sob =  arlst.spliterator();
		System.out.println("\n Using spliterator tryadvance-I: ");
		while(sob.tryAdvance(element -> System.out.print(" "+element)));
		System.out.println("\n-------------------------------------------------");
		
		sob = arlst.spliterator();
		System.out.println("\n Using spliterator tryadvance-II: ");
		while(sob.tryAdvance(System.out::print)); // short way for above
		System.out.println("\n-------------------------------------------------");
		
		sob = arlst.spliterator();
		Spliterator<Integer> sob1 = sob.trySplit(); 
		System.out.println("ArrayList(Split part): ");
		
		if(sob1 != null)
		{
			sob1.forEachRemaining(element -> System.out.print(" "+element));
		}
		System.out.println("\n-------------------------------------------------");
		
		System.out.println("\n ArrayList: ");
		sob.forEachRemaining(element -> System.out.print(" "+element));
	}
}
