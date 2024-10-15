class StringExample 
{
	public static void main(String[] args) 
	{
		String s1 = "hello", s2 = "hello", s3 = "good day";
		String s = "I said , "+s1+" to you "+s3+" was the second statement.";
		System.out.println("s is: "+s);
		System.out.println("--------------------------------");
	
		//================================

		System.out.println("s1 equals s2: "+s1.equals(s2));
		System.out.println("s1 equals s3: "+s1.equals(s3));
		System.out.println("--------------------------------");
	
		//====================================

		//length()
		int len = "hello all".length();
		System.out.println("len is: "+len);

		//====================================

		String str1 = new String();
		System.out.println("str1 is: "+str1);
		System.out.println("--------------------------------");

		byte b[] = {65,66,67,68,69,70,71,72,73};
		String str2 = new String(b);
		System.out.println("str2 is: "+str2);

		String str3 = new String(b,2,6);
		System.out.println("str3 is: "+str3);
		System.out.println("--------------------------------");

		//====================================

		char ch[] = {'h','o','w',' ','a','r','e',' ','y','o','u'};
		String str4 = new String(ch);
		System.out.println("str4 is: "+str4);


	}
}
