class FirstThread extends Thread
{
	public FirstThread(ThreadGroup tg, String name)
	{
		super(tg,name);
	}
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println(Thread.currentThread());
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

class SecondThread extends Thread
{
	public SecondThread(ThreadGroup tg, String name)
	{
		super(tg,name);
	}
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println(Thread.currentThread());
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

class ThreadGroupDemo
{
	public static void main(String []args)
	{
		ThreadGroup tg = new ThreadGroup("MyThreadGroup");
		FirstThread tg1 = new FirstThread(tg,"one");
		tg1.start();

		SecondThread tg2 = new SecondThread(tg,"Two");
		tg2.start();

		for(int i=0;i<40;i++)
		{
			System.out.println("Active thread count: "+tg.activeCount());
			System.out.println(Thread.currentThread());
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