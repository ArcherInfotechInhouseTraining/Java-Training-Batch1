class Message
{
	synchronized public void showMessage()
	{
		System.out.println("Hello");
		System.out.println("How");
		System.out.println("are");
		System.out.println("you!");

		try
		{
			Thread.sleep(700);
		}
		catch (Exception e)
		{
		}
		System.out.println("All");
		System.out.println("The");
		System.out.println("Best");
		System.out.println("-------------");
	}
}
class Friends extends Thread
{
	Message msg;

	public Friends(Message msg)
	{
		this.msg=msg;
	}
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			msg.showMessage();
			try
			{
				Thread.sleep(300);
			}
			catch (Exception e)
			{
			}
		}
	}

}
class Relatives extends Thread
{
	Message msg;

	public Relatives(Message msg)
	{
		this.msg=msg;
	}
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			msg.showMessage();
			try
			{
				Thread.sleep(300);
			}
			catch (Exception e)
			{
			}
		}
	}

}
class SyncMessage
{
	public static void main(String []args)
	{
		Message ob = new Message();

		Friends ob1 = new Friends(ob);
		ob1.start();

		Relatives ob2 = new Relatives(ob);
		ob2.start();
	}

}