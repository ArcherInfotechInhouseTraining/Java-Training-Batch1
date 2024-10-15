package urlProcessing;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class URLProcessingExample {

	public static void main(String[] args) {
		
		try
		{
			//create url object
			URL url = new URL("https://archerinfotech.in");
			
			//open connection to the url
			URLConnection urlconnection = url.openConnection();
			
			//get the input stream from the url connection
			BufferedReader in = new BufferedReader(new InputStreamReader(urlconnection.getInputStream()));
			
			//read data from the url
			String inputline;
			
			while( (inputline = in.readLine()) != null)
			{
				System.out.println(inputline);
			}
			
			//close the input stream
			in.close();
			
		}
		catch(MalformedURLException e)
		{
			e.printStackTrace();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}

}
