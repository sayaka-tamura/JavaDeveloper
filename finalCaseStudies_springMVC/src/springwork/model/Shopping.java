/**
 * author: Sayaka Tamura
 * SQL: (Shopping Table: shopping_id, total_expense, tax, usr_id(fk), item_id(fk))
 */

package springwork.model;

public class Shopping {
	private Integer shopping_id;
	private Double tax;
	private Double total_expense;
	
	public Integer getShopping_id() {
		return shopping_id;
	}
	public void setShopping_id(Integer shopping_id) {
		this.shopping_id = shopping_id;
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
