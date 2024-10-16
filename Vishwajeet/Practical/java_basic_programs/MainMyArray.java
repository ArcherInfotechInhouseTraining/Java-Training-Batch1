import java.util.*;
class MyArray
{
	private int ar[];
	public void setArray()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the count");
		int cnt=sc.nextInt();
	    ar=new int[cnt];
		System.out.println("Enter the "+cnt+" elements");
		for(int i=0;i<cnt;i++)
		{
			ar[i]=sc.nextInt();
		}
	}
	public void setArray(int []a)
	{
		ar=new int[a.length];
		for(int i=0;i<a.length;i++)
		{
			ar[i]=a[i];
		}

	}
	public void showArray()
	{
		System.out.println("\n Entered elements are:\n ");
		for(int i=0;i<ar.length;i++)
		{
			System.out.print(" "+ar[i]);
		}
	}
	public String getArray()
	{
		String str="";
		for(int i=0;i<ar.length;i++)
		{
			str=str+" "+ar[i];
		}
		return str;
	}
	public int getLength()
	{
		int i;
		for(i=0;i<ar.length;i++);
		return i;
	}
	public boolean isMatching(int []a)
	{
		boolean b=true;
		if(ar.length!=a.length)
			b=false;
		else 
		{
			for(int i=0;i<ar.length;i++)
			{
				if(ar[i]!=a[i])
				{
					b=false;
				}
			}
		}
		return b;
	}
	public int searchNo(int no)
	{
		int pos=-1;
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i]==no)
			{
				pos=i;
				break;
			}
		}
		return pos;
	}
	public void sortArray()
	{
		int y[]=new int[ar.length];
		for(int i=0;i<ar.length;i++)
		{
			y[i]=ar[i];
		}
		for(int i=0;i<y.length-1;i++)
		{
			for(int j=i;j<y.length;j++)
			{
				if(y[i]>y[j])
				{
					int tmp = y[i];
					y[i]=y[j];
					y[j]=tmp;
				}
			}
		}
		System.out.println("\n Sorted Array: ");
		for(int i=0;i<y.length;i++)
		{
			System.out.print(" "+y[i]);
		}
	}
	
}
class MainMyArray
{
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		int []p={11,22,33,44,55};
		MyArray a1 =new MyArray();
		a1.setArray();

		MyArray a2 =new MyArray();
		a2.setArray(p);

		a1.showArray();
		a2.showArray();

		System.out.println("\n Array Elements in String a1"+a1.getArray());
		System.out.println("\n Array Elements in String a2"+a2.getArray());

		System.out.println("\n Array Length a1: "+a1.getLength());
		System.out.println("\n Array Length a2: "+a2.getLength());

		System.out.println("\n Array a1 is matching with p ?"+a1.isMatching(p));
		System.out.println("\n Array a2 is matching with p ?"+a2.isMatching(p));

		System.out.println("\n Enter the number to be searched");
		int no=sc.nextInt();
		int t=a1.searchNo(no);
		if(t==-1)
		{
			System.out.println("\n Number is not present");
		}
		else
		{
			System.out.println("\n Number is present at "+t+" location");
		}
		System.out.println("\n Sorted Array a1 ");
		a1.sortArray();
		System.out.println("\n Sorted Array a2 ");
		a2.sortArray();

		System.out.println();
	}
}
