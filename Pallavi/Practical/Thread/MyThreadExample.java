
class MyThread extends Thread
{
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			try
			{
				System.out.println("Hello - "+ i);
				Thread.sleep(300);	
			}
			catch (Exception e)
			{
			}
		}
	}
}

class MyThreadExample 
{
	public static void main(String[] args) 
	{
		MyThread t1 = new MyThread();
		t1.start();

		try
		{
			for(int i=0;i<20;i++)
			{
				System.out.println("hii - ");
				Thread.sleep(200);
			}
		}
		catch (Exception e)
		{
		}
	}
}
