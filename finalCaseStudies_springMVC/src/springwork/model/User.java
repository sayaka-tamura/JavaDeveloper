package springwork.model;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import springwork.customAnnotations.EmailConstraint;
import springwork.customAnnotations.PasswordConstraint;

public class User {
	private Integer user_id;
	
	@NotNull
	@Size(min=2, max=20, message="User name must be between {2} and {1}")
	private String user_fname;
	
	@NotNull
	@Size(min=2, max=20, message="User name must be between {2} and {1}")	
	private String user_lname;
	
	@NotNull
	@EmailConstraint
	private String user_email;
	
	@NotNull
	@PasswordConstraint
	private String user_password;
	
	public User(String user_fname, String user_lname, String user_email, String user_password) {
		this.user_fname = user_fname;
		this.user_lname = user_lname;
		this.user_email = user_email;
		this.user_password = user_password;
	}
	
	public User() {
		this.user_id = 0;
		this.user_fname = "";
		this.user_lname = "";
		this.user_email = "";
		this.user_password = "";
	}

	public Integer getUser_id() {
		return user_id;
	}

	public void setUser_id(Integer user_id) {
		this.user_id = user_id;
	}

	public String getUser_fname() {
		return user_fname;
	}

	public void setUser_fname(String user_fname) {
		this.user_fname = user_fname;
	}

	public String getUser_lname() {
		return user_lname;
	}

	public void setUser_lname(String user_lname) {
		this.user_lname = user_lname;
	}

	public String getUser_email() {
		return user_email;
	}

	public void setUser_email(String user_email) {
		this.user_email = user_email;
	}

	public String getUser_password() {
		return user_password;
	}

	public void setUser_password(String user_password) {
		this.user_password = user_password;
	}

	

}
