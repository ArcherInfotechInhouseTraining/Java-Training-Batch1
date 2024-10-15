/*
class DataInputCmdLine
{
	public static void main(String []args)
	{
		String s1="_",s2="_";
		
		try
		{
			s1=args[0];
			s2=args[1];
		}
		catch(Exception e)
		{

		}

		System.out.println("S1 : "+s1);
		System.out.println("S2 : "+s2);
	}
}
*/

class DataInputCmdLine
{
	public static void main(String args[])
	{
		int x=Integer.parseInt(args[0]);
		double y=Double.parseDouble(args[1]);

		System.out.println("X : "+x);
		System.out.println("Y: "+y);
		System.out.println("Sum is : "+(x+y));
	}
}	