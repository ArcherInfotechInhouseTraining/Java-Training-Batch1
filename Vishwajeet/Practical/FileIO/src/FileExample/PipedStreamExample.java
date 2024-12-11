package FileExample;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.io.IOException;
public class PipedStreamExample {

	public static void main(String[] args) {
		// create piped input and output stream
		try {
				PipedOutputStream pos = new PipedOutputStream();
				PipedInputStream pis = new PipedInputStream(pos);
		
				// create a thread to write a data
				Thread writerThread =new Thread(()-> {
				try {
						for(int i=0;i<10;i++) {
							pos.write(i);
							System.out.println("Written "+i);
							Thread.sleep(500);
							}
							pos.close();			
					}catch(IOException | InterruptedException e) {
						e.printStackTrace();
						}
				});
		// create a thread to read data
		Thread readerThread = new Thread(()->{
			try {
				int data;
				while((data=pis.read())!=-1){
				System.out.println("Read: "+data);
				}
				pis.close();
			}catch(IOException e) {
				e.printStackTrace();
			}
		});
		
		writerThread.start();
		readerThread.start();	
		} catch(Exception e) {
		e.printStackTrace();
	}

	}
}
