package aula52ex;

public class ContactDoesntExistExeption extends Exception {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String contactName;
	
	public ContactDoesntExistExeption(String contactName) {
        this.contactName = contactName;
    }

    public String getMessage() {
        return "Contact " + contactName + " does not exist in the phonebook!";
    }

}
