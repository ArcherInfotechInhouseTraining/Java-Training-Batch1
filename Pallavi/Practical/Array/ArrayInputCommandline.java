	// Array input using commandline

class ArrayInputCommandline
{
	public static void main(String args[])
	{
		int x[] = new int[args.length];
		
		for(int i=0;i<args.length;i++)
		{
			x[i]=Integer.parseInt(args[i]);
		}

		System.out.println(" array elements are : ");

		for(int i=0;i<args.length;i++)
		{
			System.out.print("  "+x[i]);
		}
	}
}
