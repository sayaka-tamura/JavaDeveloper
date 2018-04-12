package Week4_AS3;

import java.util.Arrays;
import java.util.List;

/**
 * @author Sayaka tamura
 *	
 */
public class LinkedList_Runner {
	public static void main(String[] args) {
		LinkedList_methods llm1 = new LinkedList_methods();
		// 1. Write a Java program to append the specified element to the end of a linked list. 
		System.out.println(llm1.add("Coka Cola"));
		System.out.println(llm1.add("Fanta Grape"));
		System.out.println(llm1.add("Sparkling Soda"));
		System.out.println(llm1.add("Tonic Water"));
		System.out.println(llm1.add("Doctor Pepper"));
		System.out.println();
		
		// 2. Write a Java program to iterate through all elements in a linked list.
		System.out.println("Iterating through all elements in a linked list...");
		System.out.println(llm1.printLinkedList());
		
		// 3. Write a Java program to iterate through all elements in a linked list 
		// starting at the specified position.
		System.out.println(llm1.printLinkedList(2));
		
		// 4. Write a Java program to iterate a linked list in reverse order.
		System.out.println(llm1.printReverse());
		
		// 5. Write a Java program to insert the specified element at the specified position in the linked list.
		System.out.println(llm1.addToSpecified(2, "Mountain Dew"));
		
		// 6. Write a Java program to insert elements into the linked list at the first and last position.
		System.out.println(llm1.offerFirstAndLast("Pepsi Cola", "Pepsi Diet Cola"));

		// 7. Write a Java program to insert the specified element at the front of a linked list. 
		System.out.println(llm1.addFirst("Sunkist"));
		
		// 8. Write a Java program to insert the specified element at the end of a linked list.
		System.out.println(llm1.addLast("Sprite"));
		
		// 9. Write a Java program to insert some elements at the specified position into a linked list.
		List<String> list1 = Arrays.asList("Ginger Ale", "7Up", "Coka Cola Diet");
		System.out.println(llm1.addToSpecified(10, list1));
		
		// 10. Write a Java program to get the first and last occurrence of the specified elements in a linked list.
		System.out.println(llm1.peekFirstAndLastElements());
		
		// 11. Write a Java program to remove first and last element from a linked list.
		System.out.println(llm1.removeFirstAndLastElement());
		
		// 12. Write a Java program to remove all the elements from a linked list.
		System.out.println(llm1.removeAllElements());
		
		// 13. Write a Java program of swap two elements in an linked list
		System.out.println(llm1.add("Coka Cola"));
		System.out.println(llm1.add("Fanta Grape"));
		System.out.println(llm1.swap(llm1,0,1));
		
		// 14. Write a Java program to convert a linked list to array list.
		System.out.println(llm1.convertToArrayList());
			
		// 15. Write a Java program to test an linked list is empty or not.
		System.out.println(llm1.checkListIsEmpty());
	}
}
