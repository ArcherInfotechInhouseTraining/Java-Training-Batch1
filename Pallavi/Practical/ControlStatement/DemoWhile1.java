	/// WAP to display list of odd nos from 1 to 50 using while loop.

class DemoWhile1
{
	public static void main(String []args)
	{
		int i=1;
		
		System.out.println("\n List of Odd numbers : ");

		while(i<=50)
		{
			if(i%2!=0)
			{
				System.out.println("\t"+i);
			}
			i++;
		}
	}

}