class DemoLabelledBreak
{
	public static void main(String argd[])
	{
		int i,j;
		outer:for(i=0;i<10;i++)
		{
			System.out.print("-");
			for(j=0;j<10;j++)
			{
				if(j>i)
				{
					break outer;
				}
				System.out.print(""+j);
			}
			System.out.println();
		}
	}

}