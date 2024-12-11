package ListExamples;

@FunctionalInterface
interface MessageFI5{
	void printMessage(int x);
}

public class FunctionalInterface5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MessageFI5 ob = (int x) -> System.out.println("Functional Interface is advanced Lambda Expression- "+x);

		ob.printMessage(100);
	}

}
