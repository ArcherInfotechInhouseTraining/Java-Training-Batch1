import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Person implements Serializable
{
	private String name;
	private int age;
	
	public Person(String nm,int a)
	{
		name = nm;
		age =a;
	}
	
	public String toString()
	{
		return "Person{Name: '"+name+"',Age: "+age+"}";
	}
}
public class SerializationExample {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		
		Person person = new Person("John Doe",23);
		
		String filename = "person.ser";
		
		// Serialize the object
		try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename)))
		{
			oos.writeObject(person); //serialize
			System.out.println("Serialization Successful: "+person);
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		
		// Deserialize the object
		try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename)))
		{
			Person deserializedPerson = (Person) ois.readObject(); //Deserialized
			System.out.println("Deserialized successful: "+deserializedPerson);
		}
		catch(IOException | ClassNotFoundException e)
		{
			e.printStackTrace();
		}

	}

}
