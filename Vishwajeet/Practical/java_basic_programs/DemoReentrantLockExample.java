import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
class Runner
{
	int cnt=0;
	void incr()
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
}
class DemoReentrantLockExample
{
	public static void main(String[] args) 
	{
		Runner ob =new Runner();
		Lock lock = new ReentrantLock();
		Lock lock1 = new ReentrantLock();

		Thread t1 = new Thread(){
			public void run()
			{
				lock.lock();
				try
				{
					ob.incr();
				}
				catch (Exception e)
				{
				}
				finally
				{
					lock.unlock();
				}
			}
		};
		t1.start();

		Thread t2 = new Thread(){
			public void run()
			{
				lock1.lock();
				try
				{
					ob.incr();
				}
				catch (Exception e)
				{
				}
				finally
				{
					lock.unlock();
				}
			}
		};
		t2.start();
	}
}
