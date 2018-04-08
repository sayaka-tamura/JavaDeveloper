package CoreJava.DAO;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import CoreJava.Models.Student;

/**
 * @author Sayaka Tamura
 * This class is going to be used to search the csv files 
 * for student’s information only
 */

public class StudentDAO {
	
	/** This method reads the Students.csv file 
	 * 	@return List<Student>
	 */
	public List<Student> getStudents(){
		
		ArrayList<Student> stu_arr = new ArrayList<Student>();
		String path = "C:\\Users\\arccy\\Desktop\\students.csv";
		File file = new File(path);
		
		try {
			Scanner in = new Scanner(file);
			while(in.hasNextLine())
			{
				String[] student_info = in.nextLine().split(",");
				
				Student stu = new Student();
				stu.setEmail(student_info[0]);
				stu.setName(student_info[1]);
				stu.setPass(student_info[2]);
				
				stu_arr.add(stu);
			}
			in.close();
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		return stu_arr;
	}
	
	/**
	 * This method parses the List for a Student with that email
	 * @param studentList the List of Students as an ArrayList
	 * @param studentEmail Student’s email
	 * @return a Student Object
	 */
	public Student getStudentByEmail(List<Student> studentList, String studentEmail) {
		
		for(Student s: studentList) {
			if(s.getEmail().equals(studentEmail))
				return s;
		}
		return null;
	}
	
	/**
	 * This method returns whether or not student was found
	 * @param studentList
	 * @param studentEmail user email
	 * @param studentPass the password from the user input
	 * @return boolean
	 */
	public boolean validateUser(List<Student> studentList, String studentEmail, String studentPass) {
		
		for(Student s: studentList)
			if(s.getEmail().equals(studentEmail)&&s.getPass().equals(studentPass))
				return true;
		return false;		
	}
}
