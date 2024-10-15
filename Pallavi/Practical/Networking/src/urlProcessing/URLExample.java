package urlProcessing;

import java.net.URL;

public class URLExample {

	public static void main(String[] args) {
		
		try
		{
			//create url object
			URL url = new URL("https://gemini.google.com/app?utm_source=sem&utm_medium=paid-media&utm_campaign=q4enIN_sem7&gclid=Cj0KCQiA35urBhDCARIsAOU7QwmroDyX-Me8RkzHilOXYwnCyAFr9Pr08yhp8l4oFTxR40PrtA0pd_IaAoyiEALw_wcB");
			
			//print parts of the url
			System.out.println("Protocol: "+url.getProtocol());
			System.out.println("Host: "+url.getHost());
			System.out.println("Port: "+url.getPort());
			System.out.println("Path: "+url.getPath());
			System.out.println("Query: "+url.getQuery());
			System.out.println("Fragment: "+url.getRef());
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
