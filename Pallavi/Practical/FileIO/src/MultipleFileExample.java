import java.io.File;
import java.io.IOException;

public class MultipleFileExample {

	public static void main(String[] args) throws IOException {
		
		File directory = new File("exampleDir");
		
		if(directory.mkdir())
		{
			System.out.println("Directory created: "+directory.getName());
		}
		else
		{
			System.out.println("faild to create directory.");
		}
		
		for(int i=0;i<5;i++)
		{
			File file = new File("exampleDir","example"+i+".txt");
			
			if(file.createNewFile())
			{
				System.out.println("File created . "+file.getName());
			}
			else
			{
				System.out.println("File already exist");
			}
		}
		
		System.out.println("Files in directory.");
		File[] filelist = directory.listFiles();
		
		if(filelist != null)
		{
			for(File f: filelist)
			{
				System.out.println(f.getName());
				System.out.println(f.getAbsolutePath());
			}
		}
		
		//delete file 
		
		if(filelist != null)
		{
			for(File f : filelist)
			{
				if(f.delete())
				{
					System.out.println("file deleted: "+f.getName());
				}
				else
				{
					System.out.println("Unable to delete.");
				}
			}
		}
		
		//delete  directory
		
		if(directory.delete())
		{
			System.out.println("Directory deleted. : "+directory.getName());
		}
		else
		{
			System.out.println("Unable to delete directory");
		}

	}

}
