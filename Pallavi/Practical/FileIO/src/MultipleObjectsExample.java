import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Employee implements Serializable
{
	private String name;
	private double salary;
	
	public Employee(String name,double salary)
	{
		this.name=name;
		this.salary=salary;
	}
	
	public String toString()
	{
		return "Employee{Name: '" +name+"', Salary: "+salary + "}";
	}
}

public class MultipleObjectsExample {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		Employee ep1 = new Employee("Alice",34000);
		Employee ep2 = new Employee("Bob",67000);
		
		String filename = "employee.ser";
		
		// Serialize the objects
		
		try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename)))
		{
			oos.writeObject(ep1);
			oos.writeObject(ep2);
			
			System.out.println("Serialization successful: "+ep1+" , "+ep2);
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		
		
		// Deserialize the objects
		try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename)))
		{
			Employee deserializedEmp1 = (Employee)ois.readObject();
			Employee deserializedEmp2 = (Employee)ois.readObject();
			System.out.println("Deserialization successful: " + deserializedEmp1 + ", " + deserializedEmp2);
			
		}
		catch(IOException | ClassNotFoundException e)
		{
			e.printStackTrace();
		}
	}

}
