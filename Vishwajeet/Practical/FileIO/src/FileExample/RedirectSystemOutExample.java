package FileExample;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class RedirectSystemOutExample {
    public static void main(String[] args) {
        try {
            PrintStream fileOut = new PrintStream(new FileOutputStream("D:\\system_out.txt"));
            System.setOut(fileOut);
            
            System.out.println("This will be written to the file");
            System.out.printf("Formatted output to the file: %d%n", 123);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

