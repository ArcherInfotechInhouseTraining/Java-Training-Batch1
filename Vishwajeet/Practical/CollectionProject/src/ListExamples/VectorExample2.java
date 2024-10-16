// Using addElement(), clear() and isEmpty():
package ListExamples;
import java.util.Vector;
public class VectorExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector v1=new Vector();
		System.out.println("Size of v1: "+v1.size()+" Capacity of v1: "+v1.capacity());
		v1.addElement(10);
		System.out.println("Size of v1: "+v1.size()+" Capacity of v1: "+v1.capacity());
		System.out.println("v1 is empty: "+v1.isEmpty());
		v1.clear();
		System.out.println("v1 is empty: "+v1.isEmpty());
	}

}
