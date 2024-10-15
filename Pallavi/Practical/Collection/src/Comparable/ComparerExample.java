package Comparable;

import java.util.ArrayList;
import java.util.Collections;

public class ComparerExample {

	public static void main(String[] args) {

		ArrayList<Integer> arlst = new ArrayList<>();
		
		arlst.add(23);
		arlst.add(30);
		arlst.add(56);
		arlst.add(243);
		arlst.add(29);
		arlst.add(142);
		arlst.add(193);
		arlst.add(52);
		
		System.out.println("Entered array list: "+arlst);
		
		arlst.sort( (x,y) -> Integer.compare((int)x,(int) y));
		System.out.println("Array list (ascending) order: "+arlst);
		
		arlst.sort( (y,x) -> Integer.compare(x,y));
		System.out.println("Array list (descending) order: "+arlst);

		// Using Collections
		Collections.sort(arlst);
		System.out.println("Arraylist (ascending): "+arlst);
		
		Collections.sort(arlst,Collections.reverseOrder());
		System.out.println("ArrayList (descending): "+arlst);
		
	}

}
