package ListExamples;

@FunctionalInterface
interface MessageFI7{
	void printMessage(int x,int y);
}
public class FunctionalInterface7 {

	public static void main(String[] args) {
		MessageFI7 ob = (int x,int y)-> System.out.println("Functional Interface   Sum is - "+(x+y));

		ob.printMessage(700,700);

	}

}
