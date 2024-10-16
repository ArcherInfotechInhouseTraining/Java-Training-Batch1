package SetExamples;
import java.util.TreeSet;
public class TreeSetPoll {

	public static void main(String[] args) {
		TreeSet<Integer> set = new TreeSet<>();
		
		set.add(1);
		set.add(2);
		set.add(3);
		set.add(4);
		
		System.out.println(set);
		
		System.out.println("PollFirst: "+set.pollFirst());
		
		System.out.println("pollLast: "+set.pollLast());
		
		System.out.println("New Tree set: "+set);	

	}

}
