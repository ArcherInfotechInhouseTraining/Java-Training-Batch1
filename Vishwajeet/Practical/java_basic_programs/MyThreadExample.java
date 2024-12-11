class MyThreadExample
{
	public static void main(String []args)
	{
		Thread t1 = new Thread (new Runnable(){
			public void run()
			{
				try
				{
					for(int i=0;i<10;i++)
					{
						System.out.println("Hello");
						Thread.sleep(500);
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
			for(int i=0;i<10;i++)
			{
				System.out.println("Hii");
				Thread.sleep(400);
			}
		}
		catch (Exception e)
		{
		}
	}
}