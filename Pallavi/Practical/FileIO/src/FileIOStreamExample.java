import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileIOStreamExample {

	public static void main(String[] args) throws IOException {
		
		
		String data = "Hello World , FileInputStream and OutPutStream ";
		
		File filename = new File("data.txt");
		
		FileOutputStream fos = new FileOutputStream(filename);
		byte[] b = data.getBytes();
		fos.write(b);
		
		
		FileInputStream fis = new FileInputStream(filename);
		byte[] ba = new byte[fis.available()];
		fis.read(ba);
		
		System.out.println("Data read from file : ");
		
		for(byte t : ba )
		{
			System.out.print((char)t);
		}
		fis.close();
	}

}
