package QueueExamples;
import java.util.Queue;
import java.util.PriorityQueue;
import java.util.Comparator;

class Person6 {
	String nm;
	int age;
	
	Person6(String nm, int age){
		this.nm=nm;
		this.age=age;	
	}
	public String toString() {
		return nm+" - "+age;
	}
	
}
public class CustomObjectPriorityQueue2UsingLambdaExpression {

	public static void main(String[] args) {
		Comparator <Person6> ageComparator = (Person6 p1, Person6 p2) -> Integer.compare(p1.age, p2.age);
		
			
		
		PriorityQueue <Person6> personQueue = new PriorityQueue<>(ageComparator);
		
		personQueue.add(new Person6("Vishwajit",23));
		personQueue.add(new Person6("Swapnil",21));
		personQueue.add(new Person6("om",12));
		personQueue.add(new Person6("Bablu",32));
		
		System.out.println("Polling element from queue:");
		while(!personQueue.isEmpty()) {
			System.out.println(personQueue.poll());
		}
		

	}

}
