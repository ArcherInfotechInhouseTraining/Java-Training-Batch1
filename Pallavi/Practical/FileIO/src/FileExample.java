

import java.io.File;

public class FileExample {

	public static void main(String[] args) {
		
		File file = new File("example.txt");
		
		if(file.exists())
		{
			System.out.println("\n File Exist...");
		}
		else
		{
			System.out.println("File does not exist..");
		}
		
		// Create a new file
		
		try
		{
			boolean created = file.createNewFile();
			if(created)
			{
				System.out.println("File crreated successfully.");
			}
			else
			{
				System.out.println("File already exist");
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		// Get file information
		
		System.out.println("File name: "+file.getName());
		System.out.println("Absolute path: "+file.getAbsolutePath());
		System.out.println("Writable: "+file.canWrite());
		System.out.println("Readable: "+file.canRead());
		System.out.println("File size in bytes: "+file.length());
		
	}

}
