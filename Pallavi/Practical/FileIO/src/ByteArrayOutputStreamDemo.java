import java.io.ByteArrayOutputStream;

public class ByteArrayOutputStreamDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String data = "hello world";
		
		try
		{
			ByteArrayOutputStream out = new ByteArrayOutputStream();
			byte []array = data.getBytes();
			
			out.write(array);
			
			String StreamData = out.toString();
			System.out.println("Out put Stream: "+StreamData);
			
			out.close();
		}
		catch(Exception e)
		{
			e.getStackTrace();
		}
	}
}
