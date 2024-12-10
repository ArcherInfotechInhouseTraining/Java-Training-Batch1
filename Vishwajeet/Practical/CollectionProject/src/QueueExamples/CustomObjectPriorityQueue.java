package QueueExamples;
import java.util.Queue;
import java.util.PriorityQueue;
import java.util.Comparator;

 class Person implements Comparable<Person>{
	String nm;
	int age;
	
	Person(String nm,int age){
		this.nm=nm;
		this.age=age;
	}

	@Override
	public int compareTo(Person other) {
		
		return Integer.compare(this.age,other.age);
	}
	public String toString() {
		return nm+" - "+age;
		
	}
	
}
public class CustomObjectPriorityQueue {
	public static void main(String[] args) {
		
		PriorityQueue<Person> personQueue = new PriorityQueue<>();
		personQueue.add(new Person("Vishwajit",23));
		personQueue.add(new Person("Swapnil",22));
		personQueue.add(new Person("Om",13));
		personQueue.add(new Person("Bablu",35));
		
		System.out.println("Polling elements from person queue");
		while(!personQueue.isEmpty()) {
			System.out.println(personQueue.poll());
		}	

	}

}
