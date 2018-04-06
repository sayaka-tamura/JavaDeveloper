// Problem Statement 1-2:
package week4_AS3;

public class AdultUser implements LibraryUser{
	protected int age;
	protected String bookType;
	
	/* ------------- Constructor ------------- */
	
	public AdultUser() {
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
	
	// Problem Statement 1-5:
	@Override
	public void registerAccount() {
		if(age>12)
			System.out.println("You have successfully registered under an Adult Account");
		else if(age<=12)
			System.out.println("Sorry, Age must be greater than or equal 12 to register as an adult");
		else
			System.out.println("Invalid age");
	}

	@Override
	public void requestBook() {
		if(bookType.equals("Fiction"))
			System.out.println("Book Issued successfully, please return the book within 7 days");
		else 
			System.out.println("Oops, you are allowed to take only adult Fiction books");
	}

}
