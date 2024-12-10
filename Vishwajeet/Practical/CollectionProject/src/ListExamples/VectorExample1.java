package ListExamples;

import java.util.Vector;

public class VectorExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector v1 = new Vector();
		System.out.println("V1 size: "+v1.size()+" Capacity of v1: "+v1.capacity());
		v1.add("Hello");
		v1.add("23.45");
		v1.add(1,"Good morning");
		
		System.out.println("V1 size: "+v1.size()+" Capacity of v1: "+v1.capacity());
		
		System.out.println("Displaying all elements in v1");
		for(int i=0;i<v1.size();i++)
		{
			System.out.println(v1.elementAt(i));
		}
		System.out.println("------------------------------------------------------------------------");
		
		Vector v2=new Vector(3);
		System.out.println("Size of v2: "+v2.size()+" Capacity of v2: "+v2.capacity());
		v2.add(10);
		v2.add(23.45);
		v2.add("Hello");
		Short s=new Short((short)12);
		v2.add(s);
		System.out.println("Size of v2: "+v2.size()+" Capacity of v2: "+v2.capacity());		
		v2.add(150);
		v2.add(2343.425);
		v2.add("Hi");
		System.out.println("Size of v2: "+v2.size()+" Capacity of v2: "+v2.capacity());
		System.out.println("------------------------------------------------------------------------");
		
		
		Vector v3=new Vector(3,2);
		System.out.println("Size of v3: "+v3.size()+" Capacity of v3: "+v3.capacity());
		v3.add(10);
		v3.add(23.45);
		v3.add("Hello");
		v3.add(s);
		System.out.println("Size of v3: "+v3.size()+" Capacity of v3: "+v3.capacity());		
		v3.add(150);
		v3.add(2343.425);
		v3.add("Hi");
		v3.add("All");
		System.out.println("Size of v3: "+v3.size()+" Capacity of v3: "+v3.capacity());

		
		

	}

}
