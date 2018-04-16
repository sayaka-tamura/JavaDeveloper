package Cart_Assignment.src.cartSystemExample;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
/**
 * 
 * @author Sayaka Tamura
 * file name: AppSystem.java
 * The purpose of the AppSystem class is to implement the logic related only to this class.
 */

public class AppSystem extends TheSystem {
	
    public AppSystem() throws FileNotFoundException, IOException {
    }
    
	/**
	 * This method takes no parameter and 
	 * it would display every item in the App system.
	 */
    public void display() {
        HashMap<String, Item> current = this.getItemCollection();
        System.out.println("<Item list>:");
        
        for (Item item : current.values()) {       	
			System.out.println(item.getItemName() + " "
							+ item.getItemDesc() + " "
							+ item.getItemPrice() + " "
							+ item.getAvailableQuantity());
        }
        System.out.println("");
    }
    
    /**
     * This method takes Item Object as a parameters. 
     * It checks if the item is already in the system. 
     * If it is, then display a message 
     * "Item [Item’s system] is already in the system" 
     * and return false. If is not then add it and return true.
     * @param item
     * @return boolean if an item added or not 
     */
    public Boolean add(Item item) {
    	HashMap<String, Item> current = this.getItemCollection();
    	
    	if(current.containsValue(item)) {
    		System.out.println("Item: " + item.getItemName() + " is already in the system");
    		return false;    				
    	} else {
    		current.put(item.getItemName(), item);
    		this.setItemCollection(current);
    		System.out.println(item.getItemName() + " was added to AppSystem as a new Item");
    		return true;
    	}
    }
}
