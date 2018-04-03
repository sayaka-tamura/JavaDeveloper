/**
 * @author Sayaka Tamura
 * 5-1. Students
 * 
 * Create a Student class to store information about a student.
 * This includes a Name, a Grade, and a GPA.
 * 
 * Create three instances of type Student. Read the values for those students from user input.
 * 
 * Print out the names of those students, their grades, and their GPAs.
 * Then, print out the average GPA of all three students.
 *
 */

public class StudentApp {
	
	public static void main(String[] args) {
		double avgGpa;
		Student stu1 = new Student();	
		Student stu2 = new Student();	
		Student stu3 = new Student();	
		
		// To put info
		stu1.putinfo(1);
		stu2.putinfo(2);
		stu3.putinfo(3);

		// To print 
		System.out.println(stu1.toString());
		System.out.println(stu2.toString());
		System.out.println(stu3.toString());
		
		avgGpa = (stu1.getGpa() + stu2.getGpa() + stu3.getGpa())/3;
		System.out.println("The average of GPA is " + avgGpa);
	}
	
}
