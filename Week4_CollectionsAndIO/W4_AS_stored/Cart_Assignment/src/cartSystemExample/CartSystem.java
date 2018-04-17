package Cart_Assignment.src.cartSystemExample;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;

/**
 * @author Sayaka Tamura
 * This class is to implement the logic related only to this class
 */

public class CartSystem extends TheSystem{
    // Constructor
	public CartSystem() throws FileNotFoundException, IOException {
    }
    
	/**
	 * This method takes no parameter and it would display
	 * every item in the Cart system, alone with the sub-total of the item, 
	 * tax which is the sub-total * 0.05, 
	 * and the total which is the sub-total + tax
	 */
    public void display() {
        HashMap<String, Item> current = this.getItemCollection();
        double subTotal = 0;
        double taxRate = 0.05;
        double tax;
        double total;
        
		for(Item cartItem : current.values()) {
			int qty = cartItem.getQuantity();
			double cost = qty * cartItem.getItemPrice();
			subTotal += cost;
		}
		
		tax = subTotal*taxRate;
		total = subTotal+tax;
		
		System.out.format("Sub total: %.2f \n", subTotal);
		System.out.format("Tax: %.2f \n", tax);
		System.out.format("Total: %.2f \n", total);
		System.out.println();
	}
}
