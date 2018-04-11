package Week4_AS2_3;

public class Item {
	
	private String name;
	private Double price;
	
	public Item(String name, Double price) {
		this.name = name;
		this.price = price;
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

	/** ------- End Setters and Getters ------- */
	
}
