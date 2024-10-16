package ListExamples;
@FunctionalInterface
interface MessageFI2 {
	void printMessage();
}
 
public class FunctionalInterface2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MessageFI2 ob = new MessageFI2() {

			@Override
			public void printMessage() {
				// TODO Auto-generated method stub
				System.out.println("Functional interface advanced2");	
			}
			
		};
		ob.printMessage();
	}

}

