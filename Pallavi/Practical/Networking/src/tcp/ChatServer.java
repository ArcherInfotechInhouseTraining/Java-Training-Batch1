package tcp;
import java.net.*;
import java.io.*;

class ChatServer 
{
	public static void main(String[] args) 
	{
		try(ServerSocket serverSocket = new ServerSocket(1234))
		{
			System.out.println("Sever is listening on port 1234");
			Socket socket = serverSocket.accept();
			System.out.println("Client connected");

			new Thread(new ClientHandler(socket)).start();

		}
		catch(IOException e)
		{
			System.out.println("Server Exception: "+e.getMessage());
			e.printStackTrace();
		}
	}
}

class ClientHandler implements Runnable
{
	private Socket socket;

	public ClientHandler(Socket socket)
	{
		this.socket = socket;
	}

		public void run()
		{
			try( 
				InputStream input = socket.getInputStream();
				BufferedReader reader = new BufferedReader(new InputStreamReader(input));
				OutputStream output = socket.getOutputStream();
				PrintWriter writer = new PrintWriter(output, true);
			)
			{
				BufferedReader consoleReader = new BufferedReader(new InputStreamReader(System.in));
				String text;

				do
				{
					//read msg from client
					text = reader.readLine();
					System.out.println("Client: "+text);

					//server response
					if(! text.equalsIgnoreCase("exit"))
					{
						System.out.println("Server: ");
						String response = consoleReader.readLine();
						writer.println(response);

					}

				}
				while (! text.equalsIgnoreCase("exit"));
				System.out.println("Client disconnected");
			}
			catch(IOException e)
			{
				System.out.println("Server exception: "+e.getMessage());
				e.printStackTrace();
			}

		}
}