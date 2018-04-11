package Week4_AS2_3;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author Sayaka Tamura
 * 3. Simple Menu
 * 
 * Write a simple Restaurant Ordering Menu & Cart.
 * The menu will contain 5 different items (Hamburgers, Hot Dogs, Sandwiches, Soda, and Fries).
 * You should be able to add items to your cart.
 * Your cart should be handled by a HashMap, 
 * consisting of the item as a key and the quantity as a value.
 * Create a view order method that will display the items and quantities in your cart.
 */

public class CartRunner {
	public static void main(String[] args) {
		Map <Item, Integer> menu = new HashMap<Item, Integer>();
		Integer default_quantity = 0;
		menu.put(new Item("Hamburgers", 7.5), default_quantity);
		menu.put(new Item("Hot Dogs", 5.99), default_quantity);
		menu.put(new Item("Sandwiches", 6.99), default_quantity);
		menu.put(new Item("Soda", 1.00), default_quantity);
		menu.put(new Item("Fries", 2.50), default_quantity);
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("Would you like to add an item to your cart?");
			System.out.print("(Y/N) ");
			
			if(!sc.nextLine().equals("Y")) break;
			printCart(menu);
			System.out.println("What would you like to add to your cart?");
			String response = sc.nextLine();
			
			if(!menu.containsKey(response)) {
				System.out.println("Invalid Item.");
				continue;
			}
			else {
				Item item = menu.get(response);
				System.out.println("How many would you like to add?");
				int quantity = Integer.parseInt(sc.nextLine());
				item.addQuantity(quantity);
				cart.put(response, item);
				continue;
			}
		}
		
	}

	public static void printCart(Map<Item, Integer> menu) {
		for(Map.Entry<Item, Integer> cartItem : menu.entrySet()) {
			System.out.println(cartItem.getKey().getName() + ": $" + cartItem.getKey().getPrice());
		}
		
	}
	
	
}
