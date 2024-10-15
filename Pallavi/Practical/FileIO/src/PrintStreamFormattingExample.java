import java.io.PrintStream;
import java.util.Date;


public class PrintStreamFormattingExample {

	public static void main(String[] args) {
		
		PrintStream ps = System.out;
		
		ps.printf("Current data and time : %tc%n", new Date());
		ps.printf("Number with leading Zeros: %04d%n", 5);
		ps.printf("Floating point number with 2 decimals: %.2f%n" , 123.456);
		ps.printf("Right-justified number: %10d%n", 42);
	}
}
