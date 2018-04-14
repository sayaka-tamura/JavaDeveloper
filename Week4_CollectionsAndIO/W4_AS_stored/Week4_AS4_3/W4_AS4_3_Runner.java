package Week4_AS4_3;

import java.io.IOException;

/**
 * @author Sayaka Tamura
 */

public class W4_AS4_3_Runner {
	public static void main(String[] args) {
		/** 
		 *  3. Write a program that asks the user for their name and a number.
		 *  Then store the following message in a file named: score.txt: 
		 *  [name] got a [number] in the Math test.
		 */
		W4_AS4_3_IOmethods ioex3 = new W4_AS4_3_IOmethods();
		System.out.println(ioex3.displayNameAndScore());
		
		try {
			ioex3.outputScoreAsTextFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
