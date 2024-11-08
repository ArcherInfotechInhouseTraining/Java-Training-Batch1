// getting default name of threads

class DemoThread extends Thread
{
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println("Hello "+i+" - "+getName());

			try
			{
				Thread.sleep(200);
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
		for(int i=0;i<20;i++)
		{
			System.out.println("Hi "+i+" - "+getName());
			try
			{
				Thread.sleep(100);
			}
			catch (Exception e)
			{
			}
		}
	}
}
class MainThread 
{
	public static void main(String[] args) 
	{
		DemoThread ob1 = new DemoThread();
		ob1.start();

		SampleThread ob2 = new SampleThread();
		ob2.start();

		SampleThread ob3 = new SampleThread();
		ob3.start();
	}
}
