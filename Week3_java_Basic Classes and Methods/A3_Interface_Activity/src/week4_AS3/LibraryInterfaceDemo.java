package week4_AS3;

public class LibraryInterfaceDemo {
	public static void main(String[] args) {
		KidUsers kd1 = new KidUsers();
		System.out.println("Kids User 1: ");
		kd1.setAge(10);
		kd1.registerAccount();
		
		kd1.setBookType("Kids");
		kd1.requestBook();
		System.out.println();
		
		KidUsers kd2 = new KidUsers();
		System.out.println("Kids User 2: ");
		kd2.setAge(18);
		kd2.registerAccount();
		
		kd2.setBookType("Fiction");
		kd2.requestBook();
		System.out.println();
		
		AdultUser ad1 = new AdultUser();
		System.out.println("Adult User 1: ");
		ad1.setAge(5);
		ad1.registerAccount();
		
		ad1.setBookType("Kids");
		ad1.requestBook();
		System.out.println();
		
		AdultUser ad2 = new AdultUser();
		System.out.println("Adult User 2: ");
		ad2.setAge(23);
		ad2.registerAccount();
		
		ad2.setBookType("Fiction");
		ad2.requestBook();
		System.out.println();
		
	}
}
