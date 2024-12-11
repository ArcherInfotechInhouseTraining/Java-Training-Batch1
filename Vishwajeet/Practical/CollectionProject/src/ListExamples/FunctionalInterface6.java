package ListExamples;

@FunctionalInterface
interface MessageFI6{
	void printMessage(int x);
}
public class FunctionalInterface6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MessageFI6 ob = x-> System.out.println("Functional Interface is advanced Lambda Expression- "+x);

		ob.printMessage(700);

	}

}
