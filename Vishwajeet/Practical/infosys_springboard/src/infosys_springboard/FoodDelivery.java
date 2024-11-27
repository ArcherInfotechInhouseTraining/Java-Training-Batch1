package infosys_springboard;
import java.util.Scanner;
public class FoodDelivery {
	
	
	public static double calculateBill(char foodtype, int qty, int distance) {
		int vegCost =12;
		int NonvegCost = 15;
		double billAmt = 0.0;
		
		if((foodtype != 'V' && foodtype != 'N') || qty < 1 || distance <= 0) {
			return -1;
		}
		if(foodtype == 'V') {
			billAmt += vegCost * qty;
		}
		else if (foodtype == 'N'){
			billAmt += NonvegCost * qty;
			
		}
		
		if(distance <= 3) {
			billAmt += 0;
		}
		else if (distance <= 6) {
			billAmt += (distance-3) * 1;
		}
		else{
			billAmt += 3 + (distance - 6) * 2;
		}
		
		return billAmt;
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		
		System.out.println("Enter the food type");
		char foodtype = sc.next().charAt(0);
		
		System.out.println("Enter the quantity");
		int qty = sc.nextInt();
		
		System.out.println("Enter the distance");
		int distance = sc.nextInt();
		
		double finalBill = calculateBill(foodtype, qty, distance);

        // Output the final result
        if (finalBill == -1) {
            System.out.println("Invalid input. Bill amount: -1");
        } else {
            System.out.println("Final bill amount: $" + finalBill);
        }

	}

}
