package tcp;
import java.net.*;
import java.io.*;

class UppercaseClient  
{
	public static void main(String[] args) 
	{
		String hostName = "localhost";
		int port = 1234;

		try(Socket socket = new Socket(hostName, port))
		{
			OutputStream output = socket.getOutputStream();
			PrintWriter writer = new PrintWriter(output, true);
			InputStream input = socket.getInputStream();
			BufferedReader reader = new BufferedReader(new InputStreamReader(input));

			BufferedReader consoleReader = new BufferedReader(new InputStreamReader(System.in));
			String text;

			System.out.println("Enter text ( Type exit to quit)");
			do
			{
				System.out.println("Client: ");
				text = consoleReader.readLine();
				writer.println(text);

				if(!text.equalsIgnoreCase("exit"))
				{
					String response = reader.readLine();
					System.out.println("Server: "+response);
				}
			}
			while (!text.equalsIgnoreCase("exit"));
		}
		catch(UnknownHostException e)
		{
			System.out.println("Server not found: "+e.getMessage());

		}
		catch(IOException e)
		{
			System.out.println("I/O error: "+e.getMessage());
		}
	}
}
