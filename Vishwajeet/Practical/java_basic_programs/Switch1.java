import java.util.Scanner;
class Switch1 {
	public static void main(String []args) {
		Scanner sc=new Scanner(System.in);
		int opt=0;
		double a=0.0, b=0.0;
		while(true) {
		System.out.println("****MENU****");
		System.out.println("1.Addition \t 2. Subtraction \t 3.multiplication \t 4.division \t 5.Stop");
		System.out.println("Select your option: ");
		opt=sc.nextInt();
		
			
		System.out.println("Enter the values of and b:");
		a=sc.nextInt();
		b=sc.nextInt();
		switch(opt) {
			case 1: double sum=0.0;
				sum= a+b;
				System.out.println("Sum is: "+sum);
				break;

			case 2: double sub=0.0;
				sub= a-b;
				System.out.println("Sub is: "+sub);
				break;

			case 3: double mul=1.0;
				mul= a*b;
				System.out.println("Mul is: "+mul);
				break;

			case 4: double div=0.0;
				div= a/b;
				System.out.println("Div is: "+div);
				break;
			
			case 5: System.exit(0);
		}
		}
	}
}
		