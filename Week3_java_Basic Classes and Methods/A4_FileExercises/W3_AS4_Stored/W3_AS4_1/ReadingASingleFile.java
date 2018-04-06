import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Sayaka Tamura
 * 1. Reading a single file
 * 
 * Create one file on your desktop named hello
 * Fill the file with two lines:
 * Hello
 * World
 * 
 * Create a program to print the lines of the file.
 * Modify the program to print the lines of the file backwards.
 * 
 * Add more content to the file and see if you can make your program work.
 */

public class ReadingASingleFile {
	
	public static void main(String[] args) throws Exception {
		
		/**  ------------------------ Using AllayList class  ------------------------  */
		String path = "C:\\Users\\Students\\Desktop\\percholas_sayaka\\Week3_java_Basic Classes and Methods\\A4_FileExercises\\src\\hello.txt";
		File file = new File(path);
		try {
			Scanner sc = new Scanner(file);
			ArrayList<String> allLines = new ArrayList<String>();
			
			while(sc.hasNextLine()) {
				allLines.add(sc.nextLine());
			}
			sc.close();
			
			for(String line: allLines)
				System.out.println(line);
		    System.out.println();
		    
		   /** Print the lines of the file backwards. */
			System.out.println("Printing the lines of the file backwards...");			
			for (int i=allLines.size()-1; i>=0; i--)  // from n-1 downTo 0
			{
			    String line = allLines.get(i);
			    System.out.println( line );
			}
			System.out.println();
			
			System.out.println("Printing each characters in the lines of the file backwards...");	
			for(String line: allLines) {
				StringBuilder sb = new StringBuilder(line);
				String reversed = sb.reverse().toString();
				System.out.println(reversed);
			}
			
			// Another way
			System.out.println("Printing each characters in the lines of the file backwards in another way...");	
			for(String line: allLines) {
				char [] c = line.toCharArray();
				String output = "";
				for (int i = c.length-1; i >= 0; i--) {
					output += c[i];
				}
				System.out.println(output);
			}
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	    
	}

}
