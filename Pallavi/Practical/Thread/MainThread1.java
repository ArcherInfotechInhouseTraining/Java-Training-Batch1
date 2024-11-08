

	// Using setName(), getName(), setPriority(), getPriotity(), getId() and Thread(String)


class DemoThread extends Thread
{
	public DemoThread(String name)
	{
		super(name);
		setPriority(6);
	}
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println("hello "+i+" - "+getName()+" - "+getPriority());

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
			System.out.println("hii "+i+" - "+getName()+" - "+getPriority());

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

class MainThread1 
{
	public static void main(String[] args) 
	{
		DemoThread ob1 = new DemoThread("HelloThread");
		ob1.start();

		SampleThread ob2 = new SampleThread();
		ob2.setName("HiThread");
		ob2.setPriority(3);
		ob2.start();
	}
}
