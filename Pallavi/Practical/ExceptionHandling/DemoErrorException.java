class DemoErrorException
{
	public static void main(String []args)
	{
		int x=0;
		double y=0.0;
		int z=0;

		try
		{
			z=Integer.parseInt(args[0]);
			x=Integer.parseInt(args[1]);
			y=Double.parseDouble(args[2]);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Problem due to improper location access");
			System.out.println("Execution with default values");
			x=1;
			y=1.0;
		}
		catch(Exception e)
		{
			System.out.println("Inproper input");
		}

		System.out.println("x="+x+"\t y="+y+"\t z="+z);
	}
}