package FileExample;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;

public class BufferedOutputStreamEx {

	public static void main(String[] args) {
		try {
			FileOutputStream fos = new FileOutputStream("D:\\myfileout.txt");
			
			BufferedOutputStream bos = new BufferedOutputStream(fos,1024);
			
			String s = "Welcome to Archer Infotech, pune";
			byte []b = s.getBytes();
			bos.write(b);
			bos.close();
			fos.close();
			System.out.println("File successfully closed");
			
			
		} catch(Exception e) {
			System.out.println(e);
		}
	}
}
