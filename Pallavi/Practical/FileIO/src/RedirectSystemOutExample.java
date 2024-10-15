import java.io.FileOutputStream;
import java.io.PrintStream;

public class RedirectSystemOutExample {

	public static void main(String[] args) {
		
		try
		{
			PrintStream fileout = new PrintStream(new FileOutputStream("System_out.txt"));
		
			System.setOut(fileout);
			
			System.out.println("this will be written to the file.");
			System.out.printf("Formatted output to the file: %d%n ",123);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

	}

}
