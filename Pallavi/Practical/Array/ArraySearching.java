import java.util.Scanner;
class ArraySearching 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter array count : ");
		int cnt = sc.nextInt();

		int x[] = new int[cnt];
		int i,no;

		System.out.println("Enter the "+cnt + " elements of array : ");
		for(i=0;i<cnt;i++)
		{
			x[i]=sc.nextInt();
		}

		System.out.println("Enter number to be searched : ");
		no=sc.nextInt();

		for(i=0;i<x.length;i++)
		{
			if(x[i]==no)
			{
				break;
			}
		}
		if(i<x.length)
		{
			System.out.println("Numer is present at "+i +" location");
		}
		else
		{
			System.out.println("Number is not present");
		}
	}
}
