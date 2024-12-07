package ListExamples;

import java.util.Iterator;

//Define a custom iterable class
class Demo implements Iterable<String> {
	private String[] data;
	public Demo(String[] data) {
		this.data = data;
	}
 
 @Override
 public Iterator<String> iterator() {
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

public class MyIterableExample {
	public static void main(String[] args) {
     // Create an instance of the iterable class
     Demo demo = new Demo(new String[]{"Hello", "World", "Iterable"});

     // Iterate over the elements using a for-each loop
     for (String item : demo) {
         System.out.println(item);
     }

		System.out.println("Using iterator: ");
		Iterator<String> ob=demo.iterator();
		while(ob.hasNext()){
			System.out.println(ob.next());
		}
	}
}
