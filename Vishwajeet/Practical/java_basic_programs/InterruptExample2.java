class MyThread extends Thread
{
	public void run()
	{
		System.out.println(" Interrupted "+Thread.interrupted());

		try
		{
			for(int i=0;i<10;i++)
			{
				System.out.println(i+" - "+this);
				Thread.sleep(700);
				System.out.println("Interrupted "+Thread.interrupted());
			}
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
}
class InterruptExample2
{
	public static void main(String []args)
	{
		MyThread t1 = new MyThread();
		t1.start();
		t1.interrupt();
	}
}
