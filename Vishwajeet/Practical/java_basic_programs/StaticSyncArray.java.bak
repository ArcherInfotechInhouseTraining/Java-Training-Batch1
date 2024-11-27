class ShowArray
{
	private static int []x = {11,22,33,44,55,66,77,88,99};

	public synchronized static void print()
	{
		for(int i=0;i<9;i++)
		{
			System.out.println(" "+x[i]);
			try
			{
				Thread.sleep(600);
			}
			catch (Exception e)
			{
			}
		}
		System.out.println();
	}
}
class StaticSyncArray
{
	public static void main(String []args)
	{
		ShowArray ob1 = new ShowArray();
		Thread t1 = new Thread(){
			public void run()
			{
				ob1.print();
			}
		};

		t1.start();

		ShowArray ob2 = new ShowArray();
		Thread t2 = new Thread(){
			public void run()
			{
				ob2.print();
			}
		};

		t2.start();

		ShowArray ob12 = new ShowArray();
		Thread t12 = new Thread(){
			public void run()
			{
				ob12.print();
			}
		};

		t12.start();

		ShowArray ob22 = new ShowArray();
		Thread t22 = new Thread(){
			public void run()
			{
				ob22.print();
			}
		};

		t22.start();
	}
}