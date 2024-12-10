package shopsource;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Cart implements Serializable {
	private static final long serialVersionUID = 1L;
	List <Bill> list = new ArrayList<Bill>(); 
	public void addItem(Bill bill) {
		// TODO Auto-generated method stub
		list.add(bill);
	}
	public void showBills() {
		// TODO Auto-generated method stub
 

		for(int i=0;i<list.size();i++)
		{
			list.get(i).showBilledItem();
		}
		//System.out.println("\n ********Total Bill: ********\n "+Cart.calculateTotal());
        System.out.println("\n Total Bill for Cart "+ calculateTotal() + "\n");

	}
	
	public List<Bill> getBills() {
        return getBills();
    }
	
	public double calculateTotal() {
        double total = 0;
        try {
			for (Bill bill : list) {
			    total += bill.getItem().getPrice() * bill.getCount();
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        return total;
    }
	
	public void removeItemByCode(int code, int count, List<Stock> stocks) {
        Iterator<Bill> iterator = list.iterator();
        while (iterator.hasNext()) {
            Bill bill = iterator.next();
            if (bill.getItem().getId() == code) {
                if (bill.getCount() > count) {
                    bill.setCount(bill.getCount() - count);
                    Stock stock = FileUtil.getStockByItemId(stocks, code);
                    if (stock != null) {
                        stock.addStock(count, code);
                    }
                } else if (bill.getCount() == count) {
                    iterator.remove();
                    Stock stock = FileUtil.getStockByItemId(stocks, code);
                    if (stock != null) {
                        stock.addStock(count, code);
                    }
                }
                break; 
            }
        }
    }
	

}
