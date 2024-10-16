package Multithreading;

class SampleThread7 implements Runnable{
	public void run() {
		Thread t = Thread.currentThread();
		for(int i=0;i<10;i++) {
			System.out.println(t.getId()+t.getName()+" - With priority - "+t.getPriority());
			try {Thread.sleep(200);}catch(Exception e) {}
		}
		
	}
}
public class MainThreadUsingRunnable2 {

	public static void main(String[] args) {
		Thread t1 = new Thread(new SampleThread7());
		t1.setName("HelloThread");
		t1.setPriority(7);
		t1.start();
		
		SampleThread7 ob2 = new SampleThread7();
		Thread t2 = new Thread(ob2);
		t2.setName("HiiThread");
		t2.start();
		
		Thread t3 = new Thread(new SampleThread7());
		t3.setName("ByeThread");
		t3.setPriority(3);
		t3.start();		
	}
}
