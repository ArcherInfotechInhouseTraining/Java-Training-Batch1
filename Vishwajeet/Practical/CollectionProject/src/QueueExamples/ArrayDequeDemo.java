package QueueExamples;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeDemo {
    public static void main(String[] args) {
        // Initialize an ArrayDeque
        Deque<String> deque = new ArrayDeque<>();

        // Add elements at the end
        deque.add("One");
        deque.add("Two");
        deque.add("Three");
        System.out.println("After add: " + deque);

        // Add elements at the beginning
        deque.addFirst("Zero");
        System.out.println("After addFirst: " + deque);

        // Add elements at the end
        deque.addLast("Four");
        System.out.println("After addLast: " + deque);

        // Offer elements (equivalent to add but returns false if it fails)
        deque.offer("Five");
        System.out.println("After offer: " + deque);

        deque.offerFirst("Minus One");
        System.out.println("After offerFirst: " + deque);

        deque.offerLast("Six");
        System.out.println("After offerLast: " + deque);

        // Access elements without removal
        System.out.println("peek: " + deque.peek());
        System.out.println("peekFirst: " + deque.peekFirst());
        System.out.println("peekLast: " + deque.peekLast());

        // Remove elements
        System.out.println("poll: " + deque.poll());
        System.out.println("After poll: " + deque);

        System.out.println("pollFirst: " + deque.pollFirst());
        System.out.println("After pollFirst: " + deque);

        System.out.println("pollLast: " + deque.pollLast());
        System.out.println("After pollLast: " + deque);

        // Remove specific elements
        deque.remove("Two");
        System.out.println("After remove 'Two': " + deque);

        // Stack operations
        deque.push("First");
        System.out.println("After push: " + deque);

        System.out.println("pop: " + deque.pop());
        System.out.println("After pop: " + deque);

        // Remaining methods
        deque.add("Seven");
        deque.add("Eight");
        deque.add("Nine");
        System.out.println("After adding more elements: " + deque);

        System.out.println("removeFirst: " + deque.removeFirst());
        System.out.println("After removeFirst: " + deque);

        System.out.println("removeLast: " + deque.removeLast());
        System.out.println("After removeLast: " + deque);

        System.out.println("getFirst: " + deque.getFirst());
        System.out.println("getLast: " + deque.getLast());

        // Clear the deque
        deque.clear();
        System.out.println("After clear: " + deque);

        // Handling exceptions
        try {
            deque.removeFirst();
        } catch (Exception e) {
            System.out.println("Exception on removeFirst: " + e);
        }

        try {
            deque.removeLast();
        } catch (Exception e) {
            System.out.println("Exception on removeLast: " + e);
        }

        try {
            deque.getFirst();
        } catch (Exception e) {
            System.out.println("Exception on getFirst: " + e);
        }

        try {
            deque.getLast();
        } catch (Exception e) {
            System.out.println("Exception on getLast: " + e);
        }
    }
}
