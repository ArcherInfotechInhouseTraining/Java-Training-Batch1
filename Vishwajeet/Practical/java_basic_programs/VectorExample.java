import java.util.Vector;
import java.util.Enumeration;
class VectorExample
{
	public static void main(String[] args) 
	{
		Vector v1 =new Vector();
		System.out.println("Size of v1: "+v1.size()+" \t Capacity of v1: "+v1.capacity());
		v1.add(10); //autoboxing of primitive 10 to object i.e. Integer 10
		v1.add(23.44);
		v1.add(1,"Hello");
		System.out.println("Size of v1: "+v1.size()+" \t Capacity of v1: "+v1.capacity());

		//display
		System.out.println("vector v1: ");
		for(int i=0;i<v1.size();i++)
		{
			System.out.println(v1.elementAt(i));
		}
		//another way
		System.out.println("Enumeration");
		Enumeration e= v1.elements();
		while(e.hasMoreElements())
		{
			System.out.println(e.nextElement());
		}

		//another way for each
		System.out.println("For each");
		for(Object ob:v1)
		{
			System.out.println(ob);
		}
	}
}
