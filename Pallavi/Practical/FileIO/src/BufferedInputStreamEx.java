import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class BufferedInputStreamEx {

	public static void main(String[] args) throws IOException {
		
		try 
		{
			FileInputStream fis = new FileInputStream("example.txt");
			
			BufferedInputStream bis = new BufferedInputStream(fis);
			
			int i=0;
			while( (i=bis.read()) != -1)
			{
				char ch = (char)i;
				System.out.print(ch);
			}
			bis.close();
			fis.close();
		} 
		catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		}
	}
}
