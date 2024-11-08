

	// WAP to perform matrix multi.

import java.util.Scanner;
class Array2DMulti 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		int x[][] = new int[3][3];
		int y[][] = new int[3][3];
		int z[][] = new int[3][3];

		int i,j,k;

		System.out.println("Enter the arrya of 3*3 : ");

		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				x[i][j]=sc.nextInt();
			}
		}

		System.out.println("Enter another arrya of 3*3 : ");

		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				y[i][j]=sc.nextInt();
			}
		}

		//process for multi

		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				z[i][j]=0;
				for(k=0;k<3;k++)
				{
					z[i][j]=z[i][j]+(x[i][k]*y[k][j]);
				}
			}
		}
	
		System.out.println("Array elements are : ");
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				System.out.print("  "+x[i][j]);
			}
			
			System.out.print("\t");

			for(j=0;j<3;j++)
			{
				System.out.print("  "+y[i][j]);
			}

			System.out.print("\t");

			for(j=0;j<3;j++)
			{
				System.out.print("  "+z[i][j]);
			}
			System.out.println();
		}

		System.out.println();
	}
}
