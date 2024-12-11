import java.io.*;
import java.net.*;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class SimpleServer
{
	public static void main(String[] args) 
	{
		int port = 7777;
		try(ServerSocket serverSocket = new ServerSocket(port))
		{
			System.out.println("Server is listening on port "+port);
			while(true)
			{
				Socket socket = serverSocket.accept();
				System.out.println("New Client Connected");

				//handle client connnection
				InputStream input = socket.getInputStream();
				BufferedReader reader = new BufferedReader(new InputStreamReader(input));
				String message = reader.readLine();
				System.out.println("Received from client : "+message);

				//close client connection
				socket.close();
			}
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
