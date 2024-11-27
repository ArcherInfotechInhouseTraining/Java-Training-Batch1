package ListExamples;
import java.util.Enumeration;
import java.util.Vector;
public class VectorExample3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector v1=new Vector();
		System.out.println("Size of v1: "+v1.size()+" Capacity of v1: "+v1.capacity());
		v1.add(10);
		v1.add(23.45);
		v1.add("Hello");
		v1.add(140);
		v1.add(243.15);
		v1.add("good");
		Short s=new Short((short)12);
		v1.add(s);	
		v1.add(1520);
		v1.add(2343.425);
		v1.add("Hi");
		v1.add("Java");
		System.out.println("Size of v1: "+v1.size()+" Capacity of v1: "+v1.capacity());
		System.out.println("v1 contains Java: "+v1.contains("Java"));
		System.out.println("4th element in v1: "+v1.elementAt(4));

		// Displaying all elements from v1
		System.out.println("All Elements in v1: ");
		for(int i=0 ; i<v1.size() ; i++)
		{
			System.out.println(v1.elementAt(i));
		}

		// another way
		System.out.println("\n All Elements in v1(using Enum): ");
		Enumeration e=v1.elements();
		while(e.hasMoreElements())
		{
			System.out.println(e.nextElement());
		}

		// Another way
		System.out.println("All Elements in v1(using for each): ");
		for(Object ob : v1)
		{
			System.out.println(ob);
		}


	}

}
