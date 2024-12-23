import java.io.*;
import java.net.*;
import java.io.InputStreamReader;
import java.io.BufferedReader;
public class SimpleClient  
{
	public static void main(String[] args) 
	{
		String hostname = "localhost";
		int port = 7777;

		try(Socket socket = new Socket(hostname,port))
		{
			OutputStream output = socket.getOutputStream();
			PrintWriter writer = new PrintWriter(output, true);
			writer.println("Hello Server!");

			InputStream input = socket.getInputStream();
			BufferedReader reader = new BufferedReader(new InputStreamReader(input));
			String response = reader.readLine();
			System.out.println("Server Reasonse: "+response);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
