package Iterable;
import java.util.Iterator;

class Demo implements Iterable<String>
{
	private String[] data;
	
	public Demo(String[] data)
	{
		this.data=data;
	}
	@Override
	public Iterator<String> iterator() 
	{
		return new Iterator<String>()
		{
			private int index = 0;
			
			@Override
			public boolean hasNext()
			{
				return index<data.length;
			}
			@Override
			public String next()
			{
				if(!hasNext())
				{
					throw new java.util.NoSuchElementException();
				}
				return data[index++];
			}			
		};
	}
}
public class MyIterableExample {

	public static void main(String[] args) {
		Demo demo = new Demo(new String[]{"Hello","World","Iterable"});
		
		for(String item : demo)
		{
			System.out.println(item);
		}

		System.out.println("Using Iteraator: ");
		Iterator<String> ob = demo.iterator();
		while(ob.hasNext())
		{
			System.out.println(ob.next());
		}
	}

}
