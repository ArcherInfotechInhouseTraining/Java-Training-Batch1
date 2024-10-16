import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.Random;
class Message
{
	private String message;
	private boolean empty=true;
	private Lock lock =new ReentrantLock();
	private Condition notEmpty=lock.newCondition();
	private Condition notFull=lock.newCondition();

	public String read() throws InterruptedException
	{
		lock.lock();
		try
		{
			while(empty)
			{
				notEmpty.await();
			}
			empty=true;
			notFull.signalAll();
			return message;
		}
		finally
		{
			lock.unlock();
		}
	}
	public void write(String message) throws InterruptedException
	{
		lock.lock();
		try
		{
			while(!empty)
			{
				notFull.await();
			}
			this.message=message;
			empty=false;
			notEmpty.signalAll();
		}
		finally
		{
			lock.unlock();
		}
	}

}
class Writer implements Runnable
{
	private Message message;
	public Writer(Message message)
	{
		this.message = message;
	}
	public void run() 
	{
		String messages [] ={
			"Johny johny yes papa",
			"eating sugar?, no papa",
			"telling lies?, no papa",
			"open your mouth ha ha ha"
		};
		Random random = new Random();
		for(int i=0;i<messages.length;i++)
		{
			
			
			try{
				message.write(messages[i]);
				Thread.sleep(random.nextInt(2000));
				}catch(InterruptedException e){
				System.out.println("Writer thread interrupted");
			}
		}
		try
		{
			message.write("Finished");
		}
		catch (InterruptedException e)
		{
			System.out.println("writer thread interrupted");
		}
	}

}
class Reader implements Runnable
{
	private Message message;
	public Reader(Message message)
	{
		this.message=message;
	}
	public void run()
	{
		Random random = new Random();
		try
		{
			for(String latestMessage=message.read();!"Finished!".equals(latestMessage);latestMessage=message.read())
			{
				System.out.println(latestMessage);
				Thread.sleep(random.nextInt(2000));
			}
		}
		catch (InterruptedException e)
		{
			System.out.println("Reader Interrupted");
		}
	}
}
public class MainReaderWriter1  
{
	public static void main(String[] args) 
	{
		Message message = new Message();

		Thread writerThread1 = new Thread(new Writer(message));
		Thread readerThread1 = new Thread(new Reader(message));

		Thread writerThread2 = new Thread(new Writer(message));
		Thread readerThread2 = new Thread(new Reader(message));

		writerThread1.start();
		readerThread1.start();

		writerThread2.start();
		readerThread2.start();
	}
}
