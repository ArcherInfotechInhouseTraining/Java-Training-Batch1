class DataInputCmdLn1
{
	public static void main(String []args)
	{
		String s1="-", s2="-";
		
		try
		{
			s1=(args[0]);
			s2=(args[1]);
		}
		catch(Exception e){}
		
		System.out.println("s1="+s1);
		System.out.println("s2="+s2);	
	}
}