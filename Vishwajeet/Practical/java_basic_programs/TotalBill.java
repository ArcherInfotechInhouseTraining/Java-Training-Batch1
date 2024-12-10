import java.util.*;
class Item
{
	private int icode;
	private double ipr;

	public void setData()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the code of item: ");
		icode=sc.nextInt();
		System.out.println("Enter the price of item: ");
		ipr=sc.nextDouble();
	}
	public void getData()
	{
		System.out.println("Icode: "+icode+"\t Price: "+ipr);
	}
	public double getPrice()
	{
		return ipr;
	}
}
class TotalBill
{
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		Item []list=new Item[3];

		System.out.println("Enter the information of 3 items");
		for(int i=0;i<3;i++)
		{
			list[i]=new Item();
			list[i].setData();
		}
		System.out.println("List Item: ");
		for(int i=0;i<3;i++)
		{
			list[i].getData();
		}

		//find total
		double tot=0;
		for(int i=0;i<3;i++)
		{
			tot+=list[i].getPrice();
		}
		System.out.println("Total bill of item: "+tot);
	}
}