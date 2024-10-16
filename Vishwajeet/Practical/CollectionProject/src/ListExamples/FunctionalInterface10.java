package ListExamples;

@FunctionalInterface
interface MessageFI10 {
	int printMessage(int x,int y);
}
public class FunctionalInterface10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MessageFI10 ob = (int x,int y)-> (x+y) ;
		
		int tot=ob.printMessage(700,800);
		System.out.println("total-: "+tot);

	}

}
