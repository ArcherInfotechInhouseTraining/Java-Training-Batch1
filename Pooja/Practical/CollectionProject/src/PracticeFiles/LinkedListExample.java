package PracticeFiles;

import java.util.LinkedList;

public class LinkedListExample {

	public static void main(String[] args) {
		
		LinkedList<Integer> list = new LinkedList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		
		System.out.println("Using ForEachConsumer :");
		list.forEach(element ->System.out.print(" "+element));

		Integer ConvertToString[] = list.toArray(new Integer[list.size()]);
		System.out.println();
		
		
		for(Integer lis : ConvertToString)
		{
			System.out.print(" "+lis);
		}
		
		System.out.println("\n"+list);
	}
}

//======================================
/*
import java.util.PriorityQueue;

//Queue Operations On LinkedList:

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class LinkedListExample {
    public static void main(String[] args) {
        Queue<String> queue = new PriorityQueue<>();
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("\n Queue Operations Menu:");
            System.out.println("1. Enqueue");
            System.out.println("2. Dequeue");
            System.out.println("3. Peek");
            System.out.println("4. Check if Queue is Empty");
            System.out.println("5. Display Queue");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume the newline

            switch (choice) {
                case 1:
                    System.out.print("Enter element to enqueue: ");
                    String element = scanner.nextLine();
                    queue.add(element);
                    System.out.println("Enqueued: " + element);
                    break;
                case 2:
                    if (!queue.isEmpty()) {
                        String removedElement = queue.remove();
                        System.out.println("Dequeued: " + removedElement);
                    } else {
                        System.out.println("Queue is empty. Nothing to dequeue.");
                    }
                    break;
                case 3:
                    if (!queue.isEmpty()) {
                        String frontElement = queue.peek();
                        System.out.println("Front element: " + frontElement);
                    } else {
                        System.out.println("Queue is empty. Nothing to peek.");
                    }
                    break;
                case 4:
                    System.out.println("Is the queue empty? " + queue.isEmpty());
                    break;
                case 5:
                    System.out.println("Queue: " + queue);
                    break;
                case 6:
                    running = false;
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
        scanner.close();
    }
}
*/