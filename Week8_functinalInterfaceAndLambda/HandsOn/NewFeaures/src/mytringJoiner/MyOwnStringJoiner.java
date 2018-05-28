package mytringJoiner;

public class MyOwnStringJoiner {
	
	private String seperator;
	private String surfix;
	private String prefix;
	private String builder;
	
	public MyOwnStringJoiner(String sep) {
		this.seperator = sep;
		this.surfix = "";
		this.prefix = "";
		this.builder = "";
	}
	public MyOwnStringJoiner(String sep, String prefix, String surfix) {
		this.seperator = sep;
		this.surfix = surfix;
		this.prefix = prefix;
		this.builder = "";
	}
	
	public MyOwnStringJoiner add(String adding) {
		if(this.builder.isEmpty()) {
			this.builder += adding;
		}else {
			this.builder += this.seperator + adding;
		}
		return this;
	}
	
	public void print() {
		System.out.println(this.prefix + this.builder + this.surfix);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyOwnStringJoiner A = new MyOwnStringJoiner(",", "[", "]");
		A.add("ggg").add("jjjj").print();
	}

}
