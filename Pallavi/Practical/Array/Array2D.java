class Array2D 
{
	public static void main(String[] args) 
	{
		int x[][] = { {1,2,3,11},{4,5,6,22},{7,8,9,33} };

		System.out.println("Array elements are : \n");

		int i,j;
		for(i=0;i<3;i++)
		{
			for(j=0;j<4;j++)
			{
				System.out.print("  "+x[i][j]);
			}
			System.out.println("\n");
		}

		System.out.println("\n Another Way : \n ");

		for(i=0;i<x.length;i++)
		{
			for(j=0;j<x[i].length;j++)
			{
				System.out.print("  "+x[i][j]);
			}
			System.out.println("\n");
		}

		System.out.println("\n");
	}

}
