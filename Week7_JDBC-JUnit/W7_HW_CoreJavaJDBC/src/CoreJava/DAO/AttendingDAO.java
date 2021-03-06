package CoreJava.DAO;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import CoreJava.Models.Attending;
import CoreJava.Models.Course;
import CoreJava.Models.Student;
import CoreJava.systemsInterfaces.AttendingDAOI;
import util.OracleQueries;

public class AttendingDAO implements AttendingDAOI{
	
	/**
	 * If the studentís GPA id greater or equal to the minimum GPA of the course 
	 * then the student is allow to register to the course. 
	 * If not, then throw the StudentRegistrationException 
	 * with a custom massage such as "\nDid not meet the minimum GPA requirement\nRegistration Denied". 
	 * 
	 * Since you are creating a new record in the database, 
	 * return the primary key auto-generated by the database.
	 */
	public int registerStudentToCourse(Student student, Course course)  throws SQLException{
        int ID = 0;
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet result = null;
        String[] COL = {"attending_id"};
        
        try {
        	double a = student.getGpa();
        	double b = course.getMinimum_gpa();

    		if(a > b)
    		{
    			// student register to the course
            	conn = OracleConnection.getConnection();
            	stmt = conn.prepareStatement(OracleQueries.ADDSTUDENTTOCOURSE, COL);
            	stmt.setInt(1, course.getCourse_id());
            	stmt.setInt(2, student.getStudent_id());
            	
            	stmt.executeUpdate();
            	result = stmt.getGeneratedKeys();
                System.out.println();
                if(result != null && result.next()){
                    ID = result.getInt(1);
                }
    		} else {
    			System.out.println("Did not meet the minimum GPA requirement.\nRegistration Denied");
    		}
        }  catch (ClassNotFoundException | IOException | SQLException e){
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
	 * query the database for all the courses a student is register base on the Id
	 * @param int student_id
	 * @return List<Attending> attending list the student is attending
	 * @throws SQLException 
	 */
	public List<Attending> getStudentCourse(int student_id) throws SQLException {
		Attending attending = null;
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet result = null;
		List<Attending> attendings = new ArrayList<Attending>();
		
		try {
			conn = OracleConnection.getConnection();
            stmt = conn.prepareStatement(OracleQueries.GETATTENDINGBYSTUDENT);
            stmt.setInt(1, student_id);
            result = stmt.executeQuery();
            
            while(result != null && result.next()){
            	attending = new Attending();
            	attending.setCourse_name(result.getString(1));
            	attending.setFull_name(result.getString(2));
            	attending.setEmail(result.getString(3));
            	
            	attendings.add(attending);
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
		
		return attendings;	
	}
}
