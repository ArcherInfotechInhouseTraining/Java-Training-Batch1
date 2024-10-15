import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;

public class InputStreamReaderExample {

	public static void main(String[] args) throws UnsupportedEncodingException, FileNotFoundException, IOException 
	{
		
		try(InputStreamReader isr = new InputStreamReader(new FileInputStream("example.txt"),"UTF-8"))
		{
			int data;
			while( (data = isr.read()) != -1)
			{
				System.out.print( (char)data );
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
