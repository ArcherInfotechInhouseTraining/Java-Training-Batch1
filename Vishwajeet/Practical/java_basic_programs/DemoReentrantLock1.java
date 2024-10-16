import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
class Runner
{
	int counter=0;
	Lock lock = new ReentrantLock();
	void increment()
	{
		lock.lock();
		try
		{
			for(int i=0;i<10;i++)
			{
				counter++;
				System.out.println("INC - "+Thread.currentThread().getName()+" - "+counter);
				try
				{
					Thread.sleep(400);
				}
				catch (Exception e)
				{
				}
			}

		}
		finally
		{
			lock.unlock();
		}
	}
	void decrement()
	{
		lock.lock();
		try
		{
			for(int i=0;i<10;i++)
			{
				counter--;
				System.out.println("INC - "+Thread.currentThread().getName()+" - "+counter);
				try
				{
					Thread.sleep(700);
				}
				catch (Exception e)
				{
				}
			}

		}
		finally
		{
			lock.unlock();
		}
	}
}
class DemoReentrantLock1
{
	public static void main(String[] args) 
	{
		Runner ob = new Runner();

		Thread t1 = new Thread(){
			public void run()
			{
				ob.increment();
			}
		};
		t1.start();

		Thread t2 = new Thread(){
			public void run()
			{
				ob.increment();
			}
		};
		t2.start();
	}
}
