package W3_AS4_2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Sayaka Tamura
 * 2. Reading multiple files
 * 
 * Create two files on your desktop named courseCode and courseName.
 * Fill each file with 2 lines of data.
 * 
 * Try to print the contents of the files at the same time like so:
 * CS235 - Object Oriented Programming II
 * CS135 - Intro to Object Oriented Programming
 * 
 * Hint: If you can't read both files at the same time, maybe you can store
 *      each one in some kind of variable?
 */

public class ReadingMultipleFiles {
	public static void main(String[] args) {
		String path1 = "C:\\Users\\arccy\\Desktop\\courseCode.txt";
		File file1 = new File(path1);
		
		String path2 = "C:\\Users\\arccy\\Desktop\\CourseName.txt";
		File file2 = new File(path2);
		
		try {
			Scanner in1 = new Scanner(file1);
			ArrayList<String> courseCodeAL = new ArrayList<String>();
			
			Scanner in2 = new Scanner(file2);
			ArrayList<String> CourseNameAL = new ArrayList<String>();
			
			// Put each line to ArrayList: courseCodeAL as array
			while(in1.hasNextLine()) {
				String line1 = in1.nextLine();
				courseCodeAL.add(line1);
			}
			
			// Put each line to ArrayList: CourseNameAL as array
			while(in2.hasNextLine()) {
				String line2 = in2.nextLine();
				CourseNameAL.add(line2);
			}
			
			ArrayList<String> concatAL = new ArrayList<String>();
			for (int i = 0; i < courseCodeAL.size(); i++) {
				concatAL.add(courseCodeAL.get(i) + "-" + CourseNameAL.get(i));
			}
			
			for (int j = 0; j < concatAL.size(); j++) {
				System.out.println(concatAL.get(j));
			}
						
			in1.close();
			in2.close();
		}
		catch(FileNotFoundException e) {
			System.out.println("File not found!");
		}
	}
}
