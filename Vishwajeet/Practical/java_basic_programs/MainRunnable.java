class DemoThread implements Runnable
{
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println("Hello: "+i);
			try
			{
				Thread.sleep(700);
			}
			catch (Exception e)
			{
			}
		}
	}
}
class SampleThread implements Runnable
{
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println("Hii: "+i);
			try
			{
				Thread.sleep(400);
			}
			catch (Exception e)
			{
			}
		}
	}
}
class MainRunnable
{
	public static void main(String []args)
	{
		Thread t1 = new Thread(new DemoThread());
		t1.start();

		Thread t2 = new Thread(new SampleThread());
		t2.start();
	}
}