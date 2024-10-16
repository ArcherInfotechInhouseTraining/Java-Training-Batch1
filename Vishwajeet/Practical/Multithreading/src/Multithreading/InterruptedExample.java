package Multithreading;

class MyThread extends Thread{
	public void run() {
		try {
			for(int i=0;i<10;i++) {
			System.out.println(i+" - "+this);
			Thread.sleep(1000);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
public class InterruptedExample {

	public static void main(String[] args) {
		MyThread t1 = new MyThread();
		t1.start();
		
		try {Thread.sleep(70000);}catch(Exception e) {}
		t1.interrupt();

	}

}
