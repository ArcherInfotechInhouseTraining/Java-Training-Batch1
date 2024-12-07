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

class FillArrayExample
{
	public static void main(String []args)
	{
		int []ar=new int[8];
		
		// fill all location with 1
		FillArray2.fillArray(ar, 1);
		FillArray2.display(ar);

		// now fill 3 location from 2nd with 5
		FillArray2.fillArray(ar, 5, 2, 3);
		FillArray2.display(ar);

		System.out.println();
	}
}
