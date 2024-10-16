import java.util.Arrays;
class ArrayExample 
{
	public static void main(String[] args) 
	{
		int []x= {22,11,33,54,56,6,7,88,99};
		System.out.println("Entered array is: "+Arrays.toString(x));

		//Using sort
		Arrays.sort(x);
		System.out.println("Sorted array is: "+Arrays.toString(x));

		//using sort at specific range
		int []y={34,5,67,9,23,45,12,40,69,233,10};
		System.out.println("Entered array is: "+Arrays.toString(y));
		Arrays.sort(y,2,7);
		System.out.println("Sorted array is: "+Arrays.toString(y));

		//searching
		int key = 11;
		int pos = Arrays.binarySearch(x,key);
		System.out.println("Position is: "+pos);
		
		//fill
		Arrays.fill(x,1);
		Arrays.fill(y,2,7,111);
		System.out.println("After fill x array is: "+Arrays.toString(x));
		System.out.println("After fill range y array is: "+Arrays.toString(y));

		//copy
		int []z=Arrays.copyOf(x,12);
		System.out.println("After copyOf(), z array is: "+Arrays.toString(z));

		int []t=Arrays.copyOf(y,5);
		System.out.println("After copyOf(), t array is: "+Arrays.toString(t));

		int []t1=Arrays.copyOf(y,y.length);
		System.out.println("After copyOf(), t1 array is: "+Arrays.toString(t1));

		int []t2=Arrays.copyOfRange(y,4,8);
		System.out.println("After copyOf(), t2 array is: "+Arrays.toString(t2));

		//using equals
		boolean b = Arrays.equals(x,y);
		System.out.println("x equals y: "+b);

		boolean b1 = Arrays.equals(t1,y);
		System.out.println("t1 equals y: "+b1);

		int []k={1,1,1,1,1,1,1};
		boolean b2 = Arrays.equals(x,k);
		System.out.println("x equals k: "+b2);
	}
}
