package Cart_Assignment.src.cartSystemExample;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/**
 * 
 * @author Sayaka Tamura
 * file name: TheSystem.java
 * 
 * The purpose of the TheSystem class is to maintain the list of items 
 * and the main logic of the system that is similar in the app and cart classes.
 */

public class TheSystem {
	
    private HashMap<String, Item> itemCollection;
    
    protected FileInputStream fis = null;
    protected InputStreamReader isr = null;
    protected BufferedReader br = null;
    
    /**
     * This constructor initializes the itemCollection member field. 
     * Then, It check if the appsystem is invoking the constructor (getClass().getSimpleName().equals("AppSystem")), 
     * if it is true then the itemCollection is feed in what the sample.txt file contains. 
     * Otherwise, it would be initialize and just be empty. 
     * @throws IOException 
     */
	protected TheSystem() throws IOException {
        itemCollection = new HashMap<String, Item>();
        
        if(AppSystem.class.getSimpleName().equals("AppSystem")) {
        	try {
                fis = new FileInputStream("C:\\Users\\arccy\\Desktop\\sample.txt");
                isr = new InputStreamReader(fis, "UTF-8");
                br = new BufferedReader(isr);
                
                while(br.ready()) {
                	
                	String line = br.readLine();
                	String[] strLine = line.split("\\s ");
                        
                    Item item = new Item();
                    item.setItemName(strLine[0]);
                    item.setItemDesc(strLine[1]);
                    item.setItemPrice(Double.parseDouble(strLine[2]));
                    item.setAvailableQuantity(Integer.parseInt(strLine[3]));
                    itemCollection.put(strLine[0], item);                    	
        		}   // end while
    	    } catch (IOException e) {
    	        e.printStackTrace();
    	    }
            finally {
            	if(br != null)
            		br.close();
            }
        }
        
    }
    
	/**
	 * This method would create a new HashMap<String, Item>, 
	 * then it adds every key and item in the original itemCollection to the new HashMap<String, Item>. 
	 * Finally, return the new HashMap<String, Item>,
	 * @return HashMap<String, Item> new itemCollection object that inherit ex-itemCollection object
	 * Getter
	 */
    public HashMap<String, Item> getItemCollection(){
    	
    	HashMap<String, Item> ic_new = new HashMap<String, Item>();
				
		for(Map.Entry<String, Item> ic_item : itemCollection.entrySet()) {
			ic_new.put(ic_item.getKey(), ic_item.getValue());
		}		
    	return ic_new;
    }
    
    /**
     * this method takes a HashMap as a parameter 
     * and assigns it to the original itemCollection
     * @param copy
     * Setter
     */
    public void setItemCollection(HashMap<String, Item> copy ){
    	itemCollection = copy;
    }
    
    /**
     * This method takes as a parameter Item object and 
     * checks if the item is already in the collection. 
     * If it is, then check if there is available item, 
     * otherwise don’t add the item. 
     * If the item is not in the collection, just add it to the collection.
     * 
     * @param item 
     * @return  boolean if an Item has added or not
     */
    
    public Boolean add(Item item) {
    	
    	if(itemCollection.containsValue(item)) {
    		if(checkAvailability(item, item.getQuantity())) {
    			int current_q = item.getQuantity();
                itemCollection.get(item.getItemName()).setQuantity(current_q+1);
                
                System.out.println("Ordered " + item.getItemName() + ", Quantity: " + item.getQuantity());
                return true;
    		} else {
    			System.out.println("Quantity was over Available Quantity");
        		return false;
    		}		
    	} else {
    		itemCollection.put(item.getItemName(), item);
    		return true;
    	}
    }
    
    /**
     * This method takes as a parameter the item name to be remove. 
     * First check if the item is in the collection, 
     * if it is, then remove it and return the Item object being remove. 
     * If is not in the collection then return null
     * 
     * @param itemName
     * @return Item
     */    
    
    public Item remove(String itemName) {
    	
        if(itemCollection.containsKey(itemName)){
        	Item item = itemCollection.remove(itemName);
        	System.out.println(itemName + " has been successfuly removed.");
        	return item;
        } else {
        	System.out.println(itemName + " was not found.");        	
        	return null;
        }   
    }
    
    /**
     * This method takes as parameter an Item object 
     * and a Integer which represents how many times a single item has been added to the cart. 
     * Then it checks if the item.getQuantity() + current is greater than the item.getAvailableQuatity(). 
     * If it is, then display the following message. 
     * "System is unable to add [item’s quantity] [item’s name]". 
     * "System can only add [calculate available item] [item’s name]". 
     * Finally return false. Otherwise return true. 
     * 
     * @param item
     * @param current
     * @return boolean 
     */
    public Boolean checkAvailability(Item item, Integer current) {

    	if(item.getQuantity() + current > item.getAvailableQuantity()) {
    		int q = item.getQuantity();
    		int av_q = item.getAvailableQuantity();
    		System.out.println("System is unable to add " + current + " " + item.getItemName());
    		System.out.println("System can only add " + (av_q-q) + " " + item.getItemName());
    		return false;
    	} else
    		return true;
    }
}
