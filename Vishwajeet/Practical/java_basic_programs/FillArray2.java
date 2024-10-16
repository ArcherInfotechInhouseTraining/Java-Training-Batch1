class FillArray2
{
	public static void display(int []a)
	{
		System.out.println("\n Array Elements are: ");
		for(int i=0;i<a.length;i++)
		{
			System.out.print("  "+a[i]);
		}
	}
	public static void fillArray(int []a,int val)
	{
		for(int i=0;i<a.length;i++)
		{
			a[i]=val;
		}
	}
	public static void fillArray(int []a,int val, int sp, int cnt)
	{
		while(cnt>0)
		{
			a[sp]=val;
			sp++;
			cnt--;
		}
	}
}
