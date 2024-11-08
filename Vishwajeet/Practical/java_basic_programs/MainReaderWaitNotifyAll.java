import java.util.Random;
class Message
{
	String message;
	boolean empty=true;

	public synchronized String read()
	{
		while(empty)
		{
			try
			{
				wait();
			}
			catch (InterruptedException e)
			{
				System.out.println(Thread.currentThread().getName()+" Interrupted");
			}
		}
		empty=true;
		notifyAll();
		return message;	
	}
	public synchronized void write(String message)
	{
		while(!empty)
		{	
			try
			{
				wait();
			}
			catch (InterruptedException e)
			{
				System.out.println(Thread.currentThread().getName()+" Interrupted");
			}
		}
		this.message=message;
		empty=false;
		notifyAll();
	}
}
class Writer implements Runnable
{
	private Message message;
	public Writer(Message message)
	{
		this.message=message;
	}
	public void run()
	{
		String messages[]={
			"Johny johny yes papa",
			"eating sugar?, no papa",
			"telling lies?,no papa",
			"open your mouth, ha ha ha"
		};
		Random random = new Random();
		for(int i=0;i<messages.length;i++)
		{
			message.write(messages[i]);
			try{Thread.sleep(random.nextInt(2000));}catch(InterruptedException e){
				System.out.println("Writer thread intrrupted");
			}
		}
		message.write("finished");
	}
}
class Reader implements Runnable
{
	private Message message;
	public Reader(Message message)
	{
		this.message = message;
	}
	public void run()
	{
		Random random = new Random();
		for(String latestMessage = message.read(); !"Finished!".equals(latestMessage); latestMessage = message.read())
		{
			System.out.println(latestMessage);
			try{Thread.sleep(random.nextInt(2000));}catch(InterruptedException e){
				System.out.println("Reader thread intrrupted");
			}
		}
	}
}
public class MainReaderWaitNotifyAll
{
	public static void main(String []args)
	{
		Message message = new Message();
		Thread writerThread = new Thread(new Writer(message));
		Thread readerThread= new Thread(new Reader(message));

		writerThread.start();
		readerThread.start();
	}
}