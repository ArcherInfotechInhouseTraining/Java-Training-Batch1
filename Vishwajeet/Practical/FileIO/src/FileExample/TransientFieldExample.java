package FileExample;

import java.io.*;
import java.io.ObjectOutputStream;
class User implements Serializable {
	private static final long serialVersionUID = 1L;
	private String username;
	private transient String password; // This field will not be serialized

	public User(String username, String password) {
		this.username = username;
		this.password = password;
	}

	@Override
	public String toString() {
		return "User{username='" + username + "', password='" + password + "'}";
	}
}

public class TransientFieldExample {
	public static void main(String[] args) {
		User user = new User("Vishwajit_Pawar", "password@3333");
		String filename = "user.ser";

		// Serialize the object
		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename))) {
			oos.writeObject(user);
			System.out.println("Serialization successful: " + user);
		} catch (IOException e) {
			e.printStackTrace();
		}

		// Deserialize the object
		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename))) {
			User deserializedUser = (User) ois.readObject();
			System.out.println("Deserialization successful: " + deserializedUser);
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}

