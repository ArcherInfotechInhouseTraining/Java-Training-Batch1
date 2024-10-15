import java.util.Random;

class WorkerThread extends Thread
{
	public WorkerThread()
	{
		start();
	}

	public void run()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println(Thread.currentThread().getName()+" - "+i);

			try
			{
				Thread.sleep(new Random().nextInt(1000));
			}
			catch (Exception e)
			{
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName()+" - Ended.");
		}
	}
}
class Runner extends Thread
{
	public void run()
	{
		while(true)
		{
			try
			{
				Thread.sleep(new Random().nextInt(1000));
			}
			catch (Exception e)
			{
			}

			System.out.println("ob is Running: "+this.isAlive());
		}
	}
}
class DaemonThreadExample 
{
	public static void main(String[] args) 
	{
		Runner ob = new Runner();
		ob.setDaemon(true);
		ob.start();

		System.out.println("Ob is Running: "+ob.isAlive());

		Thread thr[] = new Thread[4];

		for(int i=0;i<thr.length;i++)
		{
			thr[i]=new WorkerThread();
		}

		System.out.println("Ob is Running: "+ob.isAlive());
		System.out.println("Main Ended.");
	}
}
