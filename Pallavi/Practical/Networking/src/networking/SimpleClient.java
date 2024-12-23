package networking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class SimpleClient {

	public static void main(String[] args)  {
		
		String hostname = "localhost";
		int port = 1234;
		
		try(Socket socket = new Socket(hostname, port))
		{
			OutputStream output = socket.getOutputStream();
			PrintWriter writer = new PrintWriter(output, true);
			writer.println("Hello, Server!!");
			
			InputStream input = socket.getInputStream();
			BufferedReader reader = new BufferedReader(new InputStreamReader(input));
			String response = reader.readLine();
			System.out.println("Server response: "+response);
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
