package Queue;

import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

//// Creating PriorityQueue from another PriorityQueue 

public class PriorityQueueExample3 {

	public static void main(String[] args) {
		
		List<Integer> list = new LinkedList<>();
		list.add(23);
		list.add(10);
		list.add(7);
		list.add(30);
		list.add(88);
		list.add(45);
		list.add(67);
		
		System.out.println("list: "+list);
		
		Queue<Integer> prq = new PriorityQueue<>(list);
		System.out.println("PriorityQueue: "+prq);
		
		Queue<Integer> p1 = new PriorityQueue<>(prq);
		System.out.println("Another PriorityQueue: "+p1);
		
		prq.remove(88);
		
		System.out.println("PriorityQueue: "+prq);
		System.out.println("Another PriorityQueue: "+p1);

	}

}
