/**
 * @author Sayaka Tamura
 * This class is to query the database for student’s information only
 * 
 * If this class throws any Exception, update the implemented interface
 */
package CoreJava.DAO;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import CoreJava.Models.Student;
import CoreJava.systemsInterfaces.StudentDAOI;
import util.OracleQueries;

public class StudentDAO implements StudentDAOI{
	/**
	 * queries the database for an Student with such an email
	 * @param email for a student user want to search
	 * @return Student Searched by email 
	 * @throws SQLException 
	 */
	public Student getStudentByGmail(String email) throws SQLException {
		Student stu = null;
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet result = null;

		try {
			conn = OracleConnection.getConnection();
            stmt = conn.prepareStatement(OracleQueries.GETSTUDENTBYEMAIL);
            stmt.setString(1, email);
            result = stmt.executeQuery();
            if(result.next()){
                stu = new Student();
                stu.setStudent_id(result.getInt(1));
                stu.setFull_name(result.getString(2));
                stu.setEmail(result.getString(3));
                stu.setGpa(result.getDouble(4));
                stu.setPass(result.getString(5));
                stu.setStudent_role(result.getInt(6));
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

		return stu;	
	}
	
	/**
	 * @param passToValidate the password from the database
	 * @param comparablePas the password from the user input
	 * @return boolean
	 * @throws SQLException 
	 * @throws IOException 
	 * @throws ClassNotFoundException 
	 */
	public boolean validateUser(String passToValidate, String comparablePas) throws SQLException {
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet result = null;
		boolean rslt = false;
		
		try {
			conn = OracleConnection.getConnection();
			stmt = conn.prepareStatement(OracleQueries.GETSTUDENTBYPASS);
			stmt.setString(1, passToValidate);
			result = stmt.executeQuery();
			
			if(result != null&&result.next()){
				if(passToValidate.equals(comparablePas))
					rslt = true;
				else
					rslt = false;
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
