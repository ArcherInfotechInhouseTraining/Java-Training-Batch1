package udp;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressExample {

	public static void main(String[] args) {
	
	try
	{
		// get the InetAddress object for host name 
		InetAddress address = InetAddress.getByName("www.google.com");
		System.out.println("Host name: "+address.getHostName());
		System.out.println("Host address: "+address.getHostAddress());
		System.out.println("Canonical host name: "+address.getCanonicalHostName());
		
		//get the InetAddress object for localhost
		InetAddress localAddress = InetAddress.getLocalHost();
		System.out.println("Local host name: "+localAddress.getHostName());
		System.out.println("Local host address: "+localAddress.getHostAddress());
		
		//check address is reachable
		boolean reacheable = address.isReachable(5000);
		System.out.println("Is reacheable: "+reacheable);
		
		//get all ip addresses for host name
		InetAddress[] allAddresses = InetAddress.getAllByName("www.archerinfotech.in");
		for(InetAddress addr: allAddresses)
		{
			System.out.println("All addresses: "+addr.getHostAddress());
		}
	}
	catch (UnknownHostException e)
	{
		e.printStackTrace();
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
		
 }

}
