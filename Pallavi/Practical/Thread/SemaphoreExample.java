import java.util.concurrent.Semaphore;

class SemaphoreExample 
{
	static Semaphore semaphore = new Semaphore(2);
	static class Worker extends Thread
	{
		private int id;

		public Worker(int id)
		{
			this.id=id;
		}

		public void run()
		{
			try
			{
				System.out.println("Worker "+id+" Waiting for permit...");
				semaphore.acquire();
				System.out.println("Worker "+id+" has acquired permit...");

				for(int i=0;i<10;i++)
				{
					System.out.println(Thread.currentThread().getName()+" - "+i);
					Thread.sleep(2000);
				}
				System.out.println("Worker "+id+" releasing permit...");
				semaphore.release();
			}
			catch (Exception e)
			{
				e.printStackTrace();
			}
		}

	} 
	
	public static void main(String[] args) 
	{
		for(int i=0;i<5;i++)
		{
			new Worker(i).start();
		}
	}
}
