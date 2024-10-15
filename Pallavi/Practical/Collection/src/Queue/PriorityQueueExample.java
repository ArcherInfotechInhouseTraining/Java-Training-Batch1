package Queue;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Max heap
		Queue<Integer> prq = new PriorityQueue<>(Comparator.reverseOrder());
		prq.add(45);
		prq.add(89);
		prq.add(12);
		prq.add(6);
		prq.add(33);
		prq.add(23);
		prq.add(77);
		
		System.out.println(prq);
		
	}

}
