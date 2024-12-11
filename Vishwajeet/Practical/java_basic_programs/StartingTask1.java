class MyExecutor extends Thread
{
	int start,end;
	public MyExecutor(int start,int end)
	{
		this.start=start;
		this.end=end;
	}
	public void run()
	{
		int tot = 0;
		for(int i=start;i<=end;i++)
		{
			tot=tot+i;
			try{Thread.sleep(800);}catch(Exception e){}
			System.out.println("Processing"+Thread.currentThread().getName());
		}
		System.out.println("\n Total is: "+tot);
	}
}
class StartingTask1  
{
	public static void main(String[] args) 
	{
		MyExecutor ob1 = new MyExecutor(2,7);
		ob1.start();

		MyExecutor ob2 = new MyExecutor(1,5);
		ob2.start();

		MyExecutor ob3 = new MyExecutor(5,10);
		ob3.start();
	}
}
