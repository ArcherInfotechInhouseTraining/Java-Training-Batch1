package ListExamples;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ListIteratorExample {

    public static void main(String[] args) {
        // Create an ArrayList of fruits
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Mango");

        System.out.println("Fruits: " + fruits);

        // Use iterator() for forward traversal
        System.out.println("\nUsing iterator() for forward traversal:");
        Iterator<String> iterator = fruits.iterator();
        while (iterator.hasNext()) {
            String fruit = iterator.next();
            System.out.print(fruit + " ");
        }

        // Use listIterator() for both forward and backward traversal
        System.out.println("\n\nUsing listIterator() for forward and backward traversal:");
        ListIterator<String> listIterator = fruits.listIterator();
        while (listIterator.hasNext()) {
            String fruit = listIterator.next();
            System.out.print(fruit + " ");
        }

        System.out.println("\nBackward traversal:");
        while (listIterator.hasPrevious()) {
            String fruit = listIterator.previous();
            System.out.print(fruit + " ");
        }

        // Use listIterator(int index) to start traversal from a specific position
        System.out.println("\n\nUsing listIterator(int index) to start at index 2:");
        listIterator = fruits.listIterator(2);
        while (listIterator.hasNext()) {
            String fruit = listIterator.next();
            System.out.print(fruit + " ");
        }
    }
}

