import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileIOStreamExample2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		String data = "This is the data that we have to write into file ";
		
		File datafile = new File("Datafile.txt");
		FileOutputStream fos = new FileOutputStream(datafile);
		byte b[] = data.getBytes();
		fos.write(b);
		
		FileInputStream fis = new FileInputStream(datafile);
		byte ba[] = new byte[fis.available()];
		fis.read(ba);
		
		System.out.println("The data read from file: ");
		
		for(byte t : ba)
		{
			System.out.print((char)t);
		}
		fis.close();
	}

}
