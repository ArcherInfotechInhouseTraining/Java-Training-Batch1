import java.io.*;
import java.net.*;
import java.io.InputStreamReader;
import java.io.BufferedReader;
public class UppercaseServer {
    public static void main(String[] args) {
		int port = 0227;
        try (ServerSocket serverSocket = new ServerSocket(port)) {
            System.out.println("Server is listening on port "+ port);
            Socket socket = serverSocket.accept();
            System.out.println("Client connected");

            InputStream input = socket.getInputStream();
            BufferedReader reader = new BufferedReader(new InputStreamReader(input));
            OutputStream output = socket.getOutputStream();
            PrintWriter writer = new PrintWriter(output, true);

            String text;

            do {
                text = reader.readLine();
                System.out.println("String Received: " + text);
                if (text != null && !text.equalsIgnoreCase("exit")) {
                    String uppercasedText = text.toUpperCase();
                    writer.println(uppercasedText);
                }
            } while (text != null && !text.equalsIgnoreCase("exit"));

            System.out.println("Client disconnected");

        } catch (IOException ex) {
            System.out.println("Server exception: " + ex.getMessage());
            ex.printStackTrace();
        }
    }
}