import java.util.Arrays;
import java.util.Iterator;
import java.util.Vector;
class VectorExample2 
{
	public static void main(String[] args) 
	{
		Vector<String> v1 = new Vector<>();
		v1.add("Hello");
		v1.insertElementAt("Hi",0);

		Object []s = v1.toArray();
		System.out.println("\n Elements are: ");
		System.out.println(Arrays.toString(s));

		v1.addElement("Java");
		v1.add("C");

		Object ar[] = v1.toArray();
		System.out.println("\n Elements are: ");
		for(int i=0 ; i<ar.length ; i++)
		{
			System.out.print("\t "+v1.get(i));
		}

		v1.set(1,"Androiod");
		v1.remove(2);
		System.out.println("Elements are: ");
		System.out.println(Arrays.toString(v1.toArray()));
		System.out.println("First Element: "+v1.firstElement());
		System.out.println("Last Element: "+v1.lastElement());

		System.out.println("Elements are : ");
		Iterator<String> itr = v1.iterator();
		while(itr.hasNext())
		{
			System.out.print("\t "+itr.next());
		}

		System.out.println();
	}
}
