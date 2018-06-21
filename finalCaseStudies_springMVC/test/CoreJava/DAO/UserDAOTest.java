package CoreJava.DAO;

import java.io.IOException;
import java.sql.SQLException;

import org.junit.Before;
import org.junit.Test;

import springwork.model.*;

import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.hamcrest.CoreMatchers.nullValue;


public class UserDAOTest {
	UserDAO uDAO;
	User user, u_check;
	int generatedId;
	boolean isUpDated, willDelete;
	
	@Before
	public void setUp() {
		uDAO = new UserDAO();
		user = new User("Cristiano", "Ronaldo", "cristiano@gmail.com", "cristiano2018@");
	}
	  
	@Test
	public void testCreateUser() throws SQLException, ClassNotFoundException, IOException {
		
		generatedId = uDAO.createUser(user);
		u_check = uDAO.getUserRecordById(generatedId);
		
        assertThat(u_check.getUser_fname(), is("Cristiano"));
        assertThat(u_check.getUser_lname(), is("Ronaldo"));
        assertThat(u_check.getUser_email(), is("cristiano@gmail.com"));
        assertThat(u_check.getUser_password(),is("cristiano2018@"));   
	}
    
	@Test
	public void testGetUserByGmail() throws SQLException {
		u_check = uDAO.getUserByGmail(user.getUser_email(), user.getUser_password());
		assertThat(u_check, notNullValue());
		assertThat(user.getUser_email(), equalTo(u_check.getUser_email()));
		assertThat(user.getUser_password(), equalTo(u_check.getUser_password()));
	}

	@Test
	public void testGetUserRecordById() throws SQLException {
		u_check = uDAO.getUserRecordById(generatedId);
		assertThat(u_check, notNullValue());
		
		assertThat(u_check.getUser_id(), is(generatedId));
		assertThat(u_check.getUser_fname(), is("Cristiano"));
		assertThat(u_check.getUser_lname(), is("Ronaldo"));
		assertThat(u_check.getUser_email(), is("cristiano@gmail.com"));
		assertThat(u_check.getUser_password(), is("cristiano2018@"));
	}
	
	@Test
	public void testUpdateUser() throws SQLException, ClassNotFoundException, IOException {
		user.setUser_email("ronaldo@gmail.com");
		u_check = uDAO.getUserRecordById(generatedId);
		
		isUpDated = uDAO.updateUser(u_check);
		
		assertThat(u_check.getUser_id(), is(generatedId));
		assertThat(u_check.getUser_fname(),is("Cristiano"));
		assertThat(u_check.getUser_lname(),is("Ronaldo"));
		assertThat(u_check.getUser_email(),is("ronaldo@gmail.com"));
		assertThat(u_check.getUser_password(),is("cristiano2018@"));
		
		assertThat(isUpDated, equalTo(true));
		willDelete = true;
	}
	
	@Test
	public void testDeleteUser() throws SQLException {
		if(willDelete) {
			uDAO.deleteUser(user);
			u_check = uDAO.getUserRecordById(generatedId);
			assertThat(u_check, nullValue());
		}
	}
}
