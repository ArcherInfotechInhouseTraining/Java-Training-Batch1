class MyThread extends Thread
{
	public void run()
	{
		System.out.println(" Is Interrupted "+this.isInterrupted());

		try
		{
			for(int i=0;i<10;i++)
			{
				System.out.println(i+" - "+this);
			}
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
}
class InterruptExample1
{
	public static void main(String []args)
	{
		MyThread t1 = new MyThread();
		t1.start();
		t1.interrupt();
	}
}

