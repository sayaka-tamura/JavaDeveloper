package Week4_AS2_3;

public class Item {
	
	private String name;
	private Double price;
	private Integer quantity;
	
	public Item(String name, Double price) {
		this.name = name;
		this.price = price;
		this.quantity = 0;
	}
	
	/** ------- Start Setters and Getters ------- */
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}

	public Integer getQuantity() {
		return quantity;
	}
	
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	
	/** ------- End Setters and Getters ------- */

	
	public void addQuantity(Integer amount) {
		this.quantity += amount;
	}
}
