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
		Map <String,Item> menu = new HashMap<String, Item>();

		menu.put("Hamburgers",new Item("Hamburgers", 7.5));
		menu.put("Hot Dogs",new Item("Hot Dogs", 5.99));
		menu.put("Sandwiches",new Item("Sandwiches", 6.99));
		menu.put("Soda",new Item("Soda", 1.00));
		menu.put("Fries",new Item("Fries", 2.50));
		
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
				menu.put(response, item);
				continue;
			}
		}
		
		System.out.println("Your cart:");
		printCart(menu);
		System.out.print("Your total: $");
		double total = 0.00;
		for(Item item : menu.values()) {
			double cost = item.getPrice() * item.getQuantity();
			total += cost;
		}
		System.out.print(total);
		
		sc.close();
		
	}

	public static void printCart(Map<String, Item> menu) {
		for(Item item : menu.values()) {
			System.out.println(item.getName() + ": $" + item.getPrice() + " - Current Quantity: " + item.getQuantity());
		}	
	}
	
	
}
