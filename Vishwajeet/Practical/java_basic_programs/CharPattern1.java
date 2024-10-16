class CharPattern1
{
	public static void main(String []args)
	{
		int i,j;
		char k;
		for(i=0;i<5;i++)
		{
			k=65;
			for(j=0;j<5;j++)
			{
				if(i<=j)
				{
					System.out.print(" "+k);
					k++;
				}
				
			}
			System.out.println();
		}
	}
}
