package aula52ex;

public class PhoneBookFullException extends Exception {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public String getMessage() {
       return "Phone book full";
    }

}
