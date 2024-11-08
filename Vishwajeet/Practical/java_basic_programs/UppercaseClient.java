import java.io.*;
import java.net.*;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class UppercaseClient {
    public static void main(String[] args) {
        String hostname = "localhost";
        int port = 0227;

        try (Socket socket = new Socket(hostname, port)) {
            OutputStream output = socket.getOutputStream();
            PrintWriter writer = new PrintWriter(output, true);
            InputStream input = socket.getInputStream();
            BufferedReader reader = new BufferedReader(new InputStreamReader(input));

            BufferedReader consoleReader = new BufferedReader(new InputStreamReader(System.in));
            String text;

            System.out.println("Enter text (type 'exit' to quit):");

            do {
                System.out.print("Client: ");
                text = consoleReader.readLine();
                writer.println(text);

                if (!text.equalsIgnoreCase("exit")) {
                    String response = reader.readLine();
                    System.out.println("Server: " + response);
                }

            } while (!text.equalsIgnoreCase("exit"));

        } catch (UnknownHostException ex) {
            System.out.println("Server not found: " + ex.getMessage());
        } catch (IOException ex) {
            System.out.println("I/O error: " + ex.getMessage());
        }
    }
}