import java.util.*;
class MyNumber
{
	private int no;

	public void setNo(int a)
	{
		no=a;
	}
	public int getNo()
	{
		return no;
	}
	public String toBinary()
	{
		int no=this.no;
		String binary="";
		while(no>0)
		{
			int rem= no%2;
			binary=rem+binary;
			no=no/2;
		}
		return binary;
	}
	public String toOctal()
	{
		int no=this.no;
		String octal="";
		while(no>0)
		{
			int rem= no%8;
			octal=rem+octal;
			no=no/8;
		}
		return octal;
	}
	public String toHex()
	{
		int no=this.no;
		String hexa="";
		while(no>0)
		{
			int rem=no%16;
			if(rem<10)
			{
				hexa=rem+hexa;
			}
			else
			{
				hexa=(char)(rem+55)+hexa;
			}
			no=no/16;
		}
		return hexa;
	}
	public boolean isBinary(int a)
	{
		String str=Integer.toString(a);
		for(int i=0;i<str.length();i++)
		{
			char c=str.charAt(i);
			if(c!='0' && c!='1')
			{
				return false;
			}
		}
		return true;
	}
	public boolean isOctal(int a)
	{
		String str=Integer.toString(a);
		for(int i=0;i<str.length();i++)
		{
			char c=str.charAt(i);
			if(c<'0' || c>'7')
			{
				return false;
			}
		}
		return true;
	}
	public boolean isHex(int a)
	{
		String str=Integer.toString(a);
		for(int i=0;i<str.length();i++)
		{
			char c=Character.toUpperCase(str.charAt(i));
			if(!((c>='0' && c<='9') ||(c>='A' && c<='F') || (c>='a'&& c<='f')));
			{
				return false;
			}
		}
		return true;
	}
	public static int max(int a,int b)
	{
		if(a>b)
			return a;
		else
			return b;
	}
}
class MainMyNumber
{
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		int x=sc.nextInt();
		MyNumber a=new MyNumber();
		a.setNo(x);
		System.out.println("Entered number is"+a.getNo());
		
		System.out.println("Binary of "+a.getNo()+" is: "+a.toBinary());
		System.out.println("Octal of "+a.getNo()+" is: "+a.toOctal());
		System.out.println("HexaDecimal of "+a.getNo()+" is: "+a.toHex());

		boolean isBinary = a.isBinary(1010);
		System.out.println("Is Binary ? "+ isBinary);

		boolean isOctal = a.isOctal(12);
		System.out.println("Is Octal ? "+ isOctal);

		boolean isHex = a.isHex(0xA);
		System.out.println("Is Hex ? "+ isHex);

		int maxnumber= MyNumber.max(5,10);
		System.out.println("Maximum Number is: "+maxnumber);
	}
}