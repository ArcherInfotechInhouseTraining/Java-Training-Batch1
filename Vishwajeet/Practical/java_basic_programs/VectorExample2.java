import java.util.Vector;
class VectorExample2 
{
	public static void main(String[] args) 
	{
		Vector v1 = new Vector();
		System.out.println("Size of v1: "+v1.size()+" \t Capacity of v1: "+v1.capacity());
		v1.addElement(10);
		System.out.println("Size of v1: "+v1.size()+" \t Capacity of v1: "+v1.capacity());
		System.out.println("Is v1 empty? "+v1.isEmpty());
		v1.clear();
		System.out.println("Is v1 empty? "+v1.isEmpty());
	}
}
