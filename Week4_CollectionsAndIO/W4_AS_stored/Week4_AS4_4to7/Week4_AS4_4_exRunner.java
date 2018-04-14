package Week4_AS4_4to7;

import java.io.IOException;
import java.util.Scanner;

/**
 * @author Sayaka Tamura
 */
public class Week4_AS4_4_exRunner {
	public static void main(String[] args) {
		
		/**
		 * 4. Create a file named: num1.txt and insert integers separated by some white space.
		 *  Write a program that reads three integers from the file nums.txt and displays 
		 *  (on the screen) the total of the integers.
		 */
		Week4_AS4_4_IOmethods ioex4 = new Week4_AS4_4_IOmethods();
		
//		try {
//			System.out.println(ioex4.createFileSplitsBySpaces());
//		}
//		catch (IOException e) {
//			e.printStackTrace();
//		}
		
		/**
		 *  5. Create several more files in Notepad containing three integers separated by some whitespace. 
		 *  Save them in your home directory as "nums2.txt", "nums3.txt", "nums4.txt", etc.
		 *  Then write a program that asks the user which file to open.
		 *  Then it should open that file, and read the three integers from the file. 
		 *  It should then display (on the screen) the total of the integers.
		 */
		Scanner in = new Scanner(System.in);
//		System.out.println("Which file you want open? \n"
//				+ "1: num2.txt\n"
//				+ "2: num3.txt\n"
//				+ "3: num4.txt\n"); 
//		int fileName = in.nextInt();
//		in.close();
//		
//		try {
//			System.out.println(ioex4.openFileFindTotal(fileName));
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
		
		/**
		 * 6.  Create two files and name them: puzzle.txt and puzzle2.txt
		 * Inside puzzle.txt, write the following text:
		 * MWTaahyiebt_e,c__hnyaoontuc;'e_rste_r_aynr_oert_e_gasoduoipdnp_got_shoeandtl__yty_oot_uhrree__apTdrH_oItgRhrDia_sml__eowtnotere.kr_ss_.
		 * Inside puzzle2.txt, write the following text:
		 * WTTohhriikssi__niigss,___ttbhhueet___wryrioogunh'gtr__emm_eessshssoaawggieen__gff_rrtoohmme___sswaarmmoppnllgee_22o..nttexxstt
		 * 
		 * Open a file specified by the user. This file will contain a bunch of characters.
		 * You should read in each character from the file, one character at a time.
		 * Display every third character on the screen. Throw the other characters away.
		 * There is a sample input file called puzzle.txt,
		 * containing a little message you can use to test your program.
		 * 
		 * Sample Output: 
		 * Open which file: puzzle2.txt
		 * 
		 * This_is_the_right_message_from_sample2.txt
		 */
//		System.out.println("Which file you want open? \n"
//				+ "1: puzzle.txt\n"
//				+ "2: puzzle2.txt\n"); 
//		int fileName4puzzle = in.nextInt();
//		in.close();
//		
//		try {
//			System.out.println(ioex4.openAPuzzle(fileName4puzzle));
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
		
		/**
		 * 7. Create a file CrazyText.txt and write the following text:
		 * Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod
		 * tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam,
		 * quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo
		 * consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse
		 * cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non
		 * proident, sunt in culpa qui officia deserunt mollit anim id est laborum.
		 * 
		 * Create a second file CrazyTextModified.txt and it should be empty initially.
		 * Write a program that would reads the text in CrazyText.txt
		 * and output it to CrazyTextModified.txt with every vowel capitalize.
		 */
		try {
			ioex4.readCrazyTextAndWrite();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
