package MapExamples;

import java.util.Hashtable;

public class HashtableConstructorsDemo {

    public static void main(String[] args) {
        // Default constructor
        Hashtable<String, Integer> defaultHashtable = new Hashtable<>();
        defaultHashtable.put("One", 1);
        defaultHashtable.put("Two", 2);
        System.out.println("Default constructor: " + defaultHashtable);

        // Constructor with initial capacity
        Hashtable<String, Integer> initialCapacityHashtable = new Hashtable<>(20);
        initialCapacityHashtable.put("Three", 3);
        initialCapacityHashtable.put("Four", 4);
        System.out.println("Constructor with initial capacity: " + initialCapacityHashtable);

        // Clone constructor
        Hashtable<String, Integer> cloneHashtable = new Hashtable<>(initialCapacityHashtable);
        System.out.println("Clone constructor: " + cloneHashtable);
    }
}

