package shopcrudapp;

import java.util.List;
import java.util.Scanner;

class Delete
{
	public static void  deleteItem(Scanner scanner , List<Item> items)
	{
		System.out.println("Enter item code to delete : ");
		int code = Integer.parseInt(scanner.nextLine());
		boolean flg=true;
		for(int i=0;i<items.size();i++)
		{
			if( items.get(i).getiCode() == code) 
			{
				items.remove(i);
				System.out.println("Removed : "+code);
				flg=false;
			}
		}
		if(flg)
			System.out.println("No such Item...!!");
		
		//items.removeIf(item->item.getCode() == code);	
	}
}
