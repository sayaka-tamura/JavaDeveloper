import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class HasgSetExample2Merge {
	public static void main(String[] args) {
		HashSet<String> setOfStrs = new HashSet<>();
		
		setOfStrs.add("hello");
		setOfStrs.add("abc");
		setOfStrs.add("time");
		setOfStrs.add("Hi");
		System.out.println("setOfStrs = " + setOfStrs);
		// Convert the string array int ot a collection i.e. List
		List<String> arrList = Arrays.asList("abc","def","ghi","jkl");
		// Merge the HashSet and List
		boolean bResult = setOfStrs.addAll(arrList);
		
		if(bResult)
			System.out.println("Merging of Set & ArrayList successfull");
		
		System.out.println("setOfStrs = " + setOfStrs);
	}
}
