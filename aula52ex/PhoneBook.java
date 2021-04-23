package aula52ex;

public class PhoneBook{
	
	private Contact[] contacts;
		
	public PhoneBook() {
		contacts = new Contact[5];
	}

	public void addContact(Contact c) throws  PhoneBookFullException{
		
		boolean full = true;
		
		for (int i=0; i<contacts.length; i++){
            if (contacts[i] == null){
            	contacts[i] = c;
                full = false;
                break;
            }
        }
		
		
		if (full){
            throw new PhoneBookFullException();
        }
		
	}
	
	public int consultContactPerName(String name) throws ContactDoesntExistExeption {
		
		for (int i=0; i<contacts.length; i++){
            if (contacts[i] != null){
                if (contacts[i].getName().equalsIgnoreCase(name)){
                    return i;
                }
            }
        }
        throw new ContactDoesntExistExeption(name);
		
	}

	@Override
	public String toString() {
		String s = "";
		for (Contact c : contacts){
            if (c != null){
                s += c.toString() + "\n";
            }
        }
        return s;
	}
	
	
}
