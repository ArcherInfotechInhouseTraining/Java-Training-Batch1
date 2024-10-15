package List;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;
import java.util.Spliterator;
import java.util.Stack;
import java.util.ArrayList;
import java.util.Iterator;
/*

 // implement All linked list operations using LinkedList
  
public class LinkedListExample {

	public static void main(String[] args) {
		
		LinkedList<Integer> l1 = new LinkedList<>();
		l1.add(24);
		l1.add(4);
		l1.add(124);
		l1.add(89);
		l1.add(40);
		l1.add(60);
		l1.add(33);
		
		System.out.println(l1);
		System.out.println("peek(): "+l1.peek());
		System.out.println("peekFirst(): "+l1.peekFirst());
		System.out.println("peekLast(): "+l1.peekLast());
		
		System.out.println("Size(): "+l1.size());
		
		System.out.println("get(2): "+l1.get(2));
		System.out.println("getFirst(): "+l1.getFirst());
		System.out.println("getLast(): "+l1.getLast());
		
		System.out.println("contains(40): "+l1.contains(40));
		System.out.println("contains(12): "+l1.contains(12) );
		
		l1.set(1,100);
		System.out.println("\n set(): "+l1);
		
		Iterator<Integer> isr = l1.descendingIterator();
		
		while(isr.hasNext())
		{
			System.out.print(" "+isr.next());
		}
		
		LinkedList<Integer> copylist = new LinkedList<>();
		copylist = (LinkedList<Integer>) l1.clone();
		System.out.println("\n"+copylist);
		
		System.out.println("contains: "+copylist.containsAll(l1));
		
		System.out.println(copylist);
		copylist.clear();
		System.out.println(copylist);
		
		System.out.println("element: "+l1.element());
		
		System.out.println("get(2): "+l1.get(2));
		System.out.println("getFirst(): "+l1.getFirst());
		System.out.println("getLast(): "+l1.getLast());
		
		System.out.println("indexof(89): "+l1.indexOf(89));
		
		System.out.println("offerFirst(99): "+l1.offerFirst(99));
		System.out.println("offerLast(999): "+l1.offerLast(999));
		System.out.println(l1);
		
		System.out.println("peekFirst(): "+l1.peekFirst());
		
		System.out.println("remove(3): "+l1.remove(3));
		System.out.println(l1);
		
		System.out.println("set(3,700): "+l1.set(3,700));
	}
}

//=================================================================
/*
//Add iterators using iterator(), listIterator() and spliterator()

public class LinkedListExample {

	public static void main(String[] args) {
		
		LinkedList<Integer> l1 = new LinkedList<>();
		l1.add(24);
		l1.add(4);
		l1.add(124);
		l1.add(89);
		l1.add(40);
		l1.add(60);
		l1.add(33);
		
		//iterator()
		
		System.out.println("Using iterator()");
		Iterator<Integer> ob = l1.iterator();
		while(ob.hasNext())
		{
			System.out.print(" "+ob.next());
		}
		System.out.println("\n-------------------------------------------------");
		
		System.out.println("\n Using forEach(): ");
		ob = l1.iterator();
		ob.forEachRemaining(System.out::println);
		System.out.println("\n-------------------------------------------------");
		
		// spliterator()
		System.out.println("\n Using spliterator()");
		Spliterator<Integer> sob = l1.spliterator();
		while(sob.tryAdvance(element -> System.out.println(" "+element)));
		System.out.println("\n-------------------------------------------------");
		
		sob = l1.spliterator();
		Spliterator<Integer> sob1 = sob.trySplit();
		
		System.out.println("LinkedList: ");
		if(sob1 != null)
		{
			sob1.forEachRemaining(element -> System.out.print(" "+element));
		}
		
		System.out.println("\n Split part: ");
		if(sob1 != null)
			sob1.forEachRemaining(element -> System.out.print(" "+element));
		
		sob.forEachRemaining(element -> System.out.print(" "+element));
		System.out.println("\n-------------------------------------------------");
		
		//listIterator() 
		System.out.println("Using listIterator()");
		
		ListIterator<Integer> lob = l1.listIterator(2);
		lob.forEachRemaining(System.out::println);
	}
}


//================================================================================

//// implement stack operations using LinkedList

class LinkedListExample
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		LinkedList<Integer> l1 = new LinkedList<>();
		
		System.out.println("Size of LinkedList: "+l1.size());
		
		while(true)
		{
			System.out.println("******** MENU *********");
			System.out.println("1.PUSH \t 2.POP \t 3.STOP");
			
			System.out.println("Enter your option: ");
			int opt = sc.nextInt();
			
			switch(opt)
			{
			
			case 1:
				try
				{
					System.out.println("Enter any number: ");
					l1.push(sc.nextInt());
				}
				catch(Exception e)
				{
					System.out.println("inter valid number....");
				}
				break;
			case 2:
				if( !l1.isEmpty() )
				{
					System.out.println("Pop() value: "+l1.pop());
				}
				else
				{
					System.out.println("LinkedList is empty");
				}
				break;
			case 3:
				System.exit(0);
			}
		}
	}
}


//====================================================================
// implement Queue operations using LinkedList


class LinkedListExample
{
	public static void main(String []args)
	{
		LinkedList l1 = new LinkedList();
		
		Scanner sc = new Scanner(System.in);
		
		while(true)
		{
			System.out.println("******* MENU ********");
			System.out.println("1.PUSH \t 2.POP \t 3.STOP");
			
			System.out.println("Enter your option: ");
			int opt = sc.nextInt();
			
			switch(opt)
			{
			case 1:
				try
				{
					System.out.println("Enter any number: ");
					l1.push(sc.nextInt());
				}
				catch(Exception e)
				{
					System.out.println("Enter valid number...");
				}
				break;
			case 2:
				if( !l1.isEmpty() )
				{
					System.out.println("poped value: "+l1.pollLast());
				}
				else
				{
					System.out.println("LinkedList is empty.");
				}
				break;
			case 3:
				System.exit(0);
			}
		}
	}
}
*/
//========================================================================

//use forEach() and toArray()

class LinkedListExample
{
	public static void main(String []args)
	{
		List<Integer>	list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		
		
		System.out.println(list);
		
		//convert in array
		Integer []arr = new Integer[list.size()];
		arr = list.toArray(arr);
		
		for(int i:arr)
		{
			System.out.print(" "+i);
		}
	}
}