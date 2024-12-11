package ListExamples;

@FunctionalInterface
interface MessageFI1 {
	void printMessage();
}
 class MyMessage1 implements MessageFI1 {

	@Override
	public void printMessage() {
		// TODO Auto-generated method stub
		System.out.println("Functional interface advanced");
		
	}
	
}
public class FunctionalInterface1 {

	public static void main(String[] args) {
		
		MyMessage1 ob = new MyMessage1();
		ob.printMessage();
	}

}
