package ListExamples;

@FunctionalInterface
interface MessageFI3{
	void printMessage();
}

public class FunctionalInterface3 {
	public static void main(String []args) {
		MessageFI3 ob = () -> {
				System.out.println("Functional Interface is advanced - Anonymous-1");
			}			
		;
		ob.printMessage();
	}
}

