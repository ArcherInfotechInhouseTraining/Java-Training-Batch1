package FileExample;

import java.io.PrintStream;
import java.util.Date;

public class PrintStreamFormattingExample {

	public static void main(String[] args) {
		PrintStream ps = System.out;
		
		ps.printf("Current date and time : %tc%n", new Date());
		ps.printf("Number with leading zeros : %04d%n", 5);
		ps.printf("Floating point nujmber with 2 decimal : %.2f%n", 123.456);
		ps.printf("Right justified number :  %10d%n", 42);

	}

}
