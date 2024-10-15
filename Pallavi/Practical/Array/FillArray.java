/*
	
// Write a program to fill all array elements with as a 1 and the some portion with 5

import java.util.Scanner;
class FillArray 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

        int i;
		System.out.println("Enter the elements  cnt: ");
		int cnt = sc.nextInt();
		int x[] = new int[cnt];

		System.out.println("Enter the "+cnt+" elements : ");

		for(i=0;i<cnt;i++)
		{
			x[i]=1;
		}

		System.out.println("Array elements are : \n");
		for(i=0;i<cnt;i++)
		{
			System.out.print("  "+x[i]);
		}

		//fill 3 location  from 2nd location with 5

		for(i=2;i<5;i++)
		{
			x[i]=5;
		}

		System.out.println("\n Array is :  \n");
		for(i=0;i<cnt;i++)
		{
			System.out.print("  "+x[i]);
		}
		
		System.out.println("\n");
	}
}


///====================================================================================================

// you can write display function in a same class to avoid the rep. of code as

import java.util.Scanner;
class FillArray 
{	
	public static void display(int a[])
	{
		System.out.println("\n Elements are : \n");
		for(int i=0;i<a.length;i++)
		{
			System.out.print("  "+a[i]);
		}
	}

	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the elements  cnt: ");
		int cnt = sc.nextInt();
		int x[] = new int[cnt];

		System.out.println("Enter the "+cnt+" elements : ");

		for(int i=0;i<cnt;i++)
		{
			x[i]=1;
		}

		display(x);

		//fill 3 location  from 2nd location with 5

		for(int i=2;i<5;i++)
		{
			x[i]=5;
		}

		display(x);
		
		System.out.println("\n");
	}
}


///===============================================================================================
	// take a same efforts for fill operation
import java.util.Scanner;

class FillArray
{

	public static void display(int a[])
	{
		System.out.println("\n Array elements are : \n");
		for(int i=0;i<a.length;i++)
		{
			System.out.print("  "+a[i]);
		}
	}

	public static void fillArray(int a[],int val)
	{
		for(int i=0;i<a.length;i++)
		{
			a[i]=val;
		}
	}

	public static void fillArray(int a[],int val,int sp,int cnt)
	{
			while(cnt>0)
			{
				a[sp]=val;
				sp++;
				cnt--;
			}
	}

	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the array count : ");
		int cnt=sc.nextInt();

		int x[]=new int[cnt];

		fillArray(x,1);
		display(x);

		fillArray(x,5,2,3);
		display(x);

		System.out.println("\n");

	}
}

*/
//==========================================================================================


