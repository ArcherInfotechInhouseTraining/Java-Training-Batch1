package ListExamples;

@FunctionalInterface
interface MessageFI8 {
	int printMessage(int x,int y);
}
public class FunctionalInterface8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MessageFI8 ob = (int x,int y)-> {
		System.out.println("calculating ...");
		int t= (x+y);
		return t;
	};
		int tot=ob.printMessage(700,800);
		System.out.println("total: "+tot);
	}
}
