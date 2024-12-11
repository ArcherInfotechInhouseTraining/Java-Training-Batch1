package ListExamples;

@FunctionalInterface
interface MessageFI4 {
	void printMessage();
}
public class FunctionalInterface4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MessageFI4 ob= () -> System.out.println("Functional Interface Lambda Expression anonymous 2");
		ob.printMessage();
	}
}
