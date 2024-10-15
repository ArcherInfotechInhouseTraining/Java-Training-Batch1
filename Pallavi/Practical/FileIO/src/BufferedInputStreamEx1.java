import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class BufferedInputStreamEx1 {

	public static void main(String[] args) throws IOException {

		try 
		{
			FileInputStream fis = new FileInputStream("example.txt");
			
			BufferedInputStream bis = new BufferedInputStream(fis);
			bis.skip(5);
			
			System.out.println("Stream after skipping first 5 bytes: ");
			
			int i=0;
			while( (i=bis.read()) != -1 )
			{
				System.out.print((char)i);
			}
			
			bis.close();
		} 
		catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		}
	}
}
