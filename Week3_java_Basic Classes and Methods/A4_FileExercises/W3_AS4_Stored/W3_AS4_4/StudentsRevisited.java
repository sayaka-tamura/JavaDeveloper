package W3_AS4_4;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Sayaka Tamura
 * 
 * 4. Students revisited
 * 
 * Create a method in your Student class called getInfo(), which prints a line that looks like this:
 * My name is Mike. I'm in grade 15 and I have a 4.0 GPA. For now, at least...
 * 
 * Create three files on your desktop named: names, grades, and gpas.
 * Create 10 lines of information in each file.
 * 
 * Read the lines of each file and store their contents in their own arrays.
 * 
 * Create an array of type Student[] and fill it using those arrays.
 * 
 * To confirm your work, loop through your Student[] array and call the getInfo method on each Student.
 */
public class StudentsRevisited {
	public static void main(String[] args) {
		String path1 = "C:\\Users\\arccy\\Desktop\\names.txt";
		File file1 = new File(path1);
		
		String path2 = "C:\\Users\\arccy\\Desktop\\grades.txt";
		File file2 = new File(path2);
		
		String path3 = "C:\\Users\\arccy\\Desktop\\gpas.txt";
		File file3 = new File(path3);
		
		try {
				Scanner in1 = new Scanner(file1);
				Scanner in2 = new Scanner(file2);
				Scanner in3 = new Scanner(file3);
				
				ArrayList <String> names = new ArrayList <String>();
				ArrayList <String> grades = new ArrayList <String>();
				ArrayList <String> gpas = new ArrayList <String>();
								
				// Put each line to ArrayList: names as array
				while(in1.hasNextLine()) {
					String line1 = in1.nextLine();
					names.add(line1);
				}
				
				// Put each line to ArrayList: names as array
				while(in2.hasNextLine()) {
					String line2 = in2.nextLine();
					grades.add(line2);
				}
				
				// Put each line to ArrayList: names as array
				while(in3.hasNextLine()) {
					String line3 = in3.nextLine();
					gpas.add(line3);
				}
				
				in1.close();
				in2.close();
				in3.close();
				
				// Create an array of type Student[] and fill it using those arrays.
				ArrayList <Student> students = new ArrayList<Student>();
				
				for (int i = 0; i < names.size(); i++) {
					Student stu = new Student();
					stu.setName(names.get(i));
					stu.setGrade(Integer.parseInt(grades.get(i)));
					stu.setGPA(Double.parseDouble(gpas.get(i)));
					
					students.add(stu);
				}
				
				// To confirm your work, loop through your Student[] array 
				// and call the getInfo method on each Student.
				for (Student s: students)
					s.getInfo();
				
		} catch(Exception e) {
			System.out.println("File not found!");
		}
	}
}
