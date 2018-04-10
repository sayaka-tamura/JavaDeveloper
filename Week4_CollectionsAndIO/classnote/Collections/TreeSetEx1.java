import java.util.TreeSet;

public class TreeSetEx1 {
	public static void main(String[] args) {
		// Creating Hashset and adding elements
		TreeSet<String> set = new TreeSet<String>();
		set.add("Ravi");
		set.add("Vijay");
		set.add("Ravi");
		set.add("Ajay");
		
		// Traversing elements
		for(String s : set)
			System.out.println(s);
	}
}
