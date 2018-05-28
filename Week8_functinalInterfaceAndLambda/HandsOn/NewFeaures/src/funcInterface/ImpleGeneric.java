package funcInterface;

public class ImpleGeneric implements Arith{

	public static void main(String[] args) {
//		Arith<Integer> A = new Arith<Integer>() {
//			@Override
//			public Integer compute(Integer num1, Integer num2) {
//				// TODO Auto-generated method stub
//				return num1 + num2;
//			}	
//		};
		
		ImpleGeneric v= new ImpleGeneric();
		v.print();
	}

	@Override
	public Object compute(Object num1, Object num2) {
		// TODO Auto-generated method stub
		return null;
	}

}
