package urlProcessing;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class HttpURLConnectionExample {

	public static void main(String[] args) throws IOException {
		
		// create url object
		URL url = new URL("https://jsonplaceholder.typicode.com/posts");
		
		//open a connection to the url
		HttpURLConnection connection = (HttpURLConnection) url.openConnection();
		
		//set the request method
		connection.setRequestMethod("GET");
		
		//set the request header(Optional)
		connection.setRequestProperty("User-Agent", "Mozila/5.0");
		
		//get the response code
		int responsecode = connection.getResponseCode();
		System.out.println("Response code: "+responsecode);
		
		//read the response
		BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
		String inputLine;
		StringBuffer response = new StringBuffer();
		
		while( (inputLine = in.readLine()) != null )
		{
			response.append(inputLine);
		}
		in.close();
		
		//print response
		System.out.println("Response: "+response.toString());
		
	}

}
