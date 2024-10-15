import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class ScatteringReadFileExample {

	public static void main(String[] args) {
		
		Path path = Paths.get("example.txt");
		
		try(FileChannel fileChannel = FileChannel.open(path , StandardOpenOption.READ))
		{
			ByteBuffer header = ByteBuffer.allocate(128);
			ByteBuffer body = ByteBuffer.allocate(1024);
			
			ByteBuffer[] buffers = {header , body}; 
			
			fileChannel.read(buffers);
			
			header.flip();
			body.flip();
			
			System.out.println("Header: " + new String(header.array(), 0 , header.limit()));
			System.out.println("Body: "+new String(body.array() , 0 , body.limit() ) );
			
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}

	}

}
