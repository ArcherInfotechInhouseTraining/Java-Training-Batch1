class FirstThread extends Thread
{
	public FirstThread(String name)
	{
		super(name);
	}
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println(Thread.currentThread()+" - "+i);
			try
			{
				Thread.sleep(500);
			}
			catch (Exception e)
			{
			}
		}
	}
}

class SecondThread extends Thread
{
	public SecondThread(String name)
	{
		super(name);
	}
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println(Thread.currentThread()+" - "+i);
			try
			{
				Thread.sleep(500);
			}
			catch (Exception e)
			{
			}
		}
	}
}
class UsingAliveAndJoin
{
	public static void main(String []args)
	{
		FirstThread t1 = new FirstThread("One");
		t1.start();

		SecondThread t2 = new SecondThread("Two");
		t2.start();

		System.out.println("T1 is alive "+t1.isAlive());
		System.out.println("T2 is alive "+t2.isAlive());

		for(int i=0;i<40;i++)
		{
			System.out.println(Thread.currentThread()+" - "+i);
			try
			{
				Thread.sleep(600);
			}
			catch (Exception e)
			{
			}

			if(i==10)
			{
				try
				{
					t1.join();
				}
				catch (Exception e)
				{
				}
			}
			System.out.println("T1 is alive "+t1.isAlive());
			System.out.println("T2 is alive "+t2.isAlive());
		}
	}

}