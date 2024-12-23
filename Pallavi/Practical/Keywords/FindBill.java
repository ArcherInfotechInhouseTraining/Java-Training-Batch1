//Array of objects

// Create class Item, and WAP to input and display the list of items together with total bill.

/*
import java.util.Scanner;
class Item
{
	private int icode;
	private double ipr;

	static double tot=0.0;

	public void inData()
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter icode: ");
		icode=sc.nextInt();

		System.out.println("Enter ipr: ");
		ipr=sc.nextDouble();

		tot = tot+ipr;
	}

	public void showData()
	{
		System.out.println("icode: "+icode+" \t ipr: "+ipr);
	}

	public void showTot()
	{
		System.out.println("Total is : "+tot);
	}

}


class FindBill 
{
	public static void main(String[] args) 
	{	
		int i;

		Item t[] = new Item[3];
		
		System.out.println("Enter the information of 3 items : ");

		for(i=0;i<3;i++)
		{
			t[i]=new Item();
			t[i].inData();
		}

		for(i=0;i<3;i++)
		{
			t[i].showData();
		}

		//show total
		Item.showTot();
		t[0].showTot();
		//t[1].showTot();
		//t[2].showTot();
	}
}
*/


// Using static method and static block
// Create class Item, and WAP to input and display the list of items together with total bill.


import java.util.Scanner;
class Item
{
	private int icode;
	private double ipr;
	private static double tot=0.0;

	static  //static block
	{
		tot=100.0;
	}
	public void setData()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("\n Enter the item code: ");
		icode=sc.nextInt();
		System.out.println("\n Enter the item Price: ");
		ipr=sc.nextDouble();
		
		tot=tot+ipr;		
	}
	public void showData()
	{
		System.out.println("\n item code: "+icode+"\t Price: "+ipr);
	}
	static public void showTot()  //static method
	{
		System.out.println("\n Total Bill: "+tot);
	}
}

class FindBill
{
	public static void main(String []args)
	{
		Item []t=new Item[3];

		System.out.println("Enter the information of 3 Items");
		for(int i=0;i<3;i++)
		{
			  t[i]=new Item();
			  t[i].setData();
		}

		System.out.println("\n List of  Items");
		for(int i=0;i<3;i++)
		{
			t[i].showData();
		}
		
		// show total bill
		Item.showTot();
	}
}



