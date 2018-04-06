package W3_AS4_4;

public class Student {
	private String name;
	private int grade;
	private double GPA;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public double getGPA() {
		return GPA;
	}
	public void setGPA(double GPA) {
		this.GPA = GPA;
	}
		
	public void getInfo() {
		System.out.println("My name is " + name + ". I'm in grade " + grade + " and I have a " + GPA + " GPA. For now, at least...");
	}
	
}
