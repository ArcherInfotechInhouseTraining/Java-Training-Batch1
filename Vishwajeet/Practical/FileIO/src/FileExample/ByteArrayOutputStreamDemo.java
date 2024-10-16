package FileExample;
import java.io.*;
public class ByteArrayOutputStreamDemo {

	public static void main(String[] args) {
		
		String data = "Hello world";
		try {
			ByteArrayOutputStream out = new ByteArrayOutputStream();
			byte [] array = data.getBytes();
			
			out.write(array);
			
			String streamData = out.toString();
			System.out.println("Output stream: "+streamData);
			out.close();
			
		} catch(Exception e) {
			e.printStackTrace();
		}	

	}

}
