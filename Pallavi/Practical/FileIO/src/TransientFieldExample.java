import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class User implements Serializable
{
	private static final long serialVersionUID = 1L;
	private String username;
	private transient String password;
	
	public User(String username,String password)
	{
		this.username=username;
		this.password=password;
	}
	
	public String toString()
	{
		return "User{ username: '" + username + "' , password: '" + password+ "'}";
	}
}

public class TransientFieldExample {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		
		User user = new User("John_Doe","Pass123");
		String filename = "user.txt";
		
		// Serialize the object
		try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename)))
		{
			oos.writeObject(user);
			System.out.println("Serialization successful: "+user);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		// Deserialize the object
		try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename)))
		{
			User deserializedUser = (User) ois.readObject();
			System.out.println("Deserialization successful: " + deserializedUser);
		}
		catch(IOException | ClassNotFoundException e)
		{
			e.printStackTrace();
		}
	}

}
