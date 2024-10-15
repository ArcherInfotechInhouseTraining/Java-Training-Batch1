package tcp;

import java.net.*;
import java.io.*;

class UppercaseServer  
{
	public static void main(String[] args) 
	{
		try(ServerSocket serverSocket = new ServerSocket(1234))
		{
			System.out.println("Server is listening on port 1234");
			Socket socket = serverSocket.accept();
			System.out.println("Client connected");

			InputStream input = socket.getInputStream();
			BufferedReader reader = new BufferedReader(new InputStreamReader(input));
			OutputStream output = socket.getOutputStream();
			PrintWriter writer = new PrintWriter(output, true);

			String text;
			do
			{
				text = reader.readLine();
				System.out.println("String received: "+text);
				if(text != null && !text.equalsIgnoreCase("exit"))
				{
					String upperText = text.toUpperCase();
					writer.println(upperText);
				}
			}
			while (text != null && !text.equalsIgnoreCase("exit"));
			System.out.println("client disconnected");
		}
		catch(IOException e)
		{
			System.out.println("Server Exception: "+e.getMessage());
			e.printStackTrace();
		}
		
	}
}
