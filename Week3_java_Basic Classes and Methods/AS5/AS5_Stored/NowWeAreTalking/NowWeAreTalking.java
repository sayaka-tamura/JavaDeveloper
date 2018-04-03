import java.util.Scanner;

/**
 * @author Sayaka Tamura
 * 5-3. Now we're talking
 * 
 * Ask the user to input the number of students they would like to enter.
 * Store this in an integer named [numStudents].
 * 
 * Create an array of type Student with [numStudents] positions.
 * 
 * Read through their info via a loop.
 * 
 * Using a loop, print out the names of those students, their grades, and their GPAs.
 * Finally, print out the average GPA of all students.
 */

public class NowWeAreTalking {
	public static void main(String[] args) {
		
		int numStudents;
		double sumGpa = 0.0;
				
		System.out.println("Type a number of Students to type their information.");
		Scanner in = new Scanner(System.in);
		numStudents = in.nextInt();
		Student [] students = new Student [numStudents];		
		
		// To put info
		for (int i = 0; i < numStudents; i++) {
			students[i] = new Student();
			students[i].putinfo(i);
			sumGpa += students[i].getGpa();		// to get average
		}

		// To print 
		for (int i = 0; i < students.length; i++) 
			System.out.println(students[i].toString());	
		
		System.out.printf("The average of GPA is %.2f", sumGpa/3);
		in.close();
	}
}
