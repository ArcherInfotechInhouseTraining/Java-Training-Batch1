import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class FileChannelExample 
{

	public static void main(String[] args) 
	{
		try(RandomAccessFile file = new RandomAccessFile("example.txt", "r"); FileChannel channel = file.getChannel())
		{
			ByteBuffer buffer = ByteBuffer.allocate(48);
			int bytesRead = channel.read(buffer);
			
			
			while(bytesRead != -1)
			{
				buffer.flip();
				
				while(buffer.hasRemaining())
				{
					System.out.print((char)buffer.get());
				}
				buffer.clear();
				bytesRead = channel.read(buffer);
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
