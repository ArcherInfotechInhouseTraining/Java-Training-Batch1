class DemoThread extends Thread
{
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println("Hello: "+i+" - "+getName());
			try
			{
				Thread.sleep(600);
			}
			catch (Exception e)
			{
			}
		}
	}
}
class SampleThread extends Thread
{
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println("Hii: "+i+" - "+getName());
			try
			{
				Thread.sleep(300);
			}
			catch (Exception e)
			{
			}
		}
	}
}
class MainThread2
{
	public static void main(String []args)
	{
		DemoThread ob1 = new DemoThread();
		ob1.start();

		SampleThread ob2 = new SampleThread();
		ob2.start();

		SampleThread ob3 = new SampleThread();
		ob3.start();
	}
}