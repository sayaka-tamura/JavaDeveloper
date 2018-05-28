package lambdaex1;

public class FamiliarWithLambda {
	String hello = "hello";
	
	public static void main(String[] args) {
//		FirstfuncLamdaInterface first = (hello, world) -> {
//			return "Hello";
//		};
			
		FirstfuncLamdaInterface first =(hello, world) -> hello + world;
		System.out.println(first.sayHello("Hello ", "World"));
		first.sayHello1();
	}
}
