package CoreJava.CustomExceptions;

public class StudentRegistrationException extends Exception{
	
	public StudentRegistrationException() {
		
	}
	
	// message parameter is passed it to its parent class 
	// using the super keyword
	public StudentRegistrationException(String message) {
		super(message);
	}
	
}
