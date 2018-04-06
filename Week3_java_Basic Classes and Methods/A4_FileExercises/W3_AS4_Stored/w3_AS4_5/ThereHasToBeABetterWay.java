package w3_AS4_5;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Sayaka Tamura
 *
 * 5. There has to be a better way
 * 
 * Instead of storing your student information in three seperate files,
 * let's try storing them in one.
 * 
 * You can do this by separating columns of data with a designated character.
 * For instance, separting student data with a comma might look like this:
 * Mike,15,4.0
 * 
 * While separating student data with a space would look like this:
 * Mike 15 4.0
 * 
 * For this exercise, let's stick with commas.
 * 
 * Create a new file on your desktop named students.csv (csv means Comma Separated Values)
 * Fill it up with 10 lines of data (feel free to use the values from your old files!)
 * 
 * Now, read each line of the file and, with the help of String.split(), 
 * store the line in a String array.
 * 
 * Then, immediately store the data from that array in a Student object.
 * 
 * Finally, add that Student object to your Student[] array and continue with the loop.
 * 
 * To confirm your work, loop through your Student[] array and call the getInfo method on each Student.
 */

public class ThereHasToBeABetterWay {
	public static void main(String[] args) {

		String path = "C:\\Users\\Students\\Desktop\\Students_W3_AS4_5.csv";
		File file = new File(path);
		
		String[][] student_info = new String[10][];			// make array to store the line
		// Create an array of type Student[] and fill it using those arrays.
		ArrayList <Student> students_ar = new ArrayList<Student>(10);
		
		try {
			Scanner in = new Scanner(file);			
			in.nextLine();									// skip 1st line
			
			for (int i = 0; i < 10; i++) {
				
				String line = in.nextLine();				// read each line of the file with String.split()
				student_info[i] = line.split(",");			// store the line in a String array.
				
				Student stu = new Student();				// store the data from that array in a Student object

				stu.setName(student_info[i][0]);
				stu.setGrade(Integer.parseInt(student_info[i][1]));
				stu.setGPA(Double.parseDouble(student_info[i][2]));

				students_ar.add(stu);						// add that Student object to your Student[] array
															// and continue with the loop
			}

			// To confirm your work, loop through your Student[] array 
			// and call the getInfo method on each Student.
			for (Student s: students_ar)
				s.getInfo();
			
			in.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
