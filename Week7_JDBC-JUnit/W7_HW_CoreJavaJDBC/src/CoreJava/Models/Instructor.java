/**
 * @author Sayaka Tamura
 * Instructor class is to carry data related to one Instructor
 */
package CoreJava.Models;

public class Instructor {
	private int instructor_id;
	private String full_name;
	private String email;
	private String speciality;
	private int instructor_role;
	private String pass;
	
	
	public Instructor() {
		this.instructor_id = 0;
		this.full_name = "";
		this.email = "";
		this.speciality = "";
		this.instructor_role = 0;
		this.pass = "";
	}
	
	public Instructor(int intrcutor_id, String full_name, String email, String speciality, int instructor_role,
			String pass) {
		this.instructor_id = intrcutor_id;
		this.full_name = full_name;
		this.email = email;
		this.speciality = speciality;
		this.instructor_role = instructor_role;
		this.pass = pass;
	}
	
	public int getInstructor_id() {
		return instructor_id;
	}
	public void setInstructor_id(int intrcutor_id) {
		this.instructor_id = intrcutor_id;
	}
	public String getFull_name() {
		return full_name;
	}
	public void setFull_name(String full_name) {
		this.full_name = full_name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSpeciality() {
		return speciality;
	}
	public void setSpeciality(String speciality) {
		this.speciality = speciality;
	}
	public int getInstructor_role() {
		return instructor_role;
	}
	public void setInstructor_role(int instructor_role) {
		this.instructor_role = instructor_role;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}

}
