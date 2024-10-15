package shopcrudapp7;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Cart implements Serializable{


	 private static final long serialVersionUID = 1L;

	 List<Bill> list = new ArrayList<>();

	public Cart() {
		// TODO Auto-generated constructor stub
	}

	public void showBills() {
		
		for(int i=0 ; i<list.size() ; i++)
		{
			list.get(i).showBillItem();
		}
	}

	public void addItem(Bill bill) {
		
		list.add(bill);
		
	}

}
