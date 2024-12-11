package ListExamples;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Spliterator;
public class UsingSpliterator {

	public static void main(String[] args) {
		ArrayList<Integer> arlst = new ArrayList<>();
		arlst.add(11);
		arlst.add(21);
		arlst.add(7);
		arlst.add(19);
		arlst.add(15);
		arlst.add(44);
		arlst.add(77);
		
		System.out.println("Arraylist is : "+arlst);
		
		Iterator<Integer> ob=arlst.iterator(); 
		System.out.println("Entered arraylist using iterator: ");
		while(ob.hasNext()) {
			System.out.println(" "+ob.next());
		}
		
		//by using foreach remaining
		
		ob=arlst.iterator();
		System.out.println("by using foreach: ");
		ob.forEachRemaining(element ->System.out.print(" "+element));
		
		Spliterator<Integer> sob = arlst.spliterator();
		
		//System.out.println("\n By using spliterator tryAdvance:I ");
		//while(sob.tryAdvance(element -> System.out.print(" "+element))); // Spliterator called only once in prg
		
		System.out.println("\n By using spliterator tryAdvance:II ");
		while(sob.tryAdvance(System.out::println));
		
		sob=arlst.spliterator();
		Spliterator <Integer> sob1 = sob.trySplit();
		System.out.println("Entered arraylist is (split part)");
		
		if(sob1!=null) 
			sob1.forEachRemaining(element ->System.out.print(" "+element));
		
		System.out.println("\n Entered arraylist is (split part)");
		sob.forEachRemaining(element ->System.out.print(" "+element)); //remaining part	

	}

}
