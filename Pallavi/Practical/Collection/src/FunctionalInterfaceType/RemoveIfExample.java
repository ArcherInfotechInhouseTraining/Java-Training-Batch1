package FunctionalInterfaceType;

import java.util.ArrayList;

public class RemoveIfExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> numbers = new ArrayList<>();
		numbers.add(11);
		numbers.add(48);
		numbers.add(50);
		numbers.add(51);
		numbers.add(62);
		
		System.out.println("Numbers before remove: "+numbers);
		
		boolean removed = numbers.removeIf(number -> number % 2 == 0);
		System.out.println("Numbers after remove: "+numbers);
		System.out.println(" removed Numbers: "+removed);

	}

}
