package FileExample;

import java.io.File;
import java.io.IOException;

public class FileExample {

	public static void main(String[] args) {
		File file = new File("D:\\example.txt");
		
		// check if file exists
		if(file.exists())
			System.out.println("file exists");
		else
			System.out.println("File Does not exist");
		
		// create new file
		try {
			boolean created = file.createNewFile();
			if(created)
				System.out.println("file created successfully!");
			else
				System.out.println("file already exist!");		
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("FileName: "+file.getName());
		System.out.println("Absolute path: "+file.getAbsolutePath());
		System.out.println("Writable: "+file.canWrite());
		System.out.println("Readable: "+file.canRead());
		System.out.println("file size in bytes: "+file.length());
		
		
		if(file.delete())
			System.out.println("File Deleted: "+file.getName());
		else
			System.out.println("Unable to delete file: "+file.getName());
		

	}

}
