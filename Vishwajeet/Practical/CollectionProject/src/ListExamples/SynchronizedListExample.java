package ListExamples;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
public class SynchronizedListExample {

	public static void main(String[] args) throws InterruptedException{
		List<Integer> numbers = new LinkedList<>();
		
		// wrap it in synchronized
		List<Integer> synchronizedNumbers = Collections.synchronizedList(numbers);
		
		// Thread 1 keeps adding numbers
		Thread thread1 = new Thread(()->{
			for(int i=0;i<=100;i++) {
				System.out.println(synchronizedNumbers.add(i));
				try {Thread.sleep(200);}catch(InterruptedException e) {e.printStackTrace();}
				
			}
			
		});
		
		Thread thread2 = new Thread(() ->{
			while(true) {
				System.out.println("List size: "+synchronizedNumbers.size());
				try {Thread.sleep(100);}catch(InterruptedException e) {e.printStackTrace();}
			}
		});
		
		thread1.start();
		thread2.start();
		
		thread1.join();
		thread2.join();
		

	}

}
