   // Enter any 3 digit number from keyboard and find addition of its all digits.
  // no=285 then ans = 5+8+2 => 15

import java.util.Scanner;
class DemoDivMod
{
	public static void main(String ar[])
	{
		int no=0,rem=0,tot=0;
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter any 3 digit number: ");
		no=sc.nextInt();


		System.out.println(" number is: "+no);

		rem=no%10;
		tot=tot+rem;
		no=no/10;

		rem=no%10;
		tot=tot+rem;
		no=no/10;

		rem=no%10;
		tot=tot+rem;
		
		System.out.println("Total is: "+tot);	
	}
}