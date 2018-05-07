package CoreJava.DAO;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import CoreJava.Models.Teaching;
import CoreJava.systemsInterfaces.TeachingDAOI;
import util.OracleQueries;

public class TeachingDAO implements TeachingDAOI {
	
	/**
	 * perform an INSERT query into the TEACHING table to assign an instructor to a course
	 * @throws SQLException 
	 */
	public int assignInstructorToCourse(int course_id, int instructor_id) throws SQLException {
		int ID = 0;
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet result = null;
        String[] COL = {"teaching_id"};
        
        try {
        	conn = OracleConnection.getConnection();
        	stmt = conn.prepareStatement(OracleQueries.ADDINSTRUCTORTOCOURSE, COL);
        	stmt.setInt(1, course_id);
        	stmt.setInt(2, instructor_id);
        	
        	stmt.executeUpdate();
        	result = stmt.getGeneratedKeys();
            System.out.println();
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
	
	/**
	 * queries the database for every instructor assigned to a course
	 * @throws SQLException 
	 */
	public List<Teaching> getInstructorsCourses() throws SQLException {
		Teaching teaching = null;
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet result = null;
		List<Teaching> teachings = new ArrayList<Teaching>();
		
		try {
			conn = OracleConnection.getConnection();
            stmt = conn.prepareStatement(OracleQueries.GETAllINSTRUCTORFROMTEACHING);
            result = stmt.executeQuery();
            
            while(result != null && result.next()){
            	teaching = new Teaching();
            	teaching.setCourse_name(result.getString(1));
            	teaching.setMinimum_gpa(result.getDouble(2));
            	teaching.setFull_name(result.getString(3));
            	teaching.setEmail(result.getString(4));
            	
            	teachings.add(teaching);
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
		
		return teachings;	
	}

}
