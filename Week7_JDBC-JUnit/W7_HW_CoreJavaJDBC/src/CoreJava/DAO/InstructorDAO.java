package CoreJava.DAO;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import CoreJava.Models.Instructor;
import CoreJava.systemsInterfaces.InstructorDAOI;
import util.OracleQueries;

public class InstructorDAO implements InstructorDAOI{
	
	/**
	 * @return List<Instructor> every Instructor in the database
	 * @throws SQLException 
	 */
	public List<Instructor> getAllInstructors() throws SQLException {
		Instructor instructor = null;
		Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet result = null;
        List<Instructor> instructors = new ArrayList<Instructor>();
        
        try {
        	conn = OracleConnection.getConnection();
            stmt = conn.prepareStatement(OracleQueries.GETAllINSTRUCTOR);
            result = stmt.executeQuery();
            
	        while(result != null && result.next()){
	        	instructor = new Instructor();
	        	instructor.setInstructor_id(result.getInt(1));
	        	instructor.setFull_name(result.getString(2));
	        	instructor.setEmail(result.getString(3));
	        	instructor.setSpeciality(result.getString(4));
	        	instructor.setInstructor_role(result.getInt(5));
	        	instructor.setPass(result.getString(6));
	            instructors.add(instructor);
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
        
		return instructors;
	}
	
	/**
	 * queries the database for an Instructor with such an email
	 * @param email for a instructor user want to search
	 * @return Instructor Searched by email 
	 * @throws SQLException 
	 */
	public Instructor getInstructoByGmail(String email) throws SQLException {
		Instructor ins = null;
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet result = null;
		
		try {
			conn = OracleConnection.getConnection();
            stmt = conn.prepareStatement(OracleQueries.GETINSTRUCTORBYEMAIL);
            stmt.setString(1, email);
            result = stmt.executeQuery();
            
            if(result.next()){
            	ins = new Instructor();
            	ins.setInstructor_id(result.getInt(1));
            	ins.setFull_name(result.getString(2));
            	ins.setEmail(result.getString(3));
            	ins.setSpeciality(result.getString(4));
            	ins.setInstructor_role(result.getInt(5));
            	ins.setPass(result.getString(6));
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
	
		return ins;	
	}
	
	/**
	 * 
	 * @param ins Instructor object with all its information
	 * @param comparablePas Password entered by the user trying to login as an instructor
	 * @return "Wrong Credentials", "Admin" or "Instructor"
	 * @throws SQLException 
	 */
	public String validateUser (Instructor ins, String comparablePas) throws SQLException {
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet result = null;
		String passToValidate = ins.getPass();
		int insRole = ins.getInstructor_role();
		String rslt = null;
		
		try {
			
			conn = OracleConnection.getConnection();
			stmt = conn.prepareStatement(OracleQueries.GETINSTRUCTORBYPASS);
			stmt.setString(1, passToValidate);
			result = stmt.executeQuery();
			
			if(result != null&&result.next()){
				if(passToValidate.equals(comparablePas))
				{
					
					if(insRole == 1)
						rslt = "Admin";
					else
						rslt = "Instructor";
				}			
				else
					rslt = "Wrong Credentials";
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
		
		return rslt;
	}

}
