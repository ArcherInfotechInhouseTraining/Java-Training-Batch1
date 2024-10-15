import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileIOStreamExample1 {

	public static void main(String[] args) throws IOException{
		
		String fileName = "example.txt";
		String contentToWrite = "Hello World ! , This is an example of fileInputStream and outputStream";
		
		FileOutputStream fos = new FileOutputStream(fileName);
		try(fos)
		{
			fos.write(contentToWrite.getBytes());
			System.out.println("Content Writen to file: "+fileName);
		}
		catch(Exception e)
		{
			System.err.println("Error writing to file: "+e.getMessage());
		}
		
		try(FileInputStream fis = new FileInputStream(fileName))
		{
			int content;
			System.out.println("Content read from file: ");
			while((content=fis.read())!= -1)
			{
				System.out.print((char)content);
			}
			System.out.println();
		}
		catch(IOException e)
		{
			System.err.println("Error reading file: "+e.getMessage());
		}

	}

}
