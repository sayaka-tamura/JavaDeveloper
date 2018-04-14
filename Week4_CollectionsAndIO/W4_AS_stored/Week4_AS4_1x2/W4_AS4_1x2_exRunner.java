package Week4_AS4_1x2;

import java.io.IOException;

public class W4_AS4_1x2_exRunner {
	public static void main(String[] args) {
		/**
		 * 1. Write a program that displays your name and address on the console 
		 *    as if it were a letter. Your output should look something like that below.
		 */
		W4_AS4_1x2_IOmethods ioex1 = new W4_AS4_1x2_IOmethods();
		System.out.println(ioex1.displayNameAndAddress());
		
		
		/**
	     * 2. Modify question #1, instead of displaying to the console, 
	     * 	 output the letter to a .txt file
	    */
		try {
			ioex1.outputLetterAsTextFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
