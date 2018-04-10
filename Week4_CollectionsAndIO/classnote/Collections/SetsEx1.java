import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetsEx1 {
	public static void main(String[] args) {
		int count[] = {34,22,10,60,30,22};
		Set<Integer> set = new HashSet<Integer>();
		try {
			for (int i = 0; i < 5; i++) {
				set.add(count[i]);
			}
			System.out.println(set);
			
			TreeSet<Integer> sortedSet = new TreeSet<Integer>(set);
			System.out.println("The sorted list is : ");
			System.out.println(sortedSet);
			System.out.println("the First element of the Treeset is: " + (Integer)sortedSet.first());
			System.out.println("the last element of the Treeset is: " + (Integer)sortedSet.last());
		}
		catch(Exception e) {}
		
	}
}
