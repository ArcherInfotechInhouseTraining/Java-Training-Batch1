package SetExamples;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;
public class HashSetIterationExample {

	public static void main(String[] args) {
		HashSet<Integer>set = new HashSet<>();
		set.add(11);
		set.add(21);
		set.add(31);
		set.add(41);
		set.add(51);
		
		//using iterator
		System.out.println("Using Iterator");
		Iterator<Integer> iterator=set.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		//using spliterator
		System.out.println("Using spliterator");
		Spliterator<Integer>spliterator= set.spliterator();
		spliterator.forEachRemaining((Integer i)->System.out.println(i));
		
		//using foreach
		System.out.println("Using foreach");
		set.forEach((Integer i)->System.out.println(i));

	}

}
