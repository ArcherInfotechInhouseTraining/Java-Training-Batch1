package tcp;
import java.net.*;
import java.io.*;

class ChatClient  
{
	public static void main(String[] args) 
	{
		String hostname = "localhost";
		int port = 1234;

		try(Socket socket = new Socket(hostname, port))
		{
			OutputStream output = socket.getOutputStream();
			PrintWriter writer = new PrintWriter(output,true);
			InputStream input = socket.getInputStream();
			BufferedReader reader = new BufferedReader(new InputStreamReader(input));

			BufferedReader consoleReader = new BufferedReader(new InputStreamReader(System.in));
			String text;

			new Thread(new ServerHandler(reader)).start();

			System.out.println("Enter text( 'exit' to quit)");

			do
			{
				System.out.println("Client: ");
				text = consoleReader.readLine();
				writer.println(text);

			}
			while (!text.equalsIgnoreCase("exit"));	
		}
		catch(UnknownHostException e)
		{
			System.out.println("Server not found "+e.getMessage());
		}
		catch(IOException e)
		{
			System.out.println("I/O error: "+e.getMessage());
		}
	}
}

class ServerHandler implements Runnable
{
	private BufferedReader reader;

	public ServerHandler(BufferedReader reader)
	{
		this.reader=reader;

	}

	public void run()
	{
		try
		{
			String response;
			while( (response = reader.readLine()) != null)
			{
				System.out.println("Server: "+response);
			}
		}
		catch (IOException e)
		{
			System.out.println("ServerHandler Exception: "+e.getMessage());
			e.printStackTrace();
		}
	}
}