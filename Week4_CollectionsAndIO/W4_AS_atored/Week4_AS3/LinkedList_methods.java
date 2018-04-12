package Week4_AS3;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class LinkedList_methods {
	LinkedList<String> llm = null;

	public LinkedList_methods(){
		llm = new LinkedList<String>();
	}
	
	// #1
	public String add(String string) {
		String msg = "\"" + string + "\" is appending to the end of linked list...";
		llm.add(string);	// (Queue Interface)
		return msg;
	}
	// #2
	public String printLinkedList() {
		String msg = "";
		for(String s : llm)
			msg += s + "\n";
		return msg;
	}
	// #3
	public String printLinkedList(int i) {
		String msg = "Iterating through all elements in a linked list starting at the specified position...\n";
		for (int j = i; j < llm.size(); j++) {
			msg += llm.get(j) + "\n";
		}
		return msg;
	}
	// #4
	public String printReverse() {
		String msg = "Iterating a linked list in reverse order...\n";
		Collections.reverse(llm);
		msg += printLinkedList();
		//Collections.reverse(llm);	 //bring back the linked list in order
		return msg;
		
	}
	// #5
	public String addToSpecified(int i, String string) {
		String msg = "Inserting the specified element \""+ string + "\" at the specified position: " + i + " in the linked list...\n";
		llm.add(i, string);
		
		msg += printLinkedList();
		return msg;
	}
	// #6
	public String offerFirstAndLast(String firstWord, String lastWord) {
		String msg = "Inserting an elements into the linked list at the first: \"" + firstWord + "\" and Last: \"" + lastWord + "\"...\n";
		llm.offerFirst(firstWord);	// not Throws exception(Dequeue Interface)
		llm.offerLast(lastWord);	// not Throws exception(Dequeue Interface)
		
		msg += printLinkedList();
		return msg;	
	}
	// #7
	public String addFirst(String string) {
		String msg = "Adding an element \"" + string + "\" into the linked list at the first...\n";
		llm.addFirst(string);		// 	Throws exception(Dequeue Interface), same method as push() (Stack)
		msg += printLinkedList();
		return msg;
	}
	// #8
	public String addLast(String string) {
		String msg = "Adding an element \"" + string + "\" into the linked list at the last...\n";
		llm.addLast(string);		// 	Throws exception(Dequeue Interface), same method as add() (Oueue)
		msg += printLinkedList();
		return msg;
	}
	
	// #9
	public String addToSpecified(int i, List<String> string) {
		String msg = "Inserting the specified element at the specified position in the linked list...\n";
		llm.addAll(i, string);
		
		msg += printLinkedList();
		return msg;
	}
	// #10
	public String peekFirstAndLastElements() {
		String msg = "Getting the first and last occurrence of the specified elements in a linked list...\n";
		msg += "First Element: " + llm.peekFirst() + "\n";
		msg += "Last Element: " + llm.peekLast() + "\n";
		
		return msg;
	}
	// #11
	public String removeFirstAndLastElement() {
		String msg = "Removing first and last element from a linked list...\n";
		llm.removeFirst();
		llm.removeLast();
		
		msg += printLinkedList();
		return msg;
	}
	// #12
	public String removeAllElements() {
		String msg = "Removing all elements from a linked list...\n";
		llm.clear();
		msg += printLinkedList();
		return msg;
	}
	
	// #13
	public String swap(LinkedList_methods llm1, int i, int j) {
		String msg = "Swapping two elements in an linked list...\n";
		Collections.swap(llm, i, j);
		
		msg += printLinkedList();
		return msg;
	}
	// #14
	public String convertToArrayList() {
		String msg ="Converting a linked list to array list...\n";
		
		int size = llm.size();
		String[] array = llm.toArray(new String[size]);
		for (String s : array) {
			 msg += s + "\n";
		}
		
		return msg;
	}
	// #15
	public String checkListIsEmpty() {
		String msg ="Testing an linked list is empty or not...\n";
		msg += llm.isEmpty();
		return msg;
	}
	
	
	
	
	
	
	
	
}
