import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PushbackInputStream;

public class PushbackFileReading {

	public static void main(String[] args) throws IOException {
		String filepath = "file1.txt";
		
		FileInputStream fis = new FileInputStream(filepath);
		PushbackInputStream pushback = new PushbackInputStream(fis);
		
		byte bytedata ;
		while((bytedata = (byte)pushback.read()) != -1)
		{
			System.out.print( (char)bytedata );
		}
	}

}
