package Multithreading;

class FirstThread1 extends Thread{
	public FirstThread1(String name) {
		super(name);
	}
	public void run() {
		for(int i=0;i<20;i++) {
			System.out.println(Thread.currentThread());
			try {Thread.sleep(400);}catch(Exception e) {}
		}	
	}
}
class SecondThread2 extends Thread{
	public SecondThread2(String name) {
		super(name);
		
	}
	public void run() {
		for(int i=0;i<40;i++) {
			System.out.println(Thread.currentThread());
			try {Thread.sleep(400);}catch(Exception e) {}			
		}
	}
}
public class IsAliveAndJoinDemo {

	public static void main(String[] args) {
		
		FirstThread1 f1 = new FirstThread1("One");
		f1.start();
		
		SecondThread2 f2 = new SecondThread2("Two");
		f2.start();
		
		System.out.println("f1 is Alive()? "+f1.isAlive());
		System.out.println("f2 is Alive()? "+f2.isAlive());
		
		for(int i=0;i<40;i++) {
			System.out.println(Thread.currentThread()+" - "+i);
			try {Thread.sleep(400);}catch(Exception e) {}	
			
			if(i==10) {
				try {f1.join();}catch(Exception e) {}
			}
		}	
		System.out.println("f1 is Alive()? "+f1.isAlive());
		System.out.println("f2 is Alive()? "+f2.isAlive());
	}

}
