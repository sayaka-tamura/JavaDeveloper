package CoreJava.Models;

public class Student {
	private String email;
	private String name;
	private String pass;
	
	
	public Student() {
		this.email = "Null";
		this.name = "Null";
		this.pass = "Null";
	}
	
	public Student(String email, String name, String pass) {
		this.email = email;
		this.name = name;
		this.pass = pass;
	}
	
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	
}
