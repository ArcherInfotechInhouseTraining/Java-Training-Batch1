
	// Using Runnable Interface (Anonyomus)

class  MyThreadExample1
{
	public static void main(String[] args) 
	{
		Thread t1 = new Thread(new Runnable()
		{
			public void run()
			{
				try
				{
					for(int i=0;i<20;i++)
					{
						System.out.println("hello");
						Thread.sleep(300);
					}
				}
				catch (Exception e)
				{
				}
			}
		});

		t1.start();

		try
		{
			for(int i=0;i<20;i++)
			{
				System.out.println("Hii");
				Thread.sleep(300);
			}
		}
		catch (Exception e)
		{
		}
	}
}
