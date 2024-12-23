//package collectionexamples;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;
public class PriorityQueueExample {

	public static void main(String []args)
	{
		Queue<Integer> prq = new PriorityQueue<>(Comparator.reverseOrder()); 
		// Comparator.reverseOrder() prq uses the max heap as an internal data structure
		prq.add(4);
		prq.add(3);
		prq.add(12);
		prq.add(45);
		prq.add(24);
		prq.add(11);
		prq.add(2);
		prq.add(18);
		prq.add(1);
		System.out.println("Original prq is: "+prq);
		prq.remove(4);
		System.out.println("After prq is: "+prq);
	}
}
