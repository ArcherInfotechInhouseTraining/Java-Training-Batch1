import java.io.CharArrayReader;
import java.io.CharArrayWriter;

public class CharArrayReaderWriterExample {

	public static void main(String[] args) {
		
		CharArrayWriter charArrayWriter = new CharArrayWriter();
		
		String data = "Hello , World!";
		
		try
		{
			charArrayWriter.write(data);
			
			char[] charArray = charArrayWriter.toCharArray();
			System.out.println("Writen to charArrayWriter: "+new String(charArray));
			
			CharArrayReader charArrayReader = new CharArrayReader(charArray);
			
			int i;
			System.out.println("Read from charArrayReader: ");
			while( (i=charArrayReader.read()) != -1)
			{
				System.out.print( (char)i );
			}
			
			charArrayReader.close();
			charArrayWriter.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
