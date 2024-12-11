import java.net.*;
import java.io.*;
public class GreetingServer extends Thread{
	private ServerSocket serverSocket;

	public GreetingServer (int port) throws IOException{
		serverSocket = new ServerSocket(port);
	}

	public void run(){
		while(true){
			try{
				System.out.println("Waiting for client on port "+serverSocket.getLocalPort()+"...");
				Socket server = serverSocket.accept();

				System.out.println("Just Connected to "+ server.getRemoteSocketAddress());
				DataInputStream in = new DataInputStream(server.getInputStream());
				System.out.println(in.readUTF());

				DataOutputStream out = new DataOutputStream(server.getOutputStream());
				out.writeUTF("Thank You for connecting to "+server.getLocalSocketAddress()+"\nGoodBye!");
				server.close();
			}catch(SocketTimeoutException s){
				System.out.println("Socket timed out");
				break;
			}catch(IOException e){
				e.printStackTrace();
			}
		}
	}


	public static void main(String[] args) 
	{
		int port =1000;
		try{
			Thread t = new GreetingServer(port);
			t.start();
		}catch(IOException e){
			e.printStackTrace();
		}
	}
}
