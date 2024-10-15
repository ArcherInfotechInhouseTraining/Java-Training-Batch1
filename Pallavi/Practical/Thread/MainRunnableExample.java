
	// Another ways of creating thread using the Runnable interface

class MyRunnable implements Runnable
{
	private Thread t;

	public MyRunnable()
	{
		
	}

	public MyRunnable(String name,int priority)
	{
		t = new Thread(this,name);
		t.setPriority(priority);
		t.start();
	}

	public void run()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println(t.getName()+" - "+t.getPriority()+" - "+t.getThreadGroup());
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

class YourRunnable implements Runnable
{
	private Thread t;

	public YourRunnable()
	{
		
	}

	public YourRunnable(String name,int priority)
	{
		t = new Thread(this,name);
		t.setPriority(priority);
		t.start();
	}

	public void run()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println(t);
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

class MainRunnableExample 
{
	public static void main(String[] args) 
	{
		MyRunnable ob1 = new MyRunnable("One",7);
		YourRunnable ob2 = new YourRunnable("two",8);

		for(int i=0;i<10;i++)
		{
			System.out.println(Thread.currentThread().getName()+" - "+Thread.currentThread().getPriority()+" - "+Thread.currentThread().getThreadGroup());
			try{Thread.sleep(400);}catch(Exception e){}
		}
	}
}
