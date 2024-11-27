class StringExample
{
	public static void main(String[] args) 
	{
		String s1 = "hello", s2 = "hello", s3= "all the best";

		String s = "i said "+s1+" to all "+s3+" was second statement";
		System.out.println("Statement: "+s);

		boolean b1 =s1.equals(s2);
		System.out.println("B: "+b1);

		boolean b2 = s1.equals(s3);
		System.out.println("B2: "+b2);

		int len = "good day".length();
		System.out.println("Length: "+len);

		String str1=new String();
		System.out.println("String 1: "+str1);

		byte []bvals={65,66,67,68,69,70,71,72};
		String str2=new String(bvals);
		System.out.println("String 2: "+str2);

		String str3=new String(bvals,2,5);
		System.out.println("String 3: "+str3);

		char []ch={'h','o','w',' ','a','r','e','y','o','u'}
		String str4= new String(ch);
		System.out.println("Str4 is: "+str4);

		String str5=new String(str3);
		System.out.println(""


	}
}
