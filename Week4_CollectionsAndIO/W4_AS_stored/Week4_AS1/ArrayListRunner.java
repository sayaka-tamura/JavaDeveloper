package Week4_AS1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Sayaka Tamura
 * 
 */

public class ArrayListRunner {
	public static void main(String[] args) {
		 /* 1. Starting Small
		 * Write a Java program to create a new ArrayList of strings.
		 * Add some colors (string) and print out the collection.
		 * 
		 * Example Output:
		 * [Red, Green, Orange, White, Black]
		 */
		ArrayListMethods alm = new ArrayListMethods();
		alm.add("Black");
		alm.add("White");
		alm.add("Orange");
		alm.add("Green");
		alm.add("Red");	
				
//		 // Extra work:	way 1
//		List<String> al1 = new ArrayList<String>();
//		al1.add("Black");
//		al1.add("White");
//		al1.add("Orange");
//		al1.add("Green");
//		al1.add("Red");	
//		System.out.println(al1);
		
		// way 2		
//		List<String> al0 = Arrays.asList("Red", "Green", "Orange", "White", "Black");
//		System.out.println(al0);
		
		/**
		 * 2. Iterating
		 * Write a Java method to iterate through all elements in the previous ArrayList.
		 * Print each color out in the format of: "Today's Color is [color]!"
		 */
		ArrayListMethods.iterator();		// Way 1
		//ArrayListMethods.iterator2();		// Way 2
	 
		/**
		 *  3. Updating
		 *  Write a method to change the fifth element of your ArrayList to "Magenta"
		 */
		ArrayListMethods.updateElement(4, "Magenta");
		
		/**
		 *  4. Removing
		 *  Write a method to remove the third element of your ArrayList
		 */
		ArrayListMethods.removeElement(3);
		
		/**
		 *  5. Searching
		 *  Write a method to search your ArrayList for a specified color.
		 */
		ArrayListMethods.searchElement("Orange");
		
		/**
		 *  6. Sorting
		 *  Write a method to sort your ArrayList from A-Z
		 */
		ArrayListMethods.sortArrayListAscend();
		
		/**
		 * 7. Reversing
		 * Write a method to reverse your ArrayList
		 */
		ArrayListMethods.reverseArrayList();
		
		/**
		 * 8. Copying
		 * Write a method that will copy the contents of one ArrayList to another.
		 */
		ArrayListMethods.copyArrayList();
		
		/**
		 * 9. Comparing
		 * Write a method that will compare two ArrayLists,
		 * printing out which elements they have in common.
		 */
		List<Integer> list1 = Arrays.asList(1,5,10,15,18,20);
		List<Integer> list2 = Arrays.asList(1,7,12,17,18,19);
		ArrayListMethods.compareTwoArrayList(list1,list2);
		
		/**
		 * 10. Appending
		 * Write a method that will append the contents of one ArrayList to another.
		 */
		ArrayListMethods.appendContentsToAnother();
		
		/**
		 * 11. Looping
		 * Write a method that will print out each element of your ArrayList using a For-Each loop.
		 */
		ArrayListMethods.printByforEachLoop();
		
		/**
		 * 12. Converting
		 * Write a method that will convert a regular Array to an ArrayList.
		 */
		String [] s = {"One", "Two", "Three"};
		ArrayList<String> ayy = alm.convertArray(s);
		System.out.println(ayy);

	}
}
