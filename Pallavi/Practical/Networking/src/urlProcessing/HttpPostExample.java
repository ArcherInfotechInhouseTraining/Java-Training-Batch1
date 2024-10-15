package urlProcessing;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class HttpPostExample {

	public static void main(String[] args) throws IOException {
		
		//create url object
		URL url = new URL("https://jsonplaceholder.typicode.com/posts");
		
		//open connection 
		HttpURLConnection connection = (HttpURLConnection) url.openConnection();
		
		//set the request method to post
		connection.setRequestMethod("POST");
		
		//set request header
		connection.setRequestProperty("User-Agent", "Mozila/5.0");
		connection.setRequestProperty("Content-Type", "application/json; utf-8");
		connection.setRequestProperty("Accept", "application/json");
		
		//Enable input and output stream
		connection.setDoOutput(true);
		
		//create a json payload
		String jsonInputString = "{\"title\":\"foo\", \"body\":\"bar\", \"userId\":1}";
		
		//write json data to outputstream
		
		try(OutputStream os = connection.getOutputStream())
		{
			byte[] input = jsonInputString.getBytes("utf-8");
			os.write(input, 0, input.length);
			
		}
		
		//get the response code
		int responseCode = connection.getResponseCode();
		System.out.println("Response : "+responseCode);
		
		//read the response
		BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream(), "utf-8"));
		String inputLine;
		StringBuilder response = new StringBuilder();
		
		while( (inputLine = in.readLine()) != null)
		{
			response.append(inputLine.trim());
		}
		in.close();
		
		//print the response
		System.out.println("Response: "+response.toString());
	}
}
