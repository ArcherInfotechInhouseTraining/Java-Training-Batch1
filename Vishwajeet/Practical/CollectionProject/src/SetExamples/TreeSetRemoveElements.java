package SetExamples;
import java.util.TreeSet;
public class TreeSetRemoveElements {

	public static void main(String[] args) {
		TreeSet<Integer> treeSet = new TreeSet<>();
		treeSet.add(1);
		treeSet.add(2);
		treeSet.add(3);
		treeSet.add(4);
		treeSet.add(5);

		boolean value1 = treeSet.remove(5);
		
		System.out.println(" 5 is removed?: "+value1);
		
		boolean value2 = treeSet.removeAll(treeSet);
		
		System.out.println("All elements are removed? :"+value2);
		System.out.println(treeSet);
	}

}
