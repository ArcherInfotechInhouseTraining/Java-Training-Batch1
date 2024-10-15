import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderWriterExample {

	public static void main(String[] args) throws IOException {
		String filename = "example2.txt";
		String data = "Hello World! \n This is an example of file reader and writer.";

		try(FileWriter writer = new FileWriter(filename))
		{
			writer.write(data);
			System.out.println("Data writen to file: "+filename);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		try(FileReader reader = new FileReader(filename))
		{
			int ch;
			System.out.println("Data read from file: ");
			while( (ch=reader.read()) != -1)
			{
				System.out.print( (char)ch );
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
