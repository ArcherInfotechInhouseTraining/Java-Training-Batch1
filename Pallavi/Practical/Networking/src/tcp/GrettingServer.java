package tcp;
// Two way communication

import java.net.*;
import java.io.*;

class GrettingServer extends Thread
{
	private ServerSocket serverSocket;

	public GrettingServer(int port) throws IOException
	{
		serverSocket = new ServerSocket(port);

	}
	
	public void run()
	{
		while(true)
		{
			try
			{
				System.out.println("Waiting for client on port "+serverSocket.getLocalPort()+".....");
				Socket server = serverSocket.accept();
				
				System.out.println("Just connected to the(server) "+server.getRemoteSocketAddress());
				DataInputStream in = new DataInputStream(server.getInputStream());

				System.out.println(in.readUTF());
				DataOutputStream out = new DataOutputStream(server.getOutputStream());
				out.writeUTF("Thank you for connecting to "+server.getLocalSocketAddress()+"\n Good By..!");
				server.close();

			}
			catch (SocketTimeoutException s)
			{
				System.out.println("Socket timed out!");
				break;
			}
			catch(IOException e)
			{
				e.printStackTrace();
				break;
			}
		}
	}


	public static void main(String[] args) 
	{
		int port = 1000;
		try
		{
			Thread t = new GrettingServer(port);
			t.start();
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}
}
