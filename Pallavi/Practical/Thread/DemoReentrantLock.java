import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.Lock;

class Runner
{
	int counter = 0;

	Lock lock = new ReentrantLock();

	void Increament()
	{
		lock.lock();
		
		try
		{
			for(int i=0 ; i<10 ; i++)
			{
				counter++;
				System.out.println(Thread.currentThread().getName()+" - "+counter);
				try
				{
					Thread.sleep(700);
				}
				catch (Exception e)
				{
				}
			}
		}
		catch (Exception e)
		{
		}
		finally
		{
			lock.unlock();
		}

	}
}

class DemoReentrantLock 
{
	public static void main(String[] args) 
	{
		Runner ob = new Runner();

		Thread t1 = new Thread()
		{
			public void run()
			{
				ob.Increament();
			}
		};
		t1.start();
	}
}
