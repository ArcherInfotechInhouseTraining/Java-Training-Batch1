package FileExample;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.PushbackInputStream;

public class PushbackFileReading {

	public static void main(String[] args) throws IOException {

		String filepath = "myfileout.txt";
		
		FileInputStream fis = new FileInputStream(filepath);
		
		PushbackInputStream pushback = new PushbackInputStream(fis);
		byte bytedata;
		
		while((bytedata = (byte)pushback.read())!=-1) {
			System.out.print((char)bytedata);
			
			// unread the last byte that we have read just
			pushback.unread(bytedata);
			
			//reread the byte that we unread
			
			bytedata  = (byte) pushback.read();
			System.out.print((char)bytedata);
		}
		

	}

}
