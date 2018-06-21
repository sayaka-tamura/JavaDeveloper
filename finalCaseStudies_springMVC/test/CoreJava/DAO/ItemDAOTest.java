package CoreJava.DAO;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.hamcrest.CoreMatchers.nullValue;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.*;

import java.io.IOException;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import springwork.model.Item;

public class ItemDAOTest {
	ItemDAO iDAO = new ItemDAO();
	Item item = null;
	int generatedId;
	boolean isUpDated, willDelete;
	SimpleDateFormat dateFormat = new SimpleDateFormat("MM-dd-yyyy");

	@Before
	public void setUp() throws ParseException {
		Date javaDate1 = dateFormat.parse("06-18-2018");			
		item = new Item(javaDate1, "BLT Sandwitch", 16.99, 2, "Food", null);
	}
	
	@Test
	public void testAddShoppedItem() throws SQLException, ParseException {
		generatedId = iDAO.addShoppedItem(item);
		assertThat(item.getItem_date(), is(dateFormat.parse("06-18-2018")));
		assertThat(item.getItem_name(), is("BLT Sandwitch"));
		assertThat(item.getItem_price(), is(16.99)); 
		assertThat(item.getItem_quantity(), is(2)); 
		assertThat(item.getItem_category(), is("Food"));
		assertThat(item.getItem_shopping_id(), nullValue());
		assertThat(generatedId, is(not(0)));
	}

	@Test
	public void testGetAllItemRecord() throws SQLException {
		List<Item> items = iDAO.getAllItemRecord();
		assertThat(items, notNullValue());
	}
	
	@Test
	public void testGetItemRecordById() throws SQLException, ParseException, ClassNotFoundException, IOException {
		Item i_check = iDAO.getItemRecordById(317);
	//		java.util.Date expected = new java.util.Date(dateFormat.parse("06-18-2018").getTime());
	//		assertThat(i_check.getItem_date(), is(expected));
		
		assertThat(i_check.getItem_name(), is("BLT Sandwitch"));
		assertThat(i_check.getItem_price(), is(16.99));
		assertThat(i_check.getItem_quantity(), is(2));
		assertThat(i_check.getItem_category(), is("Food"));
		assertThat(i_check.getItem_shopping_id(), is(0));
	}

//	@Test
//	public void testGetItemListByItem_ShoppingID() {
//		fail("Not yet implemented");
//	}

	@Test
	public void testUpdateShoppedItem() throws SQLException, ParseException {
		Date javaDate2 = dateFormat.parse("06-15-2018");
				
		item.setItem_name("USB Camera");
		item.setItem_date(javaDate2);
		item.setItem_price(18.99);
		item.setItem_quantity(1);
		item.setItem_category("Others");
		item.setItem_id(generatedId);
		
		isUpDated = iDAO.updateShoppedItem(item);
		
		assertThat(item.getItem_date(), is(javaDate2));
		assertThat(item.getItem_name(), is("USB Camera"));
		assertThat(item.getItem_price(), is(18.99));
		assertThat(item.getItem_quantity(), is(1));
		assertThat(item.getItem_category(), is("Others"));
		
		assertThat(isUpDated, equalTo(true));
		willDelete = true;
	}

	@Test
	public void testDeleteShoppedItem() throws SQLException {
		if(willDelete) {
			isUpDated = iDAO.deleteShoppedItem(item.getItem_id());
			assertThat(isUpDated, equalTo(true));
		}
	}

//	@Test
//	public void testDeleteAllItemRecord() {
//		fail("Not yet implemented");
//	}

}
