import java.util.Vector;
import java.util.Enumeration;

class  VectorExample1
{
	public static void main(String[] args) 
	{
		Vector v1  = new Vector();
		System.out.println("Size of v1: "+v1.size()+" \t Capacity of v1: "+v1.capacity());
		v1.add(10);
		v1.add(7.77);
		v1.add(1,"Hello");
		v1.add('s');	
		v1.add(1520);
		v1.add(2343.425);
		v1.add("Hi");
		v1.add("Java");
		System.out.println("v1 contains java: "+v1.contains("Java"));
		System.out.println("4th element: "+v1.elementAt(4));
		System.out.println("Size of v1: "+v1.size()+" \t Capacity of v1: "+v1.capacity());

		Vector v2 = new Vector(3); // 3 indicates that the vector v2 has initial capacity 3
		System.out.println("Size of v2: "+v2.size()+" \t Capacity of v2: "+v2.capacity());	
		
		Vector v3 = new Vector(3,2);
		System.out.println("Size of v3: "+v3.size()+" \t Capacity of v3: "+v3.capacity());

		v3.add(10);
		v3.add(23.45);
		v3.add("Hello");
		v3.add('s');
		System.out.println("Size of v3: "+v3.size()+" \t Capacity of v3: "+v3.capacity());

		/// Displaying all elements from v1
		System.out.println("v1: ");
		for(int i=0;i<v1.size();i++)
		{
			System.out.println(v1.elementAt(i));
		}

		///Another way
		System.out.println("v1 by enumeration");
		Enumeration e = v1.elements();
		while(e.hasMoreElements())
		{
			System.out.println(e.nextElement());
		}

		System.out.println("All elements in v1 (using for each): ");
		for(Object ob : v1)
		{
			System.out.println(ob);
		}
	}
}
