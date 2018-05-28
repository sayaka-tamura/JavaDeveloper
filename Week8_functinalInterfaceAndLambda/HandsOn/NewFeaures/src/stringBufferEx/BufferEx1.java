package stringBufferEx;

public class BufferEx1 {
	public static void main(String[] args) {
		StringBuffer buf = new StringBuffer(20);
		int len = buf.length();
		int cap = buf.capacity();
		System.out.println("Length = " + len);
		System.out.println("Capacity = " + cap);
		buf.append("Platform");
		System.out.println(buf);
		System.out.println(buf.capacity());
		buf.append("ksdjbvkdbvkajbvajbvjabv");
		System.out.println(buf.length());
		System.out.println(buf.capacity());
		buf.append("ksdjbvkdbvkajbvajbvjabv");
		System.out.println(buf.length());
		System.out.println(buf.capacity());
//		System.out.println(buf);
//		buf.insert(10, " by ");
//		System.out.println(buf);
		buf.setLength(10);
		buf.append("ahahaha");
		System.out.println(buf.length());
		System.out.println(buf.capacity());
		System.out.println(buf);
		buf.delete(0, 9);
		System.out.println(buf.length());
		System.out.println(buf.capacity());
		System.out.println(buf);
	}
}
