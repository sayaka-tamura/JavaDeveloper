package funcInterface;

public class ImplInterface {
	public void some() {
		System.out.println("hhh");
	};
	public static void main(String[] args) {
		FunctionalInterfaceEx1 A = new FunctionalInterfaceEx1() {
			public void print() {
				System.out.println("Implemented by A");
			}
		};
		ImplInterface f = new ImplInterface() {
			public void some() {
				System.out.println("OverRidde");
			}
		};
		Numer2Class j = new Numer2Class() {
			public void doSome() {
				System.out.println("Changed Numer2Class");
			}
		};
		f.some();
		j.doSome();
		A.print();
	}
}
