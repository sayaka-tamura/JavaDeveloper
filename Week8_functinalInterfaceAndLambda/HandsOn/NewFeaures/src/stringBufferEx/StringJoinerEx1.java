package stringBufferEx;

import java.util.StringJoiner;

public class StringJoinerEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringJoiner join = new StringJoiner(",", "[", "]");
		join.add("Luke");
		join.add("mike");
		join.add("Lance");
		System.out.println(join);
		join.add("Vani").add("James");
		System.out.println(join);
		StringJoiner join2 = new StringJoiner("|", "(",")");
		join2.add("newname");
		join.merge(join2);
		System.out.println(join);
		join2.merge(join);
		System.out.println(join2);
		String[] names = join2.toString().split(",");
		for(String n : names) {
			System.out.println(n);
		}
	}

}
