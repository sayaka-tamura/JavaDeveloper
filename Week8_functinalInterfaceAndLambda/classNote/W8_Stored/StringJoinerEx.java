package classNote;

import java.util.StringJoiner;

public class StringJoinerEx {
	public static void main(String[] args) {
		StringJoiner join = new StringJoiner(",", "[", "]");
		join.add("Luke");
		join.add("mike");
		join.add("Lance");
		System.out.println(join);
		
		join.add("Vani").add("John");
		System.out.println(join);
		
		StringJoiner join2 = new StringJoiner("|", "(", ")");
		join2.add("newname");
		System.out.println(join2);
		
		join.merge(join2);		
		System.out.println(join);
		
		join2.merge(join);
		System.out.println(join2);
		
		String[] names = join2.toString().split(",");
		for (String name : names) {
			System.out.println(name);
		}
	}
}
