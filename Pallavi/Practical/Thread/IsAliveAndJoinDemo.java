class FirstThread extends Thread
{
	public FirstThread(String name)
	{
		super(name);
	}

	public void run()
	{
		for(int i=0;i<20;i++)
		{
			System.out.println(Thread.currentThread()+" - "+i);
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

class SecondThread extends Thread
{
	public SecondThread(String name)
	{
		super(name);
	}

	public void run()
	{
		for(int i=0;i<40;i++)
		{
			System.out.println(Thread.currentThread()+" - "+i);
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

class  IsAliveAndJoinDemo 
{
	public static void main(String[] args) 
	{
		FirstThread t1 = new FirstThread("Hello");
		t1.start();

		SecondThread t2 = new SecondThread("Hii");
		t2.start();


		System.out.println("T1 is Alive: "+t1.isAlive());
		System.out.println("T2 is Alive: "+t2.isAlive());

		for(int i=0;i<40;i++)
		{
			if(i==10)
			{
				try
				{
					t2.join();
				}
				catch (Exception e)
				{
				}
			}
			System.out.println(Thread.currentThread()+" - "+i);
		}

		System.out.println("T1 is Alive: "+t1.isAlive());
		System.out.println("T2 is Alive: "+t2.isAlive());
	}
}
