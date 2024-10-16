import java.util.*;
class ArraySearching
{
	public static void main(String []args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the count: ");
		int cnt=sc.nextInt();
		int i,j;
		int []x=new int[cnt];
		System.out.println("Enter the "+cnt+" Elements");
		for(i=0;i<cnt;i++)
		{
			x[i]=sc.nextInt();
		}
		int no;
		System.out.println("Enter the number to be searched");
		no=sc.nextInt();
		for(i=0;i<x.length;i++)
		{
			if(x[i]==no)
				break;
		}
		if(i<x.length)
		{
			System.out.println("Number is present at "+i+" position");
		}
		else
		{
			System.out.println("Number is not present");
		}
	}
		
}