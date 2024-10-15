
// When isInterrupted() used
/*
class MyThread extends Thread
{
	public void run()
	{
		System.out.println("Is Interrupted : "+this.isInterrupted());
		
		try
		{
			for(int i=0;i<10;i++)
			{
				System.out.println(i+" - "+this);
				Thread.sleep(2000);
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
	public static void main(String[] args) 
	{
		MyThread t1 = new MyThread();
		t1.start();
		t1.interrupt();
	}
}

//=================================================
*/

//// When interrupted() used

class MyThread extends Thread
{
	public void run()
	{
		System.out.println("Is Interrupted: "+Thread.interrupted());
		try
		{
			for(int i=0;i<10;i++)
			{
				System.out.println(i+" - "+this);
				Thread.sleep(1000);
				System.out.println(Thread.interrupted());
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
	public static void main(String[] args) 
	{
		MyThread t1 = new MyThread();
		t1.start();

		t1.interrupt();
	}
}

