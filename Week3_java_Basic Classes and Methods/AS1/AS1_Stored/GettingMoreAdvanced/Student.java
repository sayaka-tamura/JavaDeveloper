import java.util.Scanner;

public class Student {

	private String name;
	private String grade;
	private double gpa;
	Scanner in = new Scanner(System.in);
	
	public Student()
	{
		this.name = null;
		this.grade = null;
		this.gpa = 0.0;
	}
	
	public Student(String name, String grade, double gpa) {
		this.name = name;
		this.grade = grade;
		this.gpa = gpa;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name.toUpperCase();
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		if(grade.equals("A") || grade.equals("B") || grade.equals("C") 
				 || grade.equals("D") || grade.equals("F"))
			this.grade = grade;
		else
			System.out.println("Invalid Input");
	}

	public double getGpa() {
		return gpa;
	}

	public void setGpa(double gpa) {
		if(gpa>0 && gpa<=4.0)
			this.gpa = gpa;
		else
			System.out.println("Invalid Input");
	}


	public String toString() {
		String message = "Student" + "\n";
		message += "Name: " + this.getName()+ "\n";
		message += "Grade: " + this.getGrade() + "\n";
		message += "GPA: " + this.getGpa() + "\n";
		return message;
	}

	public void putinfo(int num) {
		System.out.println("Type name for student No. [" + (num+1) + "]");
		this.setName(in.nextLine());
		System.out.println("Type Grade for student No. [" + (num+1) + "] between [A-F]");
		this.setGrade(in.nextLine());
		System.out.println("Type GPA for student No. [" + (num+1) + "] between 0 to 4.0");
		this.setGpa(in.nextDouble());
	}

}
