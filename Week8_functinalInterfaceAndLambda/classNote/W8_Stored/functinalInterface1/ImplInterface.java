package funcInterface;


public class ImplInterface {
	public static void main(String[] args) {
		FunctionalInterfaceEx1 A = new FunctionalInterfaceEx1() {

			@Override
			public void print() {
				System.out.println("Impremented by A");					
			}

		};
		
		A.print();
	}
}