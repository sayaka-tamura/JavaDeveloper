package CoreJava.DAO;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import CoreJava.util.OracleQueries;
import springwork.bcrypt.BCrypt;
import springwork.model.User;

public class UserDAO {
	
	// Create User
	public int createUser(User user) throws SQLException, ClassNotFoundException, IOException {
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
            stmt.setString(4, this.hashPassword(user.getUser_password()));
            
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
            	// stmt.setString(2, password);
            result = stmt.executeQuery();
            
            if(result.next() && result!= null){
            	if(this.checkPassword(password, result.getString(5))) {
	                user = new User();
	                user.setUser_id(result.getInt(1));
	                user.setUser_fname(result.getString(2));
	                user.setUser_lname(result.getString(3));
	                user.setUser_email(result.getString(4));
	                user.setUser_password(result.getString(5));
            	}
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
	   User user = null; 
	   Connection conn = null;
       PreparedStatement stmt = null;
       ResultSet result = null;
       
       try {
       		conn = OracleConnection.getConnection();
            stmt = conn.prepareStatement(OracleQueries.GETUSERBYITEMID);
            stmt.setInt(1, user_id);
            result = stmt.executeQuery();
                   
            if(result != null&&result.next()){
            	user =  new User();
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
       User queryUser = null;

       try{
           conn = OracleConnection.getConnection();
           stmt = conn.prepareStatement(OracleQueries.UPDATEUSER);;
           
           queryUser = this.getUserRecordById(user.getUser_id());
           
           stmt.setString(1, user.getUser_fname());
           stmt.setString(2, user.getUser_lname());
           stmt.setString(3, user.getUser_email());
           stmt.setString(4, this.hashPassword(user.getUser_password()));
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
	public boolean deleteUser(User user) throws SQLException {
        Connection conn = null;
        PreparedStatement stmt = null;
        boolean rslt = false;
        
        try{
            conn = OracleConnection.getConnection();
            stmt = conn.prepareStatement(OracleQueries.DELETEUSERBYID);
            stmt.setInt(1, user.getUser_id());

            int result = stmt.executeUpdate();
            if(result!=0) {
                System.out.println("The User Account has deleted successfully");
                rslt = true;
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
		return rslt;
    }
	
	//Hash password using bcrypt
	public String hashPassword(String originalPassword) {
		String hashed_password = BCrypt.hashpw(originalPassword, BCrypt.gensalt(12));

		return hashed_password;
	}
	
	//Check password
	public Boolean checkPassword(String originalPassword, String stored_hash) {
		Boolean password_verified = false;

		if(stored_hash == null || !stored_hash.startsWith("$2a$"))
			throw new java.lang.IllegalArgumentException("Invalid hash provided");

		password_verified = BCrypt.checkpw(originalPassword, stored_hash);

		return password_verified;
	}
	
}
