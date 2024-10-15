import java.io.File;
import java.io.IOException;

public class FileParentChildExample {

	public static void main(String[] args) throws IOException {
		
		String parentDir = "e:\\parentDir";
		
		File parentDirectory = new File(parentDir);
		
		// Create the parent directory if it does not exist
		
		if(!(parentDirectory.exists()))
		{
			if(parentDirectory.mkdir())
			{
				System.out.println("Parent Directory created : "+parentDirectory.getAbsolutePath());
			}
			else
			{
				System.out.println("Failed to create parent directory.");
				return;
			}
		}
		
		String childFile = "childFile.txt";
		File file = new File(parentDir,childFile);
		
		if(file.createNewFile())
		{
			System.out.println("File created: "+file.getAbsolutePath());
		}
		else
		{
			System.out.println("File already exist.: "+file.getAbsolutePath());
		}
		
		 // Display file information
        System.out.println("Absolute path: " + file.getAbsolutePath());
        System.out.println("Parent: " + file.getParent());
        System.out.println("Is directory: " + file.isDirectory());
        System.out.println("Is file: " + file.isFile());
        
        //deleting file and directory
        
        if(file.delete())
        {
        	System.out.println("file deleted: "+file.getName()+" , absolutePath :  "+file.getAbsolutePath());
        }
        else
        {
        	System.out.println("Faild to delete file");
        }

        if(parentDirectory.delete())
        {
        	System.out.println("Parent directory deleted : "+parentDirectory.getName()+" , AbsolutePath : "+parentDirectory.getAbsolutePath());
        }
        else
        {
        	System.out.println("Faild to delete directory");
        }
	}

}
