package SetExamples;
import java.util.TreeSet;
public class TreeSetMethodsDemo {

	public static void main(String[] args) {
		TreeSet <Integer> t1 = new TreeSet<>();
		t1.add(11);
		t1.add(22);
		t1.add(33);
		t1.add(44);
		t1.add(55);
		t1.add(66);
		t1.add(77);
		
		System.out.println("Original tree set: "+t1);
		
		TreeSet<Integer> headSet = (TreeSet<Integer>) t1.headSet(44); // it excludes value as an arguments we pass
		System.out.println("HeadSet: "+headSet);
		
		TreeSet<Integer> tailSet = (TreeSet<Integer>) t1.tailSet(44); // it includes value as an arguments we pass
		System.out.println("TailSet: "+tailSet);
		
		TreeSet<Integer> subSet = (TreeSet<Integer>) t1.subSet(33, 55); // include first argu but exclude last argu we pass
		System.out.println("subset: "+subSet);
		
		

	}

}
