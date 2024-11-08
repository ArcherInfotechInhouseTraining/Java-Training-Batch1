import java.util.Arrays;

class StringExample2 
{
	public static void main(String[] args) 
	{
		String s1 = "good day to all";
		System.out.println("String s1: "+s1);

		String s2 = s1.substring(2);
		System.out.println("String s2: "+s2);

		String s3 = s1.substring(2,10);
		System.out.println("String s2: "+s3);

		System.out.println("Good Morning , ".concat(s1));
		String s4 = s1.concat(" All the best");
		System.out.println("String s4: "+s4);

		System.out.println("String s1 contains d: "+s1.contains("d"));
		System.out.println("String s1 contains e: "+s1.contains("e"));
		System.out.println("-----------------------------------------");

		boolean b = s1.startsWith("g");
		System.out.println("String s1 starts with g: "+b);

		b = s1.startsWith("d");
		System.out.println("String s1 starts with d: "+b);

		b = s1.startsWith("l");
		System.out.println("String s1 starts with l: "+b);

		System.out.println("String s1 ends with l: "+s1.endsWith("l"));
		System.out.println("String s1 ends with y: "+s1.endsWith("y"));
		System.out.println("String s1 ends with g: "+s1.endsWith("g"));
		System.out.println("String s1 ends with all: "+s1.endsWith("all"));
		System.out.println("-----------------------------------------------");

		System.out.println("Index of o in s1: "+s1.indexOf('o'));
		System.out.println("Last index of o in s1: "+s1.lastIndexOf('o'));
		System.out.println("Last index of a in s1: "+s1.lastIndexOf('a'));
		System.out.println("Index of to in s1: "+s1.indexOf("to"));
		System.out.println("-----------------------------------------------");

		System.out.println("in s1 replace o by #: "+s1.replace('o','#'));
		String s5 = s1.replace("ll","LL");
		System.out.println("String s5: "+s5);
		System.out.println("-----------------------------------------------");

		String s6 = s1.toUpperCase();
		System.out.println("String s6: "+s6);
		System.out.println("WhAt aRe YoU dOiNG".toLowerCase());
		String s7 = "    Java Programming     ";
		System.out.println("s7 length: "+s7.length());
		s7 = s7.trim();
		System.out.println("After trim s7 length is: "+s7.length());
		System.out.println("-----------------------------------------------");

		String s8 = "good";
		String s9 = "good";
		String s10 = "day";

		System.out.println("s8 equals s9: "+s8.equals(s9));
		System.out.println("s8 equals s10: "+s8.equals(s10));
		System.out.println("s8 compare to s9: "+s8.compareTo(s9));
		System.out.println("s8 compare to s10: "+s8.compareTo(s10));
		System.out.println("-----------------------------------------------");
	
		byte b1[] = s1.getBytes();
		System.out.println("Bytes of s1: "+Arrays.toString(b1));

	}
}
