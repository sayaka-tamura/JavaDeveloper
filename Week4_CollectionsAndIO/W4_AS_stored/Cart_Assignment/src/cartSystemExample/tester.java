package Cart_Assignment.src.cartSystemExample;

import java.io.IOException;

public class tester {
	public static void main(String[] args) throws IOException {
	    
	    TheSystem sys1 = new TheSystem();
	    
	    AppSystem app1 = new AppSystem();
	    app1.display();
	    
	    CartSystem cart1 = new CartSystem();
	    cart1.display();
		
		sys1.add(sys1.getItemCollection().get("Pizza"));
		
		Item pizza2 = new Item();
		pizza2.setItemName("Pizza Malgelita");
		pizza2.setItemDesc("Pretty Good");
		pizza2.setItemPrice(10.99);
		pizza2.setAvailableQuantity(20);

		sys1.add(pizza2);
		
		sys1.checkAvailability(pizza2, 20);
		
		
	}
}
