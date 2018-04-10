import java.util.LinkedList;

public class LinkedListExample {
	public static void main(String[] args) {
		LinkedList<String> c1 = new LinkedList<String>();
		c1.add("Red");
		c1.add("Green");
		c1.add("Black");
		c1.add("White");
		c1.add("Pink");
		System.out.println(c1.peek());
		System.out.println(c1.get(1));
		System.out.println(c1.getLast());
		System.out.println(c1.pollFirst());
		System.out.println(c1.contains("Green"));
		System.out.println(c1.add("Blue"));
		System.out.println(c1.indexOf("White"));
		System.out.println("List of first linked list: " + c1);

		
		LinkedList<String> c2 = new LinkedList<String>();
		c2.add("Red");
		c2.addFirst("Green");
		c2.add("Black");
		c2.add("White");
		c2.add("Pink");
		System.out.println("List of first linked list: " + c2);
		
		// let join above two list
		LinkedList<String> a = new LinkedList<String>();
		a.addAll(c1);
		a.addAll(c2);
		System.out.println("New linked list: " + a);
	}
}
