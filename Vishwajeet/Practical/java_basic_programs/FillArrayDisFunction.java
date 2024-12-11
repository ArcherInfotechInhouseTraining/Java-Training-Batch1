class FillArrayDisFunction
{
	public static void display(int ar[])
	{
		System.out.println("\n Entered elements are");
		for(int i=0;i<ar.length;i++)
		{
			System.out.print(" "+ar[i]);
		}
	}
	public static void main(String []args)
	{
		int []x=new int[8];
		System.out.println("Enter the elements");
		for(int i=0;i<x.length;i++)
		{
			x[i]=1;
		}
		display(x);
		//now from 2nd location filled with 5
		for(int i=2;i<x.length;i++)
		{
			x[i]=5;
		}
		display(x);
		System.out.println();	
	}

}