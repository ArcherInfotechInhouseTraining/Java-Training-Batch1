import java.util.Random;

public class RandomLocationAccessFromArray 
{
    public static void main(String[] args) 
	{
		int []x={11,23,45,67,78,23,5,67,98,23,45,89,34,23,45,67};
		System.out.println("Array Size: "+x.length);
        Random random = new Random();
        
		for(int i=0 ; i<10 ; i++)
		{
			int r = random.nextInt(30);
			try
			{
				System.out.print(x[r]);
			}
			catch(Exception e)
			{
				System.out.print("-");
			}
			finally
			{
				System.out.println("  :Random Location: "+r);
			}
		}
		System.out.println("End of Program");
    }
}