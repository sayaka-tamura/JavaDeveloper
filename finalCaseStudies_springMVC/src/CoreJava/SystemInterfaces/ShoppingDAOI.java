package CoreJava.SystemInterfaces;

import java.sql.SQLException;
import java.util.List;

import springwork.model.Item;
import springwork.model.Shopping;

public interface ShoppingDAOI {
	List<Shopping> getAllShoppingRecord() throws SQLException;
	public int createShoppingID(Shopping shopping, List<Item> itemList) throws SQLException;
}
