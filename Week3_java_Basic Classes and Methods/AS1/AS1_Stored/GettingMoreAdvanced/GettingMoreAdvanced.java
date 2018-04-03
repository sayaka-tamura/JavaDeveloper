/**
 * @author Sayaka Tamura
 * 5-2. Getting more advanced
 * 
 * Create an array of type Student with three positions.
 * 
 * Read in their info just like before.
 * 
 * Print out the names of those students, their grades, and their GPAs.
 * Then, print out the average GPA of all three students.
 */

public class GettingMoreAdvanced {
	
	public static void main(String[] args) {
		double sumGpa = 0.0;
		Student [] students = new Student [3];		
		
		// To put info
		for (int i = 0; i < students.length; i++) {
			students[i] = new Student();
			students[i].putinfo(i);
			sumGpa += students[i].getGpa();		// to get average
		}

		// To print 
		for (int i = 0; i < students.length; i++) 
			System.out.println(students[i].toString());	
		
		System.out.printf("The average of GPA is %.2f", sumGpa/3);	
	}
}
