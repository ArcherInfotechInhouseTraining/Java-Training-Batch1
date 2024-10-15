import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class SharedFileLockExample {
    public static void main(String[] args) {
        Path path = Paths.get("example.txt");

        try (FileChannel fileChannel = FileChannel.open(path, StandardOpenOption.READ)) {
            // Acquire a shared lock on the file
            FileLock lock = fileChannel.lock(0, Long.MAX_VALUE, true);

            System.out.println("File is locked.");

            // Read data from the file while holding the lock
            ByteBuffer buffer = ByteBuffer.allocate(1024);
            fileChannel.read(buffer);

            buffer.flip();
            byte[] data = new byte[buffer.limit()];
            buffer.get(data);

            System.out.println("Read data: " + new String(data));

            // Release the lock
            lock.release();

            System.out.println("File lock released.");
        } 
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
