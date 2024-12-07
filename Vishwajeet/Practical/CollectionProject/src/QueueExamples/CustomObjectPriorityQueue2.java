package QueueExamples;
import java.util.Queue;
import java.util.PriorityQueue;
import java.util.Comparator;

class Person7 {
	String nm;
	int age;
	
	Person7(String nm, int age){
		this.nm=nm;
		this.age=age;	
	}
	public String toString() {
		return nm+" - "+age;
	}
	
}
public class CustomObjectPriorityQueue2 {

	public static void main(String[] args) {
		Comparator <Person7> ageComparator = new Comparator <>() {

			@Override
			public int compare(Person7 p1, Person7 p2) {
				
				return Integer.compare(p1.age, p2.age);
			}
			
		};
		PriorityQueue <Person7> personQueue = new PriorityQueue<>(ageComparator);
		
		personQueue.add(new Person7("Vishwajit",23));
		personQueue.add(new Person7("Swapnil",21));
		personQueue.add(new Person7("om",12));
		personQueue.add(new Person7("Bablu",32));
		
		System.out.println("Polling element from queue:");
		while(!personQueue.isEmpty()) {
			System.out.println(personQueue.poll());
		}
		

	}

}
