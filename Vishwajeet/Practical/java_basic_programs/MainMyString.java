class MyString
{
	private String str;

	public void setString(String s)
	{
		str=s;
	}
	public String getString()
	{
		return str;
	}
	public int getLength()
	{
		char ch[]=str.toCharArray();
		return ch.length;
	}
	public boolean isMatching(String a)
	{
		char ch1[]=str.toCharArray();
		char ch2[]=a.toCharArray();
		boolean flg=true;

		if(ch1.length!=ch2.length)
		{
			flg=false;
		}
		else
		{
			for(int i=0;i<ch1.length;i++)
			{
				if(ch1[i]!=ch2[i])
				{
					flg=false;
				}
			}
		}
		return flg;
	}
}
class MainMyString
{
	public static void main(String []args)
	{
		MyString s1=new MyString();
		s1.setString("Hello how are you");
		System.out.println("String s1 is: "+s1.getString());

		System.out.println("Length of String s1 is: "+s1.getLength());

		boolean b=s1.isMatching("Hello how are you");

		if(b)
			System.out.println("String are matching");
		else
			System.out.println("String are not matching");
	}
}
