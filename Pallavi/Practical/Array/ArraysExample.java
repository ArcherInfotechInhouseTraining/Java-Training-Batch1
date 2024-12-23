import java.util.Arrays;
class ArraysExample 
{
	public static void main(String[] args) 
	{
		int x[] = {23,78,97,42,46,29,8,56};

		// Using toString() to display the array
		System.out.println("Array x: "+Arrays.toString(x));
		System.out.println("------------------------------\n");

		//Using Sort
		Arrays.sort(x);
		System.out.println("Sorted Array x: "+Arrays.toString(x));

		char ch[] = {'a','y','x','d','e','f'};
		System.out.println("Array ch: "+Arrays.toString(ch));

		Arrays.sort(ch);
		System.out.println("Sorted Array ch: "+Arrays.toString(ch));
		System.out.println("------------------------------\n");

		//using sort a specific range
		int y[] = {11,67,34,90,24,54,76};
		Arrays.sort(y,2,5);
		System.out.println("Range sort Array y: "+Arrays.toString(y));
		System.out.println("------------------------------\n");

		// searching
		Arrays.sort(y);
		System.out.println("Range sort Array y: "+Arrays.toString(y));

		int key = 68;
		int pos = Arrays.binarySearch(y,key);
		System.out.println("Position is: "+pos);

		int pos1 = Arrays.binarySearch(y,34);
		System.out.println("Position is: "+pos1);
		System.out.println("------------------------------\n");

		//fill

		Arrays.fill(x,11);
		Arrays.fill(y,2,6,222);

		System.out.println("Array x after fill: "+Arrays.toString(x));
		System.out.println("Array y after fill: "+Arrays.toString(y));
		System.out.println("------------------------------\n");

		//copyOf

		int z[] = Arrays.copyOf(x,13);
		System.out.println("Array z: "+Arrays.toString(z));
		
		int t[] = Arrays.copyOfRange(y,1,8);
		System.out.println("Array t: "+Arrays.toString(t));
		int []t1 = Arrays.copyOf(y,5);
		System.out.println("Array t1: "+Arrays.toString(t1));

		int t2[] = Arrays.copyOf(y,y.length);
		System.out.println("Array t2: "+Arrays.toString(t2));
		System.out.println("------------------------------\n");

		// Using equals
		boolean b = Arrays.equals(x,y);
		System.out.println("x equals y: "+b);

		b = Arrays.equals(y,t2);
		System.out.println("y equals t2: "+b);
		
		b = Arrays.equals(t1,t2);
		System.out.println("t1 equals t2: "+b);
		System.out.println("------------------------------\n");

		int p[] = {11,22,33,44};
		int q[] = {11,22,33,44};
		int r[] = p;
		System.out.println("p equals q: "+p.equals(q));
		System.out.println("p equals r: "+p.equals(r));
		System.out.println("Array r: "+Arrays.toString(r));
		System.out.println("------------------------------\n");

		//hashcode
		System.out.println("HashCde of x: "+x.hashCode());
		System.out.println("HashCde of y: "+y.hashCode());
		System.out.println("HashCde of z: "+z.hashCode());
		System.out.println("HashCde of t: "+t.hashCode());
		System.out.println("HashCde of t1: "+t1.hashCode());
		System.out.println("HashCde of t2: "+t2.hashCode());
		System.out.println("HashCde of q: "+q.hashCode());
		System.out.println("HashCde of p: "+p.hashCode());
		System.out.println("HashCde of r: "+r.hashCode());
		System.out.println("------------------------------\n");




	}
}
