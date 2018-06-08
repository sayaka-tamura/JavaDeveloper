package CoreJava.DAO;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import springwork.model.Item;
import springwork.model.Shopping;
import CoreJava.SystemInterfaces.ShoppingDAOI;
import CoreJava.util.OracleQueries;

public class ShoppingDAO implements ShoppingDAOI {	   
	/* --- Create Shopping Record --- */
	public int createShoppingID(Shopping shopping, List<Item> itemList) throws SQLException {
		
		int ID = 0;
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet result = null;
        String[] COL = {"SHOPPING_ID"};
        
        try {
        	conn = OracleConnection.getConnection();
        	stmt = conn.prepareStatement(OracleQueries.CREATESHOPPINGID, COL);
        	stmt.setDouble(1, shopping.getTotal_expense());
        	stmt.setDouble(2, shopping.getTax());
        	
        	stmt.executeUpdate();
        	result = stmt.getGeneratedKeys();
            System.out.println();
            if(result != null && result.next()){
            	// Generate Shopping ID
                ID = result.getInt(1);
            }
        }  catch (ClassNotFoundException | IOException | SQLException e){
            e.printStackTrace();
        } finally {
            if(stmt != null) {
            	stmt.close();
            }            
            if(conn != null)
                conn.close();           
        }
        return ID;
	}
	/* --- Read All Shopping Records --- */
	public List<Shopping> getAllShoppingRecord() throws SQLException {
		
		Shopping shopping= null;
		Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet result = null;
        List<Shopping> shoppings = new ArrayList<Shopping>();
        
        try {
        	conn = OracleConnection.getConnection();
            stmt = conn.prepareStatement(OracleQueries.GETAllSHOPPINGRECORD);
            result = stmt.executeQuery();
            
	        while(result != null && result.next()){
	        	shopping = new Shopping();
	        	shopping.setShopping_id(result.getInt(1));
	        	shopping.setTotal_expense(result.getDouble(2));
	        	shopping.setTax(result.getDouble(3));

	        	shoppings.add(shopping);
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
        
		return shoppings;
	}
	
	/* --- Read A Shopping Record by ID --- */
   public Shopping getShoppingRecordById(int shopping_id)throws SQLException{
	   Shopping shopping = new Shopping(); 
	   Connection conn = null;
       PreparedStatement stmt = null;
       ResultSet result = null;
       
       try {
       		conn = OracleConnection.getConnection();
            stmt = conn.prepareStatement(OracleQueries.GETSHOPPINGBYID);
            stmt.setInt(1, shopping_id);
            result = stmt.executeQuery();
                   
            if(result != null&&result.next()){
            	shopping.setShopping_id(result.getInt(1));
            	shopping.setTotal_expense(result.getDouble(2));
            	shopping.setTax(result.getDouble(3));
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
        return shopping;
    }

	//Update Item
	public boolean updateShopping(Shopping shopping) throws SQLException {
		
       Connection conn = null;
       PreparedStatement stmt = null;
       boolean rslt = false;

       try{
           conn = OracleConnection.getConnection();
           stmt = conn.prepareStatement(OracleQueries.UPDATESHOPPINGINFO);
           stmt.setDouble(1, shopping.getTotal_expense());
           stmt.setDouble(2, shopping.getTax());
           stmt.setInt(3, shopping.getShopping_id());

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
	
	
	/* --- Delete a Shopping Record ---*/
	public void deleteShoppingRecord(Shopping shopping) throws SQLException {
        Connection conn = null;
        PreparedStatement stmt = null;

        try{
            conn = OracleConnection.getConnection();
            stmt = conn.prepareStatement(OracleQueries.DELETESHOPPINGBYID);
            stmt.setInt(1, shopping.getShopping_id());

            int result = stmt.executeUpdate();
            if(result!=0) {
                System.out.println("The Shopping Record has deleted successfully");
            } else {
                System.out.println("Could not find the Shopping ID, Try Again.");
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
	
	/* --- Delete All Shopping Record ---*/
	public void deleteAllShoppingRecord() throws SQLException {
        Connection conn = null;
        PreparedStatement stmt = null;

        try{
            conn = OracleConnection.getConnection();
            stmt = conn.prepareStatement(OracleQueries.DELETEALLSHOPPING);

            int result = stmt.executeUpdate();
            if(result!=0) {
                System.out.println("All Shopping Record has deleted successfully");
            } else {
                System.out.println("Could not Delete All Shopping Record, Try Again.");
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
