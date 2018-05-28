package lambdaex1;

@FunctionalInterface
public interface FirstfuncLamdaInterface {
	public String sayHello(String hello, String world);
	public default void sayHello1() {
		System.out.println("Say Hello again");
	}
}
