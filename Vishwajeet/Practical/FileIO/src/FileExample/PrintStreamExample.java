package FileExample;

import java.io.PrintStream;

public class PrintStreamExample {

	public static void main(String[] args) {
		PrintStream ps = System.out;
		
		ps.print("Hello, ");
		ps.println("How Are you!");
		ps.printf("This is a number : %d%n",42);
		ps.printf("this is floating pt number : %.2f%n",3.14250);
		
		boolean b = true;
		char c = 'A';
		int i = 777;
		long l = 1234567L;
		float f = 1.23456F;
		double d = 777.777;
		String str = "Hello , PrintStream";
		
		ps.println(b);
		ps.println(c);
		ps.println(i);
		ps.println(l);
		ps.println(f);
		ps.println(d);
		ps.println(str);
	

	}

}
