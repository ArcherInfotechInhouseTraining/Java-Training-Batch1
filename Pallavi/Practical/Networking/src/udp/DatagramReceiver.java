package udp;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class DatagramReceiver {

	public static void main(String[] args) {
	
		try
		{
			//create a datagramsocket  to receive packet on port 9876
			DatagramSocket socket = new DatagramSocket(9876);
			
			//prepare buffer to hold incoming data
			byte[] buffer = new byte[1024];
			
			//create a datagramPacket to receive a data
			DatagramPacket packet = new DatagramPacket(buffer, buffer.length);
			
			//receive the packet
			socket.receive(packet);
			
			//extract the data from packet
			String msg = new String(packet.getData(), 0, packet.getLength());
			System.out.println("Message received:  "+msg);
			
			//close the socket
			socket.close();
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
