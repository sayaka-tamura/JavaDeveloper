package CoreJava.DAO;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import CoreJava.Models.Course;
import CoreJava.systemsInterfaces.CourseDAOI;
import util.OracleQueries;

public class CourseDAO implements CourseDAOI{

	/**
	 * @return List<Course> every Course in the database
	 * @throws SQLException 
	 */
	public List<Course> getAllCourses() throws SQLException {
		Course course = null;
		Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet result = null;
        List<Course> courses = new ArrayList<Course>();
        
        try {
        	conn = OracleConnection.getConnection();
            stmt = conn.prepareStatement(OracleQueries.GETAllCOURSE);
            result = stmt.executeQuery();
            
	        while(result != null && result.next()){
	        	course = new Course();
	        	course.setCourse_id(result.getInt(1));
	        	course.setCourse_name(result.getString(2));
	        	course.setMinimum_gpa(result.getDouble(3));

	        	courses.add(course);
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
        
		return courses;
	}
	
	public List<Course> getCourseByInstructor(int instructor_id) throws SQLException {
		Course course = null;
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet result = null;
		List<Course> courses = new ArrayList<Course>();
		
		try {
			conn = OracleConnection.getConnection();
            stmt = conn.prepareStatement(OracleQueries.GETCOURSEBYINSTRUCTOR);
            stmt.setInt(1, instructor_id);
            result = stmt.executeQuery();
            
            while(result != null && result.next()){
            	course = new Course();
            	course.setCourse_id(result.getInt(1));
            	course.setCourse_name(result.getString(2));
            	course.setMinimum_gpa(result.getDouble(3));
            	
            	courses.add(course);
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
		
		return courses;	
	}

}
