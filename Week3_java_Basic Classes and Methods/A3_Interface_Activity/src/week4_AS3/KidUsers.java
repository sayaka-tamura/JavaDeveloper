// Problem Statement 1-2:
package week4_AS3;

public class KidUsers implements LibraryUser {
	// Problem Statement 1-3:
	protected int age;
	protected String bookType;
	
	/* ------------- Constructor ------------- */
	
	public KidUsers() {
		this.age = 0;
		this.bookType = null;
	}

	/* ------------- Start Getter and Setter ------------- */
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getBookType() {
		return bookType;
	}

	public void setBookType(String bookType) {
		this.bookType = bookType;
	}
	/* ------------- End Getter and Setter ------------- */
	
	// Problem Statement 1-4:
	@Override
	public void registerAccount() {
		if(age<=12)
			System.out.println("You have successfully registered under a Kids Account");
		else if(age>12)
			System.out.println("Sorry, Age must be less than 12 to register as a kid");
		else
			System.out.println("Invalid age");
	}

	@Override
	public void requestBook() {
		if(bookType.equals("Kids"))
			System.out.println("Book Issued successfully, please return the book within 10 days");
		else
			System.out.println("Oops, you are allowed to take only kids books");	
	}

}
