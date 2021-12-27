package exception;

public class NotAdminException extends Exception{
	
	public NotAdminException() {
		super();
	}
	
	public NotAdminException(String message) {
//		super(message);
		System.out.println(message);
	}
}