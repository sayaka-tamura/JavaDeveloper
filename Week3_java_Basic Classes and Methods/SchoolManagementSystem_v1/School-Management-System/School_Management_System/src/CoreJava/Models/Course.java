package CoreJava.Models;

public class Course {
	private int courseID;
	private String courseName;
	private String InstructorName;
	
	public Course() {
		this.courseID = 0;
		this.courseName = "Null";
		this.InstructorName = "Null";
	}
	
	public Course(int courseID, String courseName, String instructorName) {
		this.courseID = courseID;
		this.courseName = courseName;
		this.InstructorName = instructorName;
	}
	
	public int getCourseID() {
		return courseID;
	}
	public void setCourseID(int courseID) {
		this.courseID = courseID;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public String getInstructorName() {
		return InstructorName;
	}
	public void setInstructorName(String instructorName) {
		InstructorName = instructorName;
	}
	
	
}
