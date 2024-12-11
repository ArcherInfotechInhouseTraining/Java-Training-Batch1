package QueueExamples;
import java.util.PriorityQueue;
import java.util.Queue;
public class PriorityQueueExample {

	public static void main(String[] args) {
		Queue<Integer>prq = new PriorityQueue<>();
		// prg uses min heap as internal data structure
		prq.add(12);
		prq.add(23);
		prq.add(45);
		prq.add(17);
		prq.add(8);
		prq.add(42);
		prq.add(16);
		prq.add(7);
		prq.add(2);
		
		System.out.println("Original prq is: "+prq);
		
		prq.remove(8);
		
		System.out.println("After removing prq is: "+prq);	

	}

}
