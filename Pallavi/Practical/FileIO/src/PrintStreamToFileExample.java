import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class PrintStreamToFileExample {

	public static void main(String[] args) {
		
		try(PrintStream ps = new PrintStream(new FileOutputStream("output.txt")))
		{
			ps.println("Writing to file: ");
			ps.printf("Formatted number: %d%n", 100);
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}
}
