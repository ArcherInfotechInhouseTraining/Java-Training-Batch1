class MyExecutor extends Thread
{
	public void run()
	{
		int tot = 0;
		for(int i=0;i<=10;i++)
		{
			tot=tot+i;
		}
		System.out.println("\n Total is: "+tot);
	}
}
class StartingTask  
{
	public static void main(String[] args) 
	{
		MyExecutor ob = new MyExecutor();
		ob.start();
	}
}
