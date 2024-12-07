package ListExamples;

@FunctionalInterface
interface MessageFI9 {
	int printMessage(int x,int y);
}
public class FunctionalInterface9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MessageFI9 ob = (int x,int y)-> {return (x+y) ;
		};
		
		int tot=ob.printMessage(700,800);
		System.out.println("total: "+tot);
	}
}
