public class SimpleExecutorService
{
	public static void main(String[] args) 
	{
		ExecutorService pool = Executors.newSingleThreadExecutor();
		Callable <Integer> task = new Callable<Integer>(){
			public Integer call()
			{
				int i=0, t=0;
				try
				{
					for(int i=0;i<=10;i++)
					{
						tot=tot+i;
						Thread.sleep(400);
						System.out.println("Result: "+tot);
					}

				}
				catch (InterruptedException ex)
				{
					ex.printStackTrace();
				}
				return tot;
			}
		};
		Future<Integer> result= pool.submit(task);
		try
		{
			Integet.returnValue = result.get();
			System.out.println("Final Result: "+returnValue);
		}
		catch (InterruptedException | ExecutionException ex)
		{
			ex.printlnStackTrace();
		}
		pool.shutdown();
	}
}
