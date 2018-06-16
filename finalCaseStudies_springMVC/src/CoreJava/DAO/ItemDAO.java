package CoreJava.DAO;

import java.io.IOException;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import springwork.model.Item;
import CoreJava.util.OracleQueries;

public class ItemDAO {
	// Create Item
	public int addShoppedItem(Item item) throws SQLException {	
		int ID = 0;
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet result = null;
        String[] COL = {"item_id"};
        Date sqlItem_date = new java.sql.Date((item.getItem_date()).getTime());
        try{
            conn = OracleConnection.getConnection();
            stmt = conn.prepareStatement(OracleQueries.ADDSHOPPEDITEM, COL);
            stmt.setDate(1, sqlItem_date);
            stmt.setString(2, item.getItem_name());
            stmt.setDouble(3, item.getItem_price());
            stmt.setInt(4, item.getItem_quantity());
            stmt.setString(5, item.getItem_category());
            
            stmt.executeUpdate();
            result = stmt.getGeneratedKeys();
            if(result != null && result.next()){
                ID = result.getInt(1);
            }

        } catch (ClassNotFoundException | IOException | SQLException e){
            e.printStackTrace();
        } finally {
        	if(result != null)
            	result.close();
            if(stmt != null)
                stmt.close();
            if(conn != null)
                conn.close();
        }
        return ID;
    }
	
	/* --- Read All Item Records --- */
	public List<Item> getAllItemRecord() throws SQLException {
		
		Item item = null;
		List<Item> items = new ArrayList<Item>();
		Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet result = null;
        
        try {
        	conn = OracleConnection.getConnection();
            stmt = conn.prepareStatement(OracleQueries.GETAllITEMHISTORY);
            result = stmt.executeQuery();
            
	        while(result != null && result.next()){
	        	item = new Item();
	        	
	        	item.setItem_id(result.getInt(1));
	        	item.setItem_date(result.getTimestamp(2));
	        	item.setItem_name(result.getString(3));
	        	item.setItem_price(result.getDouble(4));
	        	item.setItem_quantity(result.getInt(5));
	        	item.setItem_category(result.getString(6));

	        	items.add(item);
	        }
        } catch (ClassNotFoundException | IOException | SQLException e) {
			e.printStackTrace();
		} finally {
            result.close();
            if(stmt != null){
                stmt.close();
            }
            if(conn != null){
                conn.close();
            }
        }
        
		return items;
	}
	
	/* --- Read A Item Record by ITEM ID --- */
    public Item getItemRecordById(int item_id)throws SQLException{
	   Item item = new Item(); 
	   Connection conn = null;
       PreparedStatement stmt = null;
       ResultSet result = null;
       
       try {
       		conn = OracleConnection.getConnection();
            stmt = conn.prepareStatement(OracleQueries.GETITEMBYITEMID);
            stmt.setInt(1, item_id);
            result = stmt.executeQuery();
                   
            if(result != null&&result.next()){
	        	item.setItem_id(result.getInt(1));
	        	item.setItem_date(result.getTimestamp(2));
	        	item.setItem_name(result.getString(3));
	        	item.setItem_price(result.getDouble(4));
	        	item.setItem_quantity(result.getInt(5));
	        	item.setItem_category(result.getString(6));
            }
        } catch (ClassNotFoundException | IOException | SQLException e){
            e.printStackTrace();
        } finally {
            if(stmt != null){
                stmt.close();
            }
            if(conn != null){
                conn.close();
            }
        }      
        return item;
    }
   
   	/* --- Read Item Records By Item_Shopping ID --- */
	public List<Item> getItemListByItem_ShoppingID(int item_shopping_id) throws SQLException {
	   Item item = new Item(); 
	   List<Item> items = new ArrayList<Item>();
	   Connection conn = null;
       PreparedStatement stmt = null;
       ResultSet result = null;
       
       try {
       		conn = OracleConnection.getConnection();
            stmt = conn.prepareStatement(OracleQueries.GETITEMBYITEMSHOPPINGID);
            stmt.setInt(1, item_shopping_id);
            result = stmt.executeQuery();
                   
            while(result != null&&result.next()){
	        	item.setItem_id(result.getInt(1));
	        	item.setItem_date(result.getTimestamp(2));
	        	item.setItem_name(result.getString(3));
	        	item.setItem_price(result.getDouble(4));
	        	item.setItem_quantity(result.getInt(5));
	        	item.setItem_category(result.getString(6));
	        	item.setItem_shopping_id(result.getInt(7));
	        	items.add(item);
            }
        } catch (ClassNotFoundException | IOException | SQLException e){
            e.printStackTrace();
        } finally {
            if(stmt != null){
                stmt.close();
            }
            if(conn != null){
                conn.close();
            }
        }      
        return items;
	}
	   
	//Update Item
	public boolean updateShoppedItem(Item item) throws SQLException {
        Connection conn = null;
        PreparedStatement stmt = null;
        boolean rslt = false;

        try{
            conn = OracleConnection.getConnection();
            stmt = conn.prepareStatement(OracleQueries.UPDATEITEMINFO);
            stmt.setString(1, item.getItem_name());
            stmt.setDouble(2, item.getItem_price());
            stmt.setInt(3, item.getItem_quantity());
            stmt.setString(4, item.getItem_category());
            stmt.setInt(5, item.getItem_id());

            stmt.executeUpdate();
            
            rslt = true;
        } catch (ClassNotFoundException | IOException | SQLException e){
            e.printStackTrace();
        } finally {

            if(stmt != null){
                stmt.close();
            }
            if(conn != null){
                conn.close();
            }
        }
        return rslt;
    }
	
	// Delete Item
	public boolean deleteShoppedItem(int item_id) throws SQLException {
        Connection conn = null;
        PreparedStatement stmt = null;
        boolean rslt = true;
        try{
            conn = OracleConnection.getConnection();
            stmt = conn.prepareStatement(OracleQueries.DELETEITEMBYID);
            stmt.setInt(1, item_id);

            int result = stmt.executeUpdate();
            if(result!=0) {
                System.out.println("The Item has deleted successfully");
            } else {
                System.out.println("Could not find the item, Try Again.");
                rslt = false;
            }
        } catch (ClassNotFoundException | IOException | SQLException e){
            e.printStackTrace();
        } finally {
            if(stmt != null){
                stmt.close();
            }
            if(conn != null){
                conn.close();
            }
        }
        
        return rslt;
    }
	
	/* --- Delete All Shopping Record ---*/
	public void deleteAllItemRecord() throws SQLException {
        Connection conn = null;
        PreparedStatement stmt = null;

        try{
            conn = OracleConnection.getConnection();
            stmt = conn.prepareStatement(OracleQueries.DELETEALLITEM);

            int result = stmt.executeUpdate();
            if(result!=0) {
                System.out.println("All Item Record has deleted successfully");
            } else {
                System.out.println("Could not Delete All Item Record, Try Again.");
            }
        } catch (ClassNotFoundException | IOException | SQLException e){
            e.printStackTrace();
        } finally {
            if(stmt != null){
                stmt.close();
            }
            if(conn != null){
                conn.close();
            }
        }
    }
    
}
