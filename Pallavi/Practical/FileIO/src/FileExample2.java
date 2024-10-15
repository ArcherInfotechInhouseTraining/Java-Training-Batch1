import java.io.File;
import java.io.IOException;

public class FileExample2 {

	public static void main(String[] args) throws IOException {
		
		File file = new File("example1.txt");
		
		if(file.exists())
		{
			System.out.println("\n File exist");
		}
		else
		{
			System.out.println("File does not exist");
		}
		
		boolean created = file.createNewFile();
		if(created)
		{
			System.out.println("File created successfully");
		}
		else
		{
			System.out.println("File already exist ");
		}
		
		System.out.println("file name: "+file.getName());
		System.out.println("absolute path: "+file.getAbsolutePath());
		System.out.println("Readable: "+file.canRead());
		System.out.println("Writeable: "+file.canWrite());
		System.out.println("file size in bytes: "+file.length());
		
		if(file.delete())
		{
			System.out.println("file "+file.getName()+" deleted");
		}
		else
		{
			System.out.println("Unable to delete file "+file.getName());
		}
	}
}
