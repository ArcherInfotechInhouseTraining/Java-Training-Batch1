class FirstThread implements Runnable
{
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

class SecondThread implements Runnable
{
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

class ThreadGroupDemo1
{
	public static void main(String []args)
	{
		ThreadGroup tg = new ThreadGroup("MyThreadGroup");
		Thread t1 = new Thread(tg,new FirstThread());
		t1.setName("One");
		t1.start();

		Thread t2 = new Thread(tg,new SecondThread());
		t2.setName("Two");
		t2.start();

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