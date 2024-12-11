package FileExample;

import java.io.*;
import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;
class Person implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String name;
	private int age;

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person{name='" + name + "', age=" + age + "}";
	}
}

public class SerializationExample {
	public static void main(String[] args) {
		Person person = new Person("John Doe", 30);
		String filename = "person.ser";

		// Serialize the object
		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename))){
			oos.writeObject(person);// Serialize
			System.out.println("Serialization successful: " + person);
		} catch (IOException e) {
			e.printStackTrace();
		}

		// Deserialize the object
		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename))) {
			Person deserializedPerson = (Person) ois.readObject();// Deserialize 
			System.out.println("Deserialization successful: " + deserializedPerson);
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}