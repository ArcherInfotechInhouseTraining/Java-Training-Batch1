class FirstThread implements Runnable
{
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

class SecondThread implements Runnable
{
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

class ThreadGroupDemo1 
{
	public static void main(String[] args) 
	{
		ThreadGroup tg = new ThreadGroup("MyThreadGroup");

		Thread t1 = new Thread(tg,new FirstThrad());
		t1.start();

		Thread t2 = new Thread(new SecondThread(),"two");
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
