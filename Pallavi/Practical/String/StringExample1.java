
	// Using charAt() and length()

class  StringExample1
{
	public static void main(String[] args) 
	{
		String str1 = "Hello good day";
		int len = str1.length();
		System.out.println("str1 length: "+str1);

		System.out.println("Good Morning".length());
		
		String str2 ="";
		System.out.println("str2 len: "+str2.length());

		// String str3;  //error: variable str3 might not have been initialized
		// System.out.println("str3 len: "+str3.length());

		// using charAt()

		System.out.println("String str1 is: ");
		for(int i=0; i<str1.length(); i++)
		{
			System.out.print(str1.charAt(i));
		}
		System.out.println();
	}
}
