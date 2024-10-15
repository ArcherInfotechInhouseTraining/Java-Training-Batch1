import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class ExclusiveFileLockExample 
{
	public static void main(String[] args) 
	{
		Path path = Paths.get("example.txt");

		try (FileChannel fileChannel = FileChannel.open(path, StandardOpenOption.WRITE, StandardOpenOption.CREATE)) 
		{
			// Acquire an exclusive lock on the file
			FileLock lock = fileChannel.lock();

			System.out.println("File is locked.");

			// Write data to the file while holding the lock
			ByteBuffer buffer = ByteBuffer.wrap("This is some test data.".getBytes());
			fileChannel.write(buffer);

			// Release the lock
			lock.release();

			System.out.println("File lock released.");
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
	}
}
