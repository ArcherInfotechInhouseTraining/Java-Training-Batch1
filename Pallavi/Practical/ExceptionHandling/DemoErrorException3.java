
class DemoErrorException3
{
	public static void main(String []args)
	{
		
		String s1="";
		String s2="";
		
		try
		{
			s1=args[0];
			s2=args[1];
		}
		catch(Exception e)
		{
			System.out.println("---------------------------------");
			System.out.println("One: "+e.getMessage());
			System.out.println("---------------------------------");
			System.out.println("Two: "+e);
			System.out.println("---------------------------------");
			System.out.println("Three:");
			e.printStackTrace();
			System.out.println("---------------------------------");
			System.out.println("Four: Index Issue");
			System.out.println("---------------------------------");
		}

		System.out.println("s1="+s1+"\t s2="+s2);

	}
}