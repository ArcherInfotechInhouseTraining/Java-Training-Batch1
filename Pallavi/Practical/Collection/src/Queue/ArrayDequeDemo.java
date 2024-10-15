package Queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeDemo {

	public static void main(String[] args) {
		
		Deque<String> deque = new ArrayDeque<>();
		deque.add("one");
		deque.add("two");
		deque.add("three");
		
		System.out.println("After add(): "+deque);
		
		deque.addFirst("zero");
		System.out.println("After addFirst(): "+deque);
		
		deque.addLast("Four");
		System.out.println("After addLast(): "+deque);
		
		deque.offer("five");
		deque.offerFirst("minus one");
		deque.offerLast("six");
		
		System.out.println("After offer operations: "+deque);
		System.out.println("\n------------------------------");
		
		 // Access elements without removal
		System.out.println("peek(): "+deque.peek());
		System.out.println("peekFirst(): "+deque.peekFirst());
		System.out.println("peekLast(): "+deque.peekLast());
		
		// Remove elements
		System.out.println("poll: "+deque.poll());
		System.out.println("After poll(): "+deque);
		
		System.out.println("pollFirst(): "+deque.pollFirst());
		System.out.println("After pollFirst(): "+deque);
		
		System.out.println("pollLast(): "+deque.pollLast());
		System.out.println("After pollLast(): "+deque);
		
		  // Remove specific elements
		deque.remove("two");
		System.out.println("after remove: "+deque);
		
		// Stack operations
		deque.push("First");
		System.out.println("After push: "+deque);

		deque.pop();
		System.out.println("After pop: "+deque);
	}

}
