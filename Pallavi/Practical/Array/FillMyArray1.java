we can provide it as a library also so for that we need to insert the documentation comments as

/**
This class contains some static methods, which are provided to fill the entire array with
the value 1 and A method which will fill the specific part of an array with a given value
*/
public class FillMyArray1
{
	/**
	This method will displays all array element in a single line.
	*/
	public static void display(int []a)
	{
		System.out.println("\n Array Elements are: ");
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
	public static void fillArray(int []a,int val, int sp, int cnt)
	{
		while(cnt>0)
		{
			a[sp]=val;
			sp++;
			cnt--;
		}
	}
}

// save as a public class and compile it using javadoc from bin folder, you will get documentation
// for your class.