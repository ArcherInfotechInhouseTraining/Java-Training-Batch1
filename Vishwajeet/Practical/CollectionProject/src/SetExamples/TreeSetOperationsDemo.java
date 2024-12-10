package SetExamples;
import java.util.TreeSet;
public class TreeSetOperationsDemo {

	public static void main(String[] args) {
		TreeSet<Integer> set1 = new TreeSet<>();
		set1.add(11);
		set1.add(22);
		set1.add(33);
		set1.add(44);
		set1.add(55);
		
		System.out.println("Set1: "+set1);
		
		TreeSet<Integer> set2 = new TreeSet<>();
		set2.add(10);
		set2.add(22);
		set2.add(3);
		set2.add(44);
		set2.add(50);
		
		System.out.println("Set2: "+set2);
		
		// Union operation
		TreeSet<Integer> union = new TreeSet<>(set1);
		union.addAll(set2);
		System.out.println("Union: "+union);  // common elements displayed only once from both set with remaining all elements
		
		
		//Subset operation
		TreeSet<Integer> subset = new TreeSet<>(set1);
		subset.retainAll(set2);
		System.out.println("Subset: "+subset);
		
		//Difference operation set1 - set2
		TreeSet<Integer> difference1 = new TreeSet<>(set1);
		difference1.removeAll(set2);
		System.out.println("difference1: "+difference1);
		
		
		TreeSet<Integer> difference2 = new TreeSet<>(set2);
		difference2.removeAll(set1);
		System.out.println("difference2: "+difference2);
		
		
		//Intersection operation
		TreeSet<Integer> intersection = new TreeSet<>(set1);
		intersection.retainAll(set2);
		System.out.println("Intersection: "+intersection); // gives common elements from both set		

	}

}
