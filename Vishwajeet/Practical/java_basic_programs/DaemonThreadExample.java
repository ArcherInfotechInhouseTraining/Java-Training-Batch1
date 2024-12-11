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
			System.out.println(i+" - "+Thread.currentThread().getName());
			try{Thread.sleep(400);}catch(Exception e){}
		}
		System.out.println(Thread.currentThread().getName()+"Ended");
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
				Thread.sleep(new Random().nextInt(2000));
			}
			catch (Exception e)
			{
			}
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
		System.out.println("Ob is Running"+ob.isAlive());

		Thread tar[]=new Thread[4];
		for(int i=0;i<tar.length;i++)
		{
			tar[i]=new WorkerThread();
		}
		System.out.println("Ob is running"+ob.isAlive());
		System.out.println("Main ended");
	}
}
