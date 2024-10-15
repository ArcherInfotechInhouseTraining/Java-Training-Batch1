import java.io.BufferedOutputStream;
import java.io.FileOutputStream;

public class BufferedOutputStreamEx {

	public static void main(String[] args) {
		try
		{
			FileOutputStream fos = new FileOutputStream("myfileout.txt");
			BufferedOutputStream bos = new BufferedOutputStream(fos);
			
			String s = "Welcome to Archer Infotech";
			byte b[] = s.getBytes();
			bos.write(b);
			bos.close();
			fos.close();
			
			System.out.println("Successfully Writen");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
