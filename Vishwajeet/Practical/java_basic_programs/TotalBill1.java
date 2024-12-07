import java.util.*;
class Item
{
	private int icode;
	private double ipr;
	private static double tot;

	public void setData()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the code of item: ");
		icode=sc.nextInt();
		System.out.println("Enter the price of item: ");
		ipr=sc.nextDouble();

		tot=tot+ipr;
	}
	public void getData()
	{
		System.out.println("Icode: "+icode+"\t Price: "+ipr);
	}
	public void showTot()
	{
		System.out.println("Total Bill: "+tot);
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
		list[0].showTot();
	}
}