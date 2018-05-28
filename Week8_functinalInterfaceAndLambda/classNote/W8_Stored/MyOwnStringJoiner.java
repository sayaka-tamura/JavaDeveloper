package classNote;

public class MyOwnStringJoiner {
	private String separator;
	private String surfix;
	private String prefix;
	private String builder;
	
	public MyOwnStringJoiner(String sep) {
		this.separator = sep;
		this.surfix = "";
		this.prefix = "";
		this.builder = "";
	}
	
	public MyOwnStringJoiner(String sep, String prefix, String surfix) {
		this.separator = sep;
		this.prefix = prefix;
		this.surfix = surfix;
		this.builder = "";
	}
	
	public MyOwnStringJoiner add(String adding) {
		if(this.builder.isEmpty()) {
			this.builder += adding;
		} else {
			this.builder += this.separator + adding;
		}
		
		return this;
	}
	
	public void print() {
		System.out.println(this.prefix + this.builder + this.surfix);
	}
	
	public static void main(String[] args) {
		MyOwnStringJoiner A = new MyOwnStringJoiner(",", "[", "]");
		A.add("ggg").add("jjjj").print();
	}
}
