import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ConsoleInputExample {

	public static void main(String[] args) {


		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		try
		{
			System.out.println("Enter your name: ");
			String name = br.readLine();
			System.out.println("Hello "+name+"!");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
