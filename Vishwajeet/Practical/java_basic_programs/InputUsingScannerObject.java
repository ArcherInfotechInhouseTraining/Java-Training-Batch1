import java.util.Scanner;
class InputUsingScannerObject {
	
	public static void main(String []args) {
		Scanner sc= new Scanner(System.in);
		String s="";
		int x=0;
		double y=0.0;
		char ch='$';
		
	System.out.println("Enter any string: ");
	s=sc.nextLine();
	System.out.println("Enter int value: ");
	x=sc.nextInt();
	System.out.println("Enter fractional value: ");
	y=sc.nextDouble();
	System.out.println("Enter character: ");
	ch=sc.next().charAt(0);
		
	System.out.println("String: "+s);
	System.out.println("x: "+x);
	System.out.println("y: "+y);
	System.out.println("ch: "+ch);
	}
}
