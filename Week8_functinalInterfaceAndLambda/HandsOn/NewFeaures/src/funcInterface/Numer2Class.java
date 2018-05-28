package funcInterface;

public class Numer2Class {
	public String rr;
	public void myPrint() {
		FunctionalInterfaceEx1 ref1 = new FunctionalInterfaceEx1() {

			@Override
			public void print() {
				// TODO Auto-generated method stub
				
			}

			@Override
			public Integer add(Integer num1, Integer num2) {
				// TODO Auto-generated method stub
				return null;
			}
			
		};
		FunctionalInterfaceEx1 ref2 = new FunctionalInterfaceEx1() {

			@Override
			public void print() {
				// TODO Auto-generated method stub
				
			}

			@Override
			public Integer add(Integer num1, Integer num2) {
				// TODO Auto-generated method stub
				return null;
			}
			
		};
		new FunctionalInterfaceEx1() {

			@Override
			public void print() {
				// TODO Auto-generated method stub
				
			}
			
		};
		ref2.print();
	}
}
