class FirstThread extends Thread
{
	public FirstThread(ThreadGroup tg,String name)
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
				Thread.sleep(400);
			}
			catch (Exception e)
			{
			}
		}
	}
}

class SecondThread extends Thread
{
	public SecondThread(ThreadGroup tg,String name)
	{
		super(tg,name);
	}

	public void run()
	{
		for(int i=0;i<40;i++)
		{
			System.out.println(Thread.currentThread());
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

class ThreadGroupDemo 
{
	public static void main(String[] args) 
	{
		ThreadGroup tg = new ThreadGroup("MyThreadGroup");

		FirstThread t1 = new FirstThread(tg,"one");
		t1.start();

		SecondThread t2 = new SecondThread(tg,"Two");
		t2.start();

		for(int i=0;i<40;i++)
		{
			System.out.println("Active Thread Count - "+Thread.activeCount());
			System.out.println("Active ThreadGroup Count - "+tg.activeCount());
			System.out.println("Current Thread - "+Thread.currentThread());
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
