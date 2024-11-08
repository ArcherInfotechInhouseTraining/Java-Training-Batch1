class MyThread extends Thread
{
	public MyThread(String name)
	{
		super(name);
		start();
	}

	public void run()
	{
		try
		{
			for(int i=0;i<20;i++)
			{
				System.out.println(i+" - "+this.getName());
				Thread.sleep(300);
			}
		}
		catch (Exception e)
		{
		}
	}
}

class ThreadYieldExample 
{
	public static void main(String[] args) 
	{
		MyThread t1 = new MyThread("One");
		MyThread t2 = new MyThread("Two");
		MyThread t3 = new MyThread("Three");
		MyThread t4 = new MyThread("Four");
		MyThread t5 = new MyThread("Five");

		try
		{
			t3.yield();
			for(int i=0;i<30;i++)
			{
				System.out.println("Hii");
			}
		}
		catch (Exception e)
		{
		}
	}
}
