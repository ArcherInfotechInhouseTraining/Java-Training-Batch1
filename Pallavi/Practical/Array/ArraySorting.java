
// WAP to sort the array in ascending form.

import java.util.Scanner;
class ArraySorting 
{
	public static void main(String[] args) 
	{
		Scanner sc  = new Scanner(System.in);

		System.out.println("Enter the arrray count : ");
		int cnt = sc.nextInt();
		int x[] = new int[cnt];

		System.out.println("Enter the "+cnt+"elements: ");

		int i;
		for(i=0;i<x.length;i++)
		{
			x[i]=sc.nextInt();
		}

		System.out.println("\n Array Elements : \n");
		for(i=0;i<x.length;i++)
		{
			System.out.print("  "+x[i]);
		}

		//process
		System.out.println("\n Array elements in Ascending Order: \n");

		for(i=0;i<x.length-1;i++)
		{
			for(int j=i;j<x.length;j++)
			{
				int tmp;
				if(x[i]>x[j])
				{
					tmp=x[i];
					x[i]=x[j];
					x[j]=tmp;
				}
			}
		}

		for(i=0;i<x.length;i++)
		{
			System.out.print("  "+x[i]);
		}

			System.out.print(" \n ");
	}
}
