import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class RegionFileLockExample {
	public static void main(String[] args) {
		Path path = Paths.get("example.txt");

		try (FileChannel fileChannel = FileChannel.open(path, StandardOpenOption.WRITE, StandardOpenOption.CREATE)) 
		{
			// Acquire an exclusive lock on a region of the file
			FileLock lock = fileChannel.lock(0, 50, false);

			System.out.println("File region is locked.");

			// Write data to the locked region of the file
			ByteBuffer buffer = ByteBuffer.wrap("This is some test data for a specific region.".getBytes());
			fileChannel.write(buffer);

			// Release the lock
			lock.release();

			System.out.println("File region lock released.");
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
	}
}
