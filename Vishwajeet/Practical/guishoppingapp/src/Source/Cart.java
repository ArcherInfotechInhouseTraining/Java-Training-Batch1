package Source;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Cart implements Serializable {
	private static final long serialVersionUID = 1L;
	List <Bill> bill = new ArrayList<Bill>(); 
	public void addItem(Bill bill) {
		// TODO Auto-generated method stub
		this.bill.add(bill);
	}
	public void showBills() {
		// TODO Auto-generated method stub
		for(int i=0;i<bill.size();i++)
		{
			bill.get(i).showBilledItem();
		}
	}
	public double getTotalBill() {
		double tot = 0.0;
		for(Bill b : bill) {
			tot = tot + b.getIndividuaTotal();
		}
		return tot;
	}
	public void remove(int code, int count) {
		for(int i=0 ; i<bill.size();i++)
		{
			if(bill.get(i).getId()==code) {
				bill.get(i).setCount(count);
			}
		}
	}
	public List<Bill> getBilList() {
		// TODO Auto-generated method stub
		return bill;
	}
}
