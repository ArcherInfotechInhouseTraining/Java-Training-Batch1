class FillArray1
{
	public static void display(int a[])
	{
		System.out.println("\n Entered elements are:");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(" "+a[i]);
		}
	}

	public static void fillArray(int ar[],int val)
	{
		for(int i=0;i<ar.length;i++)
		{
			ar[i]=val;
		}
	}
	public static void fillArray(int ar[],int val,int sp, int cnt)
	{
		while(cnt>0)
		{
			ar[sp]=val;
			sp++;
			cnt--;
		}
	}
	public static void main(String []args)
	{
		int []x=new int[8];
		fillArray(x,1);
		display(x);

		fillArray(x,5,2,3);
		display(x);
		System.out.println();
	}
}