import java.util.Scanner;

class PrimeWhile
{
	public static void main(String args[])
	{
		int n1=0,n2=0;
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the range start from : ");
		n1=sc.nextInt();
		System.out.println("Enter the range ends to: ");
		n2=sc.nextInt();

		System.out.println("List of prime no's from "+n1+"to"+n2);

		for( ;n1<=n2;n1++)
		{
			int d=2,flg=0;
			while(d<=n1/2)
			{
				if(n1%d==0)
				{
					flg=1;
					break;
				}
				d++;
			}

			if(flg==0 && n1!=1)
			{
				System.out.println(+n1);
			}
		}
	}
}