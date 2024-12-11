package Multithreading;

class Interrupt1 extends Thread{
	public void run() {
		System.out.println(" Interrupted: "+Thread.interrupted()); 
		System.out.println("Is Interrupted : "+this.isInterrupted());
		
		try {
			for(int i=0;i<15;i++) {
				System.out.println(i+" - "+this);
				Thread.sleep(1000);
				System.out.println(" Interrupted: "+Thread.interrupted());


			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	
}
public class InterruptExample1 {

	public static void main(String[] args) {
		
		Interrupt1 t1 = new Interrupt1();
		t1.start();
		t1.interrupt();	
	}

}
