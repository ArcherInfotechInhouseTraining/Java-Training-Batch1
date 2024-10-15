package shopsource1;

import java.util.List;
import java.util.Scanner;

class Create
{
	public static void createItem(Scanner sc , List<Item> items)
	{
		//Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter item code: ");
		int code = Integer.parseInt(sc.nextLine());
		
		System.out.println("Enter item name: ");
		String name = sc.nextLine();
		
		System.out.println("Enter item price: ");
		int price = Integer.parseInt(sc.nextLine());
		
		System.out.println("Enter item count: ");
		int count = Integer.parseInt(sc.nextLine());
		
		System.out.println("Enter item mrp: ");
		int mrp = Integer.parseInt(sc.nextLine());
	}
}