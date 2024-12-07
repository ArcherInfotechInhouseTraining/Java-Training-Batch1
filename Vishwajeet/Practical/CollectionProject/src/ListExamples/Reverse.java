package ListExamples;

import java.lang.Integer;

public class Reverse {
	public static void main(String []args) {
		int number = 123;
		String numberstr = Integer.toString(number);
		String reversestr = new StringBuilder(numberstr).reverse().toString();
		int reversenumber = Integer.parseInt(reversestr);
		
		System.out.println("Reverse number"+reversestr);		
	}
}
