package Week4_AS2_1X2;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Sayaka Tamura
 * 
 * 1. Key,Value Pairs
 * Create a new HashMap consisting of an Integer Key and String value.
 * Add 5 colors to the HashMap as values. The Keys should be numbers from 1-5.
 * 
 * Print out all Keys in the HashMap.
 * Print out all Values in the HashMap.
 * 
 * Try setting the value of one of the keys to something new.
 * Print out all keys again.
 * Print out all values again.
 * 
 * Did anything change? Why?
 *
 */

public class W4_AS2Runner {
	public static void main(String[] args) {
		
		Map<Integer, String> pallet = new HashMap<Integer, String>();
		pallet.put(1, "Orange");
		pallet.put(2, "Dark Mandallin");
		pallet.put(3, "Aqua Blue");
		pallet.put(4, "Jet Black");
		pallet.put(5, "Dandelion");
		
		// Print out all Keys in the HashMap.
		// Print out all Values in the HashMap.
		System.out.println(pallet);
		
		// Try setting the value of one of the keys to something new.
		// Print out all keys again.
		// Print out all values again.
		// Did anything change? Why? 
		//  ->  Changed. 
		//	    Map Stores variables with a key corresponding a value, 
		//		do not allow duplicated value.
		System.out.println("Element changed");
		pallet.put(2, "Antique Brown");
		System.out.println(pallet);
		System.out.println();

		
		// handling data at Pallete class
		Pallete pl1 = new Pallete();
		pl1.put(1, "Orange");
		pl1.put(2, "Dark Mandallin");
		pl1.put(3, "Aqua Blue");
		pl1.put(4, "Jet Black");
		pl1.put(5, "Dandelion");

		/**
		 * 2. Printing out one-by-one again
		 * Using the HashMap from part 1, print out each key,value pair one by one.
		 * Try it with an iterator and then with a For-Each loop.
		 */

		// #2-1
		System.out.println("Color Pallet by Pallet Class: ");
		pl1.printPallete();
		System.out.println();


		pl1.changePallete(6,"Aqua Green");

		pl1.printPallete();
		System.out.println();

		
		// #2-2
		pl1.iterator();
		
	}
	


}
