
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Cart {
		
	private Map<String, Integer> cart = null;
	
	public Cart(){
		cart = new HashMap<String, Integer>();
	}
	
	public void addToCart(String key, Integer value) {
		Integer before = 0;
		if(this.cart.containsKey(key)) {
			before = this.cart.get(key);
		}
		if(before > 0) {
			Integer after = value + before;
			this.cart.put(key, after);
		}
		else {
			this.cart.put(key, value);
		}
	}
	
	public void removeFromCart(String key) {
		this.cart.remove(key);
	}
	
	public String toString() {
		Set<String> keys = this.cart.keySet();
		String message = "";
		Integer total = 0;
		for(String key : keys) {
			message += key + ": " + this.cart.get(key) + "\n";
			total += this.cart.get(key);
		}
		message += "Total: " + total;
		return message;
	}
}
