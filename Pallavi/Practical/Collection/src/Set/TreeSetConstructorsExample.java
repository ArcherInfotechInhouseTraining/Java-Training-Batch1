package Set;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;

public class TreeSetConstructorsExample {

	public static void main(String[] args) {
		TreeSet<Integer> tset1 = new TreeSet<>();
		tset1.add(1);
		tset1.add(2);
		tset1.add(3);
		tset1.add(4);
		tset1.add(5);
		
		System.out.println("Default Constructor: "+tset1);
		
		List<Integer> list = Arrays.asList(6,7,8);
		TreeSet<Integer> tset2 = new TreeSet<>(list);
		System.out.println("Using collection construcot: "+tset2);
		
		TreeSet<Integer> tset3 = new TreeSet<>(Comparator.reverseOrder());
		tset3.add(1);
		tset3.add(2);
		tset3.add(3);
		tset3.add(4);
		
		System.out.println("Using comparator constructor: "+tset3);
	}

}
