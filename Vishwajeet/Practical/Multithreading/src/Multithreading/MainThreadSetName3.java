package Multithreading;
class SampleThread3 extends Thread{
	public SampleThread3(String name) {
		super(name);
		setPriority(6);
	}
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println("Hello "+i+" - "+getName()+" with priority: "+getPriority());
			try {Thread.sleep(400);}catch(Exception e) {}
		}
	}
}
class SampleThread4 extends Thread{
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println("Hii "+i+" - "+getName()+" with priority: "+getPriority());
			try {Thread.sleep(400);}catch(Exception e) {}
		}
	}
}
public class MainThreadSetName3 {

	public static void main(String[] args) {
		SampleThread3 s3 = new SampleThread3("HelloThread");
		s3.start();
		
		SampleThread4 s4 = new SampleThread4();
		s4.setName("HiiThread");
		s4.setPriority(Thread.MAX_PRIORITY);
		s4.start();

	}

}
