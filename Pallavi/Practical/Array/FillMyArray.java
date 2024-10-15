
/**
This class contains some static methods, which are provided to fill the entire array with
the value 1 and A method which will fill the specific part of an array with a given value
*/

import java.util.*;
class FillArray
{
	
	/**
	This method will displays all array element in a single line.
	*/

	public static void display(int []a)
	{
		System.out.println("\n Array elements : \n");
		for(int i=0;i<a.length;i++)
		{
			System.out.print("  "+a[i]);
		}
	}

/**
	This method will fill an array with a value provided by val 
	*/

	public static void fillArray(int []a,int val)
	{
		for(int i=0;i<a.length;i++)
		{
			a[i]=val;
		}
	}

/**
	This method will fill a part, from sp position and cnt elements after it,
	of array with a value provided by val 
	*/

	public static void fillArray(int []a,int val,int sp,int cnt)
	{
		while(cnt>0)
		{
			a[sp]=val;
			sp++;
			cnt--;
		}
	}
}

class FillMyArray 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the array coutn : ");
		int cnt=sc.nextInt();
		int x[]=new int[cnt];

		//fill all array with 1

		FillArray.fillArray(x,1);
		FillArray.display(x);

		FillArray.fillArray(x,5,2,3);
		FillArray.display(x);
	}
}
