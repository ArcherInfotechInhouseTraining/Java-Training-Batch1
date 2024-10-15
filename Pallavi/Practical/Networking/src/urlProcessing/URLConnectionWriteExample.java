package urlProcessing;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.net.URLConnection;

public class URLConnectionWriteExample {
    public static void main(String[] args) {
    	 try {
            // Create a URL object
            URL url = new URL("http://www.example.com/post");

            // Open a connection to the URL
            URLConnection urlConnection = url.openConnection();

            // Enable output for the connection
            urlConnection.setDoOutput(true);

            // Write data to the URL
            OutputStream outputStream = urlConnection.getOutputStream();
            BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(outputStream));
            writer.write("param1=value1&param2=value2");
            writer.flush();
            writer.close();

        } catch (IOException e) {
            System.out.println("An I/O error occurred: " + e.getMessage());
        }
    }
}
