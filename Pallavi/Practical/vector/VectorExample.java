import java.util.Vector;
import java.util.Enumeration;
class VectorExample 
{
	public static void main(String[] args) 
	{
		Vector v1 = new Vector();
		System.out.println("Size of v1: "+v1.size()+"\t capacity of v1: "+v1.capacity());

		v1.add(12);
		v1.add(34.56);
		v1.add(1,"Hello");
		//System.out.println("v1 is: "+Arrays.toString(v1));
		System.out.println("Size of v1: "+v1.size()+"\t capacity of v1: "+v1.capacity());
		System.out.println("---------------------------------------------------");

		Vector v2 = new Vector(3);
		System.out.println("Size of v2: "+v2.size()+"\t capacity of v2: "+v2.capacity());

		v2.add(34);
		v2.add(27.89);
		v2.add("hii");
		Short s = new Short((short)12);
		v2.add(s);
		System.out.println("Size of v2: "+v2.size()+"\t capacity of v2: "+v2.capacity());
		v2.add(123);
		v2.add("Hello");
		v2.add(39.96);
		System.out.println("Size of v2: "+v2.size()+"\t capacity of v2: "+v2.capacity());

		System.out.println("-------------------------------------------------------------");

		Vector v3 = new Vector(3,2);
		System.out.println("v3 size is  : "+v3.size()+"\t v3 capacity is: "+v3.capacity());
		v3.add(11);
		v3.add(34.78);
		v3.add('A');
		v3.add("hii");
		System.out.println("v3 size is: "+v3.size()+"\t v3 capacity is: "+v3.capacity());
		v3.add(90);
		v3.add("good");
		v3.add(234.89);
		v3.add(100);
		System.out.println("V3 size is: "+v3.size()+" \t v3 capacity is: "+v3.capacity());
		System.out.println("-------------------------------------------------------------");

	//======== clear() , isEmpty() , addElement() ==============

		v1.addElement(10);
		System.out.println("v1 size is : "+v1.size()+"\t v1 capacity is: "+v1.capacity());
		System.out.println("v1 is empty? : "+v1.isEmpty());
		v1.clear();
		System.out.println("v1 is empty? : "+v1.isEmpty());

	  System.out.println("-------------------------------------------------------------");

	//=========== Using contains(), elementAt() and elements()===========
	System.out.println("v1 contains hello: "+v2.contains("hii"));
	System.out.println("2nd position element: "+v2.elementAt(2));
	
	// Displaying all elements from v1
	System.out.println("v2 elements are: ");
	for(int i=0 ; i<v2.size() ; i++)
	{
		System.out.print("\t "+v2.elementAt(i));
	}

	// another way
	System.out.println("\n All elements of v2 using(Enum): ");
	Enumeration e = v2.elements();
	while(e.hasMoreElements())
	{
		System.out.print("\t "+e.nextElement());
	}

	//Anathor way
	System.out.println("v2 using For Each: ");
	for(Object ob:v2)
	{
		System.out.print("\t "+ob);
	}

	}
}
