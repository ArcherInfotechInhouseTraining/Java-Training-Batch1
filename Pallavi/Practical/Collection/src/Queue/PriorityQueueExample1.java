package Queue;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

class Student
{
	private String name;
	private  double per;
	
	public Student(String name,double per)
	{
		this.name = name;
		this.per = per;
	}
	
	public String getName()
	{
		return name;
	}
	
	public  double getPer()
	{
		return per;
	}
	
	public String toString()
	{
		return "name: "+name+"  per: "+per;
	}
}

public class PriorityQueueExample1 {

	public static void main(String[] args) {

		Queue<Student> prq = new PriorityQueue<>(new StudentPerComparator());
	
		prq.add(new Student("ABC",90.54));
		prq.add(new Student("XYZ",50.4));
		prq.add(new Student("PQR",77.4));
		prq.add(new Student("EFG",23.4));
		prq.add(new Student("STR",60.4));
		prq.add(new Student("MNO",88.4));
		
		
		System.out.println("Student data: "+prq);
		System.out.println("Size: "+prq.size());
	}
}

class StudentPerComparator implements Comparator<Student>
{

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		return Double.compare(o1.getPer(), o2.getPer());
	}
	
}
