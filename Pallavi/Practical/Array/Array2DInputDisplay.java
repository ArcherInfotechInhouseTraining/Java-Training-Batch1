
	///  Input and Display in 2D Array

import java.util.Scanner;
class Array2DInputDisplay 
{
	public static void main(String[] args) 
	{
		int [][]x = new int[3][3];
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Array:  ");

		int i,j;

		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				x[i][j]=sc.nextInt();
			}
		}

		System.out.println("\n Display Array : \n");

		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				System.out.print("  "+x[i][j]);
			}
			System.out.println("\n");
		}

		System.out.println("\n");
	}
}
