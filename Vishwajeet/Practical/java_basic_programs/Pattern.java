class Pattern
{
	public static void main(String []args)
	{
		int i,j;
		for(i=0;i<9;i++)
		{
			for(j=0;j<=9;j++)
			{
				if(j<(9-i))
				{
					System.out.print(" ");
				}
				else
				{
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}
}