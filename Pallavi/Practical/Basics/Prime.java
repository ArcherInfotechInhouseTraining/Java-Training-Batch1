import java.util.Scanner;

class Prime 
{

	public static void main(String []args)
	{
		int no,flg=0;

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter any number: ");
		no=sc.nextInt();

		int d=2;

		while( d<=(no/2) )
		{
			if(no%d == 0)
			{
				flg=1;
				break;
			}
			d++;
		}
		if(flg==1 || no==1)
		{
			System.out.println("Number is not  a prime no.");
		}
		else
		{
			System.out.println("Number is a prime no.");
		}	
	}
}