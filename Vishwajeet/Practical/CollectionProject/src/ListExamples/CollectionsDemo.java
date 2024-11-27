package ListExamples;
import java.util.ArrayList;
import java.util.Collections;
public class CollectionsDemo {

	public static void main(String[] args) {
		ArrayList<Integer> arlst=new ArrayList<>();
		arlst.add(12);
		arlst.add(24);
		arlst.add(2);
		arlst.add(17);
		arlst.add(1);
		arlst.add(27);
		arlst.add(77);
		
		System.out.println("Entered arrayList is: "+arlst);
		
		arlst.sort((x,y)->Integer.compare((int)x,(int)y)); //ascending
		System.out.println("Entered arrayList is in ascending: "+arlst);
		
		arlst.sort((y,x)->Integer.compare((int)x,(int)y)); //descending
		System.out.println("Entered arrayList is in descending: "+arlst);
		
		
		//using collections
		
		Collections.sort(arlst);
		System.out.println("Entered arrayList is in ascending by using Collections"+arlst);
		
		Collections.sort(arlst,Collections.reverseOrder());
		System.out.println("Entered arrayList is in descending by using Collections "+arlst);
		
		
		
		
		
		
		
		

	}

}
