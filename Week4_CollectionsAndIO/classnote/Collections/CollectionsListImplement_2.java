import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;			// Interface that contain no pair of elements e1 and e2 such that e1.equals(e2) , and at most one null element.

public class CollectionsListImplement_2 {
	public static void main(String[] args) {
		List<Integer> a = Arrays.asList(3, 4, 6, 7, 9, 12, 15, 17, 23);
		List<Integer> b = Arrays.asList(3, 5, 7, 9, 10, 13, 15, 18, 23);
//		LinkedList<Integer> c = new LinkedList<Integer>();
//		
//		for (int i = 0; i < 10; i++) {
//			if(i!=9)
//				a.add(i);
//			if(i%2 == 0 || i%3==0)
//				b.add(i);
//		}		
		
		Set<Integer> c = new HashSet<Integer>(a);
		c.retainAll(b);			// Retains only the elements in this set
								// that are contained in the specified collection
		// c.addAll(b);
		
		System.out.println(c);
	}
}

// Sort c1 and c2 into a third LinkedList collection c3 : 
// Expected Output: 0 0 1 2 2 3 3 4 4 5 6 6 7 8 8 9 
