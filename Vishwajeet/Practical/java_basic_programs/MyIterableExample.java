import java.util.Iterator;
// Define a custom iterable class
class MyIterable implements Iterable<String> 
{
    private String[] data;
    public MyIterable(String[] data) 
    {
        this.data = data;
    }
    // Implement the iterator() method required by Iterable interface
    @Override
    public Iterator<String> iterator(){
        return new Iterator<String>() {
            private int index = 0;

            @Override
            public boolean hasNext() {
                return index < data.length;
            }

            @Override
            public String next() {
                if (!hasNext()) {
                    throw new java.util.NoSuchElementException();
                }
                return data[index++];
            }
        };
    }
}

public class MyIterableExample 
{
    public static void main(String[] args) 
    {
        // Create an instance of the iterable class
        MyIterable myIterable = new MyIterable(new String[]{"Hello", "World", "Iterable"});

        // Iterate over the elements using a for-each loop
        for (String item : myIterable) 
		{
            System.out.println(item);
        }
    }
}
