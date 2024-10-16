import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
class Runner
{
	int cnt=0;
	Lock lock = new ReentrantLock();
	void incr()
	{
		lock.lock();
		try
		{
			for(int i=0;i<10;i++)
			{
				cnt++;
				System.out.println(Thread.currentThread().getName()+" - "+cnt);
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

	void decr()
	{
		lock.lock();
		try
		{
			for(int i=0;i<10;i++)
			{
				cnt--;
				System.out.println(Thread.currentThread().getName()+" - "+cnt);
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
}

class  DemoReentrantLock2
{
	public static void main(String[] args) 
	{
		Runner ob = new Runner();

		Thread t1 = new Thread(){
			public void run()
			{
				ob.incr();
			}
		};
		t1.start();
		Thread t2 = new Thread(){
			public void run()
			{
				ob.incr();
			}
		};
		t2.start();
	}
}
