class Demo
{
	public Demo()
	{
		float d = 89.90f;
	}
}
class FractionaWrapperExampe 
{
	public static void main(String[] args) 
	{
		int x=10,y=0;
		//System.out.println("x/y"+(x/y));

		float a=12.34f,b=0.0f;
		System.out.println("a/b "+(a/b));

		float p=-12.24f,q=0.0f;
		System.out.println("p/q "+(p/q));

		System.out.println("0.0/0.0 "+(0.0/0.0));
		System.out.println("sqrt(-1)"+Math.sqrt(-4));
		System.out.println("10.0%0.0 "+(10.0%0.0));

		float f1=54.22f , f2=23.12f, vmax=0.0f, vmin=0.0f;
		vmax = Float.max(f1,f2);
		System.out.println("Max is: "+vmax);

		vmin = Float.min(f1,f2);
		System.out.println("Min is: "+vmin);

		f1 = 98f;
		System.out.println("hex of f1: "+Float.toHexString(f1));
	
		Demo ob = new Demo();
		System.out.println("toString of f2: "+Float.toString(f1));

	}
}