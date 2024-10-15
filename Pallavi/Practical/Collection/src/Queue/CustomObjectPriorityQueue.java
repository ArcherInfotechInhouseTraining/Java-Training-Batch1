package Queue;
//Using custom comparator to create the priority queue

import java.util.Comparator;
import java.util.PriorityQueue;

/*
class Person implements Comparable<Person>
{
	private String name;
	private int age;
	
	public Person(String name , int age)
	{
		this.name = name;
		this.age = age;
	}
	
	@Override
	public int compareTo(Person other) {
		// TODO Auto-generated method stub
		return Integer.compare(this.age, other.age);
	}
	
	public String toString()
	{
		return "name: "+name+" age: "+age;
	}
}

public class CustomObjectPriorityQueue {

	public static void main(String[] args) {
		
		 // PriorityQueue with custom objects (min-heap based on age)
		
		PriorityQueue<Person> prq = new PriorityQueue<>();
		prq.add(new Person("ABC",23));
		prq.add(new Person("XYZ",20));
		prq.add(new Person("PQR",12));
		prq.add(new Person("Keshav",11));
		prq.add(new Person("Madhav",8));
		
		System.out.println("Person Queue: ");
		
		while(!prq.isEmpty())
		{
			System.out.println(prq.poll());
		}
	}
}

//========================================================================

// the custom comparator can be defined to perform same operation 

class Person 
{
	String name;
	int age;
	
	public Person(String name,int age)
	{
		this.name = name;
		this.age = age;
	}

	public String toString()
	{
		return "Name: "+name+" age: "+age;
	}
	
}

class  CustomObjectPriorityQueue
{
	public static void main(String []args)
	{
		Comparator<Person> ageComparator = new Comparator<Person>()
		{
			@Override
			public int compare(Person p1, Person p2) {
				// TODO Auto-generated method stub
				return Integer.compare(p1.age, p2.age);
			}
		};
		
		PriorityQueue<Person> prq = new PriorityQueue<>(ageComparator);
		prq.add(new Person("ABC",23));
		prq.add(new Person("XYZ",20));
		prq.add(new Person("PQR",12));
		prq.add(new Person("Keshav",11));
		prq.add(new Person("Madhav",8));
		
		System.out.println("Person Queue: ");
		while(!prq.isEmpty())
		{
			System.out.println(prq.poll());
		}
	}
}


//=============================================================================
// Using lambda expression 

class Person 
{

	String name;
	int age;
	
	public Person(String name,int age)
	{
		this.name = name;
		this.age = age;
	}
	
	public String toString()
	{
		return "Name: "+name+" age: "+age;
	}
}
class CustomObjectPriorityQueue
{
	public static void main(String []args)
	{
		Comparator<Person> ageComparator = (p1,p2) -> Integer.compare(p1.age, p2.age);
		
		PriorityQueue<Person> prq = new PriorityQueue<>(ageComparator);
		prq.add(new Person("ABC",23));
		prq.add(new Person("XYZ",20));
		prq.add(new Person("PQR",12));
		prq.add(new Person("Keshav",11));
		prq.add(new Person("Madhav",8));
		
		System.out.println("Person Queue: ");
		while(!prq.isEmpty())
			System.out.println(prq.poll());
	}
}

*/
//================================================================================







