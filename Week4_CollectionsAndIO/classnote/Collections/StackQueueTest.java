import java.util.Queue;			// Interface for Queue
import java.util.Deque;			// it is extended Queue Interface
import java.util.LinkedList;	// Bi-directional linear list (Included Deque Interface)
import java.util.List;
import java.util.ArrayDeque;	// Implemented linear type Dequeue
import java.util.Collections;

public class StackQueueTest {
	public static void main(String[] args) {
		
		// Queue : FIFO
		Queue<Integer> q1 = new ArrayDeque<Integer>();
		System.out.println(q1.add(5));		// could use add / offer
		System.out.println(q1.peek());		// could use element / peek
		System.out.println(q1.isEmpty());		
		q1.poll();							// could remove / poll
		
		System.out.println(q1.isEmpty());
		
		// Dequeue(= Stack) : LIFO (can use both function for Stack and Queue)
		Deque<Integer> dq1 = new ArrayDeque<Integer>();
		dq1.push(10);						// push / offerFirst
		dq1.poll();							// remove: return exception 
											// poll: return null if it empty
		System.out.println(dq1.peek());		// element: return exception
											// peek: return null if it empty
		
		// people often use Queue/Dequeue than LinkedList class
		List<Integer> l1 = new LinkedList<Integer>();
		LinkedList<Integer> ll1 = new LinkedList<Integer>();
			// use linked list, when want to add element or remove
			//
		l1.add(6);
		l1.add(7);
		System.out.println(l1);
		
		ll1.add(20);
		ll1.add(15);
		System.out.println(ll1);
		
		Collections.sort(ll1);
		for(int i: ll1)
			System.out.println(i);
	}	
	
}

/**
 * Collection framework
 * List: Store variables in order, can have duplicated value
 * 			-> implemented to "ArrayList" and "LinkedList"
 * Set : Store variables not in order, cannot have duplicated value 
 * 			-> implemented to "HashSet"(not allows null), "TreeSet"(allows null) and "LinkedHashSet"
 * Map : Store variables with a key corresponding a value, do not allow duplicated value
 * 			-> implemented to "HashMap" and "TreeMap"
 * 
 */
