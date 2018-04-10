
public class MapExample {
	public static void main(String[] args) {
		Cart cart = new Cart();
		cart.addToCart("Hamburger", 1);
		cart.addToCart("Hamburger", 2);
		cart.addToCart("Fries", 1);
		cart.addToCart("Soda", 2);
		
		System.out.println(cart);
		
	}
}
