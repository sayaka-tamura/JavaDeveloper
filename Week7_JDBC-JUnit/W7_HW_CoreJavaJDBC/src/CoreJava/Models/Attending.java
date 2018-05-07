/**
 * @author Sayaka Tamura
 * Attending class is to carry data related to any Student that is registered to a course
 * ATTENDING SQL(COLUMN): ATTENDING_ID,COURSE_ID,STUDENT_ID
 */
package CoreJava.Models;

public class Attending {
	private String course_name;
	private String full_name;	// Instructor name
	private String email;		// Instructor email
	
	public Attending() {
		this.course_name = "";
		this.full_name = "";
		this.email = "";
	}
	
	public Attending(String course_name, String full_name, String email) {
		super();
		this.course_name = course_name;
		this.full_name = full_name;
		this.email = email;
	}
	
	public String getCourse_name() {
		return course_name;
	}
	public void setCourse_name(String course_name) {
		this.course_name = course_name;
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
}
