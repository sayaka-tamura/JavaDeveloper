/**
 * author: Sayaka Tamura
 * SQL: (Date Table: date_id, date_item_id, date)
 */

package springwork.model;

public class Date {
	private String date;
	private Integer shopping_id;
	private String item_name;
	private Double tax;
	private Double total_expense;
	
	
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public Integer getShopping_id() {
		return shopping_id;
	}
	public void setShopping_id(Integer shopping_id) {
		this.shopping_id = shopping_id;
	}
	public String getItem_name() {
		return item_name;
	}
	public void setItem_name(String item_name) {
		this.item_name = item_name;
	}
	public Double getTax() {
		return tax;
	}
	public void setTax(Double tax) {
		this.tax = tax;
	}
	public Double getTotal_expense() {
		return total_expense;
	}
	public void setTotal_expense(Double total_expense) {
		this.total_expense = total_expense;
	}
	
}
