package funcInterface;

@FunctionalInterface
public interface Arith<T> {
	public T compute(T num1, T num2);
	default void print() {
		System.out.println("not");
	}
}
