import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedOutputStreamEx1 {

	public static void main(String[] args) throws IOException {
		
		String data = "Hello World";
		
		FileOutputStream fos = new FileOutputStream("file1.txt");
		
		BufferedOutputStream bos = new BufferedOutputStream(fos,1024);
		bos.write(data.getBytes());
		bos.flush();
		bos.close();
		System.out.println("Successfully Written...");
	}
}
