class MyThread implements Runnable
{
	Thread t;
	public MyThread()
	{
		t = new Thread(this);
		t.start();
	}
	public void run()
	{
		try
		{
			for(int i=0;i<10;i++)
			{
				System.out.println("Hello");
				Thread.sleep(600);
			}
		}
		catch (Exception e)
		{
		}
	}
}
class MyThreadExample2
{
	public static void main(String []args)
	{
		MyThread t1 = new MyThread();
		try
		{
			for(int i=0;i<10;i++)
			{
				System.out.println("Hii");
				Thread.sleep(500);
			}
		}
		catch (Exception e)
		{
		}
	}
}