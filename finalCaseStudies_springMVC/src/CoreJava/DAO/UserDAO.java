package CoreJava.DAO;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import springwork.model.Item;
import springwork.model.User;
import CoreJava.util.OracleQueries;

public class UserDAO {
	
	// Create User
	public int createUser(User user) throws SQLException {
		int ID = 0;
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet result = null;
        String[] COL = {"user_id"};

        try{
            conn = OracleConnection.getConnection();
            stmt = conn.prepareStatement(OracleQueries.ADDNEWUSER, COL);
            stmt.setString(1, user.getUser_fname());
            stmt.setString(2, user.getUser_lname());
            stmt.setString(3, user.getUser_email());
            stmt.setString(4, user.getUser_password());
            
            stmt.executeUpdate();
            result = stmt.getGeneratedKeys();
            System.out.println();
            if(result != null && result.next()){
            	// Generate Shopping ID
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
    
	/* --- Read User by Email and Password --- */
	public User getUserByGmail(String email, String password) throws SQLException {
		User user = null;
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet result = null;

		try {
			conn = OracleConnection.getConnection();
            stmt = conn.prepareStatement(OracleQueries.GETUSERBYEMAILANDPASS);
            stmt.setString(1, email);
            stmt.setString(2, password);
            result = stmt.executeQuery();
            if(result.next()){
                user = new User();
                user.setUser_id(result.getInt(1));
                user.setUser_fname(result.getString(2));
                user.setUser_lname(result.getString(3));
                user.setUser_email(result.getString(4));
                user.setUser_password(result.getString(5));
            }
            result.close();
			
		} catch (ClassNotFoundException | IOException | SQLException e) {
			e.printStackTrace();
		} finally {
            
            if(stmt != null){
                stmt.close();
            }
            if(conn != null){
                conn.close();
            }
        }

		return user;	
	}
	
	/* --- Read A User Record by User ID --- */
    public User getUserRecordById(int user_id)throws SQLException{
	   User user = new User(); 
	   Connection conn = null;
       PreparedStatement stmt = null;
       ResultSet result = null;
       
       try {
       		conn = OracleConnection.getConnection();
            stmt = conn.prepareStatement(OracleQueries.GETUSERBYITEMID);
            stmt.setInt(1, user_id);
            result = stmt.executeQuery();
                   
            if(result != null&&result.next()){
	        	user.setUser_id(result.getInt(1));
	        	user.setUser_fname(result.getString(2));
	        	user.setUser_lname(result.getString(3));
	        	user.setUser_email(result.getString(4));
	        	user.setUser_password(result.getString(5));
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
        return user;
    }
    
	//Update User
	public boolean updateUser(User user) throws SQLException {
		 
       Connection conn = null;
       PreparedStatement stmt = null;
       boolean rslt = false;

       try{
           conn = OracleConnection.getConnection();
           stmt = conn.prepareStatement(OracleQueries.UPDATEUSER);
           stmt.setString(1, user.getUser_fname());
           stmt.setString(2, user.getUser_lname());
           stmt.setString(3, user.getUser_email());
           stmt.setString(4, user.getUser_password());
           stmt.setInt(5, user.getUser_id());
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

	 /*--- Delete USER ---*/
	public void deleteShoppingRecord(User user) throws SQLException {
        Connection conn = null;
        PreparedStatement stmt = null;

        try{
            conn = OracleConnection.getConnection();
            stmt = conn.prepareStatement(OracleQueries.DELETEUSERBYID);
            stmt.setInt(1, user.getUser_id());

            int result = stmt.executeUpdate();
            if(result!=0) {
                System.out.println("The User Account has deleted successfully");
            } else {
                System.out.println("Could not find the User ID, Try Again.");
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
