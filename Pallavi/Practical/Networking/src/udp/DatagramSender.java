package udp;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class DatagramSender {

	public static void main(String[] args) {
		
		try
		{
//			create datagramsocket
			DatagramSocket socket = new DatagramSocket();
			
//			prepare data to be sent
			String msg = "Hello, this is test message";
			byte[] buffer = msg.getBytes();
			
//			get the destination address
			InetAddress receiverAddress = InetAddress.getByName("localhost");
			int receiverPort = 9876;
			
//			create datagram packet to send
			DatagramPacket packet = new DatagramPacket(buffer, buffer.length, receiverAddress, receiverPort);
			
//			send the packet
			socket.send(packet);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

	}

}
