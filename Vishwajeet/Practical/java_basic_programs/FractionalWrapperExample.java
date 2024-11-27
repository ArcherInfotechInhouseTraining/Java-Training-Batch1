public class FractionalWrapperExample 
{
	public static void main(String[] args) 
	{
		int x=10,y=0;

		float a = 12.5f,b=0.0f;
		System.out.println("a/b "+(a/b));

		float p=-122.4f, q=0.0f;
		System.out.println("p/q "+(p/q));

		System.out.println(0.0/0.0);
		System.out.println(Math.sqrt(-1));

		try{System.out.println(10%0);}catch(Exception e){}

		float v1=123.45f,v2=34.56f;
		float vmax=0.0f,vmin=0.0f;

		vmax=Float.max(v1,v2);
		vmin=Float.min(v1,v2);

		System.out.println("min value: "+vmin+" \t max value: "+vmax);
		System.out.println("v1+v2 = "+Float.sum(v1,v2));

		v1=20F;
		System.out.println("Hex of v1: "+Float.toHexString(v1));
	}
}
