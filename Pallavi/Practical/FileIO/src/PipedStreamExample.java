import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

public class PipedStreamExample {

	public static void main(String[] args) throws InterruptedException {
		
		try
		{
			PipedOutputStream pos = new PipedOutputStream();
			PipedInputStream pis = new PipedInputStream(pos);
			
			Thread writerThread = new Thread( ()->{
				try
				{
					for(int i=0;i<10;i++)
					{
						pos.write(i);
						System.out.println("Writer: "+i);
						Thread.sleep(500);
					}
					pos.close();
				}
				catch(IOException | InterruptedException e)
				{
					e.printStackTrace();
				} 
			});
			
			Thread readerThread = new Thread( ()->
			{
				try
				{
					int data;
					while( (data=pis.read())!= -1 )
					{
						System.out.println("Reader: "+data);
					}
					pis.close();
				}
				catch(Exception e)
				{
					e.printStackTrace();
				}
			});
			
			writerThread.start();
			readerThread.start();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
