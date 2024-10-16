class DemoStringExample1 
{
	public static void main(String[] args) 
	{
		String s1="hello good day!";
		int len=s1.length();
		System.out.println("Length s1: "+len);

		String s2 = "";
		System.out.println("length of s2: "+s2.length());

		System.out.println("String s1 is: ");
		for(int i=0;i<s1.length();i++)
		{
			System.out.print(s1.charAt(i));
			try{Thread.sleep(800);}catch(Exception e){}
		}
		System.out.println();
	}
}
