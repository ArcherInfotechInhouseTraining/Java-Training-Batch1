package Multithreading;

class SampleThread1 extends Thread{
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println("Hello "+i+" - "+getName());
			try {Thread.sleep(400);}catch(Exception e) {}
		}
	}
}
class SampleThread2 extends Thread{
	public void run() {
		for(int i=0;i<20;i++) {
			System.out.println("Hii "+i+" - "+getName());
			try {Thread.sleep(400);}catch(Exception e) {}
			
		}
	}
}
public class MainConcThread2 {

	public static void main(String[] args) {
		SampleThread1 s1 = new SampleThread1();
		s1.start();
		
		SampleThread2 s2 = new SampleThread2();
		s2.start();
	}

}
