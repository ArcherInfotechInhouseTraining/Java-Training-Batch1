class FillArray
{
	public static void main(String []args)
	{
		int []x=new int[8];
		System.out.println("Enter the elements");
		for(int i=0;i<x.length;i++)
		{
			x[i]=1;
		}
		System.out.println("Entered elements are");
		for(int i=0;i<x.length;i++)
		{
			System.out.print(" "+x[i]);
		}
		//now from 2nd location filled with 5
		for(int i=2;i<x.length;i++)
		{
			x[i]=5;
		}
		System.out.println("\n Entered elements are");
		for(int i=0;i<x.length;i++)
		{
			System.out.print(" "+x[i]);
		}
		System.out.println();

	}

}