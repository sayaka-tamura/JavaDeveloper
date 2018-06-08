package springwork.service;

import java.sql.SQLException;


import CoreJava.DAO.UserDAO;
import springwork.model.User;

public class loginService {
	
	private UserDAO uDAO;
	
	public boolean checkLogin(User u) throws SQLException {
		User specific_user = uDAO.getUserByGmail(u.getUser_email(), u.getUser_password());
		return specific_user != null;
	}
}
