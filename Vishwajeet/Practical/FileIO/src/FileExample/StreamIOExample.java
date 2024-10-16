package FileExample;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class StreamIOExample {

	public static void main(String[] args) throws IOException {
		String data = "This the data, that we have to write in to the file";
		
		File datafile = new File("D:\\data.txt");
		datafile.createNewFile();
		FileOutputStream fos = new FileOutputStream(datafile);
		byte []b = data.getBytes();
		fos.write(b);
		fos.close();
		
		FileInputStream fis = new FileInputStream(datafile);
		byte []ba = new byte[fis.available()];
		fis.read(ba);
		
		System.out.println("The data read from file");
		for(byte t: ba) {
			System.out.print((char)t);
		}
		fis.close();
	}

}
