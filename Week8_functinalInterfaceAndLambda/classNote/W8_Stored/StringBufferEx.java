package classNote;

public class StringBufferEx {
	public static void main(String[] args) {
		StringBuffer buf = new StringBuffer("PerScholas");
		int len = buf.length();
		int cap = buf.capacity();
		System.out.println("Length = " + len);
		System.out.println("Capacity = " + cap);
		buf.append("Platform");
		System.out.println(buf);
		buf.insert(10, " by ");
		System.out.println(buf);
	}
}
