	// Input an array and display the list of prime nos from an array

import java.util.*;
class  ArrayPrime
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the array cout: ");
		int cnt = sc.nextInt();
		int x[] = new int[cnt];

		int i,d,flg;

		System.out.println("Enter the "+cnt+" array elements : ");

		for(i=0;i<cnt;i++)
		{
			x[i]=sc.nextInt();
		}

		System.out.println("Array elements are : \n");

		for(i=0;i<x.length;i++)
		{
			System.out.print("  "+x[i]);
		}

		//Process

		System.out.println("\n List of prime no's : \n");
		for(int no:x)
		{
			d=2;
			flg=0;

			while(d<=(no/2))
			{
				if(no%d==0)
				{
					flg=1;
					break;
				}
				d++;
			}
			if(flg==0 && no!=1 )
			{
				System.out.print("  "+no);
			}
		}
		System.out.println("\n");
	}
}
