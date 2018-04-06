package W3_AS4_3;

import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Sayaka Tamura
 *
 * 3. Storing a Student
 * 
 * Create a class named Student which contains student information.
 * Specifically, create three variables: name, grade, and gpa.
 * 
 * Create an instance of type Student and read the values from user input.
 * 
 * Create three files on your desktop named: names, grades, and gpas.
 * 
 * Store the information from this Student in those files.
 * (name stored in names, grade => grades, gpa => gpas)
 */

public class StoringAStudent {
	public static void main(String[] args) {
		String name;
		int grade;
		double gpa;
		final int numOfStu = 3;
		ArrayList<Student> students = new ArrayList<>();
				
		String path = "C:\\Users\\arccy\\Desktop\\student.txt";
		File file = new File(path);
		
		try {
			FileWriter writer = new FileWriter(file,false);	// false: overwrite
			Scanner in = new Scanner(System.in);
			
			
			for (int i = 0; i < numOfStu; i++) {
				Student student = new Student();
				System.out.println("Type Student's name");
				name = in.next();
				System.out.println("Type Student's grade");
				grade = in.nextInt();
				System.out.println("Type Student's GPA");
				gpa = in.nextDouble();
				
				student.setName(name);
				student.setGrade(grade);
				student.setGPA(gpa);
				
				students.add(student);
								
				writer.write(student.getName() + ",");
				writer.write(student.getGrade() + ",");
				writer.write(student.getGPA() + "\r\n");			
			}
																
			writer.close();
			in.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}
}
