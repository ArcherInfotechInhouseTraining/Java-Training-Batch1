package Multithreading;

class DemoThread extends Thread{
	public void run() {
		for(int i=0;i<=10;i++) {
			System.out.println("Hello "+i);
			try {Thread.sleep(400);}catch(Exception e) {}
			
		}
	}
}

public class MainThread1 {

	public static void main(String[] args) {
		DemoThread d1 = new DemoThread();
		d1.start();
		
		DemoThread d2 = new DemoThread();
		d2.start();

	}

}
