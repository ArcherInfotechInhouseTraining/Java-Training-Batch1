package List;

import java.util.ArrayList;
/*
public class ReplaceAllExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> numbers = new ArrayList<>();
		numbers.add(1);
		numbers.add(2);
		numbers.add(5);
		numbers.add(7);
		numbers.add(6);
		
		System.out.println("Numbers before remove: "+numbers);
		

        // Replacing each element with its square
		numbers.replaceAll(n -> n*n);
		
		// Printing the modified ArrayList
		System.out.println("Modified ArrayList: "+numbers);
		
	}
}
*/


import java.util.ArrayList;

public class ReplaceAllExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> fruits = new ArrayList<>();
		fruits.add("Mango");
		fruits.add("Apple");
		fruits.add("Banana");
		fruits.add("Orange");
	
		System.out.println("Numbers before remove: "+fruits);
		

        // Replacing each element with its square
		fruits.replaceAll(fruit -> fruit.toUpperCase());
		
		// Printing the modified ArrayList
		System.out.println("Modified ArrayList: "+fruits);
	}
}


