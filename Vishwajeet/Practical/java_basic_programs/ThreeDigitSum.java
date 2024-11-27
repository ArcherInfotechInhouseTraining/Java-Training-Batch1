import java.util.Scanner;
class ThreeDigitSum {
	public static void main(String []args){
		Scanner sc=new Scanner(System.in);
		int no,rem,tot=0;
		System.out.println("Enter any number");
		no=sc.nextInt();

		rem=no%10;
		tot=tot+rem;
		no=no/10;

		rem=no%10;
		tot=tot+rem;
		no=no/10;

		rem=no%10;
		tot=tot+rem;
		no=no/10;

		System.out.println("DigitSum: "+tot);
	}
}