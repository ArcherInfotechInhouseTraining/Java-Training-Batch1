package ListExamples;

interface MessageFI {
	void printMessage();
}
 class MyMessage implements MessageFI {

	@Override
	public void printMessage() {
		// TODO Auto-generated method stub
		System.out.println("Functional interface advanced");
		
	}
	
}
public class FunctionalInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyMessage ob = new MyMessage();
		ob.printMessage();
	}

}
