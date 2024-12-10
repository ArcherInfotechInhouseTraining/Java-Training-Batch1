package ListExamples;
import java.util.LinkedList;
import java.util.Queue;
public class QueueExample {

	public static void main(String[] args) {
		LinkedList <Integer> l1 = new LinkedList<>();
		l1.add(11);
		l1.add(23);
		l1.add(77);
		l1.add(555);
		l1.add(777);
		
		System.out.println(l1);
		
		for(Object ob:l1) {
			System.out.println(ob);
			
		}
		Queue <Integer>q1 = new LinkedList<>(l1);
		System.out.println("Element at first: "+q1.element());
		System.out.println("Element offer: "+q1.offer(54));
		System.out.println("Element at first: "+q1.peek());
		System.out.println("Element at first: "+q1.poll());
		System.out.println("Element at first: "+q1.poll());
		System.out.println("Element at first: "+q1.remove());
		q1.add(11);
		System.out.println(q1);	
	}

}
