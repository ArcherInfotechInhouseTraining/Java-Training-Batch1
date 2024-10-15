import java.io.InputStreamReader;
import java.io.BufferedReader;

class ArrayInputBrIsr1
{
	public static void main(String args[])
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int cnt=0;

		System.out.println("Enter the array count : ");
		try
		{
			cnt = Integer.parseInt(br.readLine());
		}
		catch(Exception e){}

		int x[] = new int[cnt];

		System.out.println("Enter the"+cnt+"array Elements : ");

		for(int i=0;i<cnt;i++)
		{
			try
			{
				x[i]=Integer.parseInt(br.readLine());
			}
			catch(Exception e){}
		}

		System.out.println("array Elements are : ");

		for(int i=0;i<cnt;i++)
		{		
			System.out.print("  "+x[i]);
		}
	}
}