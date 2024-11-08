import java.util.Arrays;
class StringExample2 
{
	public static void main(String[] args) 
	{
		String s1="hello good day to all!";
		System.out.println("String s1: "+s1);

		String s2=s1.substring(2);
		System.out.println("String s2:"+s2);

		String s3=s1.substring(6,13);
		System.out.println("String s3: "+s3);

		String s4=s1.concat(" All the best");
		System.out.println("s4: "+s4);

		System.out.println("All the best".contains("e")); //gives true of false value for the sentence contains that leeter passed to contains
		System.out.println(s1.contains("ll"));

		System.out.println("All the best".startsWith("a"));//true only if exact match includes capital or small
		System.out.println("All the best".startsWith("All"));

		System.out.println(s1.endsWith("!"));

		System.out.println(s1.indexOf("o"));
		System.out.println(s1.lastIndexOf("o"));
		System.out.println(s1.lastIndexOf("ll"));
		System.out.println(s1.indexOf("ll"));

		String s5 =s1.replace('o','#');
		System.out.println("s5: "+s5);

		String s6=s1.toUpperCase();
		System.out.println("s6: "+s6);

		String s7="          java programming";
		s7=s7.trim();
		System.out.println("s7: "+s7);

		String s8="good";
		String s9="good";
		String s10="day";

		System.out.println("s8 equals s9: "+s8.equals(s9));
		System.out.println("s9 equals s10: "+s9.equals(s10));
		System.out.println("s8 compares to s9: "+s8.compareTo(s9));
		System.out.println("s8 Compare to s10: "+s8.compareTo(s10));

		byte []b = s1.getBytes();
		System.out.println("byte b: "+Arrays.toString(b));
	}
}
