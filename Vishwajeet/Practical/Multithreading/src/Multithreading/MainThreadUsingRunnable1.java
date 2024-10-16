package Multithreading;

class SampleThread5 implements Runnable{
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println("Hello "+i);
			try {Thread.sleep(400);}catch(Exception e) {}
		}
		
	}	
}
class SampleThread6 implements Runnable{
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println("Hii "+i);
			try {Thread.sleep(200);}catch(Exception e) {}
		}
		
	}	
} 

public class MainThreadUsingRunnable1 {

	public static void main(String[] args) {
		Thread t1 = new Thread(new SampleThread5());
		t1.start();
		
		Thread t2 = new Thread(new SampleThread6());
		t2.start();
		
		

	}

}
