package networking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class SimpleServer {

	public static void main(String[] args) 
	{
		try(ServerSocket serverSocket = new ServerSocket(1234))
		{
			System.out.println("Server is listening on port 1234");
			
			while(true)
			{
				Socket socket = serverSocket.accept();
				System.out.println("New client connected.");
				
				//handle the clinet connection
				
				InputStream input = socket.getInputStream();
				BufferedReader reader = new BufferedReader(new InputStreamReader(input));
				String message = reader.readLine();
				System.out.println("Recieved: "+message);
				
				//close client connection
				socket.close();
			}
			
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}
}
