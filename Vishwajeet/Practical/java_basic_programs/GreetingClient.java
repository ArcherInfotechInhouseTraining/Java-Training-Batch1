import java.io.*;
import java.net.*;
class GreetingClient 
{
	public static void main(String[] args) 
	{
		String serverName = "localhost";
		int port = 1000;
		try{
			System.out.println("Connecting to "+serverName+" on port "+port);
			Socket client = new Socket(serverName, port);

			System.out.println("Just connected to "+client.getRemoteSocketAddress());
			OutputStream outtoServer = client.getOutputStream();
			DataOutputStream out = new DataOutputStream(outtoServer);

			out.writeUTF("Hello From "+client.getLocalSocketAddress());
			InputStream infromServer = client.getInputStream();
			DataInputStream in = new DataInputStream(infromServer);

			System.out.println("server says "+ in.readUTF());
			client.close();
		}catch(IOException e){
			e.printStackTrace();
		}
	}
}
