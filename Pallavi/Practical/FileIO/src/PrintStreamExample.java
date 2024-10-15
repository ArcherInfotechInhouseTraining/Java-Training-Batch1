import java.io.PrintStream;

public class PrintStreamExample {

	public static void main(String[] args) {
		
		PrintStream ps = System.out;
		
		ps.print("Hello");
		ps.println(" World");
		
		ps.printf("This is a number: %d%n", 42);
		ps.printf("This is floating point: %.2f%n", 23.24);
		
		boolean b = true;
		int a = 2;
		float f = 23.4f;
		double d = 45.687;
		long l = 45893;
		char c = 'p';
		String str = "Hello, PrintStream!";
		
		ps.println(b);
		ps.println(a);
		ps.println(f);
		ps.println(d);
		ps.println(l);
		ps.println(c);
		ps.println(str);
	}
}
