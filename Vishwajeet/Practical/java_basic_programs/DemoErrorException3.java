class DemoErrorException3
{
	public static void main(String []args)
	{
		int x=0;
		double y=0.0;

		try
		{
			x=Integer.parseInt(args[0]);
			y=Double.parseDouble(args[1]);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Problem due to improper location access");
			System.out.println("Execution with default values");
			x=1;
			y=1.0;
		}

		System.out.println("x="+x+"\t y="+y);
	}
}
