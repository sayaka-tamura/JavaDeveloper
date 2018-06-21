package springwork.model;

import java.util.Date;

import javax.validation.constraints.NotNull;

import org.springframework.format.annotation.DateTimeFormat;

public class Item{
	private Integer item_id;
	
	//@NotNull(message = "Date is Required")
	@DateTimeFormat(pattern="MM-dd-yyyy")
	private java.util.Date item_date;
	private String item_name;
	
	@NotNull(message = "Expense is Required")
	private Double item_price;
	
	private Integer item_quantity;
	private String item_category;
	private Integer item_shopping_id;
	
	
	public Item() {
		super();
		this.item_id = 0;
		this.item_date = null;
		this.item_name = "";
		this.item_price = 0.0;
		this.item_quantity = 0;
		this.item_category = "";
		this.item_shopping_id = 0;
	}
	
	public Item(Date item_date, String item_name, Double item_price, Integer item_quantity,
			String item_category, Integer item_shopping_id) {
		super();
		this.item_date = item_date;
		this.item_name = item_name;
		this.item_price = item_price;
		this.item_quantity = item_quantity;
		this.item_category = item_category;
		this.item_shopping_id = item_shopping_id;
	}

	public Integer getItem_id() {
		return item_id;
	}

	public void setItem_id(Integer item_id) {
		this.item_id = item_id;
	}

	public java.util.Date getItem_date() {
		return item_date;
	}

	public void setItem_date(java.util.Date item_date2) {
		this.item_date = item_date2;
	}

	public String getItem_name() {
		return item_name;
	}

	public void setItem_name(String item_name) {
		this.item_name = item_name;
	}

	public Double getItem_price() {
		return item_price;
	}

	public void setItem_price(Double item_price) {
		this.item_price = item_price;
	}

	public String getItem_category() {
		return item_category;
	}

	public void setItem_category(String item_category) {
		this.item_category = item_category;
	}

	public Integer getItem_quantity() {
		return item_quantity;
	}

	public void setItem_quantity(Integer item_quantity) {
		this.item_quantity = item_quantity;
	}

	public Integer getItem_shopping_id() {
		return item_shopping_id;
	}

	public void setItem_shopping_id(Integer item_shopping_id) {
		this.item_shopping_id = item_shopping_id;
	}
 
}
